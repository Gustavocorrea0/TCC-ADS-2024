package Veiculo;


public class CaminhaoOuVeiculoDeTransporte extends Veiculo {
    
    private int idCaminhaoOuVeiculoDeTransporte;
    private Double capacidadeDeCarga;
    
    public int getIdCaminhaoOuVeiculoDeTransporte() {
        return idCaminhaoOuVeiculoDeTransporte;
    }

    public void setIdCaminhaoOuVeiculoDeTransporte(int idCaminhaoOuVeiculoDeTransporte) {
        this.idCaminhaoOuVeiculoDeTransporte = idCaminhaoOuVeiculoDeTransporte;
    }

    public Double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(Double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
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
