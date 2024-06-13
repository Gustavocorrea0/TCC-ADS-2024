package praga;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import Propriedade.TelaDeInicioPropriedade;
import javax.swing.table.DefaultTableModel;

public final class TelaDeConsultaPropriedade extends javax.swing.JFrame {

    private DefaultTableModel modeloPropriedade;
    private ControlePropriedade controlePropriedade;

    public TelaDeConsultaPropriedade() {
        initComponents();
        readTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessarPropriedade = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePropriedade = new javax.swing.JTable();
        jLabelIMGTelaInicialFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAcessarPropriedade.setBorder(null);
        jButtonAcessarPropriedade.setContentAreaFilled(false);
        jButtonAcessarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 305, 44));

        jButtonCadastrar.setBorder(null);
        jButtonCadastrar.setContentAreaFilled(false);
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 305, 44));

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 25));

        jTablePropriedade.setBackground(new java.awt.Color(15, 42, 61));
        jTablePropriedade.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTablePropriedade.setForeground(new java.awt.Color(255, 255, 255));
        jTablePropriedade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Area(Alqueire)", "Cidade", "Cultura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
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
        jTablePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablePropriedade.setGridColor(new java.awt.Color(255, 204, 0));
        jTablePropriedade.setRowHeight(30);
        jTablePropriedade.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTablePropriedade);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 870, 350));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPraga/img_tela_escolha_propriedade.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioPraga().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        this.dispose();
        new TelaDeCadastroPraga().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonAcessarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarPropriedadeActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarPropriedadeActionPerformed

    public void readTable() {
        modeloPropriedade = (DefaultTableModel) jTablePropriedade.getModel();
        controlePropriedade = new ControlePropriedade();

        for (Propriedade u : controlePropriedade.readPropriedade()) {
            modeloPropriedade.addRow(new Object[]{u.getNomePropriedade(),
                u.getAreaPropriedade(), u.getCidade(), u.getTipoDeCulturaDaPropriedade(), u.getIdPropriedade()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarPropriedade;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePropriedade;
    // End of variables declaration//GEN-END:variables
}
