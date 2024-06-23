package Maquina;

import ConexaoComBanco.Conecta;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.io.File;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.BaseColor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Desktop;
import javax.swing.JFileChooser;

public class ControleMaquina {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;

    public Carregador carregador;
    public CarretaGraneleira carretaGraneleira;
    public Colheitadeira colheitadeira;
    public MaquinaDePlantio maquinaDePlantio;
    public Pulverizador pulverizador;
    public Subsolador subsolador;
    public Maquina maquina;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleMaquina() {
        conexao = new Conecta();
        carregador = new Carregador();
        carretaGraneleira = new CarretaGraneleira();
        colheitadeira = new Colheitadeira();
        maquinaDePlantio = new MaquinaDePlantio();
        pulverizador = new Pulverizador();
        subsolador = new Subsolador();
    }

    public String cadastrarCarregador(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {

                sql = "INSERT INTO carregador (tipo_maquina, nome_maquina, marca_maquina, ano_da_maquina, chassi_maquina,"
                        + " estado_maquina, peso_suportado) VALUES (?, ?, ?, ?, ?, ?, ?);";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, carregador.getTipoMaquina());
                ps.setString(2, carregador.getNomeMaquina());
                ps.setString(3, carregador.getMarcaMaquina());
                ps.setInt(4, carregador.getAnoMaquina());
                ps.setString(5, carregador.getChassiMaquina());
                ps.setString(6, carregador.getEstadoMaquina());
                ps.setDouble(7, carregador.getPesoSuportado());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Carregador cadastrado com sucesso";
                } else {
                    msg = "O carregador não foi cadastrado";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Carregador " + ex.getMessage();
        }
        return msg;
    }

    public Carregador buscarCarregador(String nomeMaquina) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM carregador WHERE nome_maquina = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeMaquina);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Carregador carregadorBusca = new Carregador();
                carregadorBusca.setNomeMaquina(resultados.getString("nome_maquina"));
                carregadorBusca.setMarcaMaquina(resultados.getString("marca_maquina"));
                carregadorBusca.setChassiMaquina(resultados.getString("chassi_maquina"));
                carregadorBusca.setEstadoMaquina(resultados.getString("estado_maquina"));
                carregadorBusca.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                carregadorBusca.setPesoSuportado(resultados.getDouble("peso_suportado"));
                carregadorBusca.setIdCarregador(resultados.getInt("id_carregador"));

                return carregadorBusca;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public String removerCarregador(String nomeMaquina) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM carregador WHERE nome_maquina = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeMaquina);

            int linhasAfetadas1 = ps.executeUpdate();

            if (linhasAfetadas1 > 0) {
                msg = "Carregador removido com sucesso";
            } else {
                msg = "Carregador não removido";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover carregador";
        }
        return msg;
    }

    public String atualizarCarregador(Carregador carregador) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE carregador SET nome_maquina = ?, marca_maquina = ?, chassi_maquina = ?, ano_da_maquina = ?, estado_maquina = ?, peso_suportado = ? WHERE id_carregador = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, carregador.getNomeMaquina());
            ps.setString(2, carregador.getMarcaMaquina());
            ps.setString(3, carregador.getChassiMaquina());
            ps.setInt(4, carregador.getAnoMaquina());
            ps.setString(5, carregador.getEstadoMaquina());
            ps.setDouble(6, carregador.getPesoSuportado());
            ps.setInt(7, carregador.getIdCarregador());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Carregador atualizado com sucesso";
            } else {
                return "Carregador não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar carregador";
        }
        
    }

    public List<Carregador> readCarregador() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM carregador";

        List<Carregador> carregadores = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Carregador carregador1 = new Carregador();
                carregador1.setNomeMaquina(resultados.getString("nome_maquina"));
                carregador1.setMarcaMaquina(resultados.getString("marca_maquina"));
                carregador1.setEstadoMaquina(resultados.getString("estado_maquina"));
                carregador1.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                carregador1.setIdCarregador(resultados.getInt("id_carregador"));
                carregadores.add(carregador1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return carregadores;
    }

//----------------------------------------------------------------------------------------------------------------------------------------------
    public String cadastrarCarretaGraneleira(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {

                sql = "INSERT INTO carreta_graneleira (tipo_Maquina, nome_Maquina, marca_Maquina, ano_da_maquina,"
                        + " chassi_maquina, estado_maquina, capacidade_de_peso, capacidade_de_sacas)\n"
                        + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, carretaGraneleira.getTipoMaquina());
                ps.setString(2, carretaGraneleira.getNomeMaquina());
                ps.setString(3, carretaGraneleira.getMarcaMaquina());
                ps.setInt(4, carretaGraneleira.getAnoMaquina());
                ps.setString(5, carretaGraneleira.getChassiMaquina());
                ps.setString(6, carretaGraneleira.getEstadoMaquina());
                ps.setDouble(7, carretaGraneleira.getCapacidadeDePeso());
                ps.setDouble(8, carretaGraneleira.getCapacidadeDeSacas());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Carreta Graneleira cadastrada com sucesso";
                } else {
                    msg = "Carreta Graneleira não foi cadastrado";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Carreta Graneleira " + ex.getMessage();
        }
        return msg;
    }

    public CarretaGraneleira buscarCarretaGraneleira(String nomeMaquina) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM carreta_graneleira WHERE nome_maquina = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeMaquina);
            resultados = ps.executeQuery();

            if (resultados.next()) {

                CarretaGraneleira carretaGraneleiraBusca = new CarretaGraneleira();
                carretaGraneleiraBusca.setNomeMaquina(resultados.getString("nome_maquina"));
                carretaGraneleiraBusca.setMarcaMaquina(resultados.getString("marca_maquina"));
                carretaGraneleiraBusca.setChassiMaquina(resultados.getString("chassi_maquina"));
                carretaGraneleiraBusca.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                carretaGraneleiraBusca.setEstadoMaquina(resultados.getString("estado_maquina"));
                carretaGraneleiraBusca.setCapacidadeDePeso(resultados.getDouble("capacidade_de_peso"));
                carretaGraneleiraBusca.setCapacidadeDeSacas(resultados.getInt("capacidade_de_sacas"));
                carretaGraneleiraBusca.setIdCarretaGraneleira(resultados.getInt("id_carreta_graneleira"));

                return carretaGraneleiraBusca;
            } else {

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public String removerCarretaGraneleira(String nomeMaquina) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM carreta_graneleira WHERE nome_maquina = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeMaquina);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Carreta graneleira removida com sucesso";
            } else {
                msg = "Carreta graneleira não foi removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover o carreta graneleira";
        }
        return msg;
    }

    public String atualizarCarretaGraneleira(CarretaGraneleira carretaGraneleira) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE carreta_graneleira SET nome_maquina = ?, marca_maquina = ?, chassi_maquina = ?, "
                    + "ano_da_maquina = ?, estado_maquina = ?, capacidade_de_peso = ?, capacidade_de_sacas = ? WHERE id_carreta_graneleira = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, carretaGraneleira.getNomeMaquina());
            ps.setString(2, carretaGraneleira.getMarcaMaquina());
            ps.setString(3, carretaGraneleira.getChassiMaquina());
            ps.setInt(4, carretaGraneleira.getAnoMaquina());
            ps.setString(5, carretaGraneleira.getEstadoMaquina());
            ps.setDouble(6, carretaGraneleira.getCapacidadeDePeso());
            ps.setInt(7, carretaGraneleira.getCapacidadeDeSacas());
            ps.setInt(8, carretaGraneleira.getIdCarretaGraneleira());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Carreta graneleira atualizada com sucesso";
            } else {
                return "Carreta graneleira não encontrada";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar carreta graneleira";
        }
    }

    public List<CarretaGraneleira> readCarretaGraneleira() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM carreta_graneleira";

        List<CarretaGraneleira> carretaGraneleiras = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                CarretaGraneleira carretaGraneleira1 = new CarretaGraneleira();
                carretaGraneleira1.setNomeMaquina(resultados.getString("nome_maquina"));
                carretaGraneleira1.setMarcaMaquina(resultados.getString("marca_maquina"));
                carretaGraneleira1.setEstadoMaquina(resultados.getString("estado_maquina"));
                carretaGraneleira1.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                carretaGraneleira1.setIdCarretaGraneleira(resultados.getInt("id_carreta_graneleira"));
                carretaGraneleiras.add(carretaGraneleira1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return carretaGraneleiras;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------

    public String cadastrarColheitadeira(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {

                sql = "INSERT INTO colheitadeira (tipo_Maquina, nome_Maquina, marca_Maquina, ano_da_maquina, chassi_maquina,"
                        + "estado_maquina, quantidade_de_sacos, capacidade_do_tanque_de_combustivel, tipo_de_cultura) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, colheitadeira.getTipoMaquina());
                ps.setString(2, colheitadeira.getNomeMaquina());
                ps.setString(3, colheitadeira.getMarcaMaquina());
                ps.setInt(4, colheitadeira.getAnoMaquina());
                ps.setString(5, colheitadeira.getChassiMaquina());
                ps.setString(6, colheitadeira.getEstadoMaquina());
                ps.setInt(7, colheitadeira.getQuantidadeDeSacos());
                ps.setDouble(8, colheitadeira.getCapacidadeDoTanqueDeCombustivel());
                ps.setString(9, colheitadeira.getCultura());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Colheitadeira cadastrada com sucesso";
                } else {
                    msg = "Colheitadeira não foi cadastrada";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Colheitadeira " + ex.getMessage();
        }
        return msg;
    }

    public Colheitadeira buscarColheitadeira(String nomeMaquina) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM colheitadeira WHERE nome_maquina = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeMaquina);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Colheitadeira ColheitadeiraBusca = new Colheitadeira();
                ColheitadeiraBusca.setNomeMaquina(resultados.getString("nome_maquina"));
                ColheitadeiraBusca.setMarcaMaquina(resultados.getString("marca_maquina"));
                ColheitadeiraBusca.setChassiMaquina(resultados.getString("chassi_maquina"));
                ColheitadeiraBusca.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                ColheitadeiraBusca.setEstadoMaquina(resultados.getString("estado_maquina"));
                ColheitadeiraBusca.setQuantidadeDeSacos(resultados.getInt("quantidade_de_sacos"));
                ColheitadeiraBusca.setCapacidadeDoTanqueDeCombustivel(resultados.getDouble("capacidade_do_tanque_de_combustivel"));
                ColheitadeiraBusca.setCultura(resultados.getString("tipo_de_cultura"));
                ColheitadeiraBusca.setIdColheitadeira(resultados.getInt("id_colheitadeira"));
                return ColheitadeiraBusca;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerColheitadeira(String nomeMaquina) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM colheitadeira WHERE nome_maquina = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeMaquina);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Colheitadeira removida com sucesso";
            } else {
                msg = "Colheitadeira não foi removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover a colheitadeira";
        }
        return msg;
    }

    public String atualizarColheitadeira(Colheitadeira colheitadeira) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE colheitadeira SET nome_maquina = ?, marca_maquina = ?, chassi_maquina = ?, ano_da_maquina = ?,"
                    + " estado_maquina = ?, quantidade_de_sacos = ?, capacidade_do_tanque_de_combustivel = ?, tipo_de_cultura = ? WHERE id_colheitadeira = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, colheitadeira.getNomeMaquina());
            ps.setString(2, colheitadeira.getMarcaMaquina());
            ps.setString(3, colheitadeira.getChassiMaquina());
            ps.setInt(4, colheitadeira.getAnoMaquina());
            ps.setString(5, colheitadeira.getEstadoMaquina());
            ps.setInt(6, colheitadeira.getQuantidadeDeSacos());
            ps.setDouble(7, colheitadeira.getCapacidadeDoTanqueDeCombustivel());
            ps.setString(8, colheitadeira.getCultura());
            ps.setInt(9, colheitadeira.getIdColheitadeira());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Colheitadeira atualizada com sucesso";
            } else {
                return "Colheitadeira não encontrada";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Colheitadeira";
        }
    }

    public List<Colheitadeira> readColheitadeira() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM colheitadeira";

        List<Colheitadeira> colheitadeiras = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Colheitadeira colheitadeira1 = new Colheitadeira();
                colheitadeira1.setNomeMaquina(resultados.getString("nome_maquina"));
                colheitadeira1.setMarcaMaquina(resultados.getString("marca_maquina"));
                colheitadeira1.setEstadoMaquina(resultados.getString("estado_maquina"));
                colheitadeira1.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                colheitadeira1.setIdColheitadeira(resultados.getInt("id_colheitadeira"));
                colheitadeiras.add(colheitadeira1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return colheitadeiras;
    }

//----------------------------------------------------------------------------------------------------------------------------------------------    
    public String cadastrarMaquinaDePlantio(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }
        try {
            if (operacao == INCLUSAO) {

                sql = "INSERT INTO maquina_de_plantio (tipo_maquina, nome_maquina, marca_maquina, ano_da_maquina,"
                        + " chassi_maquina, estado_maquina, capacidade_de_sementes, quantidade_de_linhas) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, maquinaDePlantio.getTipoMaquina());
                ps.setString(2, maquinaDePlantio.getNomeMaquina());
                ps.setString(3, maquinaDePlantio.getMarcaMaquina());
                ps.setInt(4, maquinaDePlantio.getAnoMaquina());
                ps.setString(5, maquinaDePlantio.getChassiMaquina());
                ps.setString(6, maquinaDePlantio.getEstadoMaquina());
                ps.setInt(7, maquinaDePlantio.getCapacidadeDeSementes());
                ps.setInt(8, maquinaDePlantio.getQuantidadeDeLinhas());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Maquina de plantio cadastrada com sucesso";
                } else {
                    msg = "Maquina de plantio não foi cadastrada";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Maquina de plantio " + ex.getMessage();
        }
        return msg;
    }

    public MaquinaDePlantio buscarMaquinaDePlantio(String nomeMaquina) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM maquina_de_plantio WHERE nome_maquina = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeMaquina);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                MaquinaDePlantio maquinaDePlantioBusca = new MaquinaDePlantio();
                maquinaDePlantioBusca.setNomeMaquina(resultados.getString("nome_maquina"));
                maquinaDePlantioBusca.setMarcaMaquina(resultados.getString("marca_maquina"));
                maquinaDePlantioBusca.setChassiMaquina(resultados.getString("chassi_maquina"));
                maquinaDePlantioBusca.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                maquinaDePlantioBusca.setEstadoMaquina(resultados.getString("estado_maquina"));
                maquinaDePlantioBusca.setCapacidadeDeSementes(resultados.getInt("capacidade_de_sementes"));
                maquinaDePlantioBusca.setQuantidadeDeLinhas(resultados.getInt("quantidade_de_linhas"));
                maquinaDePlantioBusca.setIdMaquinaDePlantio(resultados.getInt("id_maquina_de_plantio"));
                return maquinaDePlantioBusca;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerMaquinaDePlantio(String nomeMaquina) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM maquina_de_plantio WHERE nome_maquina = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeMaquina);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Maquina de Plantio removida com sucesso";
            } else {
                msg = "Maquina de Plantio não foi removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover a maquina de Plantio";
        }
        return msg;
    }

    public String atualizarMaquinaDePlantio(MaquinaDePlantio maquinaDePlantio) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE maquina_de_plantio SET nome_maquina = ?, marca_maquina = ?, chassi_maquina = ?, ano_da_maquina = ?,"
                    + " estado_maquina = ?, capacidade_de_sementes = ?, quantidade_de_linhas = ? WHERE id_maquina_de_plantio = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, maquinaDePlantio.getNomeMaquina());
            ps.setString(2, maquinaDePlantio.getMarcaMaquina());
            ps.setString(3, maquinaDePlantio.getChassiMaquina());
            ps.setInt(4, maquinaDePlantio.getAnoMaquina());
            ps.setString(5, maquinaDePlantio.getEstadoMaquina());
            ps.setInt(6, maquinaDePlantio.getCapacidadeDeSementes());
            ps.setInt(7, maquinaDePlantio.getQuantidadeDeLinhas());
            ps.setInt(8, maquinaDePlantio.getIdMaquinaDePlantio());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Maquina de plantio atualizada com sucesso";
            } else {
                return "Maquina de plantio não encontrada";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Maquina de plantio";
        }
    }

    public List<MaquinaDePlantio> readMaquinaDePlantio() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM maquina_de_plantio";

        List<MaquinaDePlantio> maquinaDePlantios = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                MaquinaDePlantio maquinaDePlantio1 = new MaquinaDePlantio();
                maquinaDePlantio1.setNomeMaquina(resultados.getString("nome_maquina"));
                maquinaDePlantio1.setMarcaMaquina(resultados.getString("marca_maquina"));
                maquinaDePlantio1.setEstadoMaquina(resultados.getString("estado_maquina"));
                maquinaDePlantio1.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                maquinaDePlantio1.setIdMaquinaDePlantio(resultados.getInt("id_maquina_de_plantio"));
                maquinaDePlantios.add(maquinaDePlantio1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return maquinaDePlantios;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------

    public String cadastrarPulverizador(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {

                sql = "INSERT INTO pulverizador (tipo_Maquina, nome_Maquina, marca_Maquina, ano_da_maquina,"
                        + " chassi_maquina, estado_maquina, tipo_de_cultura, capacidade_do_reservatorio)\n"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, pulverizador.getTipoMaquina());
                ps.setString(2, pulverizador.getNomeMaquina());
                ps.setString(3, pulverizador.getMarcaMaquina());
                ps.setInt(4, pulverizador.getAnoMaquina());
                ps.setString(5, pulverizador.getChassiMaquina());
                ps.setString(6, pulverizador.getEstadoMaquina());
                ps.setString(7, pulverizador.getTipoDeCultura());
                ps.setDouble(8, pulverizador.getCapacidadeDoReservatorio());
                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Pulverizador cadastrado com sucesso";
                } else {
                    msg = "Pulverizador não foi cadastrado";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Pulverizador " + ex.getMessage();
        }
        return msg;
    }

    public Pulverizador buscarPulverizador(String nomeMaquina) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM pulverizador WHERE nome_maquina = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeMaquina);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Pulverizador pulverizadorBusca = new Pulverizador();
                pulverizadorBusca.setNomeMaquina(resultados.getString("nome_maquina"));
                pulverizadorBusca.setMarcaMaquina(resultados.getString("marca_maquina"));
                pulverizadorBusca.setChassiMaquina(resultados.getString("chassi_maquina"));
                pulverizadorBusca.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                pulverizadorBusca.setEstadoMaquina(resultados.getString("estado_maquina"));
                pulverizadorBusca.setCapacidadeDoReservatorio(resultados.getDouble("capacidade_do_reservatorio"));
                pulverizadorBusca.setTipoDeCultura(resultados.getString("tipo_de_cultura"));
                pulverizadorBusca.setIdPulverizador(resultados.getInt("id_pulverizador"));
                return pulverizadorBusca;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public String removerPulverizador(String nomeMaquina) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM pulverizador WHERE nome_maquina = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeMaquina);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Pulverizador removido com sucesso";
            } else {
                msg = "Pulverizador não foi removido";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover pulverizador";
        }
        return msg;
    }

    public String atualizarPulverizador(Pulverizador pulverizador) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE pulverizador SET nome_maquina = ?, marca_maquina = ?, chassi_maquina = ?, ano_da_maquina = ?,"
                    + " estado_maquina = ?, tipo_de_cultura = ?, capacidade_do_reservatorio = ? WHERE id_pulverizador = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, pulverizador.getNomeMaquina());
            ps.setString(2, pulverizador.getMarcaMaquina());
            ps.setString(3, pulverizador.getChassiMaquina());
            ps.setInt(4, pulverizador.getAnoMaquina());
            ps.setString(5, pulverizador.getEstadoMaquina());
            ps.setString(6, pulverizador.getTipoDeCultura());
            ps.setDouble(7, pulverizador.getCapacidadeDoReservatorio());
            ps.setInt(8, pulverizador.getIdPulverizador());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Pulverizador atualizado com sucesso";
            } else {
                return "Pulverizador não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Pulverizador";
        }
    }

    public List<Pulverizador> readPulverizador() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM pulverizador";

        List<Pulverizador> pulverizadores = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Pulverizador pulverizador1 = new Pulverizador();
                pulverizador1.setNomeMaquina(resultados.getString("nome_maquina"));
                pulverizador1.setMarcaMaquina(resultados.getString("marca_maquina"));
                pulverizador1.setEstadoMaquina(resultados.getString("estado_maquina"));
                pulverizador1.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                pulverizador1.setIdPulverizador(resultados.getInt("id_pulverizador"));
                pulverizadores.add(pulverizador1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return pulverizadores;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------

    public String cadastrarSubSolador(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {

                sql = "INSERT INTO subsolador (tipo_Maquina, nome_Maquina, marca_Maquina, ano_da_maquina, chassi_maquina,"
                        + " estado_maquina, peso, largura_em_mm, numero_de_hastes, potencia_do_trator_em_cv)\n"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, subsolador.getTipoMaquina());
                ps.setString(2, subsolador.getNomeMaquina());
                ps.setString(3, subsolador.getMarcaMaquina());
                ps.setInt(4, subsolador.getAnoMaquina());
                ps.setString(5, subsolador.getChassiMaquina());
                ps.setString(6, subsolador.getEstadoMaquina());
                ps.setDouble(7, subsolador.getPeso());
                ps.setDouble(8, subsolador.getLarguraEmMM());
                ps.setInt(9, subsolador.getNumeroDeHastes());
                ps.setInt(10, subsolador.getPotenciaNecessariaTratorEmCv());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Subsolador cadastrado com sucesso";
                } else {
                    msg = "Subsolador não foi cadastrado";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Subsolador " + ex.getMessage();
        }
        return msg;
    }

    public Subsolador buscarSubsolador(String nomeMaquina) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM subsolador WHERE nome_maquina = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeMaquina);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Subsolador subsoladorBusca = new Subsolador();
                subsoladorBusca.setNomeMaquina(resultados.getString("nome_maquina"));
                subsoladorBusca.setMarcaMaquina(resultados.getString("marca_maquina"));
                subsoladorBusca.setChassiMaquina(resultados.getString("chassi_maquina"));
                subsoladorBusca.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                subsoladorBusca.setEstadoMaquina(resultados.getString("estado_maquina"));
                subsoladorBusca.setLarguraEmMM(resultados.getDouble("largura_em_mm"));
                subsoladorBusca.setNumeroDeHastes(resultados.getInt("numero_de_hastes"));
                subsoladorBusca.setPeso(resultados.getDouble("peso"));
                subsoladorBusca.setPotenciaNecessariaTratorEmCv(resultados.getInt("potencia_do_trator_em_cv"));
                subsoladorBusca.setIdSubsolador(resultados.getInt("id_subsolador"));
                return subsoladorBusca;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerSubsolador(String nomeMaquina) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM subsolador WHERE nome_maquina = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeMaquina);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Subsolador removido com sucesso";
            } else {
                msg = "Subsolador não foi removido";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover Subsolador";
        }
        return msg;
    }

    public String atualizarSubsolador(Subsolador subsolador) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE subsolador SET nome_maquina = ?, marca_maquina = ?, chassi_maquina = ?, ano_da_maquina = ?,"
                    + " estado_maquina = ?, peso = ?, largura_em_mm = ?, numero_de_hastes = ?, potencia_do_trator_em_cv = ? WHERE id_subsolador = ?";

            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, subsolador.getNomeMaquina());
            ps.setString(2, subsolador.getMarcaMaquina());
            ps.setString(3, subsolador.getChassiMaquina());
            ps.setInt(4, subsolador.getAnoMaquina());
            ps.setString(5, subsolador.getEstadoMaquina());
            ps.setDouble(6, subsolador.getPeso());
            ps.setDouble(7, subsolador.getLarguraEmMM());
            ps.setInt(8, subsolador.getNumeroDeHastes());
            ps.setInt(9, subsolador.getPotenciaNecessariaTratorEmCv());
            ps.setInt(10, subsolador.getIdSubsolador());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Subsolador atualizado com sucesso";
            } else {
                return "Subsolador não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Subsolador";
        }
    }

    public List<Subsolador> readSubsolador() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM subsolador";

        List<Subsolador> subsoladores = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Subsolador subsolador1 = new Subsolador();
                subsolador1.setNomeMaquina(resultados.getString("nome_maquina"));
                subsolador1.setMarcaMaquina(resultados.getString("marca_maquina"));
                subsolador1.setEstadoMaquina(resultados.getString("estado_maquina"));
                subsolador1.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                subsolador1.setIdSubsolador(resultados.getInt("id_subsolador"));
                subsoladores.add(subsolador1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return subsoladores;
    }

    public void gerarRelatorioDeMaquinasEmPDF() throws SQLException, ParseException, IOException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM maquina";

        Document doc = new Document();

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = jFileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = jFileChooser.getSelectedFile();
            String nomePDF = selectedDirectory.getAbsolutePath() + File.separator + "relatorio_de_maquinas.pdf";
            
            try {
                ps = conexao.conn.prepareStatement(sql);
                resultados = ps.executeQuery();
                Font fonte2 = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
                Paragraph linhaEmBranco = new Paragraph(" ", fonte2);

                String imagePath = "/logo_ac_farm_system.png";
                Image imagem = Image.getInstance(getClass().getResource(imagePath));
                imagem.scaleToFit(55, 50);

                LineSeparator line = new LineSeparator();
                line.setLineWidth(0.5f);
                line.setPercentage(85f);

                PdfWriter.getInstance(doc, new FileOutputStream(nomePDF));
                doc.open();

                imagem.setAbsolutePosition(76, imagem.getAbsoluteY());
                doc.add(imagem);

                Font fonte = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
                Paragraph p = new Paragraph("Relatorio de Dados de Maquinas", fonte);

                Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonte2);
                Paragraph tiposDeDados = new Paragraph("            Tipos de dados: Maquinas cadastradas", fonte2);
                Paragraph formato = new Paragraph("            Formato: Tabela", fonte2);

                p.setAlignment(Element.ALIGN_CENTER);
                data.setAlignment(Element.ALIGN_JUSTIFIED);
                tiposDeDados.setAlignment(3);
                formato.setAlignment(3);

                doc.add(p);
                doc.add(linhaEmBranco);
                doc.add(line);
                doc.add(linhaEmBranco);
                doc.add(data);
                doc.add(tiposDeDados);
                doc.add(formato);
                doc.add(linhaEmBranco);
                doc.add(line);

                //Tamanho da coluna
                PdfPTable table = new PdfPTable(5);
                table.setWidthPercentage(85);
                table.setWidths(new int[]{2, 2, 2, 2, 2});

                PdfPCell cellNomeMaquina = new PdfPCell(new Paragraph("Nome"));
                PdfPCell cellMarcaMaquina = new PdfPCell(new Paragraph("Marca"));
                PdfPCell cellTipoMaquina = new PdfPCell(new Paragraph("Tipo"));
                PdfPCell cellAnoMaquina = new PdfPCell(new Paragraph("Ano"));
                PdfPCell cellEstadoMaquina = new PdfPCell(new Paragraph("Estado"));

                cellNomeMaquina.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellMarcaMaquina.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellTipoMaquina.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellAnoMaquina.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellEstadoMaquina.setBackgroundColor(BaseColor.LIGHT_GRAY);

                cellNomeMaquina.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellMarcaMaquina.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTipoMaquina.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellAnoMaquina.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellEstadoMaquina.setHorizontalAlignment(Element.ALIGN_CENTER);

                table.addCell(cellNomeMaquina);
                table.addCell(cellMarcaMaquina);
                table.addCell(cellTipoMaquina);
                table.addCell(cellAnoMaquina);
                table.addCell(cellEstadoMaquina);

                while (resultados.next()) {

                    maquina = new Maquina();

                    maquina.setNomeMaquina(resultados.getString("nome_maquina"));
                    maquina.setMarcaMaquina(resultados.getString("marca_maquina"));
                    maquina.setTipoMaquina(resultados.getString("tipo_maquina"));
                    maquina.setAnoMaquina(resultados.getInt("ano_da_maquina"));
                    maquina.setEstadoMaquina(resultados.getString("estado_maquina"));

                    cellNomeMaquina = new PdfPCell(new Paragraph(maquina.getNomeMaquina()));
                    cellMarcaMaquina = new PdfPCell(new Paragraph(maquina.getMarcaMaquina()));
                    cellTipoMaquina = new PdfPCell(new Paragraph(maquina.getTipoMaquina()));
                    cellAnoMaquina = new PdfPCell(new Paragraph(String.valueOf(maquina.getAnoMaquina())));
                    cellEstadoMaquina = new PdfPCell(new Paragraph(maquina.getEstadoMaquina()));

                    table.addCell(cellNomeMaquina);
                    table.addCell(cellMarcaMaquina);
                    table.addCell(cellTipoMaquina);
                    table.addCell(cellAnoMaquina);
                    table.addCell(cellEstadoMaquina);
                }

                doc.add(new Paragraph(" "));
                doc.add(table);
                doc.close();

                Desktop.getDesktop().open(new File(nomePDF));

            } catch (DocumentException | FileNotFoundException | SQLException | NullPointerException d) {
                d.getMessage();
            }
        }

    }
}
