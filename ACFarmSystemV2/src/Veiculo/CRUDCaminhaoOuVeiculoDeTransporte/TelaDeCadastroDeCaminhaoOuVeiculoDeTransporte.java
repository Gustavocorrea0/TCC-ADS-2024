package Veiculo.CRUDCaminhaoOuVeiculoDeTransporte;

import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDCaminhaoOuVeiculoDeTransporte;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class TelaDeCadastroDeCaminhaoOuVeiculoDeTransporte extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String estado;
    private String tipoVeiculo;

    private String nome;
    private String marca;
    private String chassi;

    private int anoAtual;
    private int ano;

    private Double capacidadeDoTanque;
    private Double capacidadeDeCarga;

    public TelaDeCadastroDeCaminhaoOuVeiculoDeTransporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jButtonVoltarATelaDeInicioVeiculo = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabelFundoCadastroDeVeiculo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setBorderPainted(false);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.setDefaultCapable(false);
        jButtonCancelarCadastro.setFocusPainted(false);
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 596, 280, 36));

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setBorderPainted(false);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.setDefaultCapable(false);
        jButtonConfirmarCadastro.setFocusPainted(false);
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 547, 280, 35));

        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 181, 272, 29));

        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 284, 271, 29));

        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 392, 272, 29));

        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 498, 272, 29));

        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 181, 270, 29));

        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setBorder(null);
        getContentPane().add(jTextFieldChassiCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 284, 271, 29));

        jButtonVoltarATelaDeInicioVeiculo.setBorder(null);
        jButtonVoltarATelaDeInicioVeiculo.setBorderPainted(false);
        jButtonVoltarATelaDeInicioVeiculo.setContentAreaFilled(false);
        jButtonVoltarATelaDeInicioVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeInicioVeiculo.setDefaultCapable(false);
        jButtonVoltarATelaDeInicioVeiculo.setFocusPainted(false);
        jButtonVoltarATelaDeInicioVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeInicioVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeInicioVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 39, 25));

        jComboBoxEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ativo", "Inativo" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 280, 30));

        jLabelFundoCadastroDeVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgCaminhao/img_tela_de_cadastro_de_caminhao.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadastroDeVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonVoltarATelaDeInicioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed
        this.dispose();
        new TelaCRUDCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        cadastrarCaminhaoOuVeiculoDeTransporte();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed

    public void cadastrarCaminhaoOuVeiculoDeTransporte() {
        if (jTextFieldNomeCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do caminhão");
            return;
        }

        if (jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do caminhão");
            return;
        }

        if (jTextFieldAnoCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do caminhão");
            return;
        }

        if (jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do tanque do caminhão");
            return;
        }

        if (jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade de carga do caminhão");
            return;
        }

        if (jTextFieldChassiCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do caminhão (17 Digitos)");
            return;
        }

        Calendar cal = Calendar.getInstance();

        nome = jTextFieldNomeCaminhaoOuVeiculoDeTransporte.getText();
        marca = jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.getText();
        chassi = jTextFieldChassiCaminhaoOuVeiculoDeTransporte.getText();

        try {
            anoAtual = cal.get(Calendar.YEAR);
            ano = Integer.parseInt(jTextFieldAnoCaminhaoOuVeiculoDeTransporte.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O ano deve ser um valor númerico");
            return;
        }

        try {
            capacidadeDoTanque = Double.valueOf(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A capacidade do tanque deve ser númerica");
            return;
        }

        try {
            capacidadeDeCarga = Double.valueOf(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A capacidade de carga deve ser númerica");
            return;
        }

        estado = jComboBoxEstado.getSelectedItem().toString();

        if (capacidadeDeCarga <= 0) {
            JOptionPane.showMessageDialog(null, "Numero de rodas Inválidos");
            return;
        }

        if (ano > (anoAtual + 1) || ano < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (chassi.length() != 17) {
            JOptionPane.showMessageDialog(null, "Chassi Inválido (17 Digitos)");
            return;
        }

        if (capacidadeDoTanque <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade do tanque Inválida");
            return;
        }

        if (capacidadeDeCarga <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade do carga Inválida");
            return;
        }

        try {
            tipoVeiculo = "Caminhao ou Veiculo de Transporte";

            if (estado.equals("Ativo")) {
                estado = "A";
            } else if (estado.equals("Inativo")) {
                estado = "I";
            } else {
                JOptionPane.showMessageDialog(this, "Estado Inválido");
                return;
            }

            controleVeiculo.caminhaoOuVeiculoDeTransporte.setTipoVeiculo(tipoVeiculo);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setNomeVeiculo(nome);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setMarcaVeiculo(marca);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setAnoVeiculo(ano);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setChassiVeiculo(chassi);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setEstadoVeiculo(estado);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanque);
            controleVeiculo.caminhaoOuVeiculoDeTransporte.setCapacidadeDeCarga(capacidadeDeCarga);

            if (controleVeiculo.buscarCaminhaoOuVeiculoDeTransportePorNome(nome) != null) {
                JOptionPane.showMessageDialog(this, "Já existe um veiculo com este nome\n"
                        + "Recomenda-se utilizar o nome + numero (Exemplo: Caminhao 12)");
                return;
            }

            String msg = controleVeiculo.cadastrarCaminhaoOuVeiculoDeTransporte(ControleVeiculo.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();

        } catch (Exception ex) {
            System.out.println("Problema no sistema, tipo: " + ex.getMessage());
        }

    }

    private void limparCampos() {
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaDeInicioVeiculo;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabelFundoCadastroDeVeiculo;
    private javax.swing.JTextField jTextFieldAnoCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldChassiCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldMarcaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldNomeCaminhaoOuVeiculoDeTransporte;
    // End of variables declaration//GEN-END:variables
}
