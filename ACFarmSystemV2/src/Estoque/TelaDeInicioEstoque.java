package Estoque;

import Estoque.CRUDAgrotoxico.TelaDeInicioAgrotoxico;
import Estoque.CRUDCombustivel.TelaDeInicioCombustivel;
import Estoque.CRUDFertilizante.TelaDeInicioFertilizante;
import Estoque.CRUDSemente.TelaDeInicioSemente;
import acfarmsystemv2.telaDeInicio.TelaDeInicio;

public class TelaDeInicioEstoque extends javax.swing.JFrame {

    public TelaDeInicioEstoque() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCombustivel = new javax.swing.JButton();
        jButtonSementes = new javax.swing.JButton();
        jButtonAgrotoxico = new javax.swing.JButton();
        jButtonFertilizante = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jLabelTelaDeInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCombustivel.setBorder(null);
        jButtonCombustivel.setBorderPainted(false);
        jButtonCombustivel.setContentAreaFilled(false);
        jButtonCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 143, 190, 184));

        jButtonSementes.setBorder(null);
        jButtonSementes.setBorderPainted(false);
        jButtonSementes.setContentAreaFilled(false);
        jButtonSementes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSementes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSementesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSementes, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 143, 190, 182));

        jButtonAgrotoxico.setBorder(null);
        jButtonAgrotoxico.setBorderPainted(false);
        jButtonAgrotoxico.setContentAreaFilled(false);
        jButtonAgrotoxico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 402, 190, 187));

        jButtonFertilizante.setBorder(null);
        jButtonFertilizante.setBorderPainted(false);
        jButtonFertilizante.setContentAreaFilled(false);
        jButtonFertilizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 401, 190, 188));

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setBorderPainted(false);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 40, 22));

        jLabelTelaDeInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/img_tela_de_inicio_estoque.png"))); // NOI18N
        getContentPane().add(jLabelTelaDeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCombustivelActionPerformed
        this.dispose();
        new TelaDeInicioCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonCombustivelActionPerformed

    private void jButtonFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFertilizanteActionPerformed
        this.dispose();
        new TelaDeInicioFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonFertilizanteActionPerformed

    private void jButtonSementesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSementesActionPerformed
       this.dispose();
        new TelaDeInicioSemente().setVisible(true);
    }//GEN-LAST:event_jButtonSementesActionPerformed

    private void jButtonAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgrotoxicoActionPerformed
        this.dispose();
        new TelaDeInicioAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonAgrotoxicoActionPerformed

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgrotoxico;
    private javax.swing.JButton jButtonCombustivel;
    private javax.swing.JButton jButtonFertilizante;
    private javax.swing.JButton jButtonSementes;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelTelaDeInicio;
    // End of variables declaration//GEN-END:variables
}
