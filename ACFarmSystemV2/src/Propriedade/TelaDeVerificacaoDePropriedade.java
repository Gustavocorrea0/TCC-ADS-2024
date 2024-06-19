package Propriedade;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeVerificacaoDePropriedade extends javax.swing.JFrame {

    private ControlePropriedade controlePropriedade = new ControlePropriedade();

    public TelaDeVerificacaoDePropriedade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jTextFieldNomePropriedadeBuscada = new javax.swing.JTextField();
        jTextFieldAreaPropriedade = new javax.swing.JTextField();
        jTextFieldCulturaPropriedade = new javax.swing.JTextField();
        jTextFieldEstadoPropriedade = new javax.swing.JTextField();
        jTextFieldCidadePropriedade = new javax.swing.JTextField();
        jTextFieldLocalPropriedade = new javax.swing.JTextField();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 20, 35, 23));

        jTextFieldNomePropriedadeBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedadeBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedadeBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedadeBuscada.setBorder(null);
        jTextFieldNomePropriedadeBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedadeBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 138, 305, 29));

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
        getContentPane().add(jTextFieldAreaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 397, 278, 28));

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
        getContentPane().add(jTextFieldCulturaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 490, 278, 28));

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
        getContentPane().add(jTextFieldEstadoPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 305, 277, 28));

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
        getContentPane().add(jTextFieldCidadePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 398, 277, 28));

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
        getContentPane().add(jTextFieldLocalPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 489, 417, 29));

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
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 305, 277, 28));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 130, 284, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPropriedade/img_tela_de_verificacao_de_propriedade.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jTextFieldNomePropriedadeBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeBuscadaActionPerformed

    private void jTextFieldLocalPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocalPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldLocalPropriedadeActionPerformed

    private void jTextFieldCulturaPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCulturaPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldCulturaPropriedadeActionPerformed

    private void jTextFieldEstadoPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoPropriedadeActionPerformed

    private void jTextFieldCidadePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldCidadePropriedadeActionPerformed

    private void jTextFieldAreaPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldAreaPropriedadeActionPerformed

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeVerificacaoDePropriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

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
        jTextFieldNomePropriedade.setText("");
        jTextFieldLocalPropriedade.setText("");
        jTextFieldEstadoPropriedade.setText("");
        jTextFieldCidadePropriedade.setText("");
        jTextFieldCulturaPropriedade.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAreaPropriedade;
    private javax.swing.JTextField jTextFieldCidadePropriedade;
    private javax.swing.JTextField jTextFieldCulturaPropriedade;
    private javax.swing.JTextField jTextFieldEstadoPropriedade;
    private javax.swing.JTextField jTextFieldLocalPropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedadeBuscada;
    // End of variables declaration//GEN-END:variables
}
