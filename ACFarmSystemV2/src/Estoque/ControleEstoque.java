package Estoque;

import ConexaoComBanco.Conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControleEstoque {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;

    public Agrotoxico agrotoxico;
    public Combustivel combustivel;
    public Fertilizante fertilizante;
    public Semente semente;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleEstoque() {
        conexao = new Conecta();
        agrotoxico = new Agrotoxico();
        combustivel = new Combustivel();
        fertilizante = new Fertilizante();
        semente = new Semente();
    }

    public String cadastrarAgrotoxico(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO agrotoxico (nome_agrotoxico, marca_agrotoxico, quantidade_minima_em_litros, data_de_validade, quantidade_em_litros) VALUES (?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, agrotoxico.getNomeAgrotoxico());
                ps.setString(2, agrotoxico.getMarcaAgrotoxico());
                ps.setDouble(3, agrotoxico.getQuantidadeMinimaEmLitros());
                ps.setDate(4, new java.sql.Date(agrotoxico.getDataDeValidade().getTime()));
                ps.setDouble(5, agrotoxico.getQuantidadeEmLitros());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "A Agrotoxico lançado";
                } else {
                    msg = "A Agrotoxico não foi lançado";
                }
            } else {
                msg = "Operacão não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar combustivel" + ex.getMessage();
        }
        return msg;
    }

    public Agrotoxico buscarAgrotoxico(String nomeAgrotoxico) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM agrotoxico WHERE nome_agrotoxico = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeAgrotoxico);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Agrotoxico agrotoxicoBuscado = new Agrotoxico();

                agrotoxicoBuscado.setNomeAgrotoxico(resultados.getString("nome_agrotoxico"));
                agrotoxicoBuscado.setMarcaAgrotoxico(resultados.getString("marca_agrotoxico"));
                agrotoxicoBuscado.setDataDeValidade(resultados.getDate("data_de_validade"));
                agrotoxicoBuscado.setQuantidadeEmLitros(resultados.getDouble("quantidade_em_litros"));
                agrotoxicoBuscado.setQuantidadeMinimaEmLitros(resultados.getDouble("quantidade_minima_em_litros"));
                agrotoxicoBuscado.setIdAgrotoxico(resultados.getInt("id_agrotoxico"));
                return agrotoxicoBuscado;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerAgrotoxico(String nomeAgrotoxico) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM agrotoxico WHERE nome_agrotoxico = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeAgrotoxico);

            int linhasAfetadas1 = ps.executeUpdate();

            if (linhasAfetadas1 > 0) {
                msg = "Agrotoxico removido com sucesso";
            } else {
                msg = "A Agrotoxico não foi removido";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover agrotoxico";
        }
        return msg;
    }

    public List<Agrotoxico> lerAgrotoxico() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM agrotoxico";

        List<Agrotoxico> agrotoxicos = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Agrotoxico agrotoxicoBuscado = new Agrotoxico();

                agrotoxicoBuscado.setNomeAgrotoxico(resultados.getString("nome_agrotoxico"));
                agrotoxicoBuscado.setMarcaAgrotoxico(resultados.getString("marca_agrotoxico"));
                agrotoxicoBuscado.setQuantidadeEmLitros(resultados.getDouble("quantidade_em_litros"));
                agrotoxicoBuscado.setQuantidadeMinimaEmLitros(resultados.getDouble("quantidade_minima_em_litros"));
                agrotoxicoBuscado.setIdAgrotoxico(resultados.getInt("id_agrotoxico"));

                agrotoxicos.add(agrotoxicoBuscado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return agrotoxicos;
    }

    public String atualizarAgrotoxico(Agrotoxico agrotoxicoAtualizado) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE agrotoxico SET nome_agrotoxico = ?, marca_agrotoxico = ?, quantidade_minima_em_litros = ?, data_de_validade = ?, quantidade_em_litros = ? WHERE id_agrotoxico = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, agrotoxicoAtualizado.getNomeAgrotoxico());
            ps.setString(2, agrotoxicoAtualizado.getMarcaAgrotoxico());
            ps.setDouble(3, agrotoxicoAtualizado.getQuantidadeMinimaEmLitros());
            ps.setDate(4, new java.sql.Date(agrotoxicoAtualizado.getDataDeValidade().getTime()));
            ps.setDouble(5, agrotoxicoAtualizado.getQuantidadeEmLitros());
            ps.setInt(6, agrotoxicoAtualizado.getIdAgrotoxico());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Agrotoxico atualizado com sucesso";
            } else {
                return "Agrotoxico não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Agrotoxico";
        }
    }

    public String cadastrarCombustivel(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO combustivel (nome_combustivel, quantidade_em_litros, quantidade_minima_em_litros) VALUES (?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, combustivel.getNomeCombustivel());
                ps.setDouble(2, combustivel.getQuantidadeEmLitros());
                ps.setDouble(3, combustivel.getQuantidadeMinimaEmLitros());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "O Combustivel foi cadastrado";
                } else {
                    msg = "O Combustivel não foi lançado";
                }
            } else {
                msg = "Operacão não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar combustivel" + ex.getMessage();
        }
        return msg;
    }

    public Combustivel buscarCombustivel(String nomeCombustivel) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM combustivel WHERE nome_combustivel = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeCombustivel);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Combustivel combustivelBuscado = new Combustivel();
                combustivelBuscado.setNomeCombustivel(resultados.getString("nome_combustivel"));
                combustivelBuscado.setQuantidadeEmLitros(resultados.getDouble("quantidade_em_litros"));
                combustivelBuscado.setQuantidadeMinimaEmLitros(resultados.getDouble("quantidade_minima_em_litros"));
                combustivelBuscado.setIdCombustivel(resultados.getInt("id_combustivel"));
                return combustivelBuscado;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerCombustivel(String nomeCombustivel) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM combustivel WHERE nome_combustivel = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeCombustivel);

            int linhasAfetadas1 = ps.executeUpdate();

            if (linhasAfetadas1 > 0) {
                msg = "Combustivel removido com sucesso";
            } else {
                msg = "O Combustivel não foi removido";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover combustivel";
        }
        return msg;
    }

    public List<Combustivel> lerCombustivel() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM combustivel";

        List<Combustivel> combustiveis = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Combustivel combustivelBuscado = new Combustivel();

                combustivelBuscado.setNomeCombustivel(resultados.getString("nome_combustivel"));
                combustivelBuscado.setQuantidadeEmLitros(resultados.getDouble("quantidade_em_litros"));
                combustivelBuscado.setQuantidadeMinimaEmLitros(resultados.getDouble("quantidade_minima_em_litros"));
                combustivelBuscado.setIdCombustivel(resultados.getInt("id_combustivel"));
                combustiveis.add(combustivelBuscado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return combustiveis;
    }

    public String atualizarCombustivel(Combustivel combustivelAtualizado) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE combustivel SET nome_combustivel = ?, quantidade_minima_em_litros = ?, quantidade_em_litros = ? WHERE id_combustivel = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, combustivelAtualizado.getNomeCombustivel());
            ps.setDouble(2, combustivelAtualizado.getQuantidadeMinimaEmLitros());
            ps.setDouble(3, combustivelAtualizado.getQuantidadeEmLitros());
            ps.setInt(4, combustivelAtualizado.getIdCombustivel());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Combustivel atualizado com sucesso";
            } else {
                return "Combustivel não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Combustivel";
        }
    }

//-----------------------------------------------------------------------------------------------------------------------------------
    public String cadastrarFertilizante(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO fertilizante (nome_fertilizante, marca_fertilizante, tipo_fertilizante, quantidade_em_sacos,  quantidade_em_litros) VALUES (?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, fertilizante.getNomeFertilizante());
                ps.setString(2, fertilizante.getMarcaFertilizante());
                ps.setString(3, fertilizante.getTipoFertilizante());
                ps.setDouble(4, fertilizante.getQuantidadeEmSacos());
                ps.setDouble(5, fertilizante.getQuantidadeEmLitros());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "O Fertilizante foi cadastrado";
                } else {
                    msg = "O Fertilizante não foi cadastrado";
                }
            } else {
                msg = "Operacão não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar fertilizante" + ex.getMessage();
        }
        return msg;
    }

    public Fertilizante buscarFertilizante(String nomeFertilizante) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM fertilizante WHERE nome_fertilizante = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeFertilizante);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Fertilizante fertilizanteBuscado = new Fertilizante();

                fertilizanteBuscado.setNomeFertilizante(resultados.getString("nome_fertilizante"));
                fertilizanteBuscado.setMarcaFertilizante(resultados.getString("marca_fertilizante"));
                fertilizanteBuscado.setTipoFertilizante(resultados.getString("tipo_fertilizante"));
                fertilizanteBuscado.setQuantidadeEmSacos(resultados.getDouble("quantidade_em_sacos"));
                fertilizanteBuscado.setQuantidadeEmLitros(resultados.getDouble("quantidade_em_litros"));
                fertilizanteBuscado.setIdFertilizante(resultados.getInt("id_fertilizante"));
                return fertilizanteBuscado;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerFertilizante(String nomeFertilizante) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM fertilizante WHERE nome_fertilizante = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeFertilizante);

            int linhasAfetadas1 = ps.executeUpdate();

            if (linhasAfetadas1 > 0) {
                msg = "Fertilizante removido com sucesso";
            } else {
                msg = "O Fertilizante não foi removido";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover Fertilizante";
        }
        return msg;
    }

    public List<Fertilizante> lerFertilizante() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM fertilizante";

        List<Fertilizante> fertilizantes = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Fertilizante fertilizanteBuscado = new Fertilizante();

                fertilizanteBuscado.setIdFertilizante(resultados.getInt("id_fertilizante"));
                fertilizanteBuscado.setNomeFertilizante(resultados.getString("nome_fertilizante"));
                fertilizanteBuscado.setMarcaFertilizante(resultados.getString("marca_fertilizante"));
                fertilizanteBuscado.setTipoFertilizante(resultados.getString("tipo_fertilizante"));
                fertilizanteBuscado.setQuantidadeEmLitros(resultados.getDouble("quantidade_em_litros"));
                fertilizanteBuscado.setQuantidadeEmSacos(resultados.getDouble("quantidade_em_sacos"));

                fertilizantes.add(fertilizanteBuscado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return fertilizantes;
    }

    public String atualizarFertilizante(Fertilizante fertilizanteAtualizado) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE fertilizante SET nome_fertilizante = ?, marca_fertilizante = ?, tipo_fertilizante = ?, quantidade_em_sacos = ?,  quantidade_em_litros = ? WHERE id_fertilizante = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, fertilizanteAtualizado.getNomeFertilizante());
            ps.setString(2, fertilizanteAtualizado.getMarcaFertilizante());
            ps.setString(3, fertilizanteAtualizado.getTipoFertilizante());
            ps.setDouble(4, fertilizanteAtualizado.getQuantidadeEmSacos());
            ps.setDouble(5, fertilizanteAtualizado.getQuantidadeEmLitros());
            ps.setInt(6, fertilizanteAtualizado.getIdFertilizante());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Fertilizante atualizado com sucesso";
            } else {
                return "Fertilizante não encontrado";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar Fertilizante";
        }
    }

//----------------------------------------------------------------------------------------------------------------------------------- 
    public String cadastrarSemente(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO semente (nome_semente, marca_semente, quantidade_em_sacos, quantidade_minima_em_sacos) VALUES (?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, semente.getNomeSemente());
                ps.setString(2, semente.getMarcaSemente());
                ps.setDouble(3, semente.getQuantidadeEmSacos());
                ps.setDouble(4, semente.getQuantidadeMinimaEmSacos());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "A Semente foi cadastrada";
                } else {
                    msg = "A Semente não foi lançada";
                }
            } else {
                msg = "Operacão não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar semente" + ex.getMessage();
        }
        return msg;
    }

    public Semente buscarSemente(String nomeSemente) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM semente WHERE nome_semente = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeSemente);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Semente sementeBuscada = new Semente();

                sementeBuscada.setNomeSemente(resultados.getString("nome_semente"));
                sementeBuscada.setMarcaSemente(resultados.getString("marca_semente"));
                sementeBuscada.setQuantidadeEmSacos(resultados.getDouble("quantidade_em_sacos"));
                sementeBuscada.setQuantidadeMinimaEmSacos(resultados.getDouble("quantidade_minima_em_sacos"));
                sementeBuscada.setIdSemente(resultados.getInt("id_semente"));
                return sementeBuscada;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerSemente(String nomeSemente) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM semente WHERE nome_semente = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomeSemente);

            int linhasAfetadas1 = ps.executeUpdate();

            if (linhasAfetadas1 > 0) {
                msg = "Semente removida com sucesso";
            } else {
                msg = "Semente não foi removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover Semente";
        }
        return msg;
    }

    public List<Semente> lerSemente() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM semente";

        List<Semente> sementes = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Semente sementeBuscada = new Semente();

                sementeBuscada.setNomeSemente(resultados.getString("nome_semente"));
                sementeBuscada.setMarcaSemente(resultados.getString("marca_semente"));
                sementeBuscada.setQuantidadeEmSacos(resultados.getDouble("quantidade_em_sacos"));
                sementeBuscada.setIdSemente(resultados.getInt("id_semente"));
                sementes.add(sementeBuscada);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sementes;
    }

    public String atualizarSemente(Semente sementeAtualizado) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE semente SET nome_semente = ?, marca_semente = ?, quantidade_em_sacos = ?, quantidade_minima_em_sacos = ? WHERE id_semente = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, sementeAtualizado.getNomeSemente());
            ps.setString(2, sementeAtualizado.getMarcaSemente());
            ps.setDouble(3, sementeAtualizado.getQuantidadeEmSacos());
            ps.setDouble(4, sementeAtualizado.getQuantidadeMinimaEmSacos());
            ps.setInt(5, sementeAtualizado.getIdSemente());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Semente atualizada com sucesso";
            } else {
                return "Semente não encontrada";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar semente";
        }
    }

}
