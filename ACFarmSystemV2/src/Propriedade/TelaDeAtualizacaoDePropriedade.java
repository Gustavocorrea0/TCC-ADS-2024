package Propriedade;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaDeAtualizacaoDePropriedade extends javax.swing.JFrame {

    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private String limparCampo = "";
    private String nomePropriedadeBuscada;
    private Double areaCovertidaNova;
    private String nomePropriedadeNova;
    private String localPropriedadeNova;
    private String estadoPropriedadeNova;
    private String cidadePropriedadeNova;
    private String novoTipoCultura;
    private int idPropriedade;
    private Propriedade propriedadeEncontrada;


    public TelaDeAtualizacaoDePropriedade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jTextFieldIdPropriedade = new javax.swing.JTextField();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jTextFieldAreaPropriedade = new javax.swing.JTextField();
        jTextFieldCulturaPropriedade = new javax.swing.JTextField();
        jTextFieldEstadoPropriedade = new javax.swing.JTextField();
        jTextFieldCidadePropriedade = new javax.swing.JTextField();
        jTextFieldLocalPropriedade = new javax.swing.JTextField();
        jButtonConfirmarAtualizacaoDePropriedade = new javax.swing.JButton();
        jButtonCancelarAtualizacaoDePropriedade = new javax.swing.JButton();
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
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 23, 35, 24));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 134, 260, 45));

        jTextFieldIdPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdPropriedade.setBorder(null);
        jTextFieldIdPropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldIdPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 142, 300, 28));

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
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 265, 276, 28));

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
        getContentPane().add(jTextFieldAreaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 358, 276, 28));

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
        getContentPane().add(jTextFieldCulturaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 276, 28));

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
        getContentPane().add(jTextFieldEstadoPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 265, 276, 28));

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
        getContentPane().add(jTextFieldCidadePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 359, 276, 28));

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
        getContentPane().add(jTextFieldLocalPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 415, 28));

        jButtonConfirmarAtualizacaoDePropriedade.setToolTipText("");
        jButtonConfirmarAtualizacaoDePropriedade.setBorder(null);
        jButtonConfirmarAtualizacaoDePropriedade.setBorderPainted(false);
        jButtonConfirmarAtualizacaoDePropriedade.setContentAreaFilled(false);
        jButtonConfirmarAtualizacaoDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacaoDePropriedade.setFocusPainted(false);
        jButtonConfirmarAtualizacaoDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacaoDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 532, 280, 35));

        jButtonCancelarAtualizacaoDePropriedade.setToolTipText("");
        jButtonCancelarAtualizacaoDePropriedade.setBorder(null);
        jButtonCancelarAtualizacaoDePropriedade.setBorderPainted(false);
        jButtonCancelarAtualizacaoDePropriedade.setContentAreaFilled(false);
        jButtonCancelarAtualizacaoDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacaoDePropriedade.setFocusPainted(false);
        jButtonCancelarAtualizacaoDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacaoDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 583, 280, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPropriedade/img_tela_de_atualizacao_de_propriedade.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

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
            Logger.getLogger(TelaDeAtualizacaoDePropriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jTextFieldLocalPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocalPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldLocalPropriedadeActionPerformed

    private void jTextFieldIdPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldIdPropriedadeActionPerformed

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

    private void jButtonCancelarAtualizacaoDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoDePropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDePropriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCancelarAtualizacaoDePropriedadeActionPerformed

    private void jButtonConfirmarAtualizacaoDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoDePropriedadeActionPerformed
        try {
            atualizarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDePropriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoDePropriedadeActionPerformed

    public void atualizarPropriedade() throws SQLException {
        nomePropriedadeBuscada = jTextFieldIdPropriedade.getText();
        areaCovertidaNova = Double.parseDouble(jTextFieldAreaPropriedade.getText());
        nomePropriedadeNova = jTextFieldNomePropriedade.getText();
        localPropriedadeNova = jTextFieldLocalPropriedade.getText();
        estadoPropriedadeNova = jTextFieldEstadoPropriedade.getText();
        cidadePropriedadeNova = jTextFieldCidadePropriedade.getText();
        novoTipoCultura = jTextFieldCulturaPropriedade.getText();

        if (nomePropriedadeNova.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            jTextFieldNomePropriedade.requestFocus();
            return;
        }

        if (localPropriedadeNova.equals("")) {
            JOptionPane.showMessageDialog(null, "Local Inválido");
            jTextFieldLocalPropriedade.requestFocus();
            return;
        }

        if (areaCovertidaNova <= 0) {
            JOptionPane.showMessageDialog(null, "Area Inválida");
            return;
        }

        if (estadoPropriedadeNova.equals("")) {
            JOptionPane.showMessageDialog(null, "Estado Inválido, A ou I");
            jTextFieldEstadoPropriedade.requestFocus();
            return;
        }

        if (cidadePropriedadeNova.equals("")) {
            JOptionPane.showMessageDialog(null, "Cidade Inválida");
            jTextFieldCidadePropriedade.requestFocus();
            return;
        }

        if (novoTipoCultura.equalsIgnoreCase("soja") || novoTipoCultura.equalsIgnoreCase("milho")) {
            Propriedade propriedadeAtualizada = new Propriedade();
            propriedadeAtualizada.setNomePropriedade(nomePropriedadeNova);
            propriedadeAtualizada.setLocalPropriedade(localPropriedadeNova);
            propriedadeAtualizada.setAreaPropriedade(areaCovertidaNova);
            propriedadeAtualizada.setTipoDeCulturaDaPropriedade(novoTipoCultura);
            propriedadeAtualizada.setEstado(estadoPropriedadeNova);
            propriedadeAtualizada.setCidade(cidadePropriedadeNova);
            propriedadeAtualizada.setIdPropriedade(idPropriedade);

            ControlePropriedade controlePropriedade1 = new ControlePropriedade();
            String msgAtualizacaoPropriedade = controlePropriedade1.atualizarPropriedade(propriedadeAtualizada);
            JOptionPane.showMessageDialog(null, msgAtualizacaoPropriedade);

        } else {
            JOptionPane.showMessageDialog(null, "Cultura Inválida, apenas: milho ou milho");
        }

    }

    public void buscarPropriedade() throws SQLException {
        String NomeParaBuscaPropriedade = jTextFieldIdPropriedade.getText();
        propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(NomeParaBuscaPropriedade);

        if (propriedadeEncontrada != null) {
            Double areaPropriedadeDouble = propriedadeEncontrada.getAreaPropriedade();
            String areaPropriedadeTexto = Double.toString(areaPropriedadeDouble);

            jTextFieldNomePropriedade.setText(propriedadeEncontrada.getNomePropriedade());
            jTextFieldLocalPropriedade.setText(propriedadeEncontrada.getLocalPropriedade());
            jTextFieldEstadoPropriedade.setText(propriedadeEncontrada.getEstado());
            jTextFieldCidadePropriedade.setText(propriedadeEncontrada.getCidade());
            jTextFieldCulturaPropriedade.setText(propriedadeEncontrada.getTipoDeCulturaDaPropriedade());
            jTextFieldAreaPropriedade.setText(areaPropriedadeTexto);
            idPropriedade = propriedadeEncontrada.getIdPropriedade();
            
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarAtualizacaoDePropriedade;
    private javax.swing.JButton jButtonConfirmarAtualizacaoDePropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAreaPropriedade;
    private javax.swing.JTextField jTextFieldCidadePropriedade;
    private javax.swing.JTextField jTextFieldCulturaPropriedade;
    private javax.swing.JTextField jTextFieldEstadoPropriedade;
    private javax.swing.JTextField jTextFieldIdPropriedade;
    private javax.swing.JTextField jTextFieldLocalPropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    // End of variables declaration//GEN-END:variables
}
