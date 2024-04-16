package Maquina;

/**
 *
 * @author Gustavo
 */
public class Subsolador extends Maquina {
    
    private int idSubsolador;
    private Double peso;
    private Double larguraEmMM;
    private int numeroDeHastes;
    private int potenciaNecessariaTratorEmCv;

    public int getIdSubsolador() {
        return idSubsolador;
    }

    public void setIdSubsolador(int idSubsolador) {
        this.idSubsolador = idSubsolador;
    }
    
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLarguraEmMM() {
        return larguraEmMM;
    }

    public void setLarguraEmMM(Double larguraEmMM) {
        this.larguraEmMM = larguraEmMM;
    }

    public int getNumeroDeHastes() {
        return numeroDeHastes;
    }

    public void setNumeroDeHastes(int numeroDeHastes) {
        this.numeroDeHastes = numeroDeHastes;
    }

    public int getPotenciaNecessariaTratorEmCv() {
        return potenciaNecessariaTratorEmCv;
    }

    public void setPotenciaNecessariaTratorEmCv(int potenciaNecessariaTratorEmCv) {
        this.potenciaNecessariaTratorEmCv = potenciaNecessariaTratorEmCv;
    }

    @Override
    public void setEstadoMaquina(String estadoMaquina) {
        super.setEstadoMaquina(estadoMaquina); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getEstadoMaquina() {
        return super.getEstadoMaquina(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setChassiMaquina(String chassiMaquina) {
        super.setChassiMaquina(chassiMaquina); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getChassiMaquina() {
        return super.getChassiMaquina(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAnoMaquina(int anoMaquina) {
        super.setAnoMaquina(anoMaquina); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getAnoMaquina() {
        return super.getAnoMaquina(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMarcaMaquina(String marcaMaquina) {
        super.setMarcaMaquina(marcaMaquina); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMarcaMaquina() {
        return super.getMarcaMaquina(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNomeMaquina(String nomeMaquina) {
        super.setNomeMaquina(nomeMaquina); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNomeMaquina() {
        return super.getNomeMaquina(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTipoMaquina(String tipoMaquina) {
        super.setTipoMaquina(tipoMaquina); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTipoMaquina() {
        return super.getTipoMaquina(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setIdMaquina(int idMaquina) {
        super.setIdMaquina(idMaquina); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getIdMaquina() {
        return super.getIdMaquina(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
