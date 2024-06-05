package fornecedor;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioFornecedor extends javax.swing.JFrame {

    public TelaDeInicioFornecedor() {
        initComponents();
        readFornecedores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionarFornecedor = new javax.swing.JButton();
        jButtonVerificarFornecedor = new javax.swing.JButton();
        jButtonDeletarFornecedor = new javax.swing.JButton();
        jButtonAtualizarFornecedor = new javax.swing.JButton();
        jButtonAcessarRelatorios = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jLabelIMGTelaInicialFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdicionarFornecedor.setBorder(null);
        jButtonAdicionarFornecedor.setContentAreaFilled(false);
        jButtonAdicionarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, 80, 70));

        jButtonVerificarFornecedor.setBorder(null);
        jButtonVerificarFornecedor.setContentAreaFilled(false);
        jButtonVerificarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 414, 80, 70));

        jButtonDeletarFornecedor.setBorder(null);
        jButtonDeletarFornecedor.setContentAreaFilled(false);
        jButtonDeletarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, 70));

        jButtonAtualizarFornecedor.setBorder(null);
        jButtonAtualizarFornecedor.setContentAreaFilled(false);
        jButtonAtualizarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 70));

        jButtonAcessarRelatorios.setBorder(null);
        jButtonAcessarRelatorios.setContentAreaFilled(false);
        jButtonAcessarRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarRelatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 80, 70));

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
                "Nome Fantasia", "Razão Social", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTableFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableFornecedor.setGridColor(new java.awt.Color(255, 204, 0));
        jTableFornecedor.setRowHeight(30);
        jTableFornecedor.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableFornecedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 750, 340));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasFornecedor/img_tela_inicial_fornecedor.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarFornecedorActionPerformed
        this.dispose();
        new TelaDeAtualizacaoFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarFornecedorActionPerformed

    private void jButtonAcessarRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarRelatoriosActionPerformed
        this.dispose();
        new TelaDeRelatorioFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarRelatoriosActionPerformed

    private void jButtonVerificarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarFornecedorActionPerformed
        this.dispose();
        new TelaDeConsultaFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarFornecedorActionPerformed

    private void jButtonDeletarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarFornecedorActionPerformed
        this.dispose();
        new TelaDeRemocaoFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarFornecedorActionPerformed

    private void jButtonAdicionarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarFornecedorActionPerformed
        this.dispose();
        new TelaDeCadastroFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarFornecedorActionPerformed

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void readFornecedores(){
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedor.getModel();
        
        ControleFornecedor controleFornecedor = new ControleFornecedor();
        
        for (Fornecedor t: controleFornecedor.readFornecedor()) {
            modelo.addRow(new Object[]{t.getNomeFantasia(), t.getRazaoSocial(),  t.getCidadeFornecedor(), t.getEstadoFornecedor()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarRelatorios;
    private javax.swing.JButton jButtonAdicionarFornecedor;
    private javax.swing.JButton jButtonAtualizarFornecedor;
    private javax.swing.JButton jButtonDeletarFornecedor;
    private javax.swing.JButton jButtonVerificarFornecedor;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedor;
    // End of variables declaration//GEN-END:variables
}
