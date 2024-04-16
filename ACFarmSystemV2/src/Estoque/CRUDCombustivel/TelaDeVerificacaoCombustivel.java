package Estoque.CRUDCombustivel;

import Estoque.Combustivel;
import Estoque.ControleEstoque;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeVerificacaoCombustivel extends javax.swing.JFrame {

    private ControleEstoque controleEstoque  = new ControleEstoque();
    private String nomeCombustivel;
    private String quantidadeMinima;
    private String quantidadeAtual;
    private String nomeInsumo;
    
    public TelaDeVerificacaoCombustivel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldIdCombustivel = new javax.swing.JTextField();
        jTextFieldNomeCombustivel = new javax.swing.JTextField();
        jTextFieldQuantidadeCombustivel = new javax.swing.JTextField();
        jButtonBuscarCombustivel = new javax.swing.JButton();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jButtonSairDaTelaEstoqueVerificarCombustivel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldIdCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdCombustivel.setBorder(null);
        jTextFieldIdCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 116, 270, 30));

        jTextFieldNomeCombustivel.setEditable(false);
        jTextFieldNomeCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCombustivel.setBorder(null);
        jTextFieldNomeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 244, 273, 30));

        jTextFieldQuantidadeCombustivel.setEditable(false);
        jTextFieldQuantidadeCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeCombustivel.setBorder(null);
        jTextFieldQuantidadeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 570, 271, 30));

        jButtonBuscarCombustivel.setBorder(null);
        jButtonBuscarCombustivel.setBorderPainted(false);
        jButtonBuscarCombustivel.setContentAreaFilled(false);
        jButtonBuscarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 110, 262, 42));

        jTextFieldQuantidadeMinima.setEditable(false);
        jTextFieldQuantidadeMinima.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeMinima.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeMinima.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeMinima.setBorder(null);
        jTextFieldQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeMinimaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 403, 272, 30));

        jButtonSairDaTelaEstoqueVerificarCombustivel.setBorder(null);
        jButtonSairDaTelaEstoqueVerificarCombustivel.setBorderPainted(false);
        jButtonSairDaTelaEstoqueVerificarCombustivel.setContentAreaFilled(false);
        jButtonSairDaTelaEstoqueVerificarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaEstoqueVerificarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaEstoqueVerificarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaEstoqueVerificarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 40, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasCombustivel/img_tela_de_verificacao_de_combustivel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldIdCombustivelActionPerformed

    private void jTextFieldNomeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCombustivelActionPerformed

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldQuantidadeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeCombustivelActionPerformed

    private void jButtonSairDaTelaEstoqueVerificarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaEstoqueVerificarCombustivelActionPerformed
        this.dispose();
        new TelaDeInicioCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaEstoqueVerificarCombustivelActionPerformed

    private void jButtonBuscarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCombustivelActionPerformed
        try {
            buscarCombustivel();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeVerificacaoCombustivel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeVerificacaoCombustivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarCombustivelActionPerformed

    public void buscarCombustivel() throws SQLException, ParseException {
        nomeInsumo =  jTextFieldIdCombustivel.getText();
        Combustivel combustivelEncontrado = controleEstoque.buscarCombustivel(nomeInsumo);

        if (combustivelEncontrado != null) {
            nomeCombustivel = combustivelEncontrado.getNomeCombustivel();
            quantidadeMinima = Double.toString(combustivelEncontrado.getQuantidadeMinimaEmLitros());
            quantidadeAtual = Double.toString(combustivelEncontrado.getQuantidadeEmLitros());
            
            jTextFieldNomeCombustivel.setText(nomeCombustivel);
            jTextFieldQuantidadeMinima.setText(quantidadeMinima);
            jTextFieldQuantidadeCombustivel.setText(quantidadeAtual);
        } else {
            JOptionPane.showMessageDialog(this, "Combustivel não encontrado");
            jTextFieldNomeCombustivel.setText("");
            jTextFieldQuantidadeMinima.setText("");
            jTextFieldQuantidadeCombustivel.setText("");
            jTextFieldIdCombustivel.setText("");
        }

    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarCombustivel;
    private javax.swing.JButton jButtonSairDaTelaEstoqueVerificarCombustivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldIdCombustivel;
    private javax.swing.JTextField jTextFieldNomeCombustivel;
    private javax.swing.JTextField jTextFieldQuantidadeCombustivel;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
