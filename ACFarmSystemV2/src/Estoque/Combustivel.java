package Estoque;

public class Combustivel {
    private int idCombustivel;
    private String nomeCombustivel;
    private Double quantidadeEmLitros;
    private Double quantidadeMinimaEmLitros;

    public int getIdCombustivel() {
        return idCombustivel;
    }

    public void setIdCombustivel(int idCombustivel) {
        this.idCombustivel = idCombustivel;
    }

    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    public void setNomeCombustivel(String nomeCombustivel) {
        this.nomeCombustivel = nomeCombustivel;
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
    
    
}
