package Subdivisao;

import Propriedade.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeCadastroDeSubdivisao extends javax.swing.JFrame {

    public TelaDeCadastroDeSubdivisao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoTipoDeCultura = new javax.swing.ButtonGroup();
        jButtonCancelarCadastroDePropriedade = new javax.swing.JButton();
        jButtonConfirmarCadastroDePropriedade = new javax.swing.JButton();
        jTextFieldNomeSubdivisao = new javax.swing.JTextField();
        jTextFieldAreaSubdivisao = new javax.swing.JTextField();
        jTextFieldIdPropriedade = new javax.swing.JTextField();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jRadioCulturaSoja = new javax.swing.JRadioButton();
        jRadioCulturaMilho = new javax.swing.JRadioButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jLabelCadatroPropriedade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarCadastroDePropriedade.setBorder(null);
        jButtonCancelarCadastroDePropriedade.setContentAreaFilled(false);
        jButtonCancelarCadastroDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastroDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 571, 280, 36));

        jButtonConfirmarCadastroDePropriedade.setBorder(null);
        jButtonConfirmarCadastroDePropriedade.setContentAreaFilled(false);
        jButtonConfirmarCadastroDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 280, 36));

        jTextFieldNomeSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeSubdivisao.setBorder(null);
        jTextFieldNomeSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 256, 276, 29));

        jTextFieldAreaSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAreaSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAreaSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAreaSubdivisao.setBorder(null);
        jTextFieldAreaSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAreaSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAreaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 384, 275, 28));

        jTextFieldIdPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdPropriedade.setBorder(null);
        jTextFieldIdPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 131, 304, 28));

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

        jRadioCulturaSoja.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioCulturaSoja.setForeground(new java.awt.Color(255, 255, 255));
        jRadioCulturaSoja.setText("Soja");
        jRadioCulturaSoja.setBorder(null);
        jRadioCulturaSoja.setContentAreaFilled(false);
        jRadioCulturaSoja.setFocusable(false);
        jRadioCulturaSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCulturaSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioCulturaSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 120, 20));

        jRadioCulturaMilho.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioCulturaMilho.setForeground(new java.awt.Color(255, 255, 255));
        jRadioCulturaMilho.setText("Milho");
        jRadioCulturaMilho.setBorder(null);
        jRadioCulturaMilho.setContentAreaFilled(false);
        jRadioCulturaMilho.setFocusable(false);
        jRadioCulturaMilho.setRequestFocusEnabled(false);
        jRadioCulturaMilho.setRolloverEnabled(false);
        jRadioCulturaMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCulturaMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioCulturaMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, 20));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 120, 260, 45));

        jLabelCadatroPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasSubdivisao/img_tela_de_cadastro_subdivisao.png"))); // NOI18N
        jLabelCadatroPropriedade.setText("jLabel1");
        getContentPane().add(jLabelCadatroPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private ControleSubdivisao controleSubdivisao = new ControleSubdivisao();
    private String limparCampo;
    private String tipoDeCultura;
    private String cultura;
    private Double areaCovertida;
    private String nomeSubdivisao;
    private int idPropriedadeEncontrada;

    private void jButtonCancelarCadastroDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDePropriedadeActionPerformed
        jTextFieldAreaSubdivisao.setText(limparCampo);
        jTextFieldNomeSubdivisao.setText(limparCampo);
        jTextFieldIdPropriedade.setText(limparCampo);
    }//GEN-LAST:event_jButtonCancelarCadastroDePropriedadeActionPerformed

    private void jTextFieldNomeSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSubdivisaoActionPerformed

    private void jTextFieldAreaSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldAreaSubdivisaoActionPerformed

    private void jTextFieldIdPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldIdPropriedadeActionPerformed

    private void jButtonConfirmarCadastroDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDePropriedadeActionPerformed
        cadastrarSubdivisao();
    }//GEN-LAST:event_jButtonConfirmarCadastroDePropriedadeActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose(); //Fechar tela
        new TelaDeInicioSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jRadioCulturaSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCulturaSojaActionPerformed
        cultura = "soja";
    }//GEN-LAST:event_jRadioCulturaSojaActionPerformed

    private void jRadioCulturaMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCulturaMilhoActionPerformed
        cultura = "milho";
    }//GEN-LAST:event_jRadioCulturaMilhoActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroDeSubdivisao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    public void buscarPropriedade() throws SQLException {
        String nomeBuscaPropriedade = jTextFieldIdPropriedade.getText();
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(nomeBuscaPropriedade);
        idPropriedadeEncontrada = propriedadeEncontrada.getIdPropriedade();

        if (propriedadeEncontrada != null) {
            JOptionPane.showMessageDialog(this, "Propriedade encontrada.");
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
        }
    }

    public void cadastrarSubdivisao() {
        int idPropriedade = Integer.parseInt(jTextFieldIdPropriedade.getText());
        botaoTipoDeCultura.add(jRadioCulturaMilho);
        botaoTipoDeCultura.add(jRadioCulturaSoja);
        areaCovertida = Double.valueOf(jTextFieldAreaSubdivisao.getText());
        tipoDeCultura = cultura;
        nomeSubdivisao = jTextFieldNomeSubdivisao.getText();

        if (idPropriedade <= 0) {
            JOptionPane.showMessageDialog(null, "Area Inválida");
            return;
        }

        if (nomeSubdivisao.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            jTextFieldIdPropriedade.requestFocus();
            return;
        }

        if (areaCovertida <= 0) {
            JOptionPane.showMessageDialog(null, "Area Inválida");
            return;
        }

        if (botaoTipoDeCultura.equals("")) {
            JOptionPane.showMessageDialog(null, "Adicione o nivel de Acesso");
        }

        if (botaoTipoDeCultura.equals(jRadioCulturaMilho) && botaoTipoDeCultura.equals(jRadioCulturaSoja)) {
            JOptionPane.showMessageDialog(null, "Escolha apenas uma cultura");
        }

        controleSubdivisao.subdivisao.setNomeSubdivisao(nomeSubdivisao);
        controleSubdivisao.subdivisao.setAreaSubdivisao(areaCovertida);
        controleSubdivisao.subdivisao.setCulturaSubdivisao(cultura);
        controleSubdivisao.subdivisao.setIdPropriedade(idPropriedade);
        String msg = controleSubdivisao.cadastrarSubdivisao(ControleSubdivisao.INCLUSAO);

        JOptionPane.showMessageDialog(this, msg);

        jTextFieldAreaSubdivisao.setText(limparCampo);
        jTextFieldNomeSubdivisao.setText(limparCampo);
        jTextFieldIdPropriedade.setText(limparCampo);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoTipoDeCultura;
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarCadastroDePropriedade;
    private javax.swing.JButton jButtonConfirmarCadastroDePropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabelCadatroPropriedade;
    private javax.swing.JRadioButton jRadioCulturaMilho;
    private javax.swing.JRadioButton jRadioCulturaSoja;
    private javax.swing.JTextField jTextFieldAreaSubdivisao;
    private javax.swing.JTextField jTextFieldIdPropriedade;
    private javax.swing.JTextField jTextFieldNomeSubdivisao;
    // End of variables declaration//GEN-END:variables
}
