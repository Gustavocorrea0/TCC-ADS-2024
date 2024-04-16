package acfarmsystemv2.telaDeInicio;

import ConexaoComBanco.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jasypt.util.password.BasicPasswordEncryptor;
import usuario.Usuario;

public class ControleUsuario {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;

    private Usuario usuario;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleUsuario() {
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
}
