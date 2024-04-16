package Maquina;

/**
 *
 * @author Gustavo
 */
public class Pulverizador extends Maquina {
    private int idPulverizador;
    private String tipoDeCultura;
    private Double capacidadeDoReservatorio;
    
    public int getIdPulverizador() {
        return idPulverizador;
    }

    public void setIdPulverizador(int idPulverizador) {
        this.idPulverizador = idPulverizador;
    }

    public String getTipoDeCultura() {
        return tipoDeCultura;
    }

    public void setTipoDeCultura(String tipoDeCultura) {
        this.tipoDeCultura = tipoDeCultura;
    }

    public Double getCapacidadeDoReservatorio() {
        return capacidadeDoReservatorio;
    }

    public void setCapacidadeDoReservatorio(Double capacidadeDoReservatorio) {
        this.capacidadeDoReservatorio = capacidadeDoReservatorio;
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
