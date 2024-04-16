package VendaDeProducao;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import cliente.Cliente;
import cliente.ControleCliente;
import cliente.TelaDeInicioCliente;
import javax.swing.table.DefaultTableModel;
import producao.ControleProducao;
import producao.Producao;
import producao.TelaDeInicioProducao;

public class TelaDeClienteEProducoes extends javax.swing.JFrame {

    public TelaDeClienteEProducoes() {
        initComponents();
        readClientes();
        readProducao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessarProducao = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonAcessarCliente = new javax.swing.JButton();
        jButtonRealizarVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProducao = new javax.swing.JTable();
        jLabelTelaProducao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAcessarProducao.setBorder(null);
        jButtonAcessarProducao.setBorderPainted(false);
        jButtonAcessarProducao.setContentAreaFilled(false);
        jButtonAcessarProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 102, 262, 45));

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setBorderPainted(false);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonAcessarCliente.setBorder(null);
        jButtonAcessarCliente.setBorderPainted(false);
        jButtonAcessarCliente.setContentAreaFilled(false);
        jButtonAcessarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 180, 260, 45));

        jButtonRealizarVenda.setBorder(null);
        jButtonRealizarVenda.setBorderPainted(false);
        jButtonRealizarVenda.setContentAreaFilled(false);
        jButtonRealizarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 102, 260, 45));

        jTableFornecedor.setBackground(new java.awt.Color(15, 42, 61));
        jTableFornecedor.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTableFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 400, 350));

        jTableProducao.setBackground(new java.awt.Color(15, 42, 61));
        jTableProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableProducao.setForeground(new java.awt.Color(255, 255, 255));
        jTableProducao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da Produção", "Vendido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableProducao.setGridColor(new java.awt.Color(255, 255, 255));
        jTableProducao.setRowHeight(30);
        jTableProducao.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTableProducao.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableProducao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 420, 350));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVendaProducao/img_tela_de_consulta_propriedade_e_cliente.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarVendaActionPerformed
        this.dispose();
        new TelaDeVendaProducao().setVisible(true);
    }//GEN-LAST:event_jButtonRealizarVendaActionPerformed

    private void jButtonAcessarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarProducaoActionPerformed
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarProducaoActionPerformed

    private void jButtonAcessarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarClienteActionPerformed
        this.dispose();
        new TelaDeInicioCliente().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarClienteActionPerformed

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioVendasProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void readClientes() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedor.getModel();
        ControleCliente controleCliente = new ControleCliente();

        for (Cliente t : controleCliente.readCliente()) {
            modelo.addRow(new Object[]{t.getNomeCliente()});
        }
        
    }

    private void readProducao() {
        DefaultTableModel modelo1 = (DefaultTableModel) jTableProducao.getModel();
        ControleProducao controleProducao = new ControleProducao();

        for (Producao p : controleProducao.buscarTodasAsProducoes()) {
            modelo1.addRow(new Object[]{p.getNomeProducao(), p.getStatusDeVenda()});
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarCliente;
    private javax.swing.JButton jButtonAcessarProducao;
    private javax.swing.JButton jButtonRealizarVenda;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelTelaProducao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFornecedor;
    private javax.swing.JTable jTableProducao;
    // End of variables declaration//GEN-END:variables
}
