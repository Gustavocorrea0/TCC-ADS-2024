package Estoque.CRUDCombustivel;

import Estoque.Combustivel;
import Estoque.ControleEstoque;
import Estoque.TelaDeInicioEstoque;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioCombustivel extends javax.swing.JFrame {

    public TelaDeInicioCombustivel() {
        initComponents();
        readJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionarCombustivel = new javax.swing.JButton();
        jButtonAtualizarCombustivel = new javax.swing.JButton();
        jButtonDeletarCombustivel = new javax.swing.JButton();
        jButtonVerificarCombustivel = new javax.swing.JButton();
        jButtonVoltarATelaInicial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCombustivel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdicionarCombustivel.setBorder(null);
        jButtonAdicionarCombustivel.setBorderPainted(false);
        jButtonAdicionarCombustivel.setContentAreaFilled(false);
        jButtonAdicionarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, 75, 65));

        jButtonAtualizarCombustivel.setBorder(null);
        jButtonAtualizarCombustivel.setBorderPainted(false);
        jButtonAtualizarCombustivel.setContentAreaFilled(false);
        jButtonAtualizarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 250, 70, 65));

        jButtonDeletarCombustivel.setBorder(null);
        jButtonDeletarCombustivel.setBorderPainted(false);
        jButtonDeletarCombustivel.setContentAreaFilled(false);
        jButtonDeletarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 375, 60, 60));

        jButtonVerificarCombustivel.setBorder(null);
        jButtonVerificarCombustivel.setBorderPainted(false);
        jButtonVerificarCombustivel.setContentAreaFilled(false);
        jButtonVerificarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 495, 65, 70));

        jButtonVoltarATelaInicial.setBorder(null);
        jButtonVoltarATelaInicial.setBorderPainted(false);
        jButtonVoltarATelaInicial.setContentAreaFilled(false);
        jButtonVoltarATelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 40, 25));

        jTableCombustivel.setBackground(new java.awt.Color(15, 42, 61));
        jTableCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableCombustivel.setForeground(new java.awt.Color(255, 255, 255));
        jTableCombustivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Quantidade Minima", "Abaixo do Minímo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
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
        jTableCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCombustivel.setGridColor(new java.awt.Color(255, 204, 0));
        jTableCombustivel.setRowHeight(30);
        jTableCombustivel.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableCombustivel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 720, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasCombustivel/img_tela_de_inicio_combustivel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 904, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarATelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaInicialActionPerformed
        this.dispose();
        new TelaDeInicioEstoque().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaInicialActionPerformed

    private void jButtonAdicionarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarCombustivelActionPerformed
        this.dispose();
        new TelaDeCadastroCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarCombustivelActionPerformed

    private void jButtonVerificarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarCombustivelActionPerformed
        this.dispose();
        new TelaDeVerificacaoCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarCombustivelActionPerformed

    private void jButtonAtualizarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarCombustivelActionPerformed
        this.dispose();
        new TelaDeAtualizacaoCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarCombustivelActionPerformed

    private void jButtonDeletarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarCombustivelActionPerformed
        this.dispose();
        new TelaDeRemocaoCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarCombustivelActionPerformed

    private void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCombustivel.getModel();
        ControleEstoque controleEstoque = new ControleEstoque();
        String statusMinimoCombustivel = "Não";

        for (Combustivel u : controleEstoque.lerCombustivel()) {
            if (u.getQuantidadeEmLitros() < u.getQuantidadeMinimaEmLitros()) {
                statusMinimoCombustivel = "Sim";
            }
            modelo.addRow(new Object[]{u.getNomeCombustivel(), u.getQuantidadeEmLitros(), u.getQuantidadeMinimaEmLitros() ,statusMinimoCombustivel});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarCombustivel;
    private javax.swing.JButton jButtonAtualizarCombustivel;
    private javax.swing.JButton jButtonDeletarCombustivel;
    private javax.swing.JButton jButtonVerificarCombustivel;
    private javax.swing.JButton jButtonVoltarATelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCombustivel;
    // End of variables declaration//GEN-END:variables
}
