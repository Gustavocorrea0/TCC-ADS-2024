package praga;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioPraga extends javax.swing.JFrame {

    public TelaDeInicioPraga() {
        initComponents();
        readPragas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionarPraga = new javax.swing.JButton();
        jButtonAtualizarPraga = new javax.swing.JButton();
        jButtonVerificarPraga = new javax.swing.JButton();
        jButtonDeletarPraga = new javax.swing.JButton();
        jButtonRelatorioPraga = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jLabelIMGTelaInicialFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdicionarPraga.setBorder(null);
        jButtonAdicionarPraga.setContentAreaFilled(false);
        jButtonAdicionarPraga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 118, 70, 65));

        jButtonAtualizarPraga.setBorder(null);
        jButtonAtualizarPraga.setContentAreaFilled(false);
        jButtonAtualizarPraga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 214, 70, 67));

        jButtonVerificarPraga.setBorder(null);
        jButtonVerificarPraga.setContentAreaFilled(false);
        jButtonVerificarPraga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 412, 70, 65));

        jButtonDeletarPraga.setBorder(null);
        jButtonDeletarPraga.setContentAreaFilled(false);
        jButtonDeletarPraga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 315, 70, 65));

        jButtonRelatorioPraga.setBorder(null);
        jButtonRelatorioPraga.setContentAreaFilled(false);
        jButtonRelatorioPraga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRelatorioPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRelatorioPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 504, 75, 65));

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 25));

        jTableFornecedor.setBackground(new java.awt.Color(15, 42, 61));
        jTableFornecedor.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTableFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Praga", "Controlada", "Propriedade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTableFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableFornecedor.setGridColor(new java.awt.Color(255, 204, 0));
        jTableFornecedor.setRowHeight(30);
        jTableFornecedor.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableFornecedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 740, 350));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPraga/img_tela_inicial_praga.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRelatorioPragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioPragaActionPerformed
        this.dispose();
        new TelaDeRelatorioPraga().setVisible(true);
    }//GEN-LAST:event_jButtonRelatorioPragaActionPerformed

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jButtonVerificarPragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarPragaActionPerformed
        this.dispose();
        new TelaDeConsultaPraga().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarPragaActionPerformed

    private void jButtonDeletarPragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarPragaActionPerformed
        this.dispose();
        new TelaDeRemocaoPraga().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarPragaActionPerformed

    private void jButtonAdicionarPragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarPragaActionPerformed
        this.dispose();
        new TelaDeCadastroPraga().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarPragaActionPerformed

    private void jButtonAtualizarPragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarPragaActionPerformed
        this.dispose();
        new TelaDeAtualizacaoPraga().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarPragaActionPerformed

    private void readPragas() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedor.getModel();

        ControlePraga controlePraga = new ControlePraga();

        for (Praga p : controlePraga.lerPraga()) {
            modelo.addRow(new Object[]{p.getNomePraga(), p.getEstadoDeControlePraga(), p.getPropriedadePraga()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarPraga;
    private javax.swing.JButton jButtonAtualizarPraga;
    private javax.swing.JButton jButtonDeletarPraga;
    private javax.swing.JButton jButtonRelatorioPraga;
    private javax.swing.JButton jButtonVerificarPraga;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedor;
    // End of variables declaration//GEN-END:variables
}
