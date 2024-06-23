package Maquina;

import Maquina.CRUDCarregador.TelaCRUDCarregador;
import Maquina.CRUDCarretaGraneleira.TelaCRUDCarretaGraneleira;
import Maquina.CRUDColheitadeira.TelaCRUDColheitadeira;
import Maquina.CRUDMaquinaDePlantio.TelaCRUDMaquinaDePlantio;
import Maquina.CRUDPulverizador.TelaCRUDPulverizador;
import Maquina.CRUDSubsolador.TelaCRUDSubsolador;
import acfarmsystemv2.telaDeInicio.TelaDeInicio;

public class TelaDeInicioMaquinas extends javax.swing.JFrame {

    public TelaDeInicioMaquinas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeInicio = new javax.swing.JButton();
        jButtonAcessarSubsolador = new javax.swing.JButton();
        jButtonAcessarCarregador = new javax.swing.JButton();
        jButtonAcessarColheitadeira = new javax.swing.JButton();
        jButtonAcessarCarregaGraneleira = new javax.swing.JButton();
        jButtonAcessarMaquinaDePlantio = new javax.swing.JButton();
        jButtonAcessarPulverizador = new javax.swing.JButton();
        jButtonAcessarRelatorioDeMaquina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarATelaDeInicio.setBorder(null);
        jButtonVoltarATelaDeInicio.setBorderPainted(false);
        jButtonVoltarATelaDeInicio.setContentAreaFilled(false);
        jButtonVoltarATelaDeInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 25));

        jButtonAcessarSubsolador.setBorder(null);
        jButtonAcessarSubsolador.setContentAreaFilled(false);
        jButtonAcessarSubsolador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarSubsolador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarSubsoladorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarSubsolador, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 166, 140, 110));

        jButtonAcessarCarregador.setBorder(null);
        jButtonAcessarCarregador.setContentAreaFilled(false);
        jButtonAcessarCarregador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarCarregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarCarregadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarCarregador, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 365, 140, 110));

        jButtonAcessarColheitadeira.setBorder(null);
        jButtonAcessarColheitadeira.setContentAreaFilled(false);
        jButtonAcessarColheitadeira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarColheitadeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarColheitadeiraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarColheitadeira, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 166, 140, 110));

        jButtonAcessarCarregaGraneleira.setBorder(null);
        jButtonAcessarCarregaGraneleira.setContentAreaFilled(false);
        jButtonAcessarCarregaGraneleira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarCarregaGraneleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarCarregaGraneleiraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarCarregaGraneleira, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 167, 140, 110));

        jButtonAcessarMaquinaDePlantio.setBorder(null);
        jButtonAcessarMaquinaDePlantio.setContentAreaFilled(false);
        jButtonAcessarMaquinaDePlantio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarMaquinaDePlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarMaquinaDePlantioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarMaquinaDePlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 365, 140, 110));

        jButtonAcessarPulverizador.setBorder(null);
        jButtonAcessarPulverizador.setContentAreaFilled(false);
        jButtonAcessarPulverizador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarPulverizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarPulverizadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarPulverizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 168, 140, 110));

        jButtonAcessarRelatorioDeMaquina.setBorder(null);
        jButtonAcessarRelatorioDeMaquina.setContentAreaFilled(false);
        jButtonAcessarRelatorioDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarRelatorioDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarRelatorioDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarRelatorioDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 366, 140, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/img_tela_inicial_maquina.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarSubsoladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarSubsoladorActionPerformed
        this.dispose();
        new TelaCRUDSubsolador().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarSubsoladorActionPerformed

    private void jButtonAcessarCarregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarCarregadorActionPerformed
        this.dispose();
        new TelaCRUDCarregador().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarCarregadorActionPerformed

    private void jButtonAcessarColheitadeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarColheitadeiraActionPerformed
        this.dispose();
        new TelaCRUDColheitadeira().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarColheitadeiraActionPerformed

    private void jButtonAcessarCarregaGraneleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarCarregaGraneleiraActionPerformed
        this.dispose();
        new TelaCRUDCarretaGraneleira().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarCarregaGraneleiraActionPerformed

    private void jButtonAcessarMaquinaDePlantioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarMaquinaDePlantioActionPerformed
        this.dispose();
        new TelaCRUDMaquinaDePlantio().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarMaquinaDePlantioActionPerformed

    private void jButtonAcessarPulverizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarPulverizadorActionPerformed
        this.dispose();
        new TelaCRUDPulverizador().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarPulverizadorActionPerformed

    private void jButtonVoltarATelaDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioActionPerformed

    private void jButtonAcessarRelatorioDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarRelatorioDeMaquinaActionPerformed
        this.dispose();
        new TelaDeRelatorioMaquina().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarRelatorioDeMaquinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarCarregaGraneleira;
    private javax.swing.JButton jButtonAcessarCarregador;
    private javax.swing.JButton jButtonAcessarColheitadeira;
    private javax.swing.JButton jButtonAcessarMaquinaDePlantio;
    private javax.swing.JButton jButtonAcessarPulverizador;
    private javax.swing.JButton jButtonAcessarRelatorioDeMaquina;
    private javax.swing.JButton jButtonAcessarSubsolador;
    private javax.swing.JButton jButtonVoltarATelaDeInicio;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
