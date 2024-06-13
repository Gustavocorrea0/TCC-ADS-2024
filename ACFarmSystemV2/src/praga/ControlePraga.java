package praga;

import ConexaoComBanco.Conecta;
import com.itextpdf.text.BadElementException;
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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;

public class ControlePraga {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;

    public Praga praga;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControlePraga() {
        conexao = new Conecta();
        praga = new Praga();
    }

    public String cadastrarPraga(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO praga (nome_praga, data_surgimento_praga, propriedade_praga, nivel_de_ataque_praga, estado_de_controle_praga)"
                        + " VALUES (?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, praga.getNomePraga());
                ps.setDate(2, new java.sql.Date(praga.getDataSurgimentoPraga().getTime()));
                ps.setString(3, praga.getPropriedadePraga());
                ps.setString(4, praga.getNivelDeAtaquePraga());
                ps.setString(5, praga.getEstadoDeControlePraga());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Praga lançada com sucesso";
                } else {
                    msg = "A praga não foi lançada";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao cadastrar praga " + ex.getMessage();
        }

        return msg;
    }

    public Praga buscarPraga(String nomePraga) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM praga WHERE nome_praga = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setString(1, nomePraga);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                Praga pragaBuscada = new Praga();

                pragaBuscada.setNomePraga(resultados.getString("nome_praga"));
                pragaBuscada.setDataSurgimentoPraga(resultados.getDate("data_surgimento_praga"));
                pragaBuscada.setNivelDeAtaquePraga(resultados.getString("nivel_de_ataque_praga"));
                pragaBuscada.setPropriedadePraga(resultados.getString("propriedade_praga"));
                pragaBuscada.setEstadoDeControlePraga(resultados.getString("estado_de_controle_praga"));
                pragaBuscada.setIdPraga(resultados.getInt("id_praga"));
                return pragaBuscada;
            } else {
                msg = "Praga não encontrada";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String removerPraga(String nomePraga) {
        if (!conexao.getConexao()) {
            return "Falha de conexao";
        }

        try {
            sql = "DELETE FROM praga WHERE nome_praga = ?";
            ps = conexao.conn.prepareCall(sql);
            ps.setString(1, nomePraga);

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                msg = "Praga removida com sucesso";
            } else {
                msg = "A praga não foi removida";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            msg = "Falha no banco de dados ao remover praga";
        }
        return msg;
    }

    public String atualizarPraga(Praga praga) {
        if (!conexao.getConexao()) {
            return "Falha de Conexão";
        }

        try {
            sql = "UPDATE praga SET nome_praga = ?, nivel_de_ataque_praga = ?, estado_de_controle_praga = ? WHERE id_praga = ?";
            ps = conexao.conn.prepareStatement(sql);

            ps.setString(1, praga.getNomePraga());
            ps.setString(2, praga.getNivelDeAtaquePraga());
            ps.setString(3, praga.getEstadoDeControlePraga());
            ps.setInt(4, praga.getIdPraga());

            linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                return "Praga atualizada com sucesso";
            } else {
                return "Praga não encontrada";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Falha ao atualizar praga";
        }
    }

    public List<Praga> lerPraga() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM praga";

        List<Praga> pragas = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                Praga praga1 = new Praga();
                praga1.setNomePraga(resultados.getString("nome_praga"));
                praga1.setEstadoDeControlePraga(resultados.getString("estado_de_controle_praga"));
                praga1.setPropriedadePraga(resultados.getString("propriedade_praga"));
                pragas.add(praga1);
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
        return pragas;
    }

    private String formatarData(Date data) {
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");
        return formatoBrasileiro.format(data);
    }

    public void gerarRelatorioGeralDePragas() throws SQLException, ParseException, IOException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        conexao = new Conecta();

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM praga";

        Document doc = new Document();

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = jFileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = jFileChooser.getSelectedFile();
            String nomePDF = selectedDirectory.getAbsolutePath() + File.separator + "relatorio_de_dados_geral_de_pragas.pdf";

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
                Paragraph p = new Paragraph("Relatorio geral de Pragas", fonte);

                Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonte2);
                Paragraph tipoDeDados = new Paragraph("            Tipos de dados: Pragas", fonte2);
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

                PdfPCell cellNomePraga = new PdfPCell(new Paragraph("Nome"));
                PdfPCell cellDataDeSurgimentoPraga = new PdfPCell(new Paragraph("Data de Surgimento"));
                PdfPCell cellNivelDeAtaquePraga = new PdfPCell(new Paragraph("Nivel de Ataque"));
                PdfPCell cellControlePraga = new PdfPCell(new Paragraph("Controlado"));

                cellNomePraga.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellDataDeSurgimentoPraga.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellNivelDeAtaquePraga.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellControlePraga.setBackgroundColor(BaseColor.LIGHT_GRAY);

                table.addCell(cellNomePraga);
                table.addCell(cellDataDeSurgimentoPraga);
                table.addCell(cellNivelDeAtaquePraga);
                table.addCell(cellControlePraga);

                while (resultados.next()) {
                    Praga pragaBuscada = new Praga();

                    pragaBuscada.setNomePraga(resultados.getString("nome_praga"));
                    pragaBuscada.setDataSurgimentoPraga(resultados.getDate("data_surgimento_praga"));
                    pragaBuscada.setNivelDeAtaquePraga(resultados.getString("nivel_de_ataque_praga"));
                    pragaBuscada.setPropriedadePraga(resultados.getString("propriedade_praga"));
                    pragaBuscada.setEstadoDeControlePraga(resultados.getString("estado_de_controle_praga"));
                    pragaBuscada.setIdPraga(resultados.getInt("id_praga"));

                    cellNomePraga = new PdfPCell(new Paragraph(pragaBuscada.getNomePraga()));
                    cellNivelDeAtaquePraga = new PdfPCell(new Paragraph(pragaBuscada.getNivelDeAtaquePraga()));
                    cellControlePraga = new PdfPCell(new Paragraph(pragaBuscada.getEstadoDeControlePraga()));
                    cellDataDeSurgimentoPraga = new PdfPCell(new Paragraph(formatarData(pragaBuscada.getDataSurgimentoPraga())));

                    table.addCell(cellNomePraga);
                    table.addCell(cellDataDeSurgimentoPraga);
                    table.addCell(cellNivelDeAtaquePraga);
                    table.addCell(cellControlePraga);
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

    public void gerarRelatorioDetalhadoDePragas(String nomePraga) throws SQLException, BadElementException, IOException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        conexao = new Conecta();

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        sql = "SELECT * FROM praga WHERE nome_praga = ?";
        ps = conexao.conn.prepareStatement(sql);
        ps.setString(1, nomePraga);
        resultados = ps.executeQuery();

        Document doc = new Document();
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = jFileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = jFileChooser.getSelectedFile();
            String nomePDF = selectedDirectory.getAbsolutePath() + File.separator + "relatorio_de_dados_detalhado_de_praga.pdf";

            try {
                if (resultados.next()) {
                    Praga pragaBuscada = new Praga();
                    pragaBuscada.setNomePraga(resultados.getString("nome_praga"));
                    pragaBuscada.setDataSurgimentoPraga(resultados.getDate("data_surgimento_praga"));
                    pragaBuscada.setNivelDeAtaquePraga(resultados.getString("nivel_de_ataque_praga"));
                    pragaBuscada.setPropriedadePraga(resultados.getString("propriedade_praga"));
                    pragaBuscada.setEstadoDeControlePraga(resultados.getString("estado_de_controle_praga"));

                    Font fonteTitulo = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
                    Font fonteSubtitulo = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
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

                    String nomePragaEncontrado = pragaBuscada.getNomePraga();
                    String dataDeSurgimentoEncontrado = formatarData(pragaBuscada.getDataSurgimentoPraga());
                    String nivelDeAtaquePragaEncontrado = pragaBuscada.getNivelDeAtaquePraga();
                    String propridadePragaEncontrado = pragaBuscada.getPropriedadePraga();
                    String estadoPragaEncontrada = pragaBuscada.getEstadoDeControlePraga();

                    Paragraph p = new Paragraph("Relatorio Detalhado De Praga", fonteTitulo);

                    Paragraph nomePragaRelatorio = new Paragraph("            Praga: " + nomePraga, fonteTextoComun);
                    Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonteTextoComun);
                    Paragraph tipoDeDados = new Paragraph("            Tipo de Informações: Praga", fonteTextoComun);
                    Paragraph formato = new Paragraph("            Formato: Detalhado", fonteTextoComun);

                    Paragraph nomeDaPragaParagrafo = new Paragraph("            Praga: " + nomePragaEncontrado);
                    Paragraph dataDeSurgimentoPragaParagrafo = new Paragraph("            Data de Surgimento: " + dataDeSurgimentoEncontrado);
                    Paragraph nivelDeAtaqueParagrafo = new Paragraph("            Nivel de Ataque: " + nivelDeAtaquePragaEncontrado);
                    Paragraph propriedadeParagrafo = new Paragraph("            Propriedade: " + propridadePragaEncontrado);
                    Paragraph estadoDeControleDaPragaParagrafo = new Paragraph("            Controlado(SIM ou NÃO): " + estadoPragaEncontrada);

                    p.setAlignment(Element.ALIGN_CENTER);
                    data.setAlignment(Element.ALIGN_JUSTIFIED);
                    tipoDeDados.setAlignment(3);
                    formato.setAlignment(3);

                    Paragraph dadosPragaSubtitulo = new Paragraph("           Dados da praga", fonteSubtitulo);

                    doc.add(p);
                    doc.add(linhaEmBranco);
                    doc.add(line);
                    doc.add(linhaEmBranco);
                    doc.add(nomeDaPragaParagrafo);
                    doc.add(data);
                    doc.add(tipoDeDados);
                    doc.add(formato);
                    doc.add(linhaEmBranco);
                    doc.add(line);
                    doc.add(linhaEmBranco);
                    doc.add(dadosPragaSubtitulo);
                    doc.add(linhaEmBranco);
                    doc.add(nomePragaRelatorio);
                    doc.add(propriedadeParagrafo);
                    doc.add(dataDeSurgimentoPragaParagrafo);
                    doc.add(nivelDeAtaqueParagrafo);
                    doc.add(estadoDeControleDaPragaParagrafo);

                    praga = new Praga();

                    doc.add(new Paragraph(""));
                    doc.close();

                    Desktop.getDesktop().open(new File(nomePDF));
                }
            } catch (DocumentException | FileNotFoundException | SQLException | NullPointerException d) {
                d.getMessage();
            }
        }
    }

}
