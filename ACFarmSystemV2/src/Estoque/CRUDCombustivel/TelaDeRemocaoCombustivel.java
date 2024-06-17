package Estoque.CRUDCombustivel;

import Estoque.Combustivel;
import Estoque.ControleEstoque;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeRemocaoCombustivel extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeCombustivel;
    private String quantidadeMinima;
    private String quantidadeAtual;
    private String msg;
    private String nomeInsumo;

    public TelaDeRemocaoCombustivel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeCombustivelBuscado = new javax.swing.JTextField();
        jTextFieldNomeCombustivel = new javax.swing.JTextField();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jTextFieldQuantidadeCombustivel = new javax.swing.JTextField();
        jButtonBuscarCombustivel = new javax.swing.JButton();
        jButtonVoltarATelaAnterior = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeCombustivelBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCombustivelBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCombustivelBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCombustivelBuscado.setBorder(null);
        jTextFieldNomeCombustivelBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCombustivelBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCombustivelBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 116, 271, 29));

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
        getContentPane().add(jTextFieldNomeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 243, 272, 29));

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
        getContentPane().add(jTextFieldQuantidadeMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 403, 272, 29));

        jTextFieldQuantidadeCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeCombustivel.setBorder(null);
        jTextFieldQuantidadeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 570, 272, 29));

        jButtonBuscarCombustivel.setBorder(null);
        jButtonBuscarCombustivel.setBorderPainted(false);
        jButtonBuscarCombustivel.setContentAreaFilled(false);
        jButtonBuscarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 108, 280, 45));

        jButtonVoltarATelaAnterior.setBorder(null);
        jButtonVoltarATelaAnterior.setBorderPainted(false);
        jButtonVoltarATelaAnterior.setContentAreaFilled(false);
        jButtonVoltarATelaAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 33));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 596, 280, 36));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasCombustivel/img_tela_de_remocao_combustivel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCombustivelBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCombustivelBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCombustivelBuscadoActionPerformed

    private void jTextFieldNomeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCombustivelActionPerformed

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldQuantidadeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeCombustivelActionPerformed

    private void jButtonVoltarATelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaAnteriorActionPerformed
        this.dispose();
        new TelaDeInicioCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaAnteriorActionPerformed

    private void jButtonBuscarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCombustivelActionPerformed
        try {
            buscarCombustivel();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoCombustivel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRemocaoCombustivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarCombustivelActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerCombustivel();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoção cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void buscarCombustivel() throws SQLException, ParseException {
        if (jTextFieldNomeCombustivelBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do combustivél");
            return;
        }
        nomeInsumo = jTextFieldNomeCombustivelBuscado.getText();
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
            limparCampos();
        }

    }

    public void removerCombustivel() {
        if (jTextFieldNomeCombustivelBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um combustível");
            return;
        }
        nomeInsumo = jTextFieldNomeCombustivelBuscado.getText();
        msg = controleEstoque.removerCombustivel(nomeInsumo);
        JOptionPane.showMessageDialog(this, msg);
        limparCampos();
    }

    public void limparCampos() {
        jTextFieldNomeCombustivel.setText("");
        jTextFieldQuantidadeMinima.setText("");
        jTextFieldQuantidadeCombustivel.setText("");
        jTextFieldNomeCombustivelBuscado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarCombustivel;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonVoltarATelaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldNomeCombustivel;
    private javax.swing.JTextField jTextFieldNomeCombustivelBuscado;
    private javax.swing.JTextField jTextFieldQuantidadeCombustivel;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
