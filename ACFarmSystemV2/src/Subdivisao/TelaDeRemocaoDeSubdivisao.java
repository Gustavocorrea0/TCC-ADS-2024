package Subdivisao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeRemocaoDeSubdivisao extends javax.swing.JFrame {

    public TelaDeRemocaoDeSubdivisao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoTipoDeCultura = new javax.swing.ButtonGroup();
        jTextFieldNomeSubdivisao = new javax.swing.JTextField();
        jTextFieldCulturaSubdivisao = new javax.swing.JTextField();
        jTextFieldNomeBuscaSubdivisao = new javax.swing.JTextField();
        jTextFieldAreaSubdivisao = new javax.swing.JTextField();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jButtonBuscarSubdivisao = new javax.swing.JButton();
        jButtonCancelarSubdivisao = new javax.swing.JButton();
        jButtonRemoverSubdivisao = new javax.swing.JButton();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jLabelCadatroPropriedade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeSubdivisao.setEditable(false);
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

        jTextFieldCulturaSubdivisao.setEditable(false);
        jTextFieldCulturaSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCulturaSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCulturaSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCulturaSubdivisao.setBorder(null);
        jTextFieldCulturaSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCulturaSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCulturaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 510, 275, 28));

        jTextFieldNomeBuscaSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeBuscaSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeBuscaSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeBuscaSubdivisao.setBorder(null);
        jTextFieldNomeBuscaSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeBuscaSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeBuscaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 131, 304, 28));

        jTextFieldAreaSubdivisao.setEditable(false);
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
        getContentPane().add(jTextFieldAreaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 384, 276, 28));

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

        jButtonCancelarSubdivisao.setBorder(null);
        jButtonCancelarSubdivisao.setContentAreaFilled(false);
        jButtonCancelarSubdivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 560, 280, 36));

        jButtonRemoverSubdivisao.setBorder(null);
        jButtonRemoverSubdivisao.setContentAreaFilled(false);
        jButtonRemoverSubdivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 508, 280, 36));

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
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 256, 276, 28));

        jLabelCadatroPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasSubdivisao/img_tela_de_remocao_subdivisao.png"))); // NOI18N
        jLabelCadatroPropriedade.setText("jLabel1");
        getContentPane().add(jLabelCadatroPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ControleSubdivisao controleSubdivisao = new ControleSubdivisao();
    private String msg1;
    private String nomeSubdivisao;

    private void jTextFieldNomeSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSubdivisaoActionPerformed

    private void jTextFieldCulturaSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCulturaSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldCulturaSubdivisaoActionPerformed

    private void jTextFieldNomeBuscaSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeBuscaSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeBuscaSubdivisaoActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jButtonBuscarSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarSubdivisaoActionPerformed
        try {
            buscarSubdivisao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoDeSubdivisao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarSubdivisaoActionPerformed

    private void jTextFieldAreaSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldAreaSubdivisaoActionPerformed

    private void jButtonRemoverSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverSubdivisaoActionPerformed
        removerSubdivisao();
    }//GEN-LAST:event_jButtonRemoverSubdivisaoActionPerformed

    private void jButtonCancelarSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarSubdivisaoActionPerformed
        jTextFieldNomeBuscaSubdivisao.setText("");
        jTextFieldAreaSubdivisao.setText("");
        jTextFieldNomeSubdivisao.setText("");
        jTextFieldCulturaSubdivisao.setText("");
    }//GEN-LAST:event_jButtonCancelarSubdivisaoActionPerformed

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    public void removerSubdivisao() {
        nomeSubdivisao = jTextFieldNomeBuscaSubdivisao.getText();
        msg1 = controleSubdivisao.removerSubdivisao(nomeSubdivisao);
        JOptionPane.showMessageDialog(this, msg1);
        jTextFieldAreaSubdivisao.setText("");
        jTextFieldNomeSubdivisao.setText("");
        jTextFieldCulturaSubdivisao.setText("");
        jTextFieldNomePropriedade.setText("");
    }

    public void buscarSubdivisao() throws SQLException {
        nomeSubdivisao = jTextFieldNomeBuscaSubdivisao.getText();
        Subdivisao subdivisaoEncontrada = controleSubdivisao.buscarSubdivisao(nomeSubdivisao);

        if (subdivisaoEncontrada != null) {
            String areaPropriedadeTexto = Double.toString(subdivisaoEncontrada.getAreaSubdivisao());
            jTextFieldAreaSubdivisao.setText(areaPropriedadeTexto);
            jTextFieldNomeSubdivisao.setText(subdivisaoEncontrada.getNomeSubdivisao());
            jTextFieldCulturaSubdivisao.setText(subdivisaoEncontrada.getCulturaSubdivisao());
            jTextFieldNomePropriedade.setText(subdivisaoEncontrada.getNomePropriedade());
        } else {
            JOptionPane.showMessageDialog(this, "Subdivisão não encontrada.");
            limparCampos();
        }
    }

    public void limparCampos() {
        jTextFieldAreaSubdivisao.setText("");
        jTextFieldNomeSubdivisao.setText("");
        jTextFieldCulturaSubdivisao.setText("");
        jTextFieldNomePropriedade.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoTipoDeCultura;
    private javax.swing.JButton jButtonBuscarSubdivisao;
    private javax.swing.JButton jButtonCancelarSubdivisao;
    private javax.swing.JButton jButtonRemoverSubdivisao;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabelCadatroPropriedade;
    private javax.swing.JTextField jTextFieldAreaSubdivisao;
    private javax.swing.JTextField jTextFieldCulturaSubdivisao;
    private javax.swing.JTextField jTextFieldNomeBuscaSubdivisao;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldNomeSubdivisao;
    // End of variables declaration//GEN-END:variables
}
