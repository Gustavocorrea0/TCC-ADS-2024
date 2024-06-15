package planta;

import ConexaoComBanco.Conecta;
import Propriedade.Propriedade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControlePlanta {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;
    public Planta planta;
    public Soja soja;
    public Milho milho;
    public Propriedade propriedade;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControlePlanta() {
        conexao = new Conecta();
        planta = new Planta();
        soja = new Soja();
        milho = new Milho();
        propriedade = new Propriedade();
    }

    public String cadastrarMilho(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO milho (nome_propriedade, nome_fornecedor, tipo_de_planta, ciclo_em_dias, data_de_plantio,"
                        + " altura_atual_da_planta, data_de_surgimento_de_espigas) VALUES (?, ?, ?, ?, ?, ?, ?)";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, milho.getNomePropriedade());
                ps.setString(2, milho.getNomeFornecedor());
                ps.setString(3, milho.getTipoDePlanta());
                ps.setInt(4, milho.getCicloEmDias());
                ps.setDate(5, new java.sql.Date(milho.getDataDePlantio().getTime()));
                ps.setDouble(6, milho.getAlturaAtualDaPlanta());
                ps.setDate(7, new java.sql.Date(milho.getDataDeSurgimentoDeEspigas().getTime()));

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Planta lançada com sucesso";
                } else {
                    msg = "A planta não foi lançada";
                }

            } else {
                msg = "Operação não suportada";
            }
        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Planta " + ex.getMessage();
        }

        return msg;
    }

    public Milho consultarMilho(int idMilho) {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM milho WHERE id_milho = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setInt(1, idMilho);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Milho plantaBuscada = new Milho();

                plantaBuscada.setNomeFornecedor(resultados.getString("nome_fornecedor"));
                plantaBuscada.setNomePropriedade(resultados.getString("nome_propriedade"));
                plantaBuscada.setTipoDePlanta(resultados.getString("tipo_de_planta"));
                plantaBuscada.setCicloEmDias(resultados.getInt("ciclo_em_dias"));
                plantaBuscada.setDataDePlantio(resultados.getDate("data_de_plantio"));
                plantaBuscada.setAlturaAtualDaPlanta(resultados.getDouble("altura_atual_da_planta"));
                plantaBuscada.setDataDeSurgimentoDeEspigas(resultados.getDate("data_de_surgimento_de_espigas"));

                return plantaBuscada;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerMilho(int id) {

        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM milho WHERE id_milho = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setInt(1, id);

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Planta removida com sucesso";
            } else {
                msg = "A planta não foi removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String atualizarMilho(Milho milho) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE milho SET altura_atual_da_planta = ?, data_de_surgimento_de_espigas = ? WHERE id_milho = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setDouble(1, milho.getAlturaAtualDaPlanta());
            ps.setDate(2, new java.sql.Date(milho.getDataDeSurgimentoDeEspigas().getTime()));
            ps.setInt(3, milho.getIdMilho());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Planta atualizada";
            } else {
                return "Planta não atualizada";
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

        return msg;
    }

    public String cadastrarSoja(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO soja (nome_propriedade, nome_fornecedor, tipo_de_planta, ciclo_em_dias, data_de_plantio,"
                        + " altura_atual_da_planta, data_de_surgimento_de_sementes) VALUES (?, ?, ?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, soja.getNomePropriedade());
                ps.setString(2, soja.getNomeFornecedor());
                ps.setString(3, soja.getTipoDePlanta());
                ps.setInt(4, soja.getCicloEmDias());
                ps.setDate(5, new java.sql.Date(soja.getDataDePlantio().getTime()));
                ps.setDouble(6, soja.getAlturaAtualDaPlanta());
                ps.setDate(7, new java.sql.Date(soja.getDataDeSurgimentoDeSementes().getTime()));

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Planta lançada com sucesso";
                } else {
                    msg = "A planta não foi lançada";
                }
            } else {
                msg = "Operação não suportada";
            }
        } catch (SQLException ex) {
            msg = "Erro ao cadastrar Planta " + ex.getMessage();
        }

        return msg;
    }

    public Soja consultarSoja(int id) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM soja WHERE id_soja = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setInt(1, id);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Soja plantaBuscada = new Soja();

                plantaBuscada.setNomeFornecedor(resultados.getString("nome_fornecedor"));
                plantaBuscada.setNomePropriedade(resultados.getString("nome_propriedade"));
                plantaBuscada.setTipoDePlanta(resultados.getString("tipo_de_planta"));
                plantaBuscada.setCicloEmDias(resultados.getInt("ciclo_em_dias"));
                plantaBuscada.setDataDePlantio(resultados.getDate("data_de_plantio"));
                plantaBuscada.setAlturaAtualDaPlanta(resultados.getDouble("altura_atual_da_planta"));
                plantaBuscada.setDataDeSurgimentoDeSementes(resultados.getDate("data_de_surgimento_de_sementes"));

                return plantaBuscada;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerSoja(int id) {

        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM soja WHERE id_soja = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setInt(1, id);

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Planta removida com sucesso";
            } else {
                msg = "A planta não foi removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String atualizarSoja(Soja soja) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE soja SET altura_atual_da_planta = ?, data_de_surgimento_de_sementes = ? WHERE id_soja = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setDouble(1, soja.getAlturaAtualDaPlanta());
            ps.setDate(2, new java.sql.Date(soja.getDataDeSurgimentoDeSementes().getTime()));
            ps.setInt(3, soja.getIdSoja());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Planta de soja atualizada";
            } else {
                return "Planta de soja não atualizada";
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

        return msg;
    }

    public List<Soja> readSoja() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM soja";

        List<Soja> sojas = new ArrayList<>();

        try {
            ps = conexao.conn.prepareCall(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Soja sojaBuscado = new Soja();
                sojaBuscado.setIdSoja(resultados.getInt("id_soja"));
                sojaBuscado.setNomeFornecedor(resultados.getString("nome_fornecedor"));
                sojaBuscado.setAlturaAtualDaPlanta(resultados.getDouble("altura_atual_da_planta"));
                sojaBuscado.setNomePropriedade(resultados.getString("nome_propriedade"));
                sojas.add(sojaBuscado);
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

        return sojas;

    }

    public List<Milho> readMilho() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM milho";

        List<Milho> milhos = new ArrayList<>();

        try {
            ps = conexao.conn.prepareCall(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Milho milho1 = new Milho();
                milho1.setIdMilho(resultados.getInt("id_milho"));
                milho1.setNomeFornecedor(resultados.getString("nome_fornecedor"));
                milho1.setAlturaAtualDaPlanta(resultados.getDouble("altura_atual_da_planta"));
                milho1.setNomePropriedade(resultados.getString("nome_propriedade"));
                milhos.add(milho1);
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

        return milhos;

    }

}
