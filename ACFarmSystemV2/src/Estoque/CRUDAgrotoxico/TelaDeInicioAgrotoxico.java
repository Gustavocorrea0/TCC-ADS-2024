package Estoque.CRUDAgrotoxico;

import Estoque.Agrotoxico;
import Estoque.ControleEstoque;
import Estoque.TelaDeInicioEstoque;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioAgrotoxico extends javax.swing.JFrame {

    public TelaDeInicioAgrotoxico() {
        initComponents();
        readJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionarAgrotoxico = new javax.swing.JButton();
        jButtonDeletarAgrotoxico = new javax.swing.JButton();
        jButtonAtualizarAgrotoxico = new javax.swing.JButton();
        jButtonVoltarATelaInicial = new javax.swing.JButton();
        jButtonVerificarAgrotoxico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgrotoxico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdicionarAgrotoxico.setBorder(null);
        jButtonAdicionarAgrotoxico.setBorderPainted(false);
        jButtonAdicionarAgrotoxico.setContentAreaFilled(false);
        jButtonAdicionarAgrotoxico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 80, 70));

        jButtonDeletarAgrotoxico.setBorder(null);
        jButtonDeletarAgrotoxico.setBorderPainted(false);
        jButtonDeletarAgrotoxico.setContentAreaFilled(false);
        jButtonDeletarAgrotoxico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 365, 60, 70));

        jButtonAtualizarAgrotoxico.setBorder(null);
        jButtonAtualizarAgrotoxico.setBorderPainted(false);
        jButtonAtualizarAgrotoxico.setContentAreaFilled(false);
        jButtonAtualizarAgrotoxico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 244, 70, 70));

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

        jButtonVerificarAgrotoxico.setBorder(null);
        jButtonVerificarAgrotoxico.setBorderPainted(false);
        jButtonVerificarAgrotoxico.setContentAreaFilled(false);
        jButtonVerificarAgrotoxico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 500, 70, 65));

        jTableAgrotoxico.setBackground(new java.awt.Color(15, 42, 61));
        jTableAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableAgrotoxico.setForeground(new java.awt.Color(255, 255, 255));
        jTableAgrotoxico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Quantidade Atual", "Quantidade Minima", "Abaixo do Minimo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
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
        jTableAgrotoxico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableAgrotoxico.setGridColor(new java.awt.Color(255, 204, 0));
        jTableAgrotoxico.setRowHeight(30);
        jTableAgrotoxico.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableAgrotoxico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 700, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasAgrotoxico/img_tela_inicial_agrotoxico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 904, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarATelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaInicialActionPerformed
        this.dispose();
        new TelaDeInicioEstoque().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaInicialActionPerformed

    private void jButtonAdicionarAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarAgrotoxicoActionPerformed
        this.dispose();
        new TelaDeCadastroAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarAgrotoxicoActionPerformed

    private void jButtonVerificarAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarAgrotoxicoActionPerformed
        this.dispose();
        new TelaDeVerificacaoAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarAgrotoxicoActionPerformed

    private void jButtonDeletarAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarAgrotoxicoActionPerformed
        this.dispose();
        new TelaDeRemocaoAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarAgrotoxicoActionPerformed

    private void jButtonAtualizarAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarAgrotoxicoActionPerformed
        this.dispose();
        new TelaDeAtualizacaoAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarAgrotoxicoActionPerformed

    private void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableAgrotoxico.getModel();
        ControleEstoque controleEstoque = new ControleEstoque();
        String statusQuantidadeMinima = "Não";
        for (Agrotoxico u : controleEstoque.lerAgrotoxico()) {
            
            Double quantMin = u.getQuantidadeMinimaEmLitros();
            Double quantMax = u.getQuantidadeEmLitros();
            if ( quantMax < quantMin) {
                statusQuantidadeMinima = "Sim";
            }
            modelo.addRow(new Object[]{u.getNomeAgrotoxico(), u.getMarcaAgrotoxico(), u.getQuantidadeEmLitros(), u.getQuantidadeMinimaEmLitros(), statusQuantidadeMinima});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarAgrotoxico;
    private javax.swing.JButton jButtonAtualizarAgrotoxico;
    private javax.swing.JButton jButtonDeletarAgrotoxico;
    private javax.swing.JButton jButtonVerificarAgrotoxico;
    private javax.swing.JButton jButtonVoltarATelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAgrotoxico;
    // End of variables declaration//GEN-END:variables
}
