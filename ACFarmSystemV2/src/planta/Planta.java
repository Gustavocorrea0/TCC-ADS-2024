
package planta;

import java.util.Date;

public class Planta {
    
    private int idPlanta;
    private String tipoDePlanta;
    private int cicloEmDias;
    private Date dataDePlantio;
    private Double alturaAtualDaPlanta; 
    private String nomePropriedade;
    private String nomeFornecedor;

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomePropriedade() {
        return nomePropriedade;
    }

    public void setNomePropriedade(String nomePropriedade) {
        this.nomePropriedade = nomePropriedade;
    }
 
    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public String getTipoDePlanta() {
        return tipoDePlanta;
    }

    public void setTipoDePlanta(String tipoDePlanta) {
        this.tipoDePlanta = tipoDePlanta;
    }

    public int getCicloEmDias() {
        return cicloEmDias;
    }

    public void setCicloEmDias(int cicloEmDias) {
        this.cicloEmDias = cicloEmDias;
    }

    public Date getDataDePlantio() {
        return dataDePlantio;
    }

    public void setDataDePlantio(Date dataDePlantio) {
        this.dataDePlantio = dataDePlantio;
    }

    public Double getAlturaAtualDaPlanta() {
        return alturaAtualDaPlanta;
    }

    public void setAlturaAtualDaPlanta(Double alturaAtualDaPlanta) {
        this.alturaAtualDaPlanta = alturaAtualDaPlanta;
    }
    
    
}
