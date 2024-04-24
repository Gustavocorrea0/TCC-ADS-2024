package cliente;

import ConexaoComBanco.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControleCliente {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;

    public Cliente cliente;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleCliente() {
        conexao = new Conecta();
        cliente = new Cliente();
    }

    public String cadastrarCliente(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO cliente (nome_cliente, cpf_ou_cnpj_cliente, cep_cliente, cidade_cliente, estado_cliente, endereco_cliente, telefone_cliente, tipo_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, cliente.getNomeCliente());
                ps.setString(2, cliente.getCnpjOuCpfCliente());
                ps.setString(3, cliente.getCepCliente());
                ps.setString(4, cliente.getCidadeCliente());
                ps.setString(5, cliente.getEstadoCliente());
                ps.setString(6, cliente.getEnderecoCliente());
                ps.setString(7, cliente.getTelefoneCliente());
                ps.setString(8, cliente.getTipoCliente());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Cliente cadastrado com sucesso";
                } else {
                    msg = "O cliente não foi cadastrado";
                }

            } else {
                msg = "Operação não suportada";
            }
        } catch (SQLException ex) {
            msg = "Erro ao cadastrar cliente " + ex.getMessage();
        }
        return msg;
    }

    public Cliente buscarCliente(String nomeCliente) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM cliente WHERE nome_cliente = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeCliente);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Cliente clienteBuscado = new Cliente();

                clienteBuscado.setNomeCliente(resultados.getString("nome_cliente"));
                clienteBuscado.setCepCliente(resultados.getString("cep_cliente"));
                clienteBuscado.setCidadeCliente(resultados.getString("cidade_cliente"));
                clienteBuscado.setCnpjOuCpfCliente(resultados.getString("cpf_ou_cnpj_cliente"));
                clienteBuscado.setEnderecoCliente(resultados.getString("endereco_cliente"));
                clienteBuscado.setEstadoCliente(resultados.getString("estado_cliente"));
                clienteBuscado.setIdCliente(resultados.getInt("id_cliente"));
                clienteBuscado.setTelefoneCliente(resultados.getString("telefone_cliente"));
                clienteBuscado.setTipoCliente(resultados.getString("tipo_cliente"));

                return clienteBuscado;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public String removerCliente(String nomeCliente) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM cliente WHERE nome_cliente = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeCliente);

            int linhasAfetadas1 = ps.executeUpdate();

            if (linhasAfetadas1 > 0) {
                msg = "Cliente removido com sucesso";
            } else {
                msg = "Cliente não removido";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover fornecedor";
        }
        return msg;
    }

    public String atualizarCliente(Cliente cliente) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE cliente SET nome_cliente = ?, cpf_ou_cnpj_cliente = ?, cep_cliente = ?, cidade_cliente = ?, estado_cliente = ?"
                    + ", endereco_cliente = ?, telefone_cliente = ?, tipo_cliente = ? WHERE id_cliente = ? ";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getCnpjOuCpfCliente());
            ps.setString(3, cliente.getCepCliente());
            ps.setString(4, cliente.getCidadeCliente());
            ps.setString(5, cliente.getEstadoCliente());
            ps.setString(6, cliente.getEnderecoCliente());
            ps.setString(7, cliente.getTelefoneCliente());
            ps.setString(8, cliente.getTipoCliente());
            ps.setInt(9, cliente.getIdCliente());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Cliente atualizado com sucesso";
            } else {
                return "Cliente não encontrado";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar fornecedor";
        }
    }

    public List<Cliente> readCliente() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM cliente";

        List<Cliente> clientes = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Cliente cliente1 = new Cliente();

                cliente1.setNomeCliente(resultados.getString("nome_cliente"));
                cliente1.setCepCliente(resultados.getString("cep_cliente"));
                cliente1.setCidadeCliente(resultados.getString("cidade_cliente"));
                cliente1.setCnpjOuCpfCliente(resultados.getString("cpf_ou_cnpj_cliente"));
                cliente1.setEnderecoCliente(resultados.getString("endereco_cliente"));
                cliente1.setEstadoCliente(resultados.getString("estado_cliente"));
                cliente1.setIdCliente(resultados.getInt("id_cliente"));
                cliente1.setTelefoneCliente(resultados.getString("telefone_cliente"));
                cliente1.setTipoCliente(resultados.getString("tipo_cliente"));
                clientes.add(cliente1);

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
        return clientes;
    }

}
