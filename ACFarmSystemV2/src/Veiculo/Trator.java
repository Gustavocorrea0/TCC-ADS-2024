package Veiculo;

/**
 *
 * @author Gustavo
 */
public class Trator extends Veiculo {
    
    private int idTrator;
    private int quantidadeDeMarchas;
    private int quantidadeDeRodas;
    private int potenciaEmCV;
    
    public int getIdTrator() {
        return idTrator;
    }

    public void setIdTrator(int idTrator) {
        this.idTrator = idTrator;
    }

    public int getQuantidadeDeMarchas() {
        return quantidadeDeMarchas;
    }

    public void setQuantidadeDeMarchas(int quantidadeDeMarchas) {
        this.quantidadeDeMarchas = quantidadeDeMarchas;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public int getPotenciaEmCV() {
        return potenciaEmCV;
    }

    public void setPotenciaEmCV(int potenciaEmCV) {
        this.potenciaEmCV = potenciaEmCV;
    }

    @Override
    public void setIdVeiculo(Long idVeiculo) {
        super.setIdVeiculo(idVeiculo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Long getIdVeiculo() {
        return super.getIdVeiculo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCapacidadeDoTanqueDeCombustivel(Double capacidadeDoTanqueDeCombustivel) {
        super.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanqueDeCombustivel); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Double getCapacidadeDoTanqueDeCombustivel() {
        return super.getCapacidadeDoTanqueDeCombustivel(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEstadoVeiculo(String estadoVeiculo) {
        super.setEstadoVeiculo(estadoVeiculo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getEstadoVeiculo() {
        return super.getEstadoVeiculo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setChassiVeiculo(String chassiVeiculo) {
        super.setChassiVeiculo(chassiVeiculo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getChassiVeiculo() {
        return super.getChassiVeiculo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAnoVeiculo(int anoVeiculo) {
        super.setAnoVeiculo(anoVeiculo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getAnoVeiculo() {
        return super.getAnoVeiculo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setMarcaVeiculo(String marcaVeiculo) {
        super.setMarcaVeiculo(marcaVeiculo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMarcaVeiculo() {
        return super.getMarcaVeiculo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNomeVeiculo(String nomeVeiculo) {
        super.setNomeVeiculo(nomeVeiculo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNomeVeiculo() {
        return super.getNomeVeiculo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTipoVeiculo(String tipoVeiculo) {
        super.setTipoVeiculo(tipoVeiculo); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTipoVeiculo() {
        return super.getTipoVeiculo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
}
