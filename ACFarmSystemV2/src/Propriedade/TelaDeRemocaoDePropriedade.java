package Propriedade;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeRemocaoDePropriedade extends javax.swing.JFrame {

    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private String limparCampo = "";
    private String nomePropriedadeBuscada;
    private String mensagemPropriedade;

    public TelaDeRemocaoDePropriedade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jTextFieldNomePropriedadeBuscada = new javax.swing.JTextField();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jTextFieldAreaPropriedade = new javax.swing.JTextField();
        jTextFieldCulturaPropriedade = new javax.swing.JTextField();
        jTextFieldEstadoPropriedade = new javax.swing.JTextField();
        jTextFieldCidadePropriedade = new javax.swing.JTextField();
        jTextFieldLocalPropriedade = new javax.swing.JTextField();
        jButtonConfirmarRemocaoDePropriedade = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jLabelFundoRemoverPropriedade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 23, 35, 24));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 134, 282, 45));

        jTextFieldNomePropriedadeBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedadeBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedadeBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedadeBuscada.setBorder(null);
        jTextFieldNomePropriedadeBuscada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedadeBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedadeBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 141, 305, 29));

        jTextFieldNomePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.setBorder(null);
        jTextFieldNomePropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 308, 277, 28));

        jTextFieldAreaPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAreaPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAreaPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAreaPropriedade.setBorder(null);
        jTextFieldAreaPropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAreaPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAreaPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAreaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 401, 278, 28));

        jTextFieldCulturaPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCulturaPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCulturaPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCulturaPropriedade.setBorder(null);
        jTextFieldCulturaPropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCulturaPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCulturaPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCulturaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 493, 278, 28));

        jTextFieldEstadoPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoPropriedade.setBorder(null);
        jTextFieldEstadoPropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 308, 277, 28));

        jTextFieldCidadePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCidadePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCidadePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCidadePropriedade.setBorder(null);
        jTextFieldCidadePropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCidadePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidadePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 402, 276, 28));

        jTextFieldLocalPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLocalPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldLocalPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLocalPropriedade.setBorder(null);
        jTextFieldLocalPropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldLocalPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLocalPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLocalPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 493, 416, 28));

        jButtonConfirmarRemocaoDePropriedade.setToolTipText("");
        jButtonConfirmarRemocaoDePropriedade.setBorder(null);
        jButtonConfirmarRemocaoDePropriedade.setBorderPainted(false);
        jButtonConfirmarRemocaoDePropriedade.setContentAreaFilled(false);
        jButtonConfirmarRemocaoDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocaoDePropriedade.setFocusPainted(false);
        jButtonConfirmarRemocaoDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocaoDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 550, 280, 35));

        jButtonCancelarRemocao.setToolTipText("");
        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.setFocusPainted(false);
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 598, 280, 36));

        jLabelFundoRemoverPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPropriedade/img_tela_de_remocao_de_propriedade.png"))); // NOI18N
        getContentPane().add(jLabelFundoRemoverPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoDePropriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jTextFieldLocalPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocalPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldLocalPropriedadeActionPerformed

    private void jTextFieldNomePropriedadeBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeBuscadaActionPerformed

    private void jTextFieldAreaPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldAreaPropriedadeActionPerformed

    private void jTextFieldCulturaPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCulturaPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldCulturaPropriedadeActionPerformed

    private void jTextFieldEstadoPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoPropriedadeActionPerformed

    private void jTextFieldCidadePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldCidadePropriedadeActionPerformed

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoção Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    private void jButtonConfirmarRemocaoDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoDePropriedadeActionPerformed
        removerPropriedade();
    }//GEN-LAST:event_jButtonConfirmarRemocaoDePropriedadeActionPerformed

    public void removerPropriedade() {
        if (jTextFieldNomePropriedadeBuscada.getText().isBlank() || jTextFieldNomePropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma propriedade");
            limparCampos();
            return;
        }

        nomePropriedadeBuscada = jTextFieldNomePropriedadeBuscada.getText();
        mensagemPropriedade = controlePropriedade.removerPropriedadePorNome(nomePropriedadeBuscada);
        JOptionPane.showMessageDialog(this, mensagemPropriedade);
    }

    public void buscarPropriedade() throws SQLException {
        if (jTextFieldNomePropriedadeBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da propriedade");
            limparCampos();
            return;
        }

        String nomeParaBusca = jTextFieldNomePropriedadeBuscada.getText();
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(nomeParaBusca);

        if (propriedadeEncontrada != null) {

            Double areaPropriedadeDouble = propriedadeEncontrada.getAreaPropriedade();
            String areaPropriedadeTexto = Double.toString(areaPropriedadeDouble);

            jTextFieldNomePropriedade.setText(propriedadeEncontrada.getNomePropriedade());
            jTextFieldLocalPropriedade.setText(propriedadeEncontrada.getLocalPropriedade());
            jTextFieldEstadoPropriedade.setText(propriedadeEncontrada.getEstado());
            jTextFieldCidadePropriedade.setText(propriedadeEncontrada.getCidade());
            jTextFieldCulturaPropriedade.setText(propriedadeEncontrada.getTipoDeCulturaDaPropriedade());
            jTextFieldAreaPropriedade.setText(areaPropriedadeTexto);

            jTextFieldAreaPropriedade.setEnabled(false);
            jTextFieldNomePropriedade.setEnabled(false);
            jTextFieldLocalPropriedade.setEnabled(false);
            jTextFieldEstadoPropriedade.setEnabled(false);
            jTextFieldCidadePropriedade.setEnabled(false);
            jTextFieldCulturaPropriedade.setEnabled(false);
            jTextFieldAreaPropriedade.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldAreaPropriedade.setText("");
        jTextFieldCidadePropriedade.setText("");
        jTextFieldCulturaPropriedade.setText("");
        jTextFieldNomePropriedadeBuscada.setText("");
        jTextFieldLocalPropriedade.setText("");
        jTextFieldNomePropriedade.setText("");
        jTextFieldEstadoPropriedade.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocaoDePropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabelFundoRemoverPropriedade;
    private javax.swing.JTextField jTextFieldAreaPropriedade;
    private javax.swing.JTextField jTextFieldCidadePropriedade;
    private javax.swing.JTextField jTextFieldCulturaPropriedade;
    private javax.swing.JTextField jTextFieldEstadoPropriedade;
    private javax.swing.JTextField jTextFieldLocalPropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedadeBuscada;
    // End of variables declaration//GEN-END:variables
}
