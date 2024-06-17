package Estoque.CRUDCombustivel;

import Estoque.Combustivel;
import Estoque.ControleEstoque;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoCombustivel extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeCombustivel;
    private String quantidadeMinima;
    private String quantidadeAtual;

    private String nomeCombustivelAtualizado;
    private Double quantidadeMinimaAtualizado;
    private Double quantidadeAtualAtualizado;
    private String nomeInsumo;
    private int idInsumo;

    public TelaDeAtualizacaoCombustivel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeCombustivel = new javax.swing.JTextField();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jTextFieldQuantidadeCombustivel = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldNomeCombustivelBuscado = new javax.swing.JTextField();
        jButtonSairDaTelaEstoqueAtualizarCombustivel = new javax.swing.JButton();
        jButtonBuscarEstoqueAtualizarCombustivel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCombustivel.setBorder(null);
        jTextFieldNomeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 243, 272, 29));

        jTextFieldQuantidadeMinima.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeMinima.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeMinima.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeMinima.setBorder(null);
        jTextFieldQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeMinimaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 403, 272, 29));

        jTextFieldQuantidadeCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeCombustivel.setBorder(null);
        jTextFieldQuantidadeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 570, 272, 29));

        jButtonConfirmar.setBorder(null);
        jButtonConfirmar.setBorderPainted(false);
        jButtonConfirmar.setContentAreaFilled(false);
        jButtonConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 33));

        jButtonCancelar.setBorder(null);
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 597, 282, 35));

        jTextFieldNomeCombustivelBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCombustivelBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCombustivelBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCombustivelBuscado.setBorder(null);
        jTextFieldNomeCombustivelBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCombustivelBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCombustivelBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 116, 272, 29));

        jButtonSairDaTelaEstoqueAtualizarCombustivel.setBorder(null);
        jButtonSairDaTelaEstoqueAtualizarCombustivel.setBorderPainted(false);
        jButtonSairDaTelaEstoqueAtualizarCombustivel.setContentAreaFilled(false);
        jButtonSairDaTelaEstoqueAtualizarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaEstoqueAtualizarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaEstoqueAtualizarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonBuscarEstoqueAtualizarCombustivel.setBorder(null);
        jButtonBuscarEstoqueAtualizarCombustivel.setBorderPainted(false);
        jButtonBuscarEstoqueAtualizarCombustivel.setContentAreaFilled(false);
        jButtonBuscarEstoqueAtualizarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarEstoqueAtualizarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarEstoqueAtualizarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarEstoqueAtualizarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 109, 282, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasCombustivel/img_tela_de_atualizacao_combustivel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCombustivelActionPerformed

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldQuantidadeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeCombustivelActionPerformed

    private void jTextFieldNomeCombustivelBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCombustivelBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCombustivelBuscadoActionPerformed

    private void jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed
        this.dispose();
        new TelaDeInicioCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed

    private void jButtonBuscarEstoqueAtualizarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarEstoqueAtualizarCombustivelActionPerformed
        try {
            buscarCombustivel();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoCombustivel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeAtualizacaoCombustivel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarEstoqueAtualizarCombustivelActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        atualizarCambustivel();
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "Atualização cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public void buscarCombustivel() throws SQLException, ParseException {
        if (jTextFieldNomeCombustivelBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do combustível");
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
            idInsumo = combustivelEncontrado.getIdCombustivel();

        } else {
            JOptionPane.showMessageDialog(this, "Combustivel não encontrado");
            limparCampos();
        }

    }

    public void atualizarCambustivel() {
        if (jTextFieldNomeCombustivelBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Busque um combustível");
            return;
        }

        if (jTextFieldNomeCombustivel.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do combustível");
            return;
        }

        if (jTextFieldQuantidadeMinima.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade miníma de combustível");
            return;
        }

        if (jTextFieldQuantidadeCombustivel.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade de combustível");
            return;
        }

        try {
            Combustivel combustivelAtualizado = new Combustivel();

            nomeCombustivelAtualizado = jTextFieldNomeCombustivel.getText();
            quantidadeMinimaAtualizado = Double.valueOf(jTextFieldQuantidadeMinima.getText());
            quantidadeAtualAtualizado = Double.valueOf(jTextFieldQuantidadeCombustivel.getText());

            if (nomeCombustivelAtualizado.isBlank()) {
                JOptionPane.showMessageDialog(this, "Nome Inválido");
                return;
            }

            if (quantidadeMinimaAtualizado < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade minima Inválida");
                return;
            }

            if (quantidadeAtualAtualizado < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade Inválida");
                return;
            }

            combustivelAtualizado.setNomeCombustivel(nomeCombustivelAtualizado);
            combustivelAtualizado.setQuantidadeMinimaEmLitros(quantidadeMinimaAtualizado);
            combustivelAtualizado.setQuantidadeEmLitros(quantidadeAtualAtualizado);
            combustivelAtualizado.setIdCombustivel(idInsumo);

            controleEstoque = new ControleEstoque();
            String msgAtualizacao = controleEstoque.atualizarCombustivel(combustivelAtualizado);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            limparCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "As quantidades de combustíveis devem ser númericas");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar combutível");
        }

    }

    public void limparCampos() {
        jTextFieldNomeCombustivel.setText("");
        jTextFieldQuantidadeMinima.setText("");
        jTextFieldQuantidadeCombustivel.setText("");
        jTextFieldNomeCombustivelBuscado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarEstoqueAtualizarCombustivel;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonSairDaTelaEstoqueAtualizarCombustivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldNomeCombustivel;
    private javax.swing.JTextField jTextFieldNomeCombustivelBuscado;
    private javax.swing.JTextField jTextFieldQuantidadeCombustivel;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
