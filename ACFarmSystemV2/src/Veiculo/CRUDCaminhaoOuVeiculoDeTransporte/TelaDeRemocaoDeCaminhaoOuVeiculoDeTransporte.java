package Veiculo.CRUDCaminhaoOuVeiculoDeTransporte;

import Veiculo.CaminhaoOuVeiculoDeTransporte;
import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDCaminhaoOuVeiculoDeTransporte;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeRemocaoDeCaminhaoOuVeiculoDeTransporte extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String numeroDeMarchas;
    String nomeParaBuscaCaminhao;
    
    public TelaDeRemocaoDeCaminhaoOuVeiculoDeTransporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeEscolhaDeVeiculo = new javax.swing.JButton();
        jTextFieldIdCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jButtonBuscarTrator = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jLabelTelaVerificacaoDeCaminhao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setBorder(null);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setBorderPainted(false);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setContentAreaFilled(false);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setDefaultCapable(false);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setFocusPainted(false);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoTelaDeEscolhaDeVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 24));

        jTextFieldIdCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldIdCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 114, 267, 28));

        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setEditable(false);
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 333, 270, 28));

        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setEditable(false);
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 415, 269, 29));

        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setEditable(false);
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldChassiCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 240, 268, 29));

        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setEditable(false);
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 415, 60, 29));

        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setEditable(false);
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 241, 270, 28));

        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setEditable(false);
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 330, 269, 29));

        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setEditable(false);
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 507, 269, 29));

        jButtonBuscarTrator.setBorder(null);
        jButtonBuscarTrator.setContentAreaFilled(false);
        jButtonBuscarTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 104, 260, 45));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.setDefaultCapable(false);
        jButtonCancelarRemocao.setFocusPainted(false);
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 593, 282, 37));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.setDefaultCapable(false);
        jButtonConfirmarRemocao.setFocusPainted(false);
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 543, 282, 37));

        jLabelTelaVerificacaoDeCaminhao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/img_tela_de_remocao_de_caminhao.png"))); // NOI18N
        getContentPane().add(jLabelTelaVerificacaoDeCaminhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed

    private void jTextFieldIdCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldEstadoCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jButtonBuscarTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTratorActionPerformed
        try {
            // TODO add your handling code here:
            buscarCaminhaoOuVeiculoDeTransporte();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoDeCaminhaoOuVeiculoDeTransporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarTratorActionPerformed

    private void jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed

        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText("");
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerCaminhaoOuVeiculoDeTransporte();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed

    public void buscarCaminhaoOuVeiculoDeTransporte() throws SQLException {
        nomeParaBuscaCaminhao = jTextFieldIdCaminhaoOuVeiculoDeTransporte.getText();
        CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporteEncontrado = controleVeiculo.buscarCaminhaoOuVeiculoDeTransportePorNome(nomeParaBuscaCaminhao);

        if (caminhaoOuVeiculoDeTransporteEncontrado != null) {

            String anoCaminhaoOuVeiculoDeTransporte = Integer.toString(caminhaoOuVeiculoDeTransporteEncontrado.getAnoVeiculo());
            String capacidadeDeCargaCaminhaoOuVeiculoDeTransporte = Double.toString(caminhaoOuVeiculoDeTransporteEncontrado.getCapacidadeDeCarga());
            String estadoCaminhaoOuVeiculoDeTransporte = caminhaoOuVeiculoDeTransporteEncontrado.getEstadoVeiculo();
            String capacidadeDoTanque = Double.toString(caminhaoOuVeiculoDeTransporteEncontrado.getCapacidadeDoTanqueDeCombustivel());

            jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getChassiVeiculo());
            jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getMarcaVeiculo());
            jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getNomeVeiculo());
            jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText(anoCaminhaoOuVeiculoDeTransporte);
            jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setText(estadoCaminhaoOuVeiculoDeTransporte);
            jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText(capacidadeDeCargaCaminhaoOuVeiculoDeTransporte);
            jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setText(capacidadeDoTanque);

            jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setEnabled(false);
            jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setEnabled(false);
            jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setEnabled(false);
            jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setEnabled(false);
            jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setEnabled(false);
            jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setEnabled(false);
            jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Veiculo não encontrado.");
        }
    }

    public void removerCaminhaoOuVeiculoDeTransporte() {
        nomeParaBuscaCaminhao = jTextFieldIdCaminhaoOuVeiculoDeTransporte.getText();
        String mensagem = controleVeiculo.removerCaminhaoOuVeiculoDeTransportePorNome(nomeParaBuscaCaminhao);
        JOptionPane.showMessageDialog(this, mensagem);

        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTrator;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonVoltarAoTelaDeEscolhaDeVeiculo;
    private javax.swing.JLabel jLabelTelaVerificacaoDeCaminhao;
    private javax.swing.JTextField jTextFieldAnoCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldChassiCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldEstadoCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldIdCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldMarcaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldNomeCaminhaoOuVeiculoDeTransporte;
    // End of variables declaration//GEN-END:variables
}
