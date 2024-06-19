package Propriedade;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoDePropriedade extends javax.swing.JFrame {

    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private String limparCampo = "";
    private String nomePropriedadeBuscada;
    private Double areaCovertidaAtualizada;
    private String nomePropriedadeAtualizada;
    private String localPropriedadeAtualizada;
    private String estadoPropriedadeAtualizada;
    private String cidadePropriedadeAtualizada;
    private String tipoCulturaAtualizada;
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
        jTextFieldNomePropriedadeBuscada = new javax.swing.JTextField();
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
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 130, 280, 45));

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
        getContentPane().add(jTextFieldNomePropriedadeBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 137, 305, 28));

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
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 266, 277, 28));

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
        getContentPane().add(jTextFieldAreaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 358, 278, 28));

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
        getContentPane().add(jTextFieldCulturaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 451, 278, 28));

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
        getContentPane().add(jTextFieldEstadoPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 266, 276, 28));

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
        getContentPane().add(jTextFieldCidadePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 359, 276, 28));

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
        getContentPane().add(jTextFieldLocalPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 451, 416, 28));

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
        getContentPane().add(jButtonConfirmarAtualizacaoDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 545, 282, 35));

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
        getContentPane().add(jButtonCancelarAtualizacaoDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 593, 280, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPropriedade/img_tela_de_atualizacao_de_propriedade.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, 660));

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

    private void jButtonCancelarAtualizacaoDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoDePropriedadeActionPerformed
        JOptionPane.showMessageDialog(null, "Atualização Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoDePropriedadeActionPerformed

    private void jButtonConfirmarAtualizacaoDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoDePropriedadeActionPerformed
        try {
            atualizarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDePropriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoDePropriedadeActionPerformed

    public void atualizarPropriedade() throws SQLException {
        if (jTextFieldNomePropriedadeBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Busque uma propriedade");
            return;
        }

        if (jTextFieldNomePropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da propriedade");
            return;
        }

        if (jTextFieldAreaPropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a area da propriedade");
            return;
        }

        if (jTextFieldLocalPropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o local da propriedade");
            return;
        }

        if (jTextFieldCidadePropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a cidade da propriedade");
            return;
        }

        if (jTextFieldEstadoPropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado(UF) da propriedade");
            return;
        }

        try {

            nomePropriedadeBuscada = jTextFieldNomePropriedadeBuscada.getText();
            areaCovertidaAtualizada = Double.valueOf(jTextFieldAreaPropriedade.getText());
            nomePropriedadeAtualizada = jTextFieldNomePropriedade.getText();
            localPropriedadeAtualizada = jTextFieldLocalPropriedade.getText();
            estadoPropriedadeAtualizada = jTextFieldEstadoPropriedade.getText();
            cidadePropriedadeAtualizada = jTextFieldCidadePropriedade.getText();
            tipoCulturaAtualizada = jTextFieldCulturaPropriedade.getText();

            if (nomePropriedadeAtualizada.isBlank()) {
                JOptionPane.showMessageDialog(null, "Nome Inválido");
                jTextFieldNomePropriedade.requestFocus();
                return;
            }

            if (localPropriedadeAtualizada.isBlank()) {
                JOptionPane.showMessageDialog(null, "Local Inválido");
                jTextFieldLocalPropriedade.requestFocus();
                return;
            }

            if (areaCovertidaAtualizada <= 0) {
                JOptionPane.showMessageDialog(null, "Area Inválida");
                return;
            }

            if (estadoPropriedadeAtualizada.isBlank()) {
                JOptionPane.showMessageDialog(null, "Estado Inválido, A ou I");
                jTextFieldEstadoPropriedade.requestFocus();
                return;
            }

            if (cidadePropriedadeAtualizada.isBlank()) {
                JOptionPane.showMessageDialog(null, "Cidade Inválida");
                jTextFieldCidadePropriedade.requestFocus();
                return;
            }

            if (tipoCulturaAtualizada.equalsIgnoreCase("soja") || tipoCulturaAtualizada.equalsIgnoreCase("milho")) {
                Propriedade propriedadeAtualizada = new Propriedade();
                propriedadeAtualizada.setNomePropriedade(nomePropriedadeAtualizada);
                propriedadeAtualizada.setLocalPropriedade(localPropriedadeAtualizada);
                propriedadeAtualizada.setAreaPropriedade(areaCovertidaAtualizada);
                propriedadeAtualizada.setTipoDeCulturaDaPropriedade(tipoCulturaAtualizada);
                propriedadeAtualizada.setEstado(estadoPropriedadeAtualizada);
                propriedadeAtualizada.setCidade(cidadePropriedadeAtualizada);
                propriedadeAtualizada.setIdPropriedade(idPropriedade);

                ControlePropriedade controlePropriedade1 = new ControlePropriedade();
                String msgAtualizacaoPropriedade = controlePropriedade1.atualizarPropriedade(propriedadeAtualizada);
                JOptionPane.showMessageDialog(null, msgAtualizacaoPropriedade);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Cultura Inválida, apenas: milho ou soja");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Área deve ser númerica");
        }

    }

    public void buscarPropriedade() throws SQLException {
        if (jTextFieldNomePropriedadeBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da propriedade");
            limparCampos();
            return;
        }

        String nomeParaBusca = jTextFieldNomePropriedadeBuscada.getText();
        Propriedade propriedadeEncontrada1 = controlePropriedade.buscarPropriedadePorNome(nomeParaBusca);

        if (propriedadeEncontrada1 != null) {

            Double areaPropriedadeDouble = propriedadeEncontrada1.getAreaPropriedade();
            String areaPropriedadeTexto = Double.toString(areaPropriedadeDouble);

            jTextFieldNomePropriedade.setText(propriedadeEncontrada1.getNomePropriedade());
            jTextFieldLocalPropriedade.setText(propriedadeEncontrada1.getLocalPropriedade());
            jTextFieldEstadoPropriedade.setText(propriedadeEncontrada1.getEstado());
            jTextFieldCidadePropriedade.setText(propriedadeEncontrada1.getCidade());
            jTextFieldCulturaPropriedade.setText(propriedadeEncontrada1.getTipoDeCulturaDaPropriedade());
            idPropriedade = propriedadeEncontrada1.getIdPropriedade();
            jTextFieldAreaPropriedade.setText(areaPropriedadeTexto);
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
            limparCampos();
        }
    }

    public void limparCampos() {
        jTextFieldAreaPropriedade.setText("");
        jTextFieldNomePropriedade.setText("");
        jTextFieldLocalPropriedade.setText("");
        jTextFieldEstadoPropriedade.setText("");
        jTextFieldCidadePropriedade.setText("");
        jTextFieldCulturaPropriedade.setText("");
        jTextFieldAreaPropriedade.setText("");
        jTextFieldNomePropriedadeBuscada.setText("");
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
    private javax.swing.JTextField jTextFieldLocalPropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedadeBuscada;
    // End of variables declaration//GEN-END:variables
}
