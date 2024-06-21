/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Maquina.CRUDColheitadeira;

import Maquina.*;
import javax.swing.table.DefaultTableModel;

public class TelaCRUDColheitadeira extends javax.swing.JFrame {

    public TelaCRUDColheitadeira() {
        initComponents();
        readColheitadeira();
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
        jTableColheitadeira = new javax.swing.JTable();
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
        getContentPane().add(jButtonAdicionarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 70));

        jButtonRemoverMaquina.setBorder(null);
        jButtonRemoverMaquina.setContentAreaFilled(false);
        jButtonRemoverMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 364, 80, 70));

        jButtonAtualizarMaquina.setBorder(null);
        jButtonAtualizarMaquina.setContentAreaFilled(false);
        jButtonAtualizarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 244, 80, 70));

        jButtonVerificarMaquina.setBorder(null);
        jButtonVerificarMaquina.setContentAreaFilled(false);
        jButtonVerificarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 494, 80, 70));

        jTableColheitadeira.setBackground(new java.awt.Color(15, 42, 61));
        jTableColheitadeira.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableColheitadeira.setForeground(new java.awt.Color(255, 255, 255));
        jTableColheitadeira.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableColheitadeira.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableColheitadeira.setGridColor(new java.awt.Color(255, 204, 0));
        jTableColheitadeira.setRowHeight(30);
        jTableColheitadeira.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableColheitadeira);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 760, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/img_tela_CRUD_colheitadeira.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarMaquinaActionPerformed
        this.dispose();
        new TelaDeCadastroColheitadeira().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarMaquinaActionPerformed

    private void jButtonAtualizarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarMaquinaActionPerformed
        this.dispose();
        new TelaDeAtualizacaoColheitadeira().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarMaquinaActionPerformed

    private void jButtonRemoverMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverMaquinaActionPerformed
        this.dispose();
        new TelaDeRemocaoColheitadeira().setVisible(true);
    }//GEN-LAST:event_jButtonRemoverMaquinaActionPerformed

    private void jButtonVerificarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarMaquinaActionPerformed
         this.dispose();
        new TelaDeConsultaColheitadeira().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarMaquinaActionPerformed

    private void jButtonVoltarATelaDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioActionPerformed
        this.dispose();
        new TelaDeInicioMaquinas().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioActionPerformed

    private void readColheitadeira() {
        DefaultTableModel modelo = (DefaultTableModel) jTableColheitadeira.getModel();
        ControleMaquina controleMaquina = new ControleMaquina();

        for (Colheitadeira t : controleMaquina.readColheitadeira()) {
            modelo.addRow(new Object[]{t.getNomeMaquina(), t.getMarcaMaquina(), t.getEstadoMaquina(), t.getAnoMaquina(), t.getIdColheitadeira()});
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
    private javax.swing.JTable jTableColheitadeira;
    // End of variables declaration//GEN-END:variables
}
