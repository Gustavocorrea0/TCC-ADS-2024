package Veiculo;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;

public class TelaDeEscolhaTipoDeVeiculo extends javax.swing.JFrame {

    public TelaDeEscolhaTipoDeVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeInicioVeiculo = new javax.swing.JButton();
        jButtonVerificarCaminhaoOuTransporte = new javax.swing.JButton();
        jButtonVerificarTrator = new javax.swing.JButton();
        jButtonVerificarCarro = new javax.swing.JButton();
        jLabelFundoEscolhaParaVerificacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonVoltarATelaDeInicioVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 39, 25));

        jButtonVerificarCaminhaoOuTransporte.setBorder(null);
        jButtonVerificarCaminhaoOuTransporte.setContentAreaFilled(false);
        jButtonVerificarCaminhaoOuTransporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarCaminhaoOuTransporte.setVerifyInputWhenFocusTarget(false);
        jButtonVerificarCaminhaoOuTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarCaminhaoOuTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarCaminhaoOuTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 140, 110));

        jButtonVerificarTrator.setBorder(null);
        jButtonVerificarTrator.setContentAreaFilled(false);
        jButtonVerificarTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarTrator.setVerifyInputWhenFocusTarget(false);
        jButtonVerificarTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 270, 144, 110));

        jButtonVerificarCarro.setBorder(null);
        jButtonVerificarCarro.setContentAreaFilled(false);
        jButtonVerificarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarCarro.setVerifyInputWhenFocusTarget(false);
        jButtonVerificarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 140, 110));

        jLabelFundoEscolhaParaVerificacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/img_escolha_tipo_de_veiculo.png"))); // NOI18N
        getContentPane().add(jLabelFundoEscolhaParaVerificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarATelaDeInicioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed

    private void jButtonVerificarCaminhaoOuTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarCaminhaoOuTransporteActionPerformed
        this.dispose();
        new TelaCRUDCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarCaminhaoOuTransporteActionPerformed

    private void jButtonVerificarTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarTratorActionPerformed
        this.dispose();
        new TelaCRUDTrator().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarTratorActionPerformed

    private void jButtonVerificarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarCarroActionPerformed
        this.dispose();
        new TelaCRUDCarro().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarCarroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerificarCaminhaoOuTransporte;
    private javax.swing.JButton jButtonVerificarCarro;
    private javax.swing.JButton jButtonVerificarTrator;
    private javax.swing.JButton jButtonVoltarATelaDeInicioVeiculo;
    private javax.swing.JLabel jLabelFundoEscolhaParaVerificacao;
    // End of variables declaration//GEN-END:variables
}
