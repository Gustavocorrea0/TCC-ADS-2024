package fornecedor;

import ConexaoComBanco.Conecta;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;

public class ControleFornecedor {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;

    public Fornecedor fornecedor;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleFornecedor() {
        conexao = new Conecta();
        fornecedor = new Fornecedor();
    }

    public String cadastrarFornecedor(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO fornecedor (nome_fantasia, razao_social, cnpj, telefone_fornecedor, email_fornecedor, cep_fornecedor, estado_fornecedor, cidade_fornecedor, endereco_fornecedor)"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, fornecedor.getNomeFantasia());
                ps.setString(2, fornecedor.getRazaoSocial());
                ps.setString(3, fornecedor.getCnpj());
                ps.setString(4, fornecedor.getTelefoneFornecedor());
                ps.setString(5, fornecedor.getEmailFornecedor());
                ps.setString(6, fornecedor.getCepFornecedor());
                ps.setString(7, fornecedor.getEstadoFornecedor());
                ps.setString(8, fornecedor.getCidadeFornecedor());
                ps.setString(9, fornecedor.getEnderecoFornecedor());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Fornecedor cadastrado com sucesso";
                } else {
                    msg = "O fornecedor não foi cadastrado";
                }

            } else {
                msg = "Operação não suportada";
            }
        } catch (SQLException ex) {
            msg = "Erro ao cadastrar fornecedor " + ex.getMessage();
        }
        return msg;
    }

    public Fornecedor buscarFornecedor(String nomeFornecedor) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM fornecedor WHERE nome_fantasia = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeFornecedor);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Fornecedor fornecedorBuscado = new Fornecedor();
                fornecedorBuscado.setNomeFantasia(resultados.getString("nome_fantasia"));
                fornecedorBuscado.setCnpj(resultados.getString("cnpj"));
                fornecedorBuscado.setCepFornecedor(resultados.getString("cep_fornecedor"));
                fornecedorBuscado.setCidadeFornecedor(resultados.getString("cidade_fornecedor"));
                fornecedorBuscado.setEmailFornecedor(resultados.getString("email_fornecedor"));
                fornecedorBuscado.setEstadoFornecedor(resultados.getString("estado_fornecedor"));
                fornecedorBuscado.setEnderecoFornecedor(resultados.getString("endereco_fornecedor"));
                fornecedorBuscado.setRazaoSocial(resultados.getString("razao_social"));
                fornecedorBuscado.setTelefoneFornecedor(resultados.getString("telefone_fornecedor"));
                fornecedorBuscado.setIdFornecedor(resultados.getInt("id_fornecedor"));

                return fornecedorBuscado;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerFornecedor(String nomeFornecedor) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM fornecedor WHERE nome_fantasia = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomeFornecedor);

            int linhasAfetadas1 = ps.executeUpdate();

            if (linhasAfetadas1 > 0) {
                msg = "Fornecedor removido com sucesso";
            } else {
                msg = "Fornecedor não removido";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover fornecedor";
        }
        return msg;
    }

    public String atualizarFornecedor(Fornecedor fornecedor) {
        if (!conexao.getConexao()) {
            return "Falha de conexão";
        }

        try {
            sql = "UPDATE fornecedor SET nome_fantasia = ?, razao_social = ?, cnpj = ?, telefone_fornecedor = ?,"
                    + "email_fornecedor  = ?, cep_fornecedor  = ?, estado_fornecedor = ?, cidade_fornecedor = ?, endereco_fornecedor = ? WHERE  id_fornecedor = ? ";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, fornecedor.getNomeFantasia());
            ps.setString(2, fornecedor.getRazaoSocial());
            ps.setString(3, fornecedor.getCnpj());
            ps.setString(4, fornecedor.getTelefoneFornecedor());
            ps.setString(5, fornecedor.getEmailFornecedor());
            ps.setString(6, fornecedor.getCepFornecedor());
            ps.setString(7, fornecedor.getEstadoFornecedor());
            ps.setString(8, fornecedor.getCidadeFornecedor());
            ps.setString(9, fornecedor.getEnderecoFornecedor());
            ps.setInt(10, fornecedor.getIdFornecedor());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Fornecedor atualizado com sucesso";
            } else {
                return "Fornecedor não encontrado";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar fornecedor";
        }

    }

    public List<Fornecedor> readFornecedor() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM fornecedor";

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Fornecedor fornecedor1 = new Fornecedor();
                fornecedor1.setNomeFantasia(resultados.getString("nome_fantasia"));
                fornecedor1.setCnpj(resultados.getString("cnpj"));
                fornecedor1.setCepFornecedor(resultados.getString("cep_fornecedor"));
                fornecedor1.setCidadeFornecedor(resultados.getString("cidade_fornecedor"));
                fornecedor1.setEmailFornecedor(resultados.getString("email_fornecedor"));
                fornecedor1.setEstadoFornecedor(resultados.getString("estado_fornecedor"));
                fornecedor1.setRazaoSocial(resultados.getString("razao_social"));
                fornecedor1.setTelefoneFornecedor(resultados.getString("telefone_fornecedor"));
                fornecedor1.setIdFornecedor(resultados.getInt("id_fornecedor"));
                fornecedores.add(fornecedor1);
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
        return fornecedores;
    }

    public void gerarRelatorioGeralDeFornecedores() throws SQLException, ParseException, IOException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        conexao = new Conecta();

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM fornecedor";

        Document doc = new Document();

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = jFileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = jFileChooser.getSelectedFile();
            String nomePDF = selectedDirectory.getAbsolutePath() + File.separator + "relatorio_de_dados_geral_de_fornecedores.pdf";

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

                imagem.setAbsolutePosition(76, imagem.getAbsoluteX());
                doc.add(imagem);

                Font fonte = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
                Paragraph p = new Paragraph("Relatorio de Fornecedores", fonte);

                Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonte2);
                Paragraph tipoDeDados = new Paragraph("            Tipos de dados: Fornecedores", fonte2);
                Paragraph formato = new Paragraph("            Formato: Tabela", fonte2);

                p.setAlignment(Element.ALIGN_CENTER);
                data.setAlignment(Element.ALIGN_JUSTIFIED);
                tipoDeDados.setAlignment(3);
                formato.setAlignment(3);

                doc.add(p);
                doc.add(linhaEmBranco);
                doc.add(line);
                doc.add(linhaEmBranco);
                doc.add(data);
                doc.add(tipoDeDados);
                doc.add(formato);
                doc.add(linhaEmBranco);
                doc.add(line);

                PdfPTable table = new PdfPTable(4);
                table.setWidthPercentage(85);
                table.setWidths(new int[]{2, 2, 2, 2});

                PdfPCell cellNomeFantasiaFornecedor = new PdfPCell(new Paragraph("Nome Fantasia"));
                PdfPCell cellTelefoneFornecedor = new PdfPCell(new Paragraph("Telefone"));
                PdfPCell cellEstadoFornecedor = new PdfPCell(new Paragraph("Estado"));
                PdfPCell cellCidadeFornecedor = new PdfPCell(new Paragraph("Cidade"));

                cellNomeFantasiaFornecedor.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellTelefoneFornecedor.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellEstadoFornecedor.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellCidadeFornecedor.setBackgroundColor(BaseColor.LIGHT_GRAY);

                cellNomeFantasiaFornecedor.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTelefoneFornecedor.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellEstadoFornecedor.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellCidadeFornecedor.setHorizontalAlignment(Element.ALIGN_CENTER);

                table.addCell(cellNomeFantasiaFornecedor);
                table.addCell(cellTelefoneFornecedor);
                table.addCell(cellEstadoFornecedor);
                table.addCell(cellCidadeFornecedor);

                while (resultados.next()) {

                    fornecedor = new Fornecedor();

                    fornecedor.setNomeFantasia(resultados.getString("nome_fantasia"));
                    fornecedor.setTelefoneFornecedor(resultados.getString("telefone_fornecedor"));
                    fornecedor.setEstadoFornecedor(resultados.getString("estado_fornecedor"));
                    fornecedor.setCidadeFornecedor(resultados.getString("cidade_fornecedor"));

                    cellNomeFantasiaFornecedor = new PdfPCell(new Paragraph(fornecedor.getNomeFantasia()));
                    cellTelefoneFornecedor = new PdfPCell(new Paragraph(fornecedor.getTelefoneFornecedor()));
                    cellEstadoFornecedor = new PdfPCell(new Paragraph(fornecedor.getEstadoFornecedor()));
                    cellCidadeFornecedor = new PdfPCell(new Paragraph(fornecedor.getCidadeFornecedor()));

                    table.addCell(cellNomeFantasiaFornecedor);
                    table.addCell(cellTelefoneFornecedor);
                    table.addCell(cellEstadoFornecedor);
                    table.addCell(cellCidadeFornecedor);
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

    public void gerarRelatorioDetalhadoDeFornecedores(String nomeFornecedor) throws SQLException, ParseException, IOException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        conexao = new Conecta();

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        sql = "SELECT * FROM fornecedor WHERE nome_fantasia = ?";
        ps = conexao.conn.prepareStatement(sql);
        ps.setString(1, nomeFornecedor);
        resultados = ps.executeQuery();

        Document doc = new Document();

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = jFileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = jFileChooser.getSelectedFile();
            String nomePDF = selectedDirectory.getAbsolutePath() + File.separator + "relatorio_de_delhado_de_fornecedor.pdf";

            try {

                if (resultados.next()) {
                    Fornecedor fornecedorBuscado = new Fornecedor();
                    fornecedorBuscado.setNomeFantasia(resultados.getString("nome_fantasia"));
                    fornecedorBuscado.setCnpj(resultados.getString("cnpj"));
                    fornecedorBuscado.setCepFornecedor(resultados.getString("cep_fornecedor"));
                    fornecedorBuscado.setCidadeFornecedor(resultados.getString("cidade_fornecedor"));
                    fornecedorBuscado.setEmailFornecedor(resultados.getString("email_fornecedor"));
                    fornecedorBuscado.setEstadoFornecedor(resultados.getString("estado_fornecedor"));
                    fornecedorBuscado.setEnderecoFornecedor(resultados.getString("endereco_fornecedor"));
                    fornecedorBuscado.setRazaoSocial(resultados.getString("razao_social"));
                    fornecedorBuscado.setTelefoneFornecedor(resultados.getString("telefone_fornecedor"));
                    fornecedorBuscado.setIdFornecedor(resultados.getInt("id_fornecedor"));

                    Font fonteTitulo = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
                    Font fonteSubtitulo = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
                    Font fonteIdentificacao = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
                    Font fonteTextoComun = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);

                    Paragraph linhaEmBranco = new Paragraph(" ", fonteTextoComun);

                    String imagePath = "/logo_ac_farm_system.png";
                    Image imagem = Image.getInstance(getClass().getResource(imagePath));

                    imagem.scaleToFit(55, 50);

                    LineSeparator line = new LineSeparator();
                    line.setLineWidth(0.5f);
                    line.setPercentage(85f);

                    PdfWriter.getInstance(doc, new FileOutputStream(nomePDF));
                    doc.open();

                    imagem.setAbsolutePosition(76, imagem.getAbsoluteX());
                    doc.add(imagem);

                    String razaoSocialEncontrado = fornecedorBuscado.getRazaoSocial();
                    String nomeFantasiaEncontrado = fornecedorBuscado.getNomeFantasia();
                    String cnpjEncontrado = fornecedorBuscado.getCnpj();
                    String telefoneEncontrado = fornecedorBuscado.getTelefoneFornecedor();
                    String emailEncontrado = fornecedorBuscado.getEmailFornecedor();
                    String enderecoEncontrado = fornecedorBuscado.getEnderecoFornecedor();
                    String estadoEncontrado = fornecedorBuscado.getEstadoFornecedor();
                    String cidadeEncontrado = fornecedorBuscado.getCidadeFornecedor();
                    String cepEncontrado = fornecedorBuscado.getCepFornecedor();

                    Paragraph p = new Paragraph("Relatorio de Fornecedor", fonteTitulo);

                    Paragraph nomeDoFornecedor = new Paragraph("            Fornecedor: " + nomeFornecedor, fonteTextoComun);
                    Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonteTextoComun);
                    Paragraph tipoDeDados = new Paragraph("            Tipo de Informações: Fornecedor", fonteTextoComun);
                    Paragraph formato = new Paragraph("            Formato: Detalhado", fonteTextoComun);

                    Paragraph razaoSocial = new Paragraph("            Razão Social: " + razaoSocialEncontrado);
                    Paragraph nomeFantasia = new Paragraph("            Nome Fantasia: " + nomeFantasiaEncontrado);
                    Paragraph cnpj = new Paragraph("            CNPJ: " + cnpjEncontrado);
                    Paragraph telefone = new Paragraph("            Telefone: " + telefoneEncontrado);
                    Paragraph email = new Paragraph("            Email: " + emailEncontrado);
                    Paragraph endereco = new Paragraph("            Endereço: " + enderecoEncontrado);
                    Paragraph estado = new Paragraph("            Estado: " + estadoEncontrado);
                    Paragraph cidade = new Paragraph("            Cidade: " + cidadeEncontrado);
                    Paragraph cep = new Paragraph("            CEP: " + cepEncontrado);

                    Paragraph dadosDoFornecedorSubtitulo = new Paragraph("            Dados de Identificação", fonteSubtitulo);
                    Paragraph enderecoDoFornecedorSubtitulo = new Paragraph("            Endereço", fonteSubtitulo);
                    Paragraph contatosDoFornecedorSubtitulo = new Paragraph("            Contato(s)", fonteSubtitulo);

                    p.setAlignment(Element.ALIGN_CENTER);
                    data.setAlignment(Element.ALIGN_JUSTIFIED);
                    tipoDeDados.setAlignment(3);
                    formato.setAlignment(3);

                    doc.add(p);
                    doc.add(linhaEmBranco);
                    doc.add(line);
                    doc.add(linhaEmBranco);
                    doc.add(nomeDoFornecedor);
                    doc.add(data);
                    doc.add(tipoDeDados);
                    doc.add(formato);
                    doc.add(linhaEmBranco);
                    doc.add(line);
                    doc.add(linhaEmBranco);
                    doc.add(dadosDoFornecedorSubtitulo);
                    doc.add(linhaEmBranco);
                    doc.add(razaoSocial);
                    doc.add(nomeFantasia);
                    doc.add(cnpj);
                    doc.add(linhaEmBranco);
                    doc.add(line);
                    doc.add(linhaEmBranco);
                    doc.add(enderecoDoFornecedorSubtitulo);
                    doc.add(linhaEmBranco);
                    doc.add(endereco);
                    doc.add(estado);
                    doc.add(cidade);
                    doc.add(cep);
                    doc.add(linhaEmBranco);
                    doc.add(line);
                    doc.add(linhaEmBranco);
                    doc.add(contatosDoFornecedorSubtitulo);
                    doc.add(linhaEmBranco);
                    doc.add(telefone);
                    doc.add(email);

                    fornecedor = new Fornecedor();

                    doc.add(new Paragraph(" "));
                    doc.close();

                    Desktop.getDesktop().open(new File(nomePDF));
                }

            } catch (DocumentException | FileNotFoundException | SQLException | NullPointerException d) {
                d.getMessage();
            }
        }
    }
}
