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
public class TelaDeVerificacaoDeCaminhaoOuVeiculoDeTransporte extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String nomeParaBuscaCaminhao;

    public TelaDeVerificacaoDeCaminhaoOuVeiculoDeTransporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeEscolhaDeVeiculo = new javax.swing.JButton();
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado = new javax.swing.JTextField();
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldEstadoCaminhao = new javax.swing.JTextField();
        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jButtonBuscarTrator = new javax.swing.JButton();
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

        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setBorder(null);
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 113, 270, 29));

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
        getContentPane().add(jTextFieldMarcaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 331, 271, 29));

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
        getContentPane().add(jTextFieldAnoCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 415, 271, 29));

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
        getContentPane().add(jTextFieldChassiCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 240, 271, 29));

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
        getContentPane().add(jTextFieldNomeCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 240, 271, 29));

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
        getContentPane().add(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 329, 271, 29));

        jTextFieldEstadoCaminhao.setEditable(false);
        jTextFieldEstadoCaminhao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoCaminhao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoCaminhao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCaminhao.setBorder(null);
        jTextFieldEstadoCaminhao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoCaminhaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoCaminhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 414, 65, 29));

        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.setEditable(false);
        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 506, 271, 29));

        jButtonBuscarTrator.setBorder(null);
        jButtonBuscarTrator.setContentAreaFilled(false);
        jButtonBuscarTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 106, 282, 45));

        jLabelTelaVerificacaoDeCaminhao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgCaminhao/img_tela_de_verificacao_de_caminhao.png"))); // NOI18N
        getContentPane().add(jLabelTelaVerificacaoDeCaminhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed
        this.dispose();
        new TelaCRUDCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed

    private void jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscadoActionPerformed

    private void jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jButtonBuscarTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTratorActionPerformed
        try {
            buscarCaminhaoOuVeiculoDeTransporte();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeVerificacaoDeCaminhaoOuVeiculoDeTransporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarTratorActionPerformed

    private void jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldEstadoCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoCaminhaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoCaminhaoActionPerformed

    public void buscarCaminhaoOuVeiculoDeTransporte() throws SQLException {
        try {
            if (jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Insira o nome do veículo");
                limparCampos();
                return;
            }

            nomeParaBuscaCaminhao = jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.getText();
            CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporteEncontrado = controleVeiculo.buscarCaminhaoOuVeiculoDeTransportePorNome(nomeParaBuscaCaminhao);

            if (caminhaoOuVeiculoDeTransporteEncontrado != null) {
                String anoCaminhaoOuVeiculoDeTransporte = Integer.toString(caminhaoOuVeiculoDeTransporteEncontrado.getAnoVeiculo());
                String capacidadeDeCargaCaminhaoOuVeiculoDeTransporte = Double.toString(caminhaoOuVeiculoDeTransporteEncontrado.getCapacidadeDeCarga());
                String capacidadeDoTanqueCaminhaoOuVeiculoDeTransporte = Double.toString(caminhaoOuVeiculoDeTransporteEncontrado.getCapacidadeDoTanqueDeCombustivel());

                jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getChassiVeiculo());
                jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getMarcaVeiculo());
                jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getNomeVeiculo());
                jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText(anoCaminhaoOuVeiculoDeTransporte);
                jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.setText(capacidadeDoTanqueCaminhaoOuVeiculoDeTransporte);
                jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText(capacidadeDeCargaCaminhaoOuVeiculoDeTransporte);
                jTextFieldEstadoCaminhao.setText(caminhaoOuVeiculoDeTransporteEncontrado.getEstadoVeiculo());
            } else {
                JOptionPane.showMessageDialog(this, "Veiculo não encontrado");
                limparCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha tipo: " + ex.getMessage());
        }

    }

    private void limparCampos() {
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldEstadoCaminhao.setText("");
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTrator;
    private javax.swing.JButton jButtonVoltarAoTelaDeEscolhaDeVeiculo;
    private javax.swing.JLabel jLabelTelaVerificacaoDeCaminhao;
    private javax.swing.JTextField jTextFieldAnoCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDeCombustivelCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldChassiCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldEstadoCaminhao;
    private javax.swing.JTextField jTextFieldMarcaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldNomeCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado;
    // End of variables declaration//GEN-END:variables
}
