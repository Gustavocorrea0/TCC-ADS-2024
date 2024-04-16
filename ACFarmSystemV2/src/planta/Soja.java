package planta;

import java.util.Date;

public class Soja extends Planta{
    private int idSoja;
    private Date dataDeSurgimentoDeSementes;

    @Override
    public void setNomePropriedade(String nomePropriedade) {
        super.setNomePropriedade(nomePropriedade); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNomePropriedade() {
        return super.getNomePropriedade(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNomeFornecedor(String nomeFornecedor) {
        super.setNomeFornecedor(nomeFornecedor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNomeFornecedor() {
        return super.getNomeFornecedor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    public int getIdSoja() {
        return idSoja;
    }

    public void setIdSoja(int idSoja) {
        this.idSoja = idSoja;
    }

    public Date getDataDeSurgimentoDeSementes() {
        return dataDeSurgimentoDeSementes;
    }

    public void setDataDeSurgimentoDeSementes(Date dataDeSurgimentoDeSementes) {
        this.dataDeSurgimentoDeSementes = dataDeSurgimentoDeSementes;
    }

    @Override
    public void setAlturaAtualDaPlanta(Double alturaAtualDaPlanta) {
        super.setAlturaAtualDaPlanta(alturaAtualDaPlanta); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Double getAlturaAtualDaPlanta() {
        return super.getAlturaAtualDaPlanta(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDataDePlantio(Date dataDePlantio) {
        super.setDataDePlantio(dataDePlantio); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Date getDataDePlantio() {
        return super.getDataDePlantio(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCicloEmDias(int cicloEmDias) {
        super.setCicloEmDias(cicloEmDias); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getCicloEmDias() {
        return super.getCicloEmDias(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTipoDePlanta(String tipoDePlanta) {
        super.setTipoDePlanta(tipoDePlanta); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTipoDePlanta() {
        return super.getTipoDePlanta(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setIdPlanta(int idPlanta) {
        super.setIdPlanta(idPlanta); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getIdPlanta() {
        return super.getIdPlanta(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
