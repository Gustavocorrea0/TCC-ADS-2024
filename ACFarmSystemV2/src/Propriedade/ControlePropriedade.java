package Propriedade;

import ConexaoComBanco.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class ControlePropriedade {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    public Propriedade propriedade;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControlePropriedade() {
        conexao = new Conecta();
        propriedade = new Propriedade();
    }

    public String cadastrarPropriedade(byte operacao) {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO propriedade (nome_propriedade, local_propriedade, area_propriedade, tipo_de_cultura_propriedade, estado, cidade) VALUES (?, ?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, propriedade.getNomePropriedade());
                ps.setString(2, propriedade.getLocalPropriedade());
                ps.setDouble(3, propriedade.getAreaPropriedade());
                ps.setString(4, propriedade.getTipoDeCulturaDaPropriedade());
                ps.setString(5, propriedade.getEstado());
                ps.setString(6, propriedade.getCidade());

                int linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Propriedade cadastrada com sucesso.";
                } else {
                    msg = "Nenhuma propriedade cadastrada.";
                }

            } else {
                msg = "Operação não suportada.";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar usuário: " + ex.getMessage();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            return msg;
        }
    }

    public String atualizarPropriedade(Propriedade propriedade) {

        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE propriedade SET nome_propriedade = ?, local_propriedade = ?, area_propriedade = ?, tipo_de_cultura_propriedade = ?, estado = ?, cidade = ? WHERE id_propriedade = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, propriedade.getNomePropriedade());
            ps.setString(2, propriedade.getLocalPropriedade());
            ps.setDouble(3, propriedade.getAreaPropriedade());
            ps.setString(4, propriedade.getTipoDeCulturaDaPropriedade());
            ps.setString(5, propriedade.getEstado());
            ps.setString(6, propriedade.getCidade());
            ps.setInt(7, propriedade.getIdPropriedade());

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Propriedade atualizada com sucesso";
            } else {
                return "Propriedade não encontrada";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar o propriedade";
        }
    }

    public List<Propriedade> readPropriedade() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT nome_propriedade AS nome, area_propriedade AS area, cidade, tipo_de_cultura_propriedade AS cultura, id_propriedade AS id FROM propriedade";

        List<Propriedade> propriedades = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Propriedade propriedadeEncontrada = new Propriedade();
                propriedadeEncontrada.setNomePropriedade(resultados.getString("nome"));
                propriedadeEncontrada.setAreaPropriedade(resultados.getDouble("area"));
                propriedadeEncontrada.setCidade(resultados.getString("cidade"));
                propriedadeEncontrada.setTipoDeCulturaDaPropriedade(resultados.getString("cultura"));
                propriedades.add(propriedadeEncontrada);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlePropriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return propriedades;
    }

    public Propriedade buscarPropriedadePorNome(String nome) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM propriedade WHERE nome_propriedade = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nome);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Propriedade propriedade1 = new Propriedade();
                propriedade1.setIdPropriedade(resultados.getInt("id_propriedade"));
                propriedade1.setNomePropriedade(resultados.getString("nome_propriedade"));
                propriedade1.setLocalPropriedade(resultados.getString("local_propriedade"));
                propriedade1.setAreaPropriedade(resultados.getDouble("area_propriedade"));
                propriedade1.setTipoDeCulturaDaPropriedade(resultados.getString("tipo_de_cultura_propriedade"));
                propriedade1.setEstado(resultados.getString("estado"));
                propriedade1.setCidade(resultados.getString("cidade"));
                return propriedade1;

            } else {

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public String removerPropriedadePorNome(String nome) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM propriedade WHERE nome_propriedade = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nome);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Propriedade removida com sucesso";
            } else {
                msg = "Propriedade não removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover  a propriedade";
        }
        return msg;
    }

}
