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
        jTextFieldIdSubdivisao = new javax.swing.JTextField();
        jTextFieldAreaSubdivisao = new javax.swing.JTextField();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jButtonBuscarSubdivisao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
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
        getContentPane().add(jTextFieldNomeSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 257, 276, 27));

        jTextFieldCulturaSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCulturaSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCulturaSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCulturaSubdivisao.setBorder(null);
        jTextFieldCulturaSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCulturaSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCulturaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 511, 277, 27));

        jTextFieldIdSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdSubdivisao.setBorder(null);
        jTextFieldIdSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 131, 304, 27));

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
        getContentPane().add(jTextFieldAreaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 384, 276, 27));

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
        getContentPane().add(jButtonBuscarSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 120, 260, 45));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 559, 280, 36));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 509, 280, 36));

        jLabelCadatroSubdivisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasSubdivisao/img_tela_de_atualizacao_subdivisao.png"))); // NOI18N
        jLabelCadatroSubdivisao.setText("jLabel1");
        getContentPane().add(jLabelCadatroSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ControleSubdivisao controleSubdivisao = new ControleSubdivisao();
    private String limparCampo;
    private String tipoDeCultura;
    private String cultura;
    private Double areaCovertida;
    private String nomeSubdivisao;
    private int idSubdivisao;

    private void jTextFieldNomeSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSubdivisaoActionPerformed

    private void jTextFieldCulturaSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCulturaSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldCulturaSubdivisaoActionPerformed

    private void jTextFieldIdSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldIdSubdivisaoActionPerformed

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
        jTextFieldIdSubdivisao.setText("");
        jTextFieldAreaSubdivisao.setText("");
        jTextFieldNomeSubdivisao.setText("");
        jTextFieldCulturaSubdivisao.setText("");
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarSubdivisao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDeSubdivisao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    public void buscarSubdivisao() throws SQLException {
        nomeSubdivisao = jTextFieldIdSubdivisao.getText();
        Subdivisao subdivisaoEncontrada = controleSubdivisao.buscarSubdivisao(nomeSubdivisao);

        if (subdivisaoEncontrada != null) {
            String areaPropriedadeTexto = Double.toString(subdivisaoEncontrada.getAreaSubdivisao());
            jTextFieldAreaSubdivisao.setText(areaPropriedadeTexto);
            jTextFieldNomeSubdivisao.setText(subdivisaoEncontrada.getNomeSubdivisao());
            jTextFieldCulturaSubdivisao.setText(subdivisaoEncontrada.getCulturaSubdivisao());
            idSubdivisao = subdivisaoEncontrada.getIdPropriedade();
        } else {
            JOptionPane.showMessageDialog(this, "Subdivisão não encontrada.");
            jTextFieldAreaSubdivisao.setText("");
            jTextFieldNomeSubdivisao.setText("");
            jTextFieldCulturaSubdivisao.setText("");
        }
    }

    public void atualizarSubdivisao() throws SQLException {
        String nomeSubdivisaoAtualizado = jTextFieldNomeSubdivisao.getText();
        String culturaSubdivisaoAtualizado = jTextFieldCulturaSubdivisao.getText();
        Double areaConvertidaAtualizada = Double.valueOf(jTextFieldAreaSubdivisao.getText());

        if (nomeSubdivisaoAtualizado.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (areaConvertidaAtualizada <= 0) {
            JOptionPane.showMessageDialog(null, "Area inválida");
            return;
        }

        if (culturaSubdivisaoAtualizado.equalsIgnoreCase("soja") || culturaSubdivisaoAtualizado.equals("milho")) {
            Subdivisao subdivisaoAtualizada = new Subdivisao();
            subdivisaoAtualizada.setIdSubdivisao(idSubdivisao);
            subdivisaoAtualizada.setNomeSubdivisao(nomeSubdivisaoAtualizado);
            subdivisaoAtualizada.setAreaSubdivisao(areaConvertidaAtualizada);
            subdivisaoAtualizada.setCulturaSubdivisao(culturaSubdivisaoAtualizado);
            ControleSubdivisao controleSubdivisao1 = new ControleSubdivisao();
            String msgAtualizacao = controleSubdivisao1.atualizarSubdivisao(subdivisaoAtualizada);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
        } else {
            JOptionPane.showMessageDialog(null, "Cultura Inválida");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoTipoDeCultura;
    private javax.swing.JButton jButtonBuscarSubdivisao;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonConfirmarRemocaoDePropriedade;
    private javax.swing.JButton jButtonConfirmarRemocaoDePropriedade1;
    private javax.swing.JButton jButtonConfirmarRemocaoDePropriedade2;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabelCadatroSubdivisao;
    private javax.swing.JTextField jTextFieldAreaSubdivisao;
    private javax.swing.JTextField jTextFieldCulturaSubdivisao;
    private javax.swing.JTextField jTextFieldIdSubdivisao;
    private javax.swing.JTextField jTextFieldNomeSubdivisao;
    // End of variables declaration//GEN-END:variables
}
