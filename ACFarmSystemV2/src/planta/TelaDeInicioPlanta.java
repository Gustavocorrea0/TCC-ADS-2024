/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planta;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import planta.CRUDMilho.TelaDeAdicaoMilho;
import planta.CRUDSoja.TelaDeAdicaoSoja;

/**
 *
 * @author Vinicius Camacho
 */
public class TelaDeInicioPlanta extends javax.swing.JFrame {

    public TelaDeInicioPlanta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCRUDMilho = new javax.swing.JButton();
        jButtonCRUDSoja = new javax.swing.JButton();
        jButtonSairDaTelaAdicionarPlanta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCRUDMilho.setBorder(null);
        jButtonCRUDMilho.setBorderPainted(false);
        jButtonCRUDMilho.setContentAreaFilled(false);
        jButtonCRUDMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCRUDMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCRUDMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCRUDMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 387, 220, 50));

        jButtonCRUDSoja.setBorder(null);
        jButtonCRUDSoja.setBorderPainted(false);
        jButtonCRUDSoja.setContentAreaFilled(false);
        jButtonCRUDSoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCRUDSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCRUDSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCRUDSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 387, 220, 50));

        jButtonSairDaTelaAdicionarPlanta.setBorder(null);
        jButtonSairDaTelaAdicionarPlanta.setBorderPainted(false);
        jButtonSairDaTelaAdicionarPlanta.setContentAreaFilled(false);
        jButtonSairDaTelaAdicionarPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaAdicionarPlanta.setRequestFocusEnabled(false);
        jButtonSairDaTelaAdicionarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaAdicionarPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaAdicionarPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_escolha_tipo_planta.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCRUDMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCRUDMilhoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDMilho().setVisible(true);
    }//GEN-LAST:event_jButtonCRUDMilhoActionPerformed

    private void jButtonSairDaTelaAdicionarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaAdicionarPlantaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaAdicionarPlantaActionPerformed

    private void jButtonCRUDSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCRUDSojaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDSoja().setVisible(true);
    }//GEN-LAST:event_jButtonCRUDSojaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCRUDMilho;
    private javax.swing.JButton jButtonCRUDSoja;
    private javax.swing.JButton jButtonSairDaTelaAdicionarPlanta;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
