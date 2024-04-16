package Maquina;

/**
 *
 * @author Gustavo
 */

public class Colheitadeira extends Maquina {
    
    private int idColheitadeira;
    private int quantidadeDeSacos;
    private Double capacidadeDoTanqueDeCombustivel;
    private String cultura;
    
    public int getIdColheitadeira() {
        return idColheitadeira;
    }

    public void setIdColheitadeira(int idColheitadeira) {
        this.idColheitadeira = idColheitadeira;
    }

    public int getQuantidadeDeSacos() {
        return quantidadeDeSacos;
    }

    public void setQuantidadeDeSacos(int quantidadeDeSacos) {
        this.quantidadeDeSacos = quantidadeDeSacos;
    }

    public Double getCapacidadeDoTanqueDeCombustivel() {
        return capacidadeDoTanqueDeCombustivel;
    }

    public void setCapacidadeDoTanqueDeCombustivel(Double capacidadeDoTanqueDeCombustivel) {
        this.capacidadeDoTanqueDeCombustivel = capacidadeDoTanqueDeCombustivel;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

        @Override
    public void setEstadoMaquina(String estadoMaquina) {
        super.setEstadoMaquina(estadoMaquina); 
    }

    @Override
    public String getEstadoMaquina() {
        return super.getEstadoMaquina(); 
    }

    @Override
    public void setChassiMaquina(String chassiMaquina) {
        super.setChassiMaquina(chassiMaquina); 
    }

    @Override
    public String getChassiMaquina() {
        return super.getChassiMaquina();
    }

    @Override
    public void setAnoMaquina(int anoMaquina) {
        super.setAnoMaquina(anoMaquina); 
    }

    @Override
    public int getAnoMaquina() {
        return super.getAnoMaquina(); 
    }

    @Override
    public void setMarcaMaquina(String marcaMaquina) {
        super.setMarcaMaquina(marcaMaquina); 
    }

    @Override
    public String getMarcaMaquina() {
        return super.getMarcaMaquina(); 
    }

    @Override
    public void setNomeMaquina(String nomeMaquina) {
        super.setNomeMaquina(nomeMaquina); 
    }

    @Override
    public String getNomeMaquina() {
        return super.getNomeMaquina(); 
    }

    @Override
    public void setTipoMaquina(String tipoMaquina) {
        super.setTipoMaquina(tipoMaquina); 
    }

    @Override
    public String getTipoMaquina() {
        return super.getTipoMaquina(); 
    }

    @Override
    public void setIdMaquina(int idMaquina) {
        super.setIdMaquina(idMaquina); 
    }

    @Override
    public int getIdMaquina() {
        return super.getIdMaquina(); 
    }
    
}
