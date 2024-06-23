package Subdivisao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoDeSubdivisao extends javax.swing.JFrame {

    public TelaDeAtualizacaoDeSubdivisao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoTipoDeCultura = new javax.swing.ButtonGroup();
        jTextFieldNomeSubdivisao = new javax.swing.JTextField();
        jTextFieldCulturaSubdivisao = new javax.swing.JTextField();
        jTextFieldNomeSubdivisaoBuscada = new javax.swing.JTextField();
        jTextFieldAreaSubdivisao = new javax.swing.JTextField();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jButtonBuscarSubdivisao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jLabelCadatroSubdivisao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeSubdivisao.setBorder(null);
        jTextFieldNomeSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 256, 277, 29));

        jTextFieldCulturaSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCulturaSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCulturaSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCulturaSubdivisao.setBorder(null);
        jTextFieldCulturaSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCulturaSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCulturaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 508, 277, 29));

        jTextFieldNomeSubdivisaoBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeSubdivisaoBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeSubdivisaoBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeSubdivisaoBuscada.setBorder(null);
        jTextFieldNomeSubdivisaoBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSubdivisaoBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeSubdivisaoBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 129, 305, 27));

        jTextFieldAreaSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAreaSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAreaSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAreaSubdivisao.setBorder(null);
        jTextFieldAreaSubdivisao.setSelectionColor(new java.awt.Color(153, 204, 255));
        jTextFieldAreaSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAreaSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAreaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 382, 277, 29));

        jButtonVoltarAoTelaDeUsuario.setBorder(null);
        jButtonVoltarAoTelaDeUsuario.setBorderPainted(false);
        jButtonVoltarAoTelaDeUsuario.setContentAreaFilled(false);
        jButtonVoltarAoTelaDeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoTelaDeUsuario.setDefaultCapable(false);
        jButtonVoltarAoTelaDeUsuario.setFocusPainted(false);
        jButtonVoltarAoTelaDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoTelaDeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 35, 24));

        jButtonBuscarSubdivisao.setBorder(null);
        jButtonBuscarSubdivisao.setContentAreaFilled(false);
        jButtonBuscarSubdivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 280, 45));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 593, 280, 36));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 544, 280, 36));

        jTextFieldNomePropriedade.setEditable(false);
        jTextFieldNomePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.setBorder(null);
        jTextFieldNomePropriedade.setSelectionColor(new java.awt.Color(153, 204, 255));
        jTextFieldNomePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 255, 278, 28));

        jLabelCadatroSubdivisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasSubdivisao/img_tela_de_atualizacao_subdivisao.png"))); // NOI18N
        jLabelCadatroSubdivisao.setText("jLabel1");
        getContentPane().add(jLabelCadatroSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ControleSubdivisao controleSubdivisao = new ControleSubdivisao();
    private String nomeSubdivisao;
    private int idSubdivisao;
    private String nomeSubdivisaoAtualizado;
    private String culturaSubdivisaoAtualizado;
    private Double areaConvertidaAtualizada;

    private void jTextFieldNomeSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSubdivisaoActionPerformed

    private void jTextFieldCulturaSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCulturaSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldCulturaSubdivisaoActionPerformed

    private void jTextFieldNomeSubdivisaoBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSubdivisaoBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSubdivisaoBuscadaActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jButtonBuscarSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarSubdivisaoActionPerformed
        try {
            buscarSubdivisao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDeSubdivisao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarSubdivisaoActionPerformed

    private void jTextFieldAreaSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldAreaSubdivisaoActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarSubdivisao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDeSubdivisao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    public void buscarSubdivisao() throws SQLException {
        if (jTextFieldNomeSubdivisaoBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da subdivisão");
            limparCampos();
            return;
        }

        nomeSubdivisao = jTextFieldNomeSubdivisaoBuscada.getText();
        Subdivisao subdivisaoEncontrada = controleSubdivisao.buscarSubdivisao(nomeSubdivisao);

        if (subdivisaoEncontrada != null) {
            String areaPropriedadeTexto = Double.toString(subdivisaoEncontrada.getAreaSubdivisao());
            jTextFieldNomeSubdivisao.setText(subdivisaoEncontrada.getNomeSubdivisao());
            jTextFieldCulturaSubdivisao.setText(subdivisaoEncontrada.getCulturaSubdivisao());
            jTextFieldNomePropriedade.setText(subdivisaoEncontrada.getNomePropriedade());
            jTextFieldAreaSubdivisao.setText(areaPropriedadeTexto);
            idSubdivisao = subdivisaoEncontrada.getIdPropriedade();
        } else {
            JOptionPane.showMessageDialog(this, "Subdivisão não encontrada.");
            limparCampos();
        }
    }

    public void limparCampos() {
        jTextFieldNomeSubdivisaoBuscada.setText("");
        jTextFieldAreaSubdivisao.setText("");
        jTextFieldNomeSubdivisao.setText("");
        jTextFieldCulturaSubdivisao.setText("");
        jTextFieldNomePropriedade.setText("");
    }

    public void atualizarSubdivisao() throws SQLException {
        if (jTextFieldNomeSubdivisaoBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma subdivisão");
            limparCampos();
            return;
        }
        
        if (jTextFieldNomeSubdivisao.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da subdivisão");
            return;
        }

        if (jTextFieldCulturaSubdivisao.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira uma cultura:\nMilho\nSoja");
            return;
        }

        if (jTextFieldAreaSubdivisao.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a area");
            return;
        }

        nomeSubdivisaoAtualizado = jTextFieldNomeSubdivisao.getText();
        culturaSubdivisaoAtualizado = jTextFieldCulturaSubdivisao.getText();
        
        try {
            areaConvertidaAtualizada = Double.valueOf(jTextFieldAreaSubdivisao.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A area da subdivisão é um valor numérico");
            return;
        }

        if (areaConvertidaAtualizada <= 0) {
            JOptionPane.showMessageDialog(null, "Area inválida");
            return;
        }

        String nomePropriedade = jTextFieldNomePropriedade.getText();
        
        if (culturaSubdivisaoAtualizado.equalsIgnoreCase("soja") || culturaSubdivisaoAtualizado.equalsIgnoreCase("milho")) {
            Subdivisao subdivisaoAtualizada = new Subdivisao();
            subdivisaoAtualizada.setNomeSubdivisao(nomeSubdivisaoAtualizado);
            subdivisaoAtualizada.setAreaSubdivisao(areaConvertidaAtualizada);
            subdivisaoAtualizada.setCulturaSubdivisao(culturaSubdivisaoAtualizado);
            subdivisaoAtualizada.setIdSubdivisao(idSubdivisao);
            subdivisaoAtualizada.setNomePropriedade(nomePropriedade);
            
            ControleSubdivisao controleSubdivisao1 = new ControleSubdivisao();
            String msgAtualizacao = controleSubdivisao1.atualizarSubdivisao(subdivisaoAtualizada);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Cultura Inválida, apenas:\nMilho\nSoja");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoTipoDeCultura;
    private javax.swing.JButton jButtonBuscarSubdivisao;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabelCadatroSubdivisao;
    private javax.swing.JTextField jTextFieldAreaSubdivisao;
    private javax.swing.JTextField jTextFieldCulturaSubdivisao;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldNomeSubdivisao;
    private javax.swing.JTextField jTextFieldNomeSubdivisaoBuscada;
    // End of variables declaration//GEN-END:variables
}
