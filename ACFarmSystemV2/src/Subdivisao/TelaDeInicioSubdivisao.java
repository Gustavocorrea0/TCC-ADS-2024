package Subdivisao;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import javax.swing.table.DefaultTableModel;

public final class TelaDeInicioSubdivisao extends javax.swing.JFrame {

    private DefaultTableModel modeloPropriedade;

    private ControleSubdivisao controleSubdivisao = new ControleSubdivisao();
    public TelaDeInicioSubdivisao() {
        initComponents();
        readTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCadastrarPropriedade = new javax.swing.JButton();
        jButtonAtualizarPropriedade = new javax.swing.JButton();
        jButtonDeletarPropriedade = new javax.swing.JButton();
        jButtonVerificarPropriedade = new javax.swing.JButton();
        jButtonVoltarAoTelaDeInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSubdivisao = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCadastrarPropriedade.setBorder(null);
        jButtonCadastrarPropriedade.setContentAreaFilled(false);
        jButtonCadastrarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 80, 70));

        jButtonAtualizarPropriedade.setBorder(null);
        jButtonAtualizarPropriedade.setContentAreaFilled(false);
        jButtonAtualizarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 240, 86, 70));

        jButtonDeletarPropriedade.setBorder(null);
        jButtonDeletarPropriedade.setContentAreaFilled(false);
        jButtonDeletarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 365, 60, 70));

        jButtonVerificarPropriedade.setBorder(null);
        jButtonVerificarPropriedade.setContentAreaFilled(false);
        jButtonVerificarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 80, 70));

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

        jTableSubdivisao.setBackground(new java.awt.Color(15, 42, 61));
        jTableSubdivisao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTableSubdivisao.setForeground(new java.awt.Color(255, 255, 255));
        jTableSubdivisao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Area(Alqueire)", "Cultura", "Propriedade"
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
        jTableSubdivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableSubdivisao.setGridColor(new java.awt.Color(255, 204, 0));
        jTableSubdivisao.setRowHeight(30);
        jTableSubdivisao.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableSubdivisao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 740, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasSubdivisao/img_tela_de_inicio_subdivisao.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarPropriedadeActionPerformed
        this.dispose();
        new TelaDeCadastroDeSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarPropriedadeActionPerformed

    private void jButtonAtualizarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarPropriedadeActionPerformed
        this.dispose();
        new TelaDeAtualizacaoDeSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarPropriedadeActionPerformed

    private void jButtonDeletarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarPropriedadeActionPerformed
        this.dispose();
        new TelaDeRemocaoDeSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarPropriedadeActionPerformed

    private void jButtonVerificarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarPropriedadeActionPerformed
        this.dispose();
        new TelaDeConsultaDeSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarPropriedadeActionPerformed

    private void jButtonVoltarAoTelaDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeInicioActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeInicioActionPerformed

    
    public void readTable(){
        modeloPropriedade = (DefaultTableModel) jTableSubdivisao.getModel();
        controleSubdivisao= new ControleSubdivisao();
        
        for (Subdivisao u: controleSubdivisao.lerSubdivisao()){
              modeloPropriedade.addRow(new Object[]{u.getNomeSubdivisao(),
                  u.getAreaSubdivisao(), u.getCulturaSubdivisao(), u.getNomePropriedade()});
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarPropriedade;
    private javax.swing.JButton jButtonCadastrarPropriedade;
    private javax.swing.JButton jButtonDeletarPropriedade;
    private javax.swing.JButton jButtonVerificarPropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSubdivisao;
    // End of variables declaration//GEN-END:variables
}
