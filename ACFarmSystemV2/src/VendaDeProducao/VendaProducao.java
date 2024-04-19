package VendaDeProducao;

import java.util.Date;

public class VendaProducao {
    private int idVendaProducao;
    private String nomeProducao;
    private String nomeCliente;
    private String CNPJOuCPF;
    private Date dataProducao;
    private Date dataVenda;
    private Double valorTotalVenda;
    private int quantidadeDeSacasProducao;
    private String formaDePagamento;
    private String metodoDePagamento;
    private int quantidadeDeParcelas;

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public int getQuantidadeDeParcelas() {
        return quantidadeDeParcelas;
    }

    public void setQuantidadeDeParcelas(int quantidadeDeParcelas) {
        this.quantidadeDeParcelas = quantidadeDeParcelas;
    }
    
    
    
    public int getIdVendaProducao() {
        return idVendaProducao;
    }

    public void setIdVendaProducao(int idVendaProducao) {
        this.idVendaProducao = idVendaProducao;
    }

    public String getNomeProducao() {
        return nomeProducao;
    }

    public void setNomeProducao(String nomeProducao) {
        this.nomeProducao = nomeProducao;
    }

    public int getQuantidadeDeSacasProducao() {
        return quantidadeDeSacasProducao;
    }

    public void setQuantidadeDeSacasProducao(int quantidadeDeSacasProducao) {
        this.quantidadeDeSacasProducao = quantidadeDeSacasProducao;
    }

    public Date getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Date dataProducao) {
        this.dataProducao = dataProducao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCNPJOuCPF() {
        return CNPJOuCPF;
    }

    public void setCNPJOuCPF(String CNPJOuCPF) {
        this.CNPJOuCPF = CNPJOuCPF;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(Double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }
    
    
}
