package Subdivisao;

import ConexaoComBanco.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControleSubdivisao {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    public Subdivisao subdivisao;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleSubdivisao() {
        conexao = new Conecta();
        subdivisao = new Subdivisao();
    }

    public String cadastrarSubdivisao(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO subdivisao (nome_subdivisao, area_subdivisao, tipo_de_cultura_subdivisao, id_propriedade, nome_propriedade) VALUES (?,?,?,?,?)";
                ps = conexao.conn.prepareStatement(sql);
                ps.setString(1, subdivisao.getNomeSubdivisao());
                ps.setDouble(2, subdivisao.getAreaSubdivisao());
                ps.setString(3, subdivisao.getCulturaSubdivisao());
                ps.setInt(4, subdivisao.getIdPropriedade());
                ps.setString(5, subdivisao.getNomePropriedade());

                int linhasAfetadas = ps.executeUpdate();
                if (linhasAfetadas > 0) {
                    msg = "Subdivisão cadastrada com sucesso.";
                } else {
                    msg = "Nenhum subdivisão cadastrada.";
                }
            } else {
                msg = "Operação não suportada.";
            }
        } catch (SQLException ex) {
            msg = "Erro ao cadastrar subdivisao: " + ex.getMessage();
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

    public Subdivisao buscarSubdivisao(String nomeSubdivisao) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM subdivisao WHERE nome_subdivisao = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeSubdivisao);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Subdivisao subdivisaoBuscada = new Subdivisao();

                subdivisaoBuscada.setNomeSubdivisao(resultados.getString("nome_subdivisao"));
                subdivisaoBuscada.setAreaSubdivisao(resultados.getDouble("area_subdivisao"));
                subdivisaoBuscada.setCulturaSubdivisao(resultados.getString("tipo_de_cultura_subdivisao"));
                subdivisaoBuscada.setIdPropriedade(resultados.getInt("id_subdivisao"));
                subdivisaoBuscada.setNomePropriedade(resultados.getString("nome_propriedade"));

                return subdivisaoBuscada;
            } else {
                msg = "Operação inválida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerSubdivisao(String nomeSubdivisao) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM subdivisao WHERE nome_subdivisao = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeSubdivisao);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Subdivisao removida com sucesso";
            } else {
                msg = "Falha ao remover subdivisao";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover subdivisao";
        }

        return msg;
    }

    public List<Subdivisao> lerSubdivisao() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM subdivisao";

        List<Subdivisao> subdivisoes = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Subdivisao subdivisaoBuscada = new Subdivisao();
                subdivisaoBuscada.setNomeSubdivisao(resultados.getString("nome_subdivisao"));
                subdivisaoBuscada.setAreaSubdivisao(resultados.getDouble("area_subdivisao"));
                subdivisaoBuscada.setCulturaSubdivisao(resultados.getString("tipo_de_cultura_subdivisao"));
                subdivisaoBuscada.setNomePropriedade(resultados.getString("nome_propriedade"));
                subdivisoes.add(subdivisaoBuscada);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return subdivisoes;
    }

    public String atualizarSubdivisao(Subdivisao subdivisao) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE subdivisao SET nome_subdivisao = ?, area_subdivisao = ?, tipo_de_cultura_subdivisao = ?, nome_propriedade = ? WHERE id_subdivisao = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, subdivisao.getNomeSubdivisao());
            ps.setDouble(2, subdivisao.getAreaSubdivisao());
            ps.setString(3, subdivisao.getCulturaSubdivisao());
            ps.setString(4, subdivisao.getNomePropriedade());
            ps.setInt(5, subdivisao.getIdSubdivisao());

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Subdivisão atualizada com sucesso";
            } else {
                return "Falha ao atualizar subdivisão";
            }

        } catch (Exception ex) {
            return "Falha ao atualizar subdivisão" + ex.getMessage();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

}
