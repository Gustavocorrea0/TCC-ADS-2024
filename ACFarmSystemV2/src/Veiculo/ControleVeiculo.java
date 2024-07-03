package Veiculo;

import ConexaoComBanco.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControleVeiculo {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    public Trator trator;
    public Carro carro = new Carro();
    public CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporte;
    private int linhasAfetadas;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleVeiculo() {
        conexao = new Conecta();
        trator = new Trator();
        caminhaoOuVeiculoDeTransporte = new CaminhaoOuVeiculoDeTransporte();
    }

    public Trator buscarTratorPorNome(String nomeTrator) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM trator WHERE nome_veiculo = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeTrator);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Trator trator = new Trator();
                trator.setTipoVeiculo(resultados.getString("tipo_veiculo"));
                trator.setNomeVeiculo(resultados.getString("nome_veiculo"));
                trator.setMarcaVeiculo(resultados.getString("marca_veiculo"));
                trator.setAnoVeiculo(resultados.getInt("ano_veiculo"));
                trator.setChassiVeiculo(resultados.getString("chassi_veiculo"));
                trator.setEstadoVeiculo(resultados.getString("estado_veiculo"));
                trator.setCapacidadeDoTanqueDeCombustivel(resultados.getDouble("capacidade_do_tanque_de_combustivel"));
                trator.setQuantidadeDeMarchas(resultados.getInt("numero_de_marchas"));
                trator.setQuantidadeDeRodas(resultados.getInt("quantidade_de_rodas"));
                trator.setPotenciaEmCV(resultados.getInt("potencia_em_cv"));
                trator.setIdTrator(resultados.getInt("id_trator"));

                return trator;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String cadastrarTrator(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexão com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO trator (tipo_veiculo, nome_veiculo, marca_veiculo, ano_veiculo, chassi_veiculo, estado_veiculo, "
                        + "capacidade_do_tanque_de_combustivel, numero_de_marchas, quantidade_de_rodas, potencia_em_cv) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, trator.getTipoVeiculo());
                ps.setString(2, trator.getNomeVeiculo());
                ps.setString(3, trator.getMarcaVeiculo());
                ps.setInt(4, trator.getAnoVeiculo());
                ps.setString(5, trator.getChassiVeiculo());
                ps.setString(6, trator.getEstadoVeiculo());
                ps.setDouble(7, trator.getCapacidadeDoTanqueDeCombustivel());
                ps.setInt(8, trator.getQuantidadeDeMarchas());
                ps.setInt(9, trator.getQuantidadeDeRodas());
                ps.setInt(10, trator.getPotenciaEmCV());

                int linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Trator cadastrado com sucesso";
                } else {
                    msg = "Trator não foi cadastrado";
                }
            } else {
                msg = "Operação não suportada";
            }
        } catch (SQLException ex) {
            msg = "Erro ao cadastrar trator: " + ex.getMessage();
        }
        return msg;
    }

    public String removerTratorPorNome(String nome) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM trator WHERE nome_veiculo = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nome);

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Trator removido com sucesso";
            } else {
                msg = "Trator não removido";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover veiculo";
        }
        return msg;
    }

    public String atualizarTrator(Trator trator) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE trator SET nome_veiculo = ?, marca_veiculo = ?, ano_veiculo = ?, chassi_veiculo = ?,"
                    + " estado_veiculo = ?, capacidade_do_tanque_de_combustivel = ?, numero_de_marchas = ?,  quantidade_de_rodas = ?, "
                    + " potencia_em_cv = ? WHERE id_trator = ?";

            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, trator.getNomeVeiculo());
            ps.setString(2, trator.getMarcaVeiculo());
            ps.setInt(3, trator.getAnoVeiculo());
            ps.setString(4, trator.getChassiVeiculo());
            ps.setString(5, trator.getEstadoVeiculo());
            ps.setDouble(6, trator.getCapacidadeDoTanqueDeCombustivel());
            ps.setInt(7, trator.getQuantidadeDeMarchas());
            ps.setInt(8, trator.getQuantidadeDeRodas());
            ps.setInt(9, trator.getPotenciaEmCV());
            ps.setInt(10, trator.getIdTrator());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Trator atualizado com sucesso";
            } else {
                return "Trator não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Trator";
        }
    }

    public String atualizarCaminhaoOuVeiculoDeTransporte(CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporte) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE caminhao_ou_veiculo_de_transporte SET nome_veiculo = ?, marca_veiculo = ?, ano_veiculo = ?, chassi_veiculo = ?,"
                    + " estado_veiculo = ?, capacidade_do_tanque_de_combustivel = ?, capacidade_de_carga = ? WHERE id_caminhao_ou_veiculo_de_transporte = ?";

            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, caminhaoOuVeiculoDeTransporte.getNomeVeiculo());
            ps.setString(2, caminhaoOuVeiculoDeTransporte.getMarcaVeiculo());
            ps.setInt(3, caminhaoOuVeiculoDeTransporte.getAnoVeiculo());
            ps.setString(4, caminhaoOuVeiculoDeTransporte.getChassiVeiculo());
            ps.setString(5, caminhaoOuVeiculoDeTransporte.getEstadoVeiculo());
            ps.setDouble(6, caminhaoOuVeiculoDeTransporte.getCapacidadeDoTanqueDeCombustivel());
            ps.setDouble(7, caminhaoOuVeiculoDeTransporte.getCapacidadeDeCarga());
            ps.setLong(8, caminhaoOuVeiculoDeTransporte.getIdCaminhaoOuVeiculoDeTransporte());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Veiculo de transporte/caminhao atualizado com sucesso";
            } else {
                return "Veiculo de transporte/caminhao não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Veiculo de transporte/caminhao";
        }
    }

    public String cadastrarCaminhaoOuVeiculoDeTransporte(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexão com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {

                sql = "INSERT INTO caminhao_ou_veiculo_de_transporte (tipo_veiculo, nome_veiculo, marca_veiculo, ano_veiculo, chassi_veiculo, estado_veiculo, capacidade_do_tanque_de_combustivel, capacidade_de_carga)\n"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, caminhaoOuVeiculoDeTransporte.getTipoVeiculo());
                ps.setString(2, caminhaoOuVeiculoDeTransporte.getNomeVeiculo());
                ps.setString(3, caminhaoOuVeiculoDeTransporte.getMarcaVeiculo());
                ps.setInt(4, caminhaoOuVeiculoDeTransporte.getAnoVeiculo());
                ps.setString(5, caminhaoOuVeiculoDeTransporte.getChassiVeiculo());
                ps.setString(6, caminhaoOuVeiculoDeTransporte.getEstadoVeiculo());
                ps.setDouble(7, caminhaoOuVeiculoDeTransporte.getCapacidadeDoTanqueDeCombustivel());
                ps.setDouble(8, caminhaoOuVeiculoDeTransporte.getCapacidadeDeCarga());

                int linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Veiculo de transporte cadastrado com sucesso";
                } else {
                    msg = "Veiculo de transporte não foi cadastrado";
                }
            } else {
                msg = "Operação não suportada";
            }
        } catch (SQLException ex) {
            msg = "Erro no banco de dados cadastrar veiculo de transporte: " + ex.getMessage();
        }
        return msg;
    }

    public CaminhaoOuVeiculoDeTransporte buscarCaminhaoOuVeiculoDeTransportePorNome(String nomeVeiculo) {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM caminhao_ou_veiculo_de_transporte WHERE nome_veiculo =  ?";

            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeVeiculo);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporteBuscado = new CaminhaoOuVeiculoDeTransporte();

                caminhaoOuVeiculoDeTransporteBuscado.setTipoVeiculo(resultados.getString("tipo_veiculo"));
                caminhaoOuVeiculoDeTransporteBuscado.setNomeVeiculo(resultados.getString("nome_veiculo"));
                caminhaoOuVeiculoDeTransporteBuscado.setMarcaVeiculo(resultados.getString("marca_veiculo"));
                caminhaoOuVeiculoDeTransporteBuscado.setAnoVeiculo(resultados.getInt("ano_veiculo"));
                caminhaoOuVeiculoDeTransporteBuscado.setChassiVeiculo(resultados.getString("chassi_veiculo"));
                caminhaoOuVeiculoDeTransporteBuscado.setEstadoVeiculo(resultados.getString("estado_veiculo"));
                caminhaoOuVeiculoDeTransporteBuscado.setCapacidadeDoTanqueDeCombustivel(resultados.getDouble("capacidade_do_tanque_de_combustivel"));
                caminhaoOuVeiculoDeTransporteBuscado.setCapacidadeDeCarga(resultados.getDouble("capacidade_de_carga"));
                caminhaoOuVeiculoDeTransporteBuscado.setIdCaminhaoOuVeiculoDeTransporte(resultados.getInt("id_caminhao_ou_veiculo_de_transporte"));

                return caminhaoOuVeiculoDeTransporteBuscado;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerCaminhaoOuVeiculoDeTransportePorNome(String nomeVeiculo) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM caminhao_ou_veiculo_de_transporte WHERE nome_veiculo = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeVeiculo);

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Veiculo de Transporte removido com sucesso";
            } else {
                msg = "Veiculo de Transporte não removido";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover veiculo de transporte";
        }
        return msg;
    }

    public List<CaminhaoOuVeiculoDeTransporte> readCaminhaoOuVeiculoDeTransporte() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM caminhao_ou_veiculo_de_transporte";

        List<CaminhaoOuVeiculoDeTransporte> caminhaoOuVeiculoDeTransportes = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporte1 = new CaminhaoOuVeiculoDeTransporte();
                caminhaoOuVeiculoDeTransporte1.setIdCaminhaoOuVeiculoDeTransporte(resultados.getInt("id_caminhao_ou_veiculo_de_transporte"));
                caminhaoOuVeiculoDeTransporte1.setNomeVeiculo(resultados.getString("nome_veiculo"));
                caminhaoOuVeiculoDeTransporte1.setMarcaVeiculo(resultados.getString("marca_veiculo"));
                caminhaoOuVeiculoDeTransporte1.setAnoVeiculo(resultados.getInt("ano_veiculo"));
                caminhaoOuVeiculoDeTransporte1.setTipoVeiculo(resultados.getString("tipo_veiculo"));
                caminhaoOuVeiculoDeTransportes.add(caminhaoOuVeiculoDeTransporte1);
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
        return caminhaoOuVeiculoDeTransportes;
    }

    public List<Trator> readTrator() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM trator";

        List<Trator> tratores = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Trator trator = new Trator();
                trator.setNomeVeiculo(resultados.getString("nome_veiculo"));
                trator.setMarcaVeiculo(resultados.getString("marca_veiculo"));
                trator.setAnoVeiculo(resultados.getInt("ano_veiculo"));
                trator.setIdTrator(resultados.getInt("id_trator"));
                tratores.add(trator);
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
        return tratores;
    }

    public String cadastrarCarro(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexão com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO carro (tipo_veiculo, nome_veiculo, marca_veiculo, ano_veiculo, chassi_veiculo, estado_veiculo, "
                        + "capacidade_do_tanque_de_combustivel, placa_carro, cor_carro, quilometragem_carro ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, carro.getTipoVeiculo());
                ps.setString(2, carro.getNomeVeiculo());
                ps.setString(3, carro.getMarcaVeiculo());
                ps.setInt(4, carro.getAnoVeiculo());
                ps.setString(5, carro.getChassiVeiculo());
                ps.setString(6, carro.getEstadoVeiculo());
                ps.setDouble(7, carro.getCapacidadeDoTanqueDeCombustivel());
                ps.setString(8, carro.getPlacaCarro());
                ps.setString(9, carro.getCorCarro());
                ps.setInt(10, carro.getQuilometragemCarro());

                int linhasAfetadas1 = ps.executeUpdate();

                if (linhasAfetadas1 > 0) {
                    msg = "Carro cadastrado com sucesso";
                } else {
                    msg = "Carro não foi cadastrado";
                }
            } else {
                msg = "Operação não suportada";
            }
        } catch (SQLException ex) {
            msg = "Falha ao cadastrar Carro: " + ex.getMessage();
        }
        return msg;
    }

    public String removerCarro(String nomeCarro) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM carro WHERE placa_carro = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeCarro);

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Carro removido com sucesso";
            } else {
                msg = "Carro não removido";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover veiculo";
        }
        return msg;
    }

    public Carro buscarCarroPorNome(String nomeCarro) {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM carro WHERE nome_veiculo = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeCarro);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Carro carroEncontrado = new Carro();

                carroEncontrado.setTipoVeiculo(resultados.getString("tipo_veiculo"));
                carroEncontrado.setNomeVeiculo(resultados.getString("nome_veiculo"));
                carroEncontrado.setMarcaVeiculo(resultados.getString("marca_veiculo"));
                carroEncontrado.setAnoVeiculo(resultados.getInt("ano_veiculo"));
                carroEncontrado.setChassiVeiculo(resultados.getString("chassi_veiculo"));
                carroEncontrado.setEstadoVeiculo(resultados.getString("estado_veiculo"));
                carroEncontrado.setCapacidadeDoTanqueDeCombustivel(resultados.getDouble("capacidade_do_tanque_de_combustivel"));
                carroEncontrado.setPlacaCarro(resultados.getString("placa_carro"));
                carroEncontrado.setCorCarro(resultados.getString("cor_carro"));
                carroEncontrado.setQuilometragemCarro(resultados.getInt("quilometragem_carro"));
                carroEncontrado.setIdCarro(resultados.getInt("id_carro"));
                return carroEncontrado;

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Carro buscarCarroPorPlaca(String placaCarro) {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM carro WHERE placa_carro = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, placaCarro);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Carro carroEncontrado = new Carro();

                carroEncontrado.setTipoVeiculo(resultados.getString("tipo_veiculo"));
                carroEncontrado.setNomeVeiculo(resultados.getString("nome_veiculo"));
                carroEncontrado.setMarcaVeiculo(resultados.getString("marca_veiculo"));
                carroEncontrado.setAnoVeiculo(resultados.getInt("ano_veiculo"));
                carroEncontrado.setChassiVeiculo(resultados.getString("chassi_veiculo"));
                carroEncontrado.setEstadoVeiculo(resultados.getString("estado_veiculo"));
                carroEncontrado.setCapacidadeDoTanqueDeCombustivel(resultados.getDouble("capacidade_do_tanque_de_combustivel"));
                carroEncontrado.setPlacaCarro(resultados.getString("placa_carro"));
                carroEncontrado.setCorCarro(resultados.getString("cor_carro"));
                carroEncontrado.setQuilometragemCarro(resultados.getInt("quilometragem_carro"));
                carroEncontrado.setIdCarro(resultados.getInt("id_carro"));
                return carroEncontrado;

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String atualizarCarro(Carro carro) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE carro SET nome_veiculo = ?, marca_veiculo = ?, ano_veiculo = ?, chassi_veiculo = ?,"
                    + " estado_veiculo = ?, capacidade_do_tanque_de_combustivel = ?, placa_carro = ?, cor_carro = ?, "
                    + "quilometragem_carro = ? WHERE id_carro = ?";

            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, carro.getNomeVeiculo());
            ps.setString(2, carro.getMarcaVeiculo());
            ps.setInt(3, carro.getAnoVeiculo());
            ps.setString(4, carro.getChassiVeiculo());
            ps.setString(5, carro.getEstadoVeiculo());
            ps.setDouble(6, carro.getCapacidadeDoTanqueDeCombustivel());
            ps.setString(7, carro.getPlacaCarro());
            ps.setString(8, carro.getCorCarro());
            ps.setInt(9, carro.getQuilometragemCarro());
            ps.setInt(10, carro.getIdCarro());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Carro atualizado com sucesso";
            } else {
                return "Carro não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Carro";
        }
    }

    public List<Carro> readCarro() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM carro";

        List<Carro> carros = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Carro carroBusca = new Carro();
                carroBusca.setNomeVeiculo(resultados.getString("nome_veiculo"));
                carroBusca.setMarcaVeiculo(resultados.getString("marca_veiculo"));
                carroBusca.setAnoVeiculo(resultados.getInt("ano_veiculo"));
                carroBusca.setPlacaCarro(resultados.getString("placa_carro"));
                carros.add(carroBusca);
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
        return carros;
    }
}
