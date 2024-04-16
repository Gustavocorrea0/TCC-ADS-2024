package Maquina;

/**
 *
 * @author Gustavo
 */
public class MaquinaDePlantio extends Maquina {
    
    private int idMaquinaDePlantio;
    private int capacidadeDeSementes;
    private int quantidadeDeLinhas;

    public int getIdMaquinaDePlantio() {
        return idMaquinaDePlantio;
    }

    public void setIdMaquinaDePlantio(int idMaquinaDePlantio) {
        this.idMaquinaDePlantio = idMaquinaDePlantio;
    }

    public int getCapacidadeDeSementes() {
        return capacidadeDeSementes;
    }

    public void setCapacidadeDeSementes(int capacidadeDeSementes) {
        this.capacidadeDeSementes = capacidadeDeSementes;
    }

    public int getQuantidadeDeLinhas() {
        return quantidadeDeLinhas;
    }

    public void setQuantidadeDeLinhas(int quantidadeDeLinhas) {
        this.quantidadeDeLinhas = quantidadeDeLinhas;
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
