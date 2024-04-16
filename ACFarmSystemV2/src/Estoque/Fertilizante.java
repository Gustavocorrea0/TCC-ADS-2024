package Estoque;

public class Fertilizante {
    private int idFertilizante;
    private String nomeFertilizante;
    private String marcaFertilizante;
    private String tipoFertilizante;
    private Double quantidadeEmSacos;
    private Double quantidadeEmLitros;

    public String getTipoFertilizante() {
        return tipoFertilizante;
    }

    public void setTipoFertilizante(String tipoFertilizante) {
        this.tipoFertilizante = tipoFertilizante;
    }

    public String getNomeFertilizante() {
        return nomeFertilizante;
    }

    public void setNomeFertilizante(String nomeFertilizante) {
        this.nomeFertilizante = nomeFertilizante;
    }

    public String getMarcaFertilizante() {
        return marcaFertilizante;
    }

    public void setMarcaFertilizante(String marcaFertilizante) {
        this.marcaFertilizante = marcaFertilizante;
    }
 
    public int getIdFertilizante() {
        return idFertilizante;
    }

    public void setIdFertilizante(int idFertilizante) {
        this.idFertilizante = idFertilizante;
    }
    
    public Double getQuantidadeEmSacos() {
        return quantidadeEmSacos;
    }

    public void setQuantidadeEmSacos(Double quantidadeEmSacos) {
        this.quantidadeEmSacos = quantidadeEmSacos;
    }

    public Double getQuantidadeEmLitros() {
        return quantidadeEmLitros;
    }

    public void setQuantidadeEmLitros(Double quantidadeEmLitros) {
        this.quantidadeEmLitros = quantidadeEmLitros;
    }
    
}
