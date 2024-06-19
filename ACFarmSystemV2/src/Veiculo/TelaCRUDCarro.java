package Veiculo;

import Veiculo.CRUDCarro.*;
import Veiculo.CRUDTrator.*;
import javax.swing.table.DefaultTableModel;

public class TelaCRUDCarro extends javax.swing.JFrame {

    public TelaCRUDCarro() {
        initComponents();
        readCarro();
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
        jTableTrator = new javax.swing.JTable();
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
        getContentPane().add(jButtonCadastrarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, 80, 70));

        jButtonAtualizarVeiculo.setBorder(null);
        jButtonAtualizarVeiculo.setContentAreaFilled(false);
        jButtonAtualizarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 70));

        jButtonVerificarVeiculo.setBorder(null);
        jButtonVerificarVeiculo.setContentAreaFilled(false);
        jButtonVerificarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 490, 70, 70));

        jButtonDeletarVeiculo.setBorder(null);
        jButtonDeletarVeiculo.setContentAreaFilled(false);
        jButtonDeletarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 365, 60, 80));

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

        jTableTrator.setBackground(new java.awt.Color(15, 42, 61));
        jTableTrator.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTableTrator.setForeground(new java.awt.Color(255, 255, 255));
        jTableTrator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Ano", "Placa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jTableTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableTrator.setGridColor(new java.awt.Color(255, 204, 0));
        jTableTrator.setRowHeight(30);
        jTableTrator.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableTrator);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 740, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgCarro/img_tela_de_inicio_carro.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -13, -1, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarVeiculoActionPerformed
        this.dispose();
        new TelaDeCadastroDeCarro().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarVeiculoActionPerformed

    private void jButtonVerificarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarVeiculoActionPerformed
        this.dispose();
        new TelaDeVerificacaoDeCarro().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarVeiculoActionPerformed

    private void jButtonDeletarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarVeiculoActionPerformed
        this.dispose();
        new TelaDeRemocaoDeCarro().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarVeiculoActionPerformed

    private void jButtonAtualizarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarVeiculoActionPerformed
        this.dispose();
        new TelaDeAtualizacaoDeCarro().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarVeiculoActionPerformed

    private void jButtonVoltarATelaDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioActionPerformed
        this.dispose();
        new TelaDeEscolhaTipoDeVeiculo().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioActionPerformed

    public void readCarro() {
        DefaultTableModel modelo = (DefaultTableModel) jTableTrator.getModel();
        ControleVeiculo controleVeiculo = new ControleVeiculo();

        for (Carro t : controleVeiculo.readCarro()) {
            modelo.addRow(new Object[]{t.getNomeVeiculo(), t.getMarcaVeiculo(), t.getAnoVeiculo(), t.getPlacaCarro()});
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
    private javax.swing.JTable jTableTrator;
    // End of variables declaration//GEN-END:variables
}
