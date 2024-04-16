package planta;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import Propriedade.TelaDeInicioPropriedade;
import fornecedor.ControleFornecedor;
import fornecedor.Fornecedor;
import fornecedor.TelaDeInicioFornecedor;
import javax.swing.table.DefaultTableModel;
import planta.CRUDSoja.TelaDeAdicaoSoja;

public class TelaVizualizacaoPropriedadeEFornecedorSoja extends javax.swing.JFrame {

    private ControleFornecedor controleFornecedor = new ControleFornecedor();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    
    public TelaVizualizacaoPropriedadeEFornecedorSoja() {
        initComponents();
        readJtableFornecedor();
        readJtablePropriedade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSairDaTelaInicioPlanta = new javax.swing.JButton();
        jButtonAcessarFornecedor = new javax.swing.JButton();
        jButtonAcessarPropriedade = new javax.swing.JButton();
        jButtonCadastrarPlanta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePropriedade = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSairDaTelaInicioPlanta.setBorder(null);
        jButtonSairDaTelaInicioPlanta.setBorderPainted(false);
        jButtonSairDaTelaInicioPlanta.setContentAreaFilled(false);
        jButtonSairDaTelaInicioPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaInicioPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaInicioPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaInicioPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonAcessarFornecedor.setBorder(null);
        jButtonAcessarFornecedor.setBorderPainted(false);
        jButtonAcessarFornecedor.setContentAreaFilled(false);
        jButtonAcessarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 103, 260, 45));

        jButtonAcessarPropriedade.setBorder(null);
        jButtonAcessarPropriedade.setBorderPainted(false);
        jButtonAcessarPropriedade.setContentAreaFilled(false);
        jButtonAcessarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarPropriedade.setVerifyInputWhenFocusTarget(false);
        jButtonAcessarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 183, 260, 42));

        jButtonCadastrarPlanta.setBorder(null);
        jButtonCadastrarPlanta.setBorderPainted(false);
        jButtonCadastrarPlanta.setContentAreaFilled(false);
        jButtonCadastrarPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrarPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 104, 260, 43));

        jTablePropriedade.setBackground(new java.awt.Color(15, 42, 61));
        jTablePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTablePropriedade.setForeground(new java.awt.Color(255, 255, 255));
        jTablePropriedade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Propriedade"
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
        jTablePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablePropriedade.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePropriedade.setRowHeight(30);
        jTablePropriedade.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTablePropriedade.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablePropriedade);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 280, 300));

        jTableFornecedor.setBackground(new java.awt.Color(15, 42, 61));
        jTableFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fornecedor"
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
        jTableFornecedor.setGridColor(new java.awt.Color(255, 255, 255));
        jTableFornecedor.setRowHeight(30);
        jTableFornecedor.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTableFornecedor.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableFornecedor);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 280, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_tela_de_escolha_fornecedor_e_planta.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairDaTelaInicioPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaInicioPlantaActionPerformed
        this.dispose();
        new TelaCRUDSoja().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaInicioPlantaActionPerformed

    private void jButtonAcessarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarFornecedorActionPerformed
        this.dispose();
        new TelaDeInicioFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarFornecedorActionPerformed

    private void jButtonAcessarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarPropriedadeActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarPropriedadeActionPerformed

    private void jButtonCadastrarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarPlantaActionPerformed
        this.dispose();
        new TelaDeAdicaoSoja().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarPlantaActionPerformed

    private void readJtableFornecedor() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedor.getModel();

        for (Fornecedor s : controleFornecedor.readFornecedor()) {
            modelo.addRow(new Object[]{s.getNomeFantasia()});
        }
    }

    private void readJtablePropriedade() {
        DefaultTableModel modelo = (DefaultTableModel) jTablePropriedade.getModel();

        for (Propriedade s : controlePropriedade.readPropriedade()) {
            modelo.addRow(new Object[]{s.getNomePropriedade()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarFornecedor;
    private javax.swing.JButton jButtonAcessarPropriedade;
    private javax.swing.JButton jButtonCadastrarPlanta;
    private javax.swing.JButton jButtonSairDaTelaInicioPlanta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableFornecedor;
    private javax.swing.JTable jTablePropriedade;
    // End of variables declaration//GEN-END:variables
}
