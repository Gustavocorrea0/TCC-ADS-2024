package cliente;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioCliente extends javax.swing.JFrame {

    public TelaDeInicioCliente() {
        initComponents();
        readClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionarCliente = new javax.swing.JButton();
        jButtonVerificarCliente = new javax.swing.JButton();
        jButtonDeletarCliente = new javax.swing.JButton();
        jButtonAtualizarCliente = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jLabelIMGTelaInicialFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdicionarCliente.setBorder(null);
        jButtonAdicionarCliente.setContentAreaFilled(false);
        jButtonAdicionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 70));

        jButtonVerificarCliente.setBorder(null);
        jButtonVerificarCliente.setContentAreaFilled(false);
        jButtonVerificarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 80, 70));

        jButtonDeletarCliente.setBorder(null);
        jButtonDeletarCliente.setContentAreaFilled(false);
        jButtonDeletarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, 64));

        jButtonAtualizarCliente.setBorder(null);
        jButtonAtualizarCliente.setContentAreaFilled(false);
        jButtonAtualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 70, 70));

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
                "Nome ", "Tipo", "Cidade", "Telefone"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 770, 480));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasCliente/img_tela_escolha_cliente.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarClienteActionPerformed
        this.dispose();
        new TelaDeAtualizacaoCliente().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarClienteActionPerformed

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jButtonVerificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarClienteActionPerformed
        this.dispose();
        new TelaDeConsultaCliente().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarClienteActionPerformed

    private void jButtonDeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarClienteActionPerformed
        this.dispose();
        new TelaDeRemocaoCliente().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarClienteActionPerformed

    private void jButtonAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarClienteActionPerformed
        this.dispose();
        new TelaDeCadastroCliente().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarClienteActionPerformed

    private void readClientes(){
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedor.getModel();
        
        ControleCliente controleCliente = new ControleCliente();
        
        for (Cliente t: controleCliente.readCliente()) {
            modelo.addRow(new Object[]{t.getNomeCliente(), t.getTipoCliente(),  t.getCidadeCliente(), t.getTelefoneCliente()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarCliente;
    private javax.swing.JButton jButtonAtualizarCliente;
    private javax.swing.JButton jButtonDeletarCliente;
    private javax.swing.JButton jButtonVerificarCliente;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedor;
    // End of variables declaration//GEN-END:variables
}
