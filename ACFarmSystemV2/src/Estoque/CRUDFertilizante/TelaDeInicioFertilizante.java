package Estoque.CRUDFertilizante;

import Estoque.ControleEstoque;
import Estoque.Fertilizante;
import Estoque.TelaDeInicioEstoque;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioFertilizante extends javax.swing.JFrame {

    public TelaDeInicioFertilizante() {
        initComponents();
        readJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionarFertilizante = new javax.swing.JButton();
        jButtonAtualizarFertilizante = new javax.swing.JButton();
        jButtonDeletarFertilizante = new javax.swing.JButton();
        jButtonVerificarFertilizante = new javax.swing.JButton();
        jButtonVoltarATelaInicial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFertilizante = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdicionarFertilizante.setBorder(null);
        jButtonAdicionarFertilizante.setBorderPainted(false);
        jButtonAdicionarFertilizante.setContentAreaFilled(false);
        jButtonAdicionarFertilizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 75, 65));

        jButtonAtualizarFertilizante.setBorder(null);
        jButtonAtualizarFertilizante.setBorderPainted(false);
        jButtonAtualizarFertilizante.setContentAreaFilled(false);
        jButtonAtualizarFertilizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 245, 70, 70));

        jButtonDeletarFertilizante.setBorder(null);
        jButtonDeletarFertilizante.setBorderPainted(false);
        jButtonDeletarFertilizante.setContentAreaFilled(false);
        jButtonDeletarFertilizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 375, 70, 65));

        jButtonVerificarFertilizante.setBorder(null);
        jButtonVerificarFertilizante.setBorderPainted(false);
        jButtonVerificarFertilizante.setContentAreaFilled(false);
        jButtonVerificarFertilizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 502, 65, 60));

        jButtonVoltarATelaInicial.setBorder(null);
        jButtonVoltarATelaInicial.setBorderPainted(false);
        jButtonVoltarATelaInicial.setContentAreaFilled(false);
        jButtonVoltarATelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 40, 25));

        jTableFertilizante.setBackground(new java.awt.Color(15, 42, 61));
        jTableFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableFertilizante.setForeground(new java.awt.Color(255, 255, 255));
        jTableFertilizante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Tipo", "Quantidade em Litros", "Quantidade em Sacos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
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
        jTableFertilizante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableFertilizante.setGridColor(new java.awt.Color(255, 204, 0));
        jTableFertilizante.setRowHeight(30);
        jTableFertilizante.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableFertilizante);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 720, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasFertilizante/img_tela_inicio_fertilizante.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 904, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarATelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaInicialActionPerformed
        this.dispose();
        new TelaDeInicioEstoque().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaInicialActionPerformed

    private void jButtonAdicionarFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarFertilizanteActionPerformed
        this.dispose();
        new TelaDeCadastroFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarFertilizanteActionPerformed

    private void jButtonVerificarFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarFertilizanteActionPerformed
        this.dispose();
        new TelaDeVerificacaoFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarFertilizanteActionPerformed

    private void jButtonDeletarFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarFertilizanteActionPerformed
        this.dispose();
        new TelaDeRemocaoFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarFertilizanteActionPerformed

    private void jButtonAtualizarFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarFertilizanteActionPerformed
        this.dispose();
        new TelaDeAtualizacaoFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarFertilizanteActionPerformed

    private void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFertilizante.getModel();
        ControleEstoque controleEstoque = new ControleEstoque();

        for (Fertilizante u : controleEstoque.lerFertilizante()) {
            modelo.addRow(new Object[]{u.getNomeFertilizante(), u.getMarcaFertilizante(), u.getTipoFertilizante(), u.getQuantidadeEmLitros(), u.getQuantidadeEmSacos()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarFertilizante;
    private javax.swing.JButton jButtonAtualizarFertilizante;
    private javax.swing.JButton jButtonDeletarFertilizante;
    private javax.swing.JButton jButtonVerificarFertilizante;
    private javax.swing.JButton jButtonVoltarATelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFertilizante;
    // End of variables declaration//GEN-END:variables
}
