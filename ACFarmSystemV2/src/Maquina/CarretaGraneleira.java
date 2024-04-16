package Maquina;

/**
 *
 * @author Gustavo
 */
public class CarretaGraneleira extends Maquina {

    private int idCarretaGraneleira;
    private int capacidadeDeSacas;
    private Double capacidadeDePeso;

    public int getIdCarretaGraneleira() {
        return idCarretaGraneleira;
    }

    public void setIdCarretaGraneleira(int idCarretaGraneleira) {
        this.idCarretaGraneleira = idCarretaGraneleira;
    }

    public Double getCapacidadeDePeso() {
        return capacidadeDePeso;
    }

    public void setCapacidadeDePeso(Double capacidadeDePeso) {
        this.capacidadeDePeso = capacidadeDePeso;
    }

    public int getCapacidadeDeSacas() {
        return capacidadeDeSacas;
    }

    public void setCapacidadeDeSacas(int capacidadeDeSacas) {
        this.capacidadeDeSacas = capacidadeDeSacas;
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
