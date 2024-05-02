package producao;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioProducao extends javax.swing.JFrame {

    public TelaDeInicioProducao() {
        initComponents();
        readJtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVericarProducao = new javax.swing.JButton();
        jButtonRemoverProducao = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonRelatorioProducao = new javax.swing.JButton();
        jButtonAdicionarProducao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducao = new javax.swing.JTable();
        jLabelTelaProducao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVericarProducao.setBorder(null);
        jButtonVericarProducao.setBorderPainted(false);
        jButtonVericarProducao.setContentAreaFilled(false);
        jButtonVericarProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVericarProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVericarProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVericarProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 172, 260, 45));

        jButtonRemoverProducao.setBorder(null);
        jButtonRemoverProducao.setBorderPainted(false);
        jButtonRemoverProducao.setContentAreaFilled(false);
        jButtonRemoverProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 172, 260, 45));

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setBorderPainted(false);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 23, 40, 21));

        jButtonRelatorioProducao.setBorder(null);
        jButtonRelatorioProducao.setBorderPainted(false);
        jButtonRelatorioProducao.setContentAreaFilled(false);
        jButtonRelatorioProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRelatorioProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRelatorioProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 112, 260, 45));

        jButtonAdicionarProducao.setBorder(null);
        jButtonAdicionarProducao.setBorderPainted(false);
        jButtonAdicionarProducao.setContentAreaFilled(false);
        jButtonAdicionarProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 112, 260, 45));

        jTableProducao.setBackground(new java.awt.Color(15, 42, 61));
        jTableProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableProducao.setForeground(new java.awt.Color(255, 255, 255));
        jTableProducao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da Produção", "Quantidade Produzida (Sacas)", "Valor Total de Lucro (R$)", "Cultura", "Vendido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane1.setViewportView(jTableProducao);
        if (jTableProducao.getColumnModel().getColumnCount() > 0) {
            jTableProducao.getColumnModel().getColumn(0).setResizable(false);
            jTableProducao.getColumnModel().getColumn(0).setHeaderValue("Nome da Produção");
            jTableProducao.getColumnModel().getColumn(1).setResizable(false);
            jTableProducao.getColumnModel().getColumn(1).setHeaderValue("Quantidade Produzida (Sacas)");
            jTableProducao.getColumnModel().getColumn(2).setResizable(false);
            jTableProducao.getColumnModel().getColumn(2).setHeaderValue("Valor Total de Lucro (R$)");
            jTableProducao.getColumnModel().getColumn(3).setResizable(false);
            jTableProducao.getColumnModel().getColumn(3).setHeaderValue("Cultura");
            jTableProducao.getColumnModel().getColumn(4).setResizable(false);
            jTableProducao.getColumnModel().getColumn(4).setHeaderValue("Vendido");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 850, 370));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_inicio_producao.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarProducaoActionPerformed
        this.dispose();
        new TelaDeEscolhaDePropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarProducaoActionPerformed

    private void jButtonVericarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVericarProducaoActionPerformed
        this.dispose();
        new TelaDeConsultaProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVericarProducaoActionPerformed

    private void jButtonRelatorioProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioProducaoActionPerformed
        this.dispose();
        new TelaDeRelatorioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonRelatorioProducaoActionPerformed

    private void jButtonRemoverProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverProducaoActionPerformed
        this.dispose();
        new TelaDeRemocaoProducao().setVisible(true);
    }//GEN-LAST:event_jButtonRemoverProducaoActionPerformed

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    public void readJtable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableProducao.getModel();
        ControleProducao controleProducao = new ControleProducao();

        for (Producao p : controleProducao.buscarTodasAsProducoes()) {
            String valorTotalLucro = converterValorParaReal(p.getValorTotalDeLucro());
            modelo.addRow(new Object[]{p.getNomeProducao(), p.getQuantidadeProduzidaEmSacos(), valorTotalLucro, p.getCultura(), p.getStatusDeVenda()});
        }
        
    }
    
    public String converterValorParaReal(Double valorReal) {

        if (valorReal >= 9999.99 && valorReal < 100000.00) {
            return String.format("%,.2f", valorReal).replace(".", "#").replace(",", ",").replace("#", ".");
        }

        if (valorReal >= 99999.99 && valorReal < 100000.00) {
            return String.format("%,.2f", valorReal).replace(".", "#").replace(",", ".");
        }

        if (valorReal >= 100000.00 && valorReal < 999999.99) {
            return String.format("%,.2f", valorReal).replace(",", "#").replace(",", ".").replace("#", ",");
        }

        if (valorReal >= 1000000.00) {
            return String.format("%,.2f", valorReal).replace(",", "#").replace(",", ".").replace("#", ",");
        }

        return "Erro";

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarProducao;
    private javax.swing.JButton jButtonRelatorioProducao;
    private javax.swing.JButton jButtonRemoverProducao;
    private javax.swing.JButton jButtonVericarProducao;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelTelaProducao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducao;
    // End of variables declaration//GEN-END:variables
}
