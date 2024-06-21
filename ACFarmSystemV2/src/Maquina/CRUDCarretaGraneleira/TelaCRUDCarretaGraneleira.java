/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Maquina.CRUDCarretaGraneleira;

import Maquina.*;
import javax.swing.table.DefaultTableModel;

public class TelaCRUDCarretaGraneleira extends javax.swing.JFrame {

    public TelaCRUDCarretaGraneleira() {
        initComponents();
        readCarretaGraneleira();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeInicio = new javax.swing.JButton();
        jButtonAdicionarMaquina = new javax.swing.JButton();
        jButtonRemoverMaquina = new javax.swing.JButton();
        jButtonAtualizarMaquina = new javax.swing.JButton();
        jButtonVerificarMaquina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarretaGraneleira = new javax.swing.JTable();
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
        getContentPane().add(jButtonVoltarATelaDeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 35, 22));

        jButtonAdicionarMaquina.setBorder(null);
        jButtonAdicionarMaquina.setContentAreaFilled(false);
        jButtonAdicionarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 80, 70));

        jButtonRemoverMaquina.setBorder(null);
        jButtonRemoverMaquina.setContentAreaFilled(false);
        jButtonRemoverMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 364, 60, 70));

        jButtonAtualizarMaquina.setBorder(null);
        jButtonAtualizarMaquina.setContentAreaFilled(false);
        jButtonAtualizarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 70));

        jButtonVerificarMaquina.setBorder(null);
        jButtonVerificarMaquina.setContentAreaFilled(false);
        jButtonVerificarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 494, 80, 70));

        jTableCarretaGraneleira.setBackground(new java.awt.Color(15, 42, 61));
        jTableCarretaGraneleira.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableCarretaGraneleira.setForeground(new java.awt.Color(255, 255, 255));
        jTableCarretaGraneleira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Estado", "Ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCarretaGraneleira.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCarretaGraneleira.setGridColor(new java.awt.Color(255, 204, 0));
        jTableCarretaGraneleira.setRowHeight(30);
        jTableCarretaGraneleira.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableCarretaGraneleira);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 730, 380));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/img_tela_CRUD_carretaGraneleira.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarMaquinaActionPerformed
        this.dispose();
        new TelaDeCadastroCarretaGraneleira().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarMaquinaActionPerformed

    private void jButtonAtualizarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarMaquinaActionPerformed
        this.dispose();
        new TelaDeAtualizacaoCarretaGraneleira().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarMaquinaActionPerformed

    private void jButtonRemoverMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverMaquinaActionPerformed
        this.dispose();
        new TelaDeRemocaoCarretaGraneleira().setVisible(true);
    }//GEN-LAST:event_jButtonRemoverMaquinaActionPerformed

    private void jButtonVerificarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarMaquinaActionPerformed
        this.dispose();
        new TelaDeConsultaCarretaGraneleira().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarMaquinaActionPerformed

    private void jButtonVoltarATelaDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioActionPerformed
        this.dispose();
        new TelaDeInicioMaquinas().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioActionPerformed

    private void readCarretaGraneleira() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCarretaGraneleira.getModel();
        ControleMaquina controleMaquina = new ControleMaquina();

        for (CarretaGraneleira c : controleMaquina.readCarretaGraneleira()) {
            modelo.addRow(new Object[]{c.getNomeMaquina(), c.getMarcaMaquina(), c.getEstadoMaquina(), c.getAnoMaquina(), c.getIdCarretaGraneleira()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarMaquina;
    private javax.swing.JButton jButtonAtualizarMaquina;
    private javax.swing.JButton jButtonRemoverMaquina;
    private javax.swing.JButton jButtonVerificarMaquina;
    private javax.swing.JButton jButtonVoltarATelaDeInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarretaGraneleira;
    // End of variables declaration//GEN-END:variables
}
