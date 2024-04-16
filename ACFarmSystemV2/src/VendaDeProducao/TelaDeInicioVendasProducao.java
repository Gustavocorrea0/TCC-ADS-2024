package VendaDeProducao;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioVendasProducao extends javax.swing.JFrame {

    public TelaDeInicioVendasProducao() {
        initComponents();
        readJtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVerificarVenda = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonRelatorioVenda = new javax.swing.JButton();
        jButtonRealizarVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistoricoDeVendas = new javax.swing.JTable();
        jLabelTelaProducao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVerificarVenda.setBorder(null);
        jButtonVerificarVenda.setBorderPainted(false);
        jButtonVerificarVenda.setContentAreaFilled(false);
        jButtonVerificarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 260, 45));

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

        jButtonRelatorioVenda.setBorder(null);
        jButtonRelatorioVenda.setBorderPainted(false);
        jButtonRelatorioVenda.setContentAreaFilled(false);
        jButtonRelatorioVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRelatorioVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 110, 260, 45));

        jButtonRealizarVenda.setBorder(null);
        jButtonRealizarVenda.setBorderPainted(false);
        jButtonRealizarVenda.setContentAreaFilled(false);
        jButtonRealizarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 262, 45));

        jTableHistoricoDeVendas.setBackground(new java.awt.Color(15, 42, 61));
        jTableHistoricoDeVendas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableHistoricoDeVendas.setForeground(new java.awt.Color(255, 255, 255));
        jTableHistoricoDeVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Da Venda", "Nome Da Produção", "Cliente", "Forma de Pagamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTableHistoricoDeVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableHistoricoDeVendas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableHistoricoDeVendas.setRowHeight(30);
        jTableHistoricoDeVendas.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTableHistoricoDeVendas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableHistoricoDeVendas);
        if (jTableHistoricoDeVendas.getColumnModel().getColumnCount() > 0) {
            jTableHistoricoDeVendas.getColumnModel().getColumn(0).setResizable(false);
            jTableHistoricoDeVendas.getColumnModel().getColumn(1).setResizable(false);
            jTableHistoricoDeVendas.getColumnModel().getColumn(2).setResizable(false);
            jTableHistoricoDeVendas.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 850, 370));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVendaProducao/img_tela_de_inicio_vendas.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarVendaActionPerformed
        this.dispose();
        new TelaDeClienteEProducoes().setVisible(true);
    }//GEN-LAST:event_jButtonRealizarVendaActionPerformed

    private void jButtonVerificarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarVendaActionPerformed
        this.dispose();
        new TelaDeConsultaVendaProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarVendaActionPerformed

    private void jButtonRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioVendaActionPerformed
        this.dispose();
        new TelaDeEscolhaRelatorioDeVenda().setVisible(true);
    }//GEN-LAST:event_jButtonRelatorioVendaActionPerformed

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

     public void readJtable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableHistoricoDeVendas.getModel();
        ControleVendaProducao controleVendaProducao = new ControleVendaProducao();

        for (VendaProducao p : controleVendaProducao.buscarTodasAsVenda()) {
            modelo.addRow(new Object[]{p.getIdVendaProducao(), p.getNomeProducao(), p.getNomeCliente(), p.getFormaDePagamento()});
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizarVenda;
    private javax.swing.JButton jButtonRelatorioVenda;
    private javax.swing.JButton jButtonVerificarVenda;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelTelaProducao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHistoricoDeVendas;
    // End of variables declaration//GEN-END:variables
}
