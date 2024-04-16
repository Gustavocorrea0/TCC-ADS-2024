/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planta;

import javax.swing.table.DefaultTableModel;
import planta.CRUDSoja.TelaDeAdicaoSoja;
import planta.CRUDSoja.TelaDeConsultaSoja;
import planta.CRUDSoja.TelaDeMovimentacaoSoja;
import planta.CRUDSoja.TelaDeRemocaoSoja;

public class TelaCRUDSoja extends javax.swing.JFrame {

    public TelaCRUDSoja() {
        initComponents();
        readJtableSoja();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSairDaTelaInicioPlanta = new javax.swing.JButton();
        jButtonAdicionarSoja = new javax.swing.JButton();
        jButtonVerificarSoja = new javax.swing.JButton();
        jButtonMovimentacaoSoja = new javax.swing.JButton();
        jButtonRemoverSoja = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMilho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSairDaTelaInicioPlanta.setBorder(null);
        jButtonSairDaTelaInicioPlanta.setBorderPainted(false);
        jButtonSairDaTelaInicioPlanta.setContentAreaFilled(false);
        jButtonSairDaTelaInicioPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaInicioPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaInicioPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaInicioPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonAdicionarSoja.setBorder(null);
        jButtonAdicionarSoja.setBorderPainted(false);
        jButtonAdicionarSoja.setContentAreaFilled(false);
        jButtonAdicionarSoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 113, 260, 45));

        jButtonVerificarSoja.setBorder(null);
        jButtonVerificarSoja.setBorderPainted(false);
        jButtonVerificarSoja.setContentAreaFilled(false);
        jButtonVerificarSoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarSoja.setVerifyInputWhenFocusTarget(false);
        jButtonVerificarSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 175, 260, 42));

        jButtonMovimentacaoSoja.setBorder(null);
        jButtonMovimentacaoSoja.setBorderPainted(false);
        jButtonMovimentacaoSoja.setContentAreaFilled(false);
        jButtonMovimentacaoSoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMovimentacaoSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMovimentacaoSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMovimentacaoSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 115, 260, 43));

        jButtonRemoverSoja.setBorder(null);
        jButtonRemoverSoja.setBorderPainted(false);
        jButtonRemoverSoja.setContentAreaFilled(false);
        jButtonRemoverSoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 175, 259, 42));

        jTableMilho.setBackground(new java.awt.Color(15, 42, 61));
        jTableMilho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableMilho.setForeground(new java.awt.Color(255, 255, 255));
        jTableMilho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Milho", "Fornecedor", "Altura da Planta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableMilho.setGridColor(new java.awt.Color(255, 255, 255));
        jTableMilho.setRowHeight(30);
        jTableMilho.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTableMilho.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableMilho);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 830, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_escolha_CRUD_soja.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairDaTelaInicioPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaInicioPlantaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeInicioPlanta().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaInicioPlantaActionPerformed

    private void jButtonAdicionarSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarSojaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaVizualizacaoPropriedadeEFornecedorSoja().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarSojaActionPerformed

    private void jButtonVerificarSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarSojaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeConsultaSoja().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarSojaActionPerformed

    private void jButtonMovimentacaoSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMovimentacaoSojaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeMovimentacaoSoja().setVisible(true);
    }//GEN-LAST:event_jButtonMovimentacaoSojaActionPerformed

    private void jButtonRemoverSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverSojaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeRemocaoSoja().setVisible(true);
    }//GEN-LAST:event_jButtonRemoverSojaActionPerformed

    private void readJtableSoja() {
        DefaultTableModel modelo = (DefaultTableModel) jTableMilho.getModel();
        ControlePlanta controlePlanta = new ControlePlanta();

        for (Soja s : controlePlanta.readSoja()) {
            modelo.addRow(new Object[]{s.getIdSoja(), s.getNomeFornecedor(), s.getIdSoja()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarSoja;
    private javax.swing.JButton jButtonMovimentacaoSoja;
    private javax.swing.JButton jButtonRemoverSoja;
    private javax.swing.JButton jButtonSairDaTelaInicioPlanta;
    private javax.swing.JButton jButtonVerificarSoja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMilho;
    // End of variables declaration//GEN-END:variables
}
