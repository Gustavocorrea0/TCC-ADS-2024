package Veiculo;

public class Carro extends Veiculo {
    private int idCarro;
    private String placaCarro;
    private String corCarro;
    private int quilometragemCarro;

    @Override
    public void setCapacidadeDoTanqueDeCombustivel(Double capacidadeDoTanqueDeCombustivel) {
        super.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanqueDeCombustivel); 
    }

    @Override
    public Double getCapacidadeDoTanqueDeCombustivel() {
        return super.getCapacidadeDoTanqueDeCombustivel(); 
    }

    @Override
    public void setEstadoVeiculo(String estadoVeiculo) {
        super.setEstadoVeiculo(estadoVeiculo); 
    }

    @Override
    public String getEstadoVeiculo() {
        return super.getEstadoVeiculo(); 
    }

    @Override
    public void setChassiVeiculo(String chassiVeiculo) {
        super.setChassiVeiculo(chassiVeiculo); 
    }

    @Override
    public String getChassiVeiculo() {
        return super.getChassiVeiculo(); 
    }

    @Override
    public void setAnoVeiculo(int anoVeiculo) {
        super.setAnoVeiculo(anoVeiculo); 
    }

    @Override
    public int getAnoVeiculo() {
        return super.getAnoVeiculo();
    }

    @Override
    public void setMarcaVeiculo(String marcaVeiculo) {
        super.setMarcaVeiculo(marcaVeiculo);
    }

    @Override
    public String getMarcaVeiculo() {
        return super.getMarcaVeiculo(); 
    }

    @Override
    public void setNomeVeiculo(String nomeVeiculo) {
        super.setNomeVeiculo(nomeVeiculo); 
    }

    @Override
    public String getNomeVeiculo() {
        return super.getNomeVeiculo(); 
    }

    @Override
    public void setTipoVeiculo(String tipoVeiculo) {
        super.setTipoVeiculo(tipoVeiculo); 
    }

    @Override
    public String getTipoVeiculo() {
        return super.getTipoVeiculo(); 
    }

    @Override
    public void setIdVeiculo(Long idVeiculo) {
        super.setIdVeiculo(idVeiculo);
    }

    @Override
    public Long getIdVeiculo() {
        return super.getIdVeiculo(); 
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public int getQuilometragemCarro() {
        return quilometragemCarro;
    }

    public void setQuilometragemCarro(int quilometragemCarro) {
        this.quilometragemCarro = quilometragemCarro;
    }
    
}
