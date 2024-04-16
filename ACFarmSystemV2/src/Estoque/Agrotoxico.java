package Estoque;

import java.util.Date;

public class Agrotoxico {
    private int idAgrotoxico;
    private String nomeAgrotoxico;
    private String marcaAgrotoxico;
    private Double quantidadeEmLitros;
    private Double quantidadeMinimaEmLitros;
    private Date dataDeValidade;

    public int getIdAgrotoxico() {
        return idAgrotoxico;
    }

    public void setIdAgrotoxico(int idAgrotoxico) {
        this.idAgrotoxico = idAgrotoxico;
    }

    public String getNomeAgrotoxico() {
        return nomeAgrotoxico;
    }

    public void setNomeAgrotoxico(String nomeAgrotoxico) {
        this.nomeAgrotoxico = nomeAgrotoxico;
    }

    public String getMarcaAgrotoxico() {
        return marcaAgrotoxico;
    }

    public void setMarcaAgrotoxico(String marcaAgrotoxico) {
        this.marcaAgrotoxico = marcaAgrotoxico;
    }

    public Double getQuantidadeEmLitros() {
        return quantidadeEmLitros;
    }

    public void setQuantidadeEmLitros(Double quantidadeEmLitros) {
        this.quantidadeEmLitros = quantidadeEmLitros;
    }

    public Double getQuantidadeMinimaEmLitros() {
        return quantidadeMinimaEmLitros;
    }

    public void setQuantidadeMinimaEmLitros(Double quantidadeMinimaEmLitros) {
        this.quantidadeMinimaEmLitros = quantidadeMinimaEmLitros;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
    
    
}
