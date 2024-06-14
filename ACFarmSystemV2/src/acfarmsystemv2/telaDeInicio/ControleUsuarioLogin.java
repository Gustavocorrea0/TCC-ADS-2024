package acfarmsystemv2.telaDeInicio;

import ConexaoComBanco.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import usuario.Usuario;

public class ControleUsuarioLogin {

    public static Conecta conexao = new Conecta();
    public static PreparedStatement ps;
    public static ResultSet resultados;
    public static String msg;
    public static String sql;
    private int linhasAfetadas;

    public Usuario usuario;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleUsuarioLogin() {
        conexao = new Conecta();
        usuario = new Usuario();
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
                return usuario;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public String cadastrarPrimeiroUsuario(byte operacao) {
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

                linhasAfetadas = ps.executeUpdate();
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

    public static boolean buscarUsuario() {
        if (!conexao.getConexao()) {
            return false;
        }

        try {
            sql = "SELECT * FROM usuario WHERE nivel_de_acesso = 'M'";
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            if (!resultados.isBeforeFirst()) {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar usuarios no banco: " + ex);
        }
        return true;
    }
}
