package producao;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class Producao {
    private int idProducao;
    private Date dataDePlantio;
    private Date dataInicioColheita;
    private Date dataFimColheita;
    private String propriedadeColheita;
    private String cultura;
    private int quantidadeProduzidaEmSacos;
    private String nomeProducao;
    private Double valorTotalDeLucro;
    private Double valorTotalDespesas;
    private String statusDeVenda;
    private int idPropriedade;
    private int idSubdivisao;

    public String getPropriedadeColheita() {
        return propriedadeColheita;
    }

    public void setPropriedadeColheita(String propriedadeColheita) {
        this.propriedadeColheita = propriedadeColheita;
    }

    public String getStatusDeVenda() {
        return statusDeVenda;
    }

    public void setStatusDeVenda(String statusDeVenda) {
        this.statusDeVenda = statusDeVenda;
    }

    public int getIdSubdivisao() {
        return idSubdivisao;
    }

    public void setIdSubdivisao(int idSubdivisao) {
        this.idSubdivisao = idSubdivisao;
    }
    
    public int getIdProducao() {
        return idProducao;
    }

    public void setIdProducao(int idProducao) {
        this.idProducao = idProducao;
    }

    public Date getDataDePlantio() {
        return dataDePlantio;
    }

    public void setDataDePlantio(Date dataDePlantio) {
        this.dataDePlantio = dataDePlantio;
    }

    public Date getDataInicioColheita() {
        return dataInicioColheita;
    }

    public void setDataInicioColheita(Date dataInicioColheita) {
        this.dataInicioColheita = dataInicioColheita;
    }

    public Date getDataFimColheita() {
        return dataFimColheita;
    }

    public void setDataFimColheita(Date dataFimColheita) {
        this.dataFimColheita = dataFimColheita;
    }

    public String getPropriedade() {
        return propriedadeColheita;
    }

    public void setPropriedade(String propriedade) {
        this.propriedadeColheita = propriedade;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public int getQuantidadeProduzidaEmSacos() {
        return quantidadeProduzidaEmSacos;
    }

    public void setQuantidadeProduzidaEmSacos(int quantidadeProduzidaEmSacos) {
        this.quantidadeProduzidaEmSacos = quantidadeProduzidaEmSacos;
    }

    public String getNomeProducao() {
        return nomeProducao;
    }

    public void setNomeProducao(String nomeProducao) {
        this.nomeProducao = nomeProducao;
    }

    public Double getValorTotalDespesas() {
        return valorTotalDespesas;
    }

    public void setValorTotalDespesas(Double valorTotalDespesas) {
        this.valorTotalDespesas = valorTotalDespesas;
    }

    public Double getValorTotalDeLucro() {
        return valorTotalDeLucro;
    }

    public void setValorTotalDeLucro(Double valorTotalDeLucro) {
        this.valorTotalDeLucro = valorTotalDeLucro;
    }

    public int getIdPropriedade() {
        return idPropriedade;
    }

    public void setIdPropriedade(int idPropriedade) {
        this.idPropriedade = idPropriedade;
    }
    
    
}
