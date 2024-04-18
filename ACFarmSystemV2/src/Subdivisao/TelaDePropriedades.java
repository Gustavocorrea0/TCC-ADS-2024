package Subdivisao;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import Propriedade.TelaDeInicioPropriedade;
import javax.swing.table.DefaultTableModel;

public final class TelaDePropriedades extends javax.swing.JFrame {

    private DefaultTableModel modeloPropriedade;

    private ControleSubdivisao controleSubdivisao = new ControleSubdivisao();
    public TelaDePropriedades() {
        initComponents();
        readTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessarPropriedade = new javax.swing.JButton();
        jButtonCadastrarSubdivisao = new javax.swing.JButton();
        jButtonVoltarAoTelaDeInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePropriedade = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(jButtonAcessarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 100, 261, 45));

        jButtonCadastrarSubdivisao.setBorder(null);
        jButtonCadastrarSubdivisao.setContentAreaFilled(false);
        jButtonCadastrarSubdivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrarSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrarSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 261, 45));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasSubdivisao/img_tela_de_cadastro_subdivisao_lista_propriedades.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarPropriedadeActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarPropriedadeActionPerformed

    private void jButtonCadastrarSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarSubdivisaoActionPerformed
        this.dispose();
        new TelaDeCadastroDeSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarSubdivisaoActionPerformed

    private void jButtonVoltarAoTelaDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeInicioActionPerformed
        this.dispose();
        new TelaDeInicioSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeInicioActionPerformed

    public void readTable() {
        modeloPropriedade = (DefaultTableModel) jTablePropriedade.getModel();
        ControlePropriedade controlePropriedade = new ControlePropriedade();

        for (Propriedade u : controlePropriedade.readPropriedade()) {
            modeloPropriedade.addRow(new Object[]{u.getNomePropriedade(),
                u.getAreaPropriedade(), u.getCidade(), u.getTipoDeCulturaDaPropriedade(), u.getIdPropriedade()});
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarPropriedade;
    private javax.swing.JButton jButtonCadastrarSubdivisao;
    private javax.swing.JButton jButtonVoltarAoTelaDeInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePropriedade;
    // End of variables declaration//GEN-END:variables
}
