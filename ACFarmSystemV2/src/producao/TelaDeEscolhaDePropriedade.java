package producao;

import Propriedade.*;
import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import javax.swing.table.DefaultTableModel;

public class TelaDeEscolhaDePropriedade extends javax.swing.JFrame {

    private DefaultTableModel modeloPropriedade;
    private ControlePropriedade controlePropriedade;

    public TelaDeEscolhaDePropriedade() {
        initComponents();
        readTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPropriedade = new javax.swing.JButton();
        jButtonAdicionarProducao = new javax.swing.JButton();
        jButtonVoltarAoTelaDeInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePropriedade = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPropriedade.setBorder(null);
        jButtonPropriedade.setContentAreaFilled(false);
        jButtonPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 108, 261, 45));

        jButtonAdicionarProducao.setBorder(null);
        jButtonAdicionarProducao.setContentAreaFilled(false);
        jButtonAdicionarProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 108, 261, 45));

        jButtonVoltarAoTelaDeInicio.setBorder(null);
        jButtonVoltarAoTelaDeInicio.setBorderPainted(false);
        jButtonVoltarAoTelaDeInicio.setContentAreaFilled(false);
        jButtonVoltarAoTelaDeInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoTelaDeInicio.setDefaultCapable(false);
        jButtonVoltarAoTelaDeInicio.setFocusPainted(false);
        jButtonVoltarAoTelaDeInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoTelaDeInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoTelaDeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 18, 40, 25));

        jTablePropriedade.setBackground(new java.awt.Color(15, 42, 61));
        jTablePropriedade.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTablePropriedade.setForeground(new java.awt.Color(255, 255, 255));
        jTablePropriedade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Propriedade", "Area(Alqueire)", "Cidade", "Cultura"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 870, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_escolha_de_propriedade.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPropriedadeActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonPropriedadeActionPerformed

    private void jButtonAdicionarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarProducaoActionPerformed
        this.dispose();
        new TelaDeCadastroProducao().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarProducaoActionPerformed

    private void jButtonVoltarAoTelaDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeInicioActionPerformed
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeInicioActionPerformed

    public void readTable() {
        modeloPropriedade = (DefaultTableModel) jTablePropriedade.getModel();
        controlePropriedade = new ControlePropriedade();

        for (Propriedade u : controlePropriedade.readPropriedade()) {
            modeloPropriedade.addRow(new Object[]{u.getNomePropriedade(),
                u.getAreaPropriedade(), u.getCidade(), u.getTipoDeCulturaDaPropriedade(), u.getIdPropriedade()});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarProducao;
    private javax.swing.JButton jButtonPropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePropriedade;
    // End of variables declaration//GEN-END:variables
}
