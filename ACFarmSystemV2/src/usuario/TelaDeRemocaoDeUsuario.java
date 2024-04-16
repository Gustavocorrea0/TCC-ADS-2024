package usuario;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeRemocaoDeUsuario extends javax.swing.JFrame {

    private ControleUsuario usuario = new ControleUsuario();
    private int idUsuario;

    public TelaDeRemocaoDeUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscarUsuario = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jTextNivelDeAcesso = new javax.swing.JTextField();
        jTextIDBuscado = new javax.swing.JTextField();
        jTextNomeUsuario = new javax.swing.JTextField();
        jLabelIMGUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscarUsuario.setToolTipText("");
        jButtonBuscarUsuario.setBorder(null);
        jButtonBuscarUsuario.setBorderPainted(false);
        jButtonBuscarUsuario.setContentAreaFilled(false);
        jButtonBuscarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarUsuario.setFocusPainted(false);
        jButtonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 128, 260, 45));

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
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 588, 280, 35));

        jButtonConfirmarRemocao.setToolTipText("");
        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.setFocusPainted(false);
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 537, 280, 35));

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
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 20, 38, 29));

        jTextNivelDeAcesso.setBackground(new java.awt.Color(255, 255, 255));
        jTextNivelDeAcesso.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextNivelDeAcesso.setForeground(new java.awt.Color(0, 0, 0));
        jTextNivelDeAcesso.setBorder(null);
        getContentPane().add(jTextNivelDeAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 278, 278, 28));

        jTextIDBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextIDBuscado.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextIDBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextIDBuscado.setBorder(null);
        getContentPane().add(jTextIDBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 143, 304, 28));

        jTextNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextNomeUsuario.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextNomeUsuario.setBorder(null);
        getContentPane().add(jTextNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 278, 305, 28));

        jLabelIMGUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasUsuario/img_tela_de_remocao_de_usuario.png"))); // NOI18N
        getContentPane().add(jLabelIMGUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuarioActionPerformed
        try {
            buscarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoDeUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarUsuarioActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        jTextNomeUsuario.setText("");
        jTextNivelDeAcesso.setText("");
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerUsuario();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    public void buscarUsuario() throws SQLException {
        String nomeParaBusca = jTextIDBuscado.getText();
        Usuario usuarioEncontrado = usuario.buscarUsuario(nomeParaBusca);

        if (usuarioEncontrado != null) {
            jTextNomeUsuario.setText(usuarioEncontrado.getNome());
            jTextNivelDeAcesso.setText(usuarioEncontrado.getNivelDeAcesso());

        } else {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado.");
        }
    }

    public void removerUsuario() {
        String nomeParaRemover = jTextIDBuscado.getText();
        String mensagem = usuario.removerUsuarioPorNome(nomeParaRemover);
        JOptionPane.showMessageDialog(this, mensagem);

        jTextIDBuscado.setText("");
        jTextNivelDeAcesso.setText("");
        jTextNomeUsuario.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabelIMGUsuario;
    private javax.swing.JTextField jTextIDBuscado;
    private javax.swing.JTextField jTextNivelDeAcesso;
    private javax.swing.JTextField jTextNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
