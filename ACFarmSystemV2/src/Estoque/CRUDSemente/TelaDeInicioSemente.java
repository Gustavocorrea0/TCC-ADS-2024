package Estoque.CRUDSemente;

import Estoque.ControleEstoque;
import Estoque.Semente;
import Estoque.TelaDeInicioEstoque;
import javax.swing.table.DefaultTableModel;

public class TelaDeInicioSemente extends javax.swing.JFrame {

    public TelaDeInicioSemente() {
        initComponents();
        readJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionarSemente = new javax.swing.JButton();
        jButtonAtualizarSemente = new javax.swing.JButton();
        jButtonDeletarSemente = new javax.swing.JButton();
        jButtonVerificarSemente = new javax.swing.JButton();
        jButtonVoltarATelaInicial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSemente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdicionarSemente.setBorder(null);
        jButtonAdicionarSemente.setBorderPainted(false);
        jButtonAdicionarSemente.setContentAreaFilled(false);
        jButtonAdicionarSemente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 75, 65));

        jButtonAtualizarSemente.setBorder(null);
        jButtonAtualizarSemente.setBorderPainted(false);
        jButtonAtualizarSemente.setContentAreaFilled(false);
        jButtonAtualizarSemente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizarSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizarSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 244, 70, 70));

        jButtonDeletarSemente.setBorder(null);
        jButtonDeletarSemente.setBorderPainted(false);
        jButtonDeletarSemente.setContentAreaFilled(false);
        jButtonDeletarSemente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletarSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 370, 65, 70));

        jButtonVerificarSemente.setBorder(null);
        jButtonVerificarSemente.setBorderPainted(false);
        jButtonVerificarSemente.setContentAreaFilled(false);
        jButtonVerificarSemente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 495, 70, 70));

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

        jTableSemente.setBackground(new java.awt.Color(15, 42, 61));
        jTableSemente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableSemente.setForeground(new java.awt.Color(255, 255, 255));
        jTableSemente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Quantidade em sacos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSemente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableSemente.setGridColor(new java.awt.Color(255, 204, 0));
        jTableSemente.setRowHeight(30);
        jTableSemente.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableSemente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 740, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasSemente/img_tela_inicio_semente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 904, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarATelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaInicialActionPerformed
        this.dispose();
        new TelaDeInicioEstoque().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaInicialActionPerformed

    private void jButtonAdicionarSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarSementeActionPerformed
        this.dispose();
        new TelaDeCadastroSemente().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarSementeActionPerformed

    private void jButtonVerificarSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarSementeActionPerformed
        this.dispose();
        new TelaDeVerificacaoSemente().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarSementeActionPerformed

    private void jButtonDeletarSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarSementeActionPerformed
        this.dispose();
        new TelaDeRemocaoSemente().setVisible(true);
    }//GEN-LAST:event_jButtonDeletarSementeActionPerformed

    private void jButtonAtualizarSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarSementeActionPerformed
        this.dispose();
        new TelaDeAtualizacaoSemente().setVisible(true);
    }//GEN-LAST:event_jButtonAtualizarSementeActionPerformed

    private void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableSemente.getModel();
        ControleEstoque controleEstoque = new ControleEstoque();

        for (Semente u : controleEstoque.lerSemente()) {
            modelo.addRow(new Object[]{u.getNomeSemente(), u.getMarcaSemente(), u.getQuantidadeEmSacos(), u.getIdSemente()});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarSemente;
    private javax.swing.JButton jButtonAtualizarSemente;
    private javax.swing.JButton jButtonDeletarSemente;
    private javax.swing.JButton jButtonVerificarSemente;
    private javax.swing.JButton jButtonVoltarATelaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSemente;
    // End of variables declaration//GEN-END:variables
}
