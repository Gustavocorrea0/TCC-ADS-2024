package usuario;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoDeUsuario extends javax.swing.JFrame {

    private ControleUsuario usuario = new ControleUsuario();

    private String nomeParaBusca;
    private int idUsuario;

    public TelaDeAtualizacaoDeUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscarIdUsuario = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jTextNomeBuscado = new javax.swing.JTextField();
        jTextNomeUsuario = new javax.swing.JTextField();
        jTextNivelDeAcesso = new javax.swing.JTextField();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscarIdUsuario.setToolTipText("");
        jButtonBuscarIdUsuario.setBorder(null);
        jButtonBuscarIdUsuario.setBorderPainted(false);
        jButtonBuscarIdUsuario.setContentAreaFilled(false);
        jButtonBuscarIdUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarIdUsuario.setFocusPainted(false);
        jButtonBuscarIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarIdUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 132, 260, 45));

        jButtonConfirmarAtualizacao.setToolTipText("");
        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setBorderPainted(false);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.setFocusPainted(false);
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 533, 280, 35));

        jButtonCancelarAtualizacao.setToolTipText("");
        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.setFocusPainted(false);
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 584, 280, 35));

        jTextNomeBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextNomeBuscado.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextNomeBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextNomeBuscado.setBorder(null);
        jTextNomeBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNomeBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 141, 304, 28));

        jTextNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextNomeUsuario.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextNomeUsuario.setBorder(null);
        getContentPane().add(jTextNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 275, 276, 28));

        jTextNivelDeAcesso.setBackground(new java.awt.Color(255, 255, 255));
        jTextNivelDeAcesso.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextNivelDeAcesso.setForeground(new java.awt.Color(0, 0, 0));
        jTextNivelDeAcesso.setBorder(null);
        getContentPane().add(jTextNivelDeAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 276, 274, 28));

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
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 21, 40, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasUsuario/img_tela_de_atualizacao_de_usuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarIdUsuarioActionPerformed
        try {
            buscarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoDeUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonBuscarIdUsuarioActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDeUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        jTextNomeUsuario.setText("");
        jTextNivelDeAcesso.setText("");
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jTextNomeBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeBuscadoActionPerformed

    }//GEN-LAST:event_jTextNomeBuscadoActionPerformed

    public void buscarUsuario() throws SQLException {
        nomeParaBusca = jTextNomeBuscado.getText();
        Usuario usuarioEncontrado = usuario.buscarUsuario(nomeParaBusca);

        if (usuarioEncontrado != null) {
            jTextNomeUsuario.setText(usuarioEncontrado.getNome());
            jTextNivelDeAcesso.setText(usuarioEncontrado.getNivelDeAcesso());
            idUsuario = usuarioEncontrado.getId(); //ERRO
        } else {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado.");
        }
    }

    public void atualizarUsuario() throws SQLException {
        nomeParaBusca = jTextNomeBuscado.getText();
        String novoNome = jTextNomeUsuario.getText();
        String novoNivelDeAcesso = jTextNivelDeAcesso.getText();

        if (novoNome.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (novoNivelDeAcesso.equalsIgnoreCase("M") || novoNivelDeAcesso.equalsIgnoreCase("C")) {
            Usuario usuarioAtualizado = new Usuario();
            usuarioAtualizado.setNome(novoNome);
            usuarioAtualizado.setNivelDeAcesso(novoNivelDeAcesso);
            usuarioAtualizado.setId(idUsuario);
            ControleUsuario controleUsuario = new ControleUsuario();
            String msgAtualizacao = controleUsuario.atualizarUsuario(usuarioAtualizado);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            
        } else {
            JOptionPane.showMessageDialog(null, "Nivel de acesso inválido, M para master e C para comun");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarIdUsuario;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextNivelDeAcesso;
    private javax.swing.JTextField jTextNomeBuscado;
    private javax.swing.JTextField jTextNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
