package VendaDeProducao;

import ConexaoComBanco.Conecta;
import cliente.Cliente;
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
import producao.Producao;

public class ControleVendaProducao {

    public Conecta conexao = new Conecta();
    public PreparedStatement ps;
    public ResultSet resultados;
    public String msg;
    public String sql;
    private int linhasAfetadas;

    public VendaProducao vendaProducao;
    public Cliente cliente;
    public Producao producao;

    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;
    public static final byte CONSULTA = 4;

    public ControleVendaProducao() {
        vendaProducao = new VendaProducao();
        cliente = new Cliente();
        producao = new Producao();
    }

    private String formatarData(Date data) {
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");
        return formatoBrasileiro.format(data);
    }

    public String adicionarVenda(byte operacao) {
        if (!conexao.getConexao()) {
            msg = "Falha de conexao com o banco de dados";
            return msg;
        }

        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO venda_producao (nome_producao, quantidade_de_sacas_producao, "
                        + "data_producao, nome_cliente, cnpj_ou_cpf, data_venda, valor_total_venda, forma_pagamento,"
                        + "metodo_pagamento, quantidade_parcelas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                ps = conexao.conn.prepareStatement(sql);

                ps.setString(1, vendaProducao.getNomeProducao());
                ps.setDouble(2, vendaProducao.getQuantidadeDeSacasProducao());
                ps.setDate(3, new java.sql.Date(vendaProducao.getDataProducao().getTime()));
                ps.setString(4, vendaProducao.getNomeCliente());
                ps.setString(5, vendaProducao.getCNPJOuCPF());
                ps.setDate(6, new java.sql.Date(vendaProducao.getDataVenda().getTime()));
                ps.setDouble(7, vendaProducao.getValorTotalVenda());
                ps.setString(8, vendaProducao.getFormaDePagamento());
                ps.setString(9, vendaProducao.getMetodoDePagamento());
                ps.setInt(10, vendaProducao.getQuantidadeDeParcelas());

                linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    msg = "Venda realizada com sucesso";
                } else {
                    msg = "A venda não foi realizada";
                }

            } else {
                msg = "Operação não suportada";
            }

        } catch (SQLException ex) {
            msg = "Erro ao realizar venda " + ex.getMessage();
        }

        return msg;
    }

    public VendaProducao buscarVenda(int codigoVenda) throws SQLException {
        if (!conexao.getConexao()) {
            return null;
        }

        try {
            sql = "SELECT * FROM venda_producao WHERE id_venda_producao = ?";
            ps = conexao.conn.prepareStatement(sql);
            ps.setInt(1, codigoVenda);
            resultados = ps.executeQuery();

            if (resultados.next()) {
                VendaProducao vendaProducaoBuscada = new VendaProducao();

                vendaProducaoBuscada.setDataProducao(resultados.getDate("data_producao"));
                vendaProducaoBuscada.setDataVenda(resultados.getDate("data_venda"));
                vendaProducaoBuscada.setCNPJOuCPF(resultados.getString("cnpj_ou_cpf"));
                vendaProducaoBuscada.setQuantidadeDeSacasProducao(resultados.getInt("quantidade_de_sacas_producao"));
                vendaProducaoBuscada.setNomeCliente(resultados.getString("nome_cliente"));
                vendaProducaoBuscada.setNomeProducao(resultados.getString("nome_producao"));
                vendaProducaoBuscada.setValorTotalVenda(resultados.getDouble("valor_total_venda"));
                vendaProducaoBuscada.setMetodoDePagamento(resultados.getString("metodo_pagamento"));
                vendaProducaoBuscada.setFormaDePagamento(resultados.getString("forma_pagamento"));
                vendaProducaoBuscada.setQuantidadeDeParcelas(resultados.getInt("quantidade_parcelas"));
                vendaProducaoBuscada.setIdVendaProducao(resultados.getInt("id_venda_producao"));
                return vendaProducaoBuscada;
            } else {
                msg = "Venda não encontrada";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<VendaProducao> buscarTodasAsVenda() {
        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM venda_producao";

        List<VendaProducao> vendaProducoes = new ArrayList();

        try {
            ps = conexao.conn.prepareStatement(sql);
            resultados = ps.executeQuery();

            while (resultados.next()) {
                VendaProducao vendaProducaoBuscada = new VendaProducao();
                vendaProducaoBuscada.setDataProducao(resultados.getDate("data_producao"));
                vendaProducaoBuscada.setDataVenda(resultados.getDate("data_venda"));
                vendaProducaoBuscada.setCNPJOuCPF(resultados.getString("cnpj_ou_cpf"));
                vendaProducaoBuscada.setQuantidadeDeSacasProducao(resultados.getInt("quantidade_de_sacas_producao"));
                vendaProducaoBuscada.setNomeCliente(resultados.getString("nome_cliente"));
                vendaProducaoBuscada.setNomeProducao(resultados.getString("nome_producao"));
                vendaProducaoBuscada.setValorTotalVenda(resultados.getDouble("valor_total_venda"));
                vendaProducaoBuscada.setMetodoDePagamento(resultados.getString("metodo_pagamento"));
                vendaProducaoBuscada.setFormaDePagamento(resultados.getString("forma_pagamento"));
                vendaProducaoBuscada.setQuantidadeDeParcelas(resultados.getInt("quantidade_parcelas"));
                vendaProducaoBuscada.setIdVendaProducao(resultados.getInt("id_venda_producao"));
                vendaProducoes.add(vendaProducaoBuscada);
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
        return vendaProducoes;
    }

    public void gerarRelatorioGeralDeVendas() throws SQLException, ParseException, IOException, DocumentException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        resultados = null;
        ps = null;
        sql = "SELECT * FROM venda_producao";
        ps = conexao.conn.prepareStatement(sql);
        resultados = ps.executeQuery();

        Document doc = new Document();
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = jFileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = jFileChooser.getSelectedFile();
            String nomePDF = selectedDirectory.getAbsolutePath() + File.separator + "relatorio_geral_de_vendas.pdf";

            try {

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

                imagem.setAbsolutePosition(76, imagem.getAbsoluteY());
                doc.add(imagem);

                Font fonte = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
                Paragraph p = new Paragraph("Relatorio de Geral de Vendas", fonte);

                Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonte2);
                Paragraph tiposDeDados = new Paragraph("            Tipos de dados: Vendas", fonte2);
                Paragraph formato = new Paragraph("            Formato: Tabela", fonte2);

                p.setAlignment(Element.ALIGN_CENTER);
                data.setAlignment(Element.ALIGN_JUSTIFIED);
                tiposDeDados.setAlignment(3);
                formato.setAlignment(3);

                doc.add(p);
                doc.add(linhaEmBranco);
                doc.add(line);
                doc.add(linhaEmBranco);
                doc.add(data);
                doc.add(tiposDeDados);
                doc.add(formato);
                doc.add(linhaEmBranco);
                doc.add(line);

                PdfPTable table = new PdfPTable(6);
                table.setWidthPercentage(85);
                table.setWidths(new int[]{2, 2, 2, 2, 2, 2});

                PdfPCell cellNomeProducao = new PdfPCell(new Paragraph("Produção"));
                PdfPCell cellSacasProducao = new PdfPCell(new Paragraph("Sacas"));
                PdfPCell cellDataVenda = new PdfPCell(new Paragraph("Data venda"));
                PdfPCell cellMetodoDePagamentoVenda = new PdfPCell(new Paragraph("Metodo de pagamento"));
                PdfPCell cellFormaDePagamento = new PdfPCell(new Paragraph("Forma de Pagamento"));
                PdfPCell cellCodigoVenda = new PdfPCell(new Paragraph("Codigo"));

                cellNomeProducao.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellSacasProducao.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellDataVenda.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellMetodoDePagamentoVenda.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellFormaDePagamento.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cellCodigoVenda.setBackgroundColor(BaseColor.LIGHT_GRAY);

                cellNomeProducao.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellSacasProducao.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellDataVenda.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellMetodoDePagamentoVenda.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellFormaDePagamento.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellCodigoVenda.setHorizontalAlignment(Element.ALIGN_CENTER);

                table.addCell(cellNomeProducao);
                table.addCell(cellSacasProducao);
                table.addCell(cellDataVenda);
                table.addCell(cellMetodoDePagamentoVenda);
                table.addCell(cellFormaDePagamento);
                table.addCell(cellCodigoVenda);

                while (resultados.next()) {
                    vendaProducao = new VendaProducao();

                    vendaProducao.setNomeProducao(resultados.getString("nome_producao"));
                    vendaProducao.setQuantidadeDeSacasProducao(resultados.getInt("quantidade_de_sacas_producao"));
                    vendaProducao.setDataVenda(resultados.getDate("data_venda"));
                    vendaProducao.setMetodoDePagamento(resultados.getString("metodo_pagamento"));
                    vendaProducao.setFormaDePagamento(resultados.getString("forma_pagamento"));
                    vendaProducao.setIdVendaProducao(resultados.getInt("id_venda_producao"));

                    cellNomeProducao = new PdfPCell(new Paragraph(vendaProducao.getNomeProducao()));
                    cellSacasProducao = new PdfPCell(new Paragraph(String.valueOf(vendaProducao.getQuantidadeDeSacasProducao())));
                    cellDataVenda = new PdfPCell(new Paragraph(formatarData(vendaProducao.getDataVenda())));
                    cellMetodoDePagamentoVenda = new PdfPCell(new Paragraph(vendaProducao.getMetodoDePagamento()));
                    cellFormaDePagamento = new PdfPCell(new Paragraph(vendaProducao.getFormaDePagamento()));
                    cellCodigoVenda = new PdfPCell(new Paragraph(String.valueOf(vendaProducao.getIdVendaProducao())));

                    table.addCell(cellNomeProducao);
                    table.addCell(cellSacasProducao);
                    table.addCell(cellDataVenda);
                    table.addCell(cellMetodoDePagamentoVenda);
                    table.addCell(cellFormaDePagamento);
                    table.addCell(cellCodigoVenda);
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

    public void geraRelatorioDetalhadoDeVenda(int idVenda) throws SQLException, BadElementException, IOException {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDeHoje = dataAtual.format(formatter);

        conexao = new Conecta();

        if (!conexao.getConexao()) {
            msg = "Falha na conexão com o banco de dados.";
        }

        sql = "SELECT * FROM venda_producao WHERE id_venda_producao = ?";
        ps = conexao.conn.prepareStatement(sql);
        ps.setInt(1, idVenda);
        resultados = ps.executeQuery();

        Document doc = new Document();
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = jFileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = jFileChooser.getSelectedFile();
            String nomePDF = selectedDirectory.getAbsolutePath() + File.separator + "relatorio_detalhado_de_venda.pdf";

            Font fonteTitulo = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
            Font fonteSubtitulo = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
            Font fonteValor = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
            Font fonteTextoComun = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);

            Paragraph linhaEmBranco = new Paragraph(" ", fonteTextoComun);

            try {
                if (resultados.next()) {
                    VendaProducao vendaProducaoBuscada = new VendaProducao();
                    vendaProducaoBuscada.setDataProducao(resultados.getDate("data_producao"));
                    vendaProducaoBuscada.setDataVenda(resultados.getDate("data_venda"));
                    vendaProducaoBuscada.setCNPJOuCPF(resultados.getString("cnpj_ou_cpf"));
                    vendaProducaoBuscada.setQuantidadeDeSacasProducao(resultados.getInt("quantidade_de_sacas_producao"));
                    vendaProducaoBuscada.setNomeCliente(resultados.getString("nome_cliente"));
                    vendaProducaoBuscada.setNomeProducao(resultados.getString("nome_producao"));
                    vendaProducaoBuscada.setValorTotalVenda(resultados.getDouble("valor_total_venda"));
                    vendaProducaoBuscada.setMetodoDePagamento(resultados.getString("metodo_pagamento"));
                    vendaProducaoBuscada.setFormaDePagamento(resultados.getString("forma_pagamento"));
                    vendaProducaoBuscada.setQuantidadeDeParcelas(resultados.getInt("quantidade_parcelas"));
                    vendaProducaoBuscada.setIdVendaProducao(resultados.getInt("id_venda_producao"));

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

                    String codigoDaVendaEncontrado = Integer.toString(vendaProducaoBuscada.getIdVendaProducao());
                    String dataProducaoEncontrado = formatarData(vendaProducaoBuscada.getDataProducao());
                    String dataVendaEncontrado = formatarData(vendaProducaoBuscada.getDataVenda());
                    String cpfOUcnpjEncontrado = vendaProducaoBuscada.getCNPJOuCPF();
                    String quantidadeDeSacasEncontrado = Integer.toString(vendaProducaoBuscada.getQuantidadeDeSacasProducao());
                    String nomeClienteEncontrado = vendaProducaoBuscada.getNomeCliente();
                    String nomeProducaoEncontrado = vendaProducaoBuscada.getNomeProducao();
                    String valorVendaEncontrado = converterValorParaReal(vendaProducaoBuscada.getValorTotalVenda());
                    String metodoDePagamentoEncontrado = vendaProducaoBuscada.getMetodoDePagamento();
                    String formaDePagamentoEncontrado = vendaProducaoBuscada.getFormaDePagamento();
                    String quantidadeDeParcelasEncontrado = Integer.toString(vendaProducaoBuscada.getQuantidadeDeParcelas());

                    Paragraph p = new Paragraph("Dados de venda", fonteTitulo);

                    Paragraph codigoVendaRelatorio = new Paragraph("            Codigo venda: " + codigoDaVendaEncontrado, fonteTextoComun);
                    Paragraph data = new Paragraph("            Data de geração: " + dataDeHoje, fonteTextoComun);
                    Paragraph tipoDeDados = new Paragraph("            Tipo de Informações: Venda", fonteTextoComun);
                    Paragraph formato = new Paragraph("            Formato: Detalhado", fonteTextoComun);

                    Paragraph dadosProducaoSubtitulo = new Paragraph("           Dados da Produção", fonteSubtitulo);
                    Paragraph dadosClienteSubtitulo = new Paragraph("           Dados do Cliente", fonteSubtitulo);
                    Paragraph dadosVendaSubtitulo = new Paragraph("           Dados da Venda", fonteSubtitulo);

                    Paragraph dataProducaoParagrafo = new Paragraph("            Data da produção: " + dataProducaoEncontrado, fonteTextoComun);
                    Paragraph dataVendaParagrafo = new Paragraph("            Data da venda: " + dataVendaEncontrado, fonteTextoComun);
                    Paragraph cpfOUcnpjParagrafo = new Paragraph("            CPF / CNPJ cliente: " + cpfOUcnpjEncontrado, fonteTextoComun);
                    Paragraph quantidadeDeSacasParagrafo = new Paragraph("            Quantidade de sacas: " + quantidadeDeSacasEncontrado, fonteTextoComun);
                    Paragraph nomeClienteParagrafo = new Paragraph("            Cliente: " + nomeClienteEncontrado, fonteTextoComun);
                    Paragraph nomeProducaoParagrafo = new Paragraph("            Nome da producao: " + nomeProducaoEncontrado, fonteTextoComun);
                    Paragraph valorVendaParagrafo = new Paragraph("            Valor total: R$" + valorVendaEncontrado, fonteValor);
                    Paragraph metodoDePagamentoParagrafo = new Paragraph("            Método de pagamento: " + metodoDePagamentoEncontrado, fonteTextoComun);
                    Paragraph formaDePagamentoParagrafo = new Paragraph("            Forma de pagamento: " + formaDePagamentoEncontrado, fonteTextoComun);
                    Paragraph quantidadeDeParcelasParagrafo = new Paragraph("            Quantidade de parcelas: " + quantidadeDeParcelasEncontrado, fonteTextoComun);

                    p.setAlignment(Element.ALIGN_CENTER);
                    data.setAlignment(Element.ALIGN_JUSTIFIED);
                    tipoDeDados.setAlignment(3);
                    formato.setAlignment(3);

                    doc.add(p);
                    doc.add(linhaEmBranco);
                    doc.add(line);
                    doc.add(linhaEmBranco);
                    doc.add(codigoVendaRelatorio);
                    doc.add(data);
                    doc.add(tipoDeDados);
                    doc.add(formato);
                    doc.add(linhaEmBranco);
                    doc.add(line);
                    doc.add(linhaEmBranco);
                    doc.add(dadosProducaoSubtitulo);
                    doc.add(linhaEmBranco);
                    doc.add(nomeProducaoParagrafo);
                    doc.add(quantidadeDeSacasParagrafo);
                    doc.add(dataProducaoParagrafo);
                    doc.add(linhaEmBranco);
                    doc.add(dadosClienteSubtitulo);
                    doc.add(linhaEmBranco);
                    doc.add(nomeClienteParagrafo);
                    doc.add(cpfOUcnpjParagrafo);
                    doc.add(linhaEmBranco);
                    doc.add(dadosVendaSubtitulo);
                    doc.add(linhaEmBranco);
                    doc.add(dataVendaParagrafo);
                    doc.add(metodoDePagamentoParagrafo);
                    doc.add(formaDePagamentoParagrafo);
                    doc.add(quantidadeDeParcelasParagrafo);
                    doc.add(linhaEmBranco);
                    doc.add(valorVendaParagrafo);
                    doc.add(linhaEmBranco);

                    doc.add(new Paragraph(""));
                    doc.close();

                    Desktop.getDesktop().open(new File(nomePDF));
                }

            } catch (DocumentException | FileNotFoundException | SQLException | NullPointerException d) {
                d.getMessage();
            }
        }

    }

    public String converterValorParaReal(Double valorReal) {

        if (valorReal >= 9999.99 && valorReal < 100000.00) {
            return String.format("%,.2f", valorReal).replace(".", "#").replace(",", ",").replace("#", ".");
        }

        if (valorReal >= 99999.99 && valorReal < 100000.00) {
            return String.format("%,.2f", valorReal).replace(".", "#").replace(",", ".");
        }

        if (valorReal >= 100000.00 && valorReal < 999999.99) {
            return String.format("%,.2f", valorReal).replace(",", "#").replace(",", ".").replace("#", ",");
        }

        if (valorReal >= 1000000.00) {
            return String.format("%,.2f", valorReal).replace(",", "#").replace(",", ".").replace("#", ",");
        }

        return "Erro";

    }
}
