package Estoque.CRUDSemente;

import Estoque.ControleEstoque;
import Estoque.Semente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoSemente extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeSementeEncontrada;
    private String marcaSementeEncontrada;
    private String quantidadeEmSacosEncontrada;
    private String quantidadeMinimaEncontrada;
    private String msg;
    private String nomeInsumo;
    private int idSemente;

    private String nomeSementeAtualizada;
    private String marcaSementeAtualizada;
    private Double quantidadeEmSacosAtualizada;
    private Double quantidadeMinimaAtualizada;

    public TelaDeAtualizacaoSemente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeSemente = new javax.swing.JTextField();
        jTextFieldMarcaSemente = new javax.swing.JTextField();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jTextFieldQuantidadeEmSacos = new javax.swing.JTextField();
        jTextFieldNomeSementeBuscada = new javax.swing.JTextField();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jButtonSairDaTelaEstoqueAtualizarCombustivel = new javax.swing.JButton();
        jButtonBuscarSemente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeSemente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeSemente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeSemente.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeSemente.setBorder(null);
        jTextFieldNomeSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 250, 271, 29));

        jTextFieldMarcaSemente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaSemente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaSemente.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaSemente.setBorder(null);
        jTextFieldMarcaSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 412, 271, 29));

        jTextFieldQuantidadeMinima.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeMinima.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeMinima.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeMinima.setBorder(null);
        jTextFieldQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeMinimaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 250, 270, 29));

        jTextFieldQuantidadeEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmSacos.setBorder(null);
        jTextFieldQuantidadeEmSacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmSacosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 411, 270, 29));

        jTextFieldNomeSementeBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeSementeBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeSementeBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeSementeBuscada.setBorder(null);
        jTextFieldNomeSementeBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSementeBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeSementeBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 116, 271, 29));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setBorderPainted(false);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 548, 282, 33));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 597, 280, 35));

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

        jButtonBuscarSemente.setBorder(null);
        jButtonBuscarSemente.setBorderPainted(false);
        jButtonBuscarSemente.setContentAreaFilled(false);
        jButtonBuscarSemente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarSemente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarSementeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarSemente, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 106, 282, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasSemente/img_tela_atualizacao_semente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldMarcaSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaSementeActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaSementeActionPerformed

    private void jTextFieldQuantidadeEmSacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmSacosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmSacosActionPerformed

    private void jTextFieldNomeSementeBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSementeBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSementeBuscadaActionPerformed

    private void jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed
        this.dispose();
        new TelaDeInicioSemente().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed

    private void jTextFieldNomeSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSementeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSementeActionPerformed

    private void jButtonBuscarSementeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarSementeActionPerformed
        try {
            buscarSemente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoSemente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarSementeActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        atualizarSemente();
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    public void buscarSemente() throws SQLException {
        if (jTextFieldNomeSementeBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da semente");
            limparCampos();
            return;
        }

        nomeInsumo = jTextFieldNomeSementeBuscada.getText();
        Semente sementeEncontrada = controleEstoque.buscarSemente(nomeInsumo);

        if (sementeEncontrada != null) {
            nomeSementeEncontrada = sementeEncontrada.getNomeSemente();
            marcaSementeEncontrada = sementeEncontrada.getMarcaSemente();
            quantidadeEmSacosEncontrada = Double.toString(sementeEncontrada.getQuantidadeEmSacos());
            quantidadeMinimaEncontrada = Double.toString(sementeEncontrada.getQuantidadeMinimaEmSacos());
            idSemente = sementeEncontrada.getIdSemente();

            jTextFieldMarcaSemente.setText(marcaSementeEncontrada);
            jTextFieldNomeSemente.setText(nomeSementeEncontrada);
            jTextFieldQuantidadeEmSacos.setText(quantidadeEmSacosEncontrada);
            jTextFieldQuantidadeMinima.setText(quantidadeMinimaEncontrada);
        } else {
            JOptionPane.showMessageDialog(this, "Semente não encontrada");
            limparCampos();
        }

    }

    public void atualizarSemente() {
        if (jTextFieldNomeSementeBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma semente");
            limparCampos();
            return;
        }

        if (jTextFieldNomeSemente.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma semente");
            return;
        }

        if (jTextFieldMarcaSemente.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a marca da semente");
            return;
        }

        if (jTextFieldQuantidadeMinima.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade miníma de sacos de sementes");
            return;
        }

        if (jTextFieldQuantidadeEmSacos.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade de sacos de sementes");
            return;
        }

        Semente sementeAtualizada = new Semente();
        try {
            nomeSementeAtualizada = jTextFieldNomeSemente.getText();
            marcaSementeAtualizada = jTextFieldMarcaSemente.getText();
            quantidadeEmSacosAtualizada = Double.valueOf(jTextFieldQuantidadeEmSacos.getText());
            quantidadeMinimaAtualizada = Double.valueOf(jTextFieldQuantidadeMinima.getText());

            if (nomeSementeAtualizada.isBlank()) {
                JOptionPane.showMessageDialog(this, "Nome Inválido");
                return;
            }

            if (marcaSementeAtualizada.isBlank()) {
                JOptionPane.showMessageDialog(this, "Marca Inválida");
                return;
            }

            if (quantidadeEmSacosAtualizada < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade Inválida");
                return;
            }

            if (quantidadeMinimaAtualizada < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade minima Inválida");
                return;
            }

            sementeAtualizada.setNomeSemente(nomeSementeAtualizada);
            sementeAtualizada.setMarcaSemente(marcaSementeAtualizada);
            sementeAtualizada.setQuantidadeEmSacos(quantidadeEmSacosAtualizada);
            sementeAtualizada.setQuantidadeMinimaEmSacos(quantidadeMinimaAtualizada);
            sementeAtualizada.setIdSemente(idSemente);

            controleEstoque = new ControleEstoque();
            String msgAtualizacao = controleEstoque.atualizarSemente(sementeAtualizada);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            limparCampos(); 
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "As quantidades devem ser numerícas");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha ao cadastrar semente");
        }

    }

    private void limparCampos() {
        jTextFieldNomeSementeBuscada.setText("");
        jTextFieldMarcaSemente.setText("");
        jTextFieldNomeSemente.setText("");
        jTextFieldQuantidadeEmSacos.setText("");
        jTextFieldQuantidadeMinima.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarSemente;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonSairDaTelaEstoqueAtualizarCombustivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldMarcaSemente;
    private javax.swing.JTextField jTextFieldNomeSemente;
    private javax.swing.JTextField jTextFieldNomeSementeBuscada;
    private javax.swing.JTextField jTextFieldQuantidadeEmSacos;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
