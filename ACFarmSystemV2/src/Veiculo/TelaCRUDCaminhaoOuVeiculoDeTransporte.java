/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Veiculo;

import Veiculo.CRUDCaminhaoOuVeiculoDeTransporte.*;
import Veiculo.CRUDCaminhaoOuVeiculoDeTransporte.TelaDeVerificacaoDeCaminhaoOuVeiculoDeTransporte;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class TelaCRUDCaminhaoOuVeiculoDeTransporte extends javax.swing.JFrame {

    public TelaCRUDCaminhaoOuVeiculoDeTransporte() {
        initComponents();
        readCominhaoOuVeiculoDeTransporte();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCadastrarVeiculo = new javax.swing.JButton();
        jButtonAtualizarVeiculo = new javax.swing.JButton();
        jButtonVerificarVeiculo = new javax.swing.JButton();
        jButtonDeletarVeiculo = new javax.swing.JButton();
        jButtonVoltarATelaDeInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCaminhaoOuVeiculoDeTransporte = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrarVeiculo.setBorder(null);
        jButtonCadastrarVeiculo.setContentAreaFilled(false);
        jButtonCadastrarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 80, 70));

        jButtonAtualizarVeiculo.setBorder(null);
        jButtonAtualizarVeiculo.setContentAreaFilled(false);
        jButtonAtualizarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, 80, 70));

        jButtonVerificarVeiculo.setBorder(null);
        jButtonVerificarVeiculo.setContentAreaFilled(false);
        jButtonVerificarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 80, 70));

        jButtonDeletarVeiculo.setBorder(null);
        jButtonDeletarVeiculo.setContentAreaFilled(false);
        jButtonDeletarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 365, 60, 70));

        jButtonVoltarATelaDeInicio.setBorder(null);
        jButtonVoltarATelaDeInicio.setBorderPainted(false);
        jButtonVoltarATelaDeInicio.setContentAreaFilled(false);
        jButtonVoltarATelaDeInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeInicio.setDefaultCapable(false);
        jButtonVoltarATelaDeInicio.setFocusPainted(false);
        jButtonVoltarATelaDeInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 39, 25));

        jTableCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(15, 42, 61));
        jTableCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTableCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(255, 255, 255));
        jTableCaminhaoOuVeiculoDeTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jTableCaminhaoOuVeiculoDeTransporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCaminhaoOuVeiculoDeTransporte.setGridColor(new java.awt.Color(255, 204, 0));
        jTableCaminhaoOuVeiculoDeTransporte.setRowHeight(30);
        jTableCaminhaoOuVeiculoDeTransporte.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableCaminhaoOuVeiculoDeTransporte);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 740, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgCaminhao/img_tela_CRUD_caminhao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeCadastroDeCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarVeiculoActionPerformed

    private void jButtonVerificarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeVerificacaoDeCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarVeiculoActionPerformed

    private void jButtonDeletarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeRemocaoDeCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarVeiculoActionPerformed

    private void jButtonAtualizarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeAtualizacaoDeCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarVeiculoActionPerformed

    private void jButtonVoltarATelaDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaDeEscolhaTipoDeVeiculo().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioActionPerformed

    public void readCominhaoOuVeiculoDeTransporte() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCaminhaoOuVeiculoDeTransporte.getModel();
        ControleVeiculo controleVeiculo = new ControleVeiculo();

        for (CaminhaoOuVeiculoDeTransporte c: controleVeiculo.readCaminhaoOuVeiculoDeTransporte() ) {
            modelo.addRow(new Object[]{c.getNomeVeiculo(), c.getMarcaVeiculo(), c.getAnoVeiculo(), c.getIdCaminhaoOuVeiculoDeTransporte()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarVeiculo;
    private javax.swing.JButton jButtonCadastrarVeiculo;
    private javax.swing.JButton jButtonDeletarVeiculo;
    private javax.swing.JButton jButtonVerificarVeiculo;
    private javax.swing.JButton jButtonVoltarATelaDeInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCaminhaoOuVeiculoDeTransporte;
    // End of variables declaration//GEN-END:variables
}
