package usuario;

import java.sql.*;
import ConexaoComBanco.Conecta;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class ControleUsuario {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;

    public Usuario usuario;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleUsuario() {
        conexao = new Conecta();
        usuario = new Usuario();
    }

    public String cadastrar(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO usuario (nome, senha, nivel_de_acesso) VALUES (?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);
                ps.setString(1, usuario.getNome());
                ps.setString(2, usuario.getSenha());
                ps.setString(3, usuario.getNivelDeAcesso());

                int linhasAfetadas = ps.executeUpdate();
                if (linhasAfetadas > 0) {
                    msg = "Usuário cadastrado com sucesso.";
                } else {
                    msg = "Nenhum usuário cadastrado.";
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
        }
        return msg;
    }

    public String remover(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
            return msg;
        }

        try {
            if (operacao == EXCLUSAO) {
                sql = "DELETE FROM usuario WHERE id = ?"; // Suponha que você tenha um campo ID para identificar o usuário.
                ps = conexao.conn.prepareStatement(sql);
                ps.setInt(1, usuario.getId()); // Passe o ID do usuário a ser excluído.
                int linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Usuário excluído com sucesso.";
                } else {
                    msg = "Nenhum usuário excluído.";
                }
            } else {
                msg = "Operação não suportada.";
            }
        } catch (SQLException ex) {
            msg = "Erro ao remover usuário: " + ex.getMessage();
        }
        return msg;
    }

    public String removerUsuarioPorNome(String nomeProducao) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM usuario WHERE nome = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeProducao);

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Usuario removido com sucesso";
            } else {
                msg = "Usuario não removido";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha ao remover o usuario";
        }

        return msg;
    }

    public Usuario buscarUsuario(String nome) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT nome, nivel_de_acesso, id FROM usuario WHERE nome = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nome);

            resultados = ps.executeQuery();

            if (resultados.next()) {
                Usuario usuario1 = new Usuario();
                //usuario1.setId(resultados.getInt("id")); 
                usuario1.setNome(resultados.getString("nome"));
                usuario1.setNivelDeAcesso(resultados.getString("nivel_de_acesso"));
                usuario1.setId(resultados.getInt("id"));
                return usuario1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public Usuario buscarUsuarioPorNome(String nome, String senha) {
        if (!conexao.getConexao()) {
            return null; // Retorna null em caso de falha na conexão.
        }

        try {
            sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultados.getInt("id"));
                usuario.setNome(resultados.getString("nome"));
                usuario.setSenha(resultados.getString("senha"));
                usuario.setNivelDeAcesso(resultados.getString("nivel_de_acesso"));
                return usuario; // Retorna o usuário encontrado.
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Fecha os recursos (PreparedStatement e ResultSet) para evitar vazamento de recursos
            try {
                if (ps != null) {
                    ps.close();
                }
                if (resultados != null) {
                    resultados.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String atualizarUsuario(Usuario usuario) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE usuario SET nome = ?, nivel_de_acesso = ? WHERE id = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getNivelDeAcesso());
            ps.setInt(3, usuario.getId());

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Usuário atualizado com sucesso"; // Retorna uma mensagem de sucesso.
            } else {
                return "Usuário não encontrado"; // Retorna uma mensagem se o usuário não for encontrado.
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Lida com exceções adequadamente na sua aplicação.
            return "Falha ao atualizar o usuário"; // Retorna uma mensagem de erro em caso de falha na atualização.
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

    public List<Usuario> readUsuario() {

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM usuario";

        List<Usuario> usuarios = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultados.getInt("id"));
                usuario.setNome(resultados.getString("nome"));
                usuario.setNivelDeAcesso(resultados.getString("nivel_de_acesso"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    public Usuario executarLogin(String nome) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM usuario WHERE nome = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nome);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                usuario.setNome(resultados.getString("nome"));
                usuario.setSenha(resultados.getString("senha"));
                usuario.setNivelDeAcesso(resultados.getString("nivel_de_acesso"));
                return usuario;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
