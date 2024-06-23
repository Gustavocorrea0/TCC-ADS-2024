package acfarmsystemv2.telaDeInicio;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jasypt.util.password.BasicPasswordEncryptor;
import usuario.Usuario;

public class TelaDeLogin extends javax.swing.JFrame {

    private ControleUsuarioLogin controleUsuario = new ControleUsuarioLogin();
    private Usuario usuarioEncontrado = new Usuario();
    private String nome;
    private String senha;
    private String senhaCriptografada;
    private boolean validaSenha;

    public TelaDeLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEntrar = new javax.swing.JButton();
        jTextNomeUsuario = new javax.swing.JTextField();
        jPasswordSenhaDoUsuario = new javax.swing.JPasswordField();
        jButtonEncerrarSistema = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEntrar.setBorder(null);
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.setFocusable(false);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jButtonEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 455, 408, 55));

        jTextNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextNomeUsuario.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextNomeUsuario.setBorder(null);
        jTextNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 242, 460, 50));

        jPasswordSenhaDoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordSenhaDoUsuario.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jPasswordSenhaDoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordSenhaDoUsuario.setBorder(null);
        getContentPane().add(jPasswordSenhaDoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 334, 460, 50));

        jButtonEncerrarSistema.setBorder(null);
        jButtonEncerrarSistema.setBorderPainted(false);
        jButtonEncerrarSistema.setContentAreaFilled(false);
        jButtonEncerrarSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEncerrarSistema.setFocusPainted(false);
        jButtonEncerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncerrarSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEncerrarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_tela_de_login_2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        try {
            executarLogin();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonEncerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncerrarSistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonEncerrarSistemaActionPerformed

    private void jTextNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeUsuarioActionPerformed

    }//GEN-LAST:event_jTextNomeUsuarioActionPerformed

    private void jButtonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEntrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                executarLogin();
            } catch (SQLException ex) {
                Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonEntrarKeyPressed

    public void executarLogin() throws SQLException {
        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
        nome = jTextNomeUsuario.getText();
        senha = jPasswordSenhaDoUsuario.getText();

        if (nome.isEmpty() && nome.isBlank()) {
            JOptionPane.showMessageDialog(null, "Nome inválido");
            jTextNomeUsuario.setText("");
            jPasswordSenhaDoUsuario.setText("");
            return;
        }

        usuarioEncontrado = controleUsuario.executarLogin(nome);

        if (usuarioEncontrado != null) {
            senhaCriptografada = usuarioEncontrado.getSenha();
            validaSenha = passwordEncryptor.checkPassword(senha, senhaCriptografada);

            if (validaSenha == false) {
                jTextNomeUsuario.setText("");
                jPasswordSenhaDoUsuario.setText("");
                JOptionPane.showMessageDialog(null, "Dados Inválidos");
                return;
            }

            if (validaSenha == true) {
                this.dispose();
                new TelaDeInicio().setVisible(true);
            }

        } else {
            jTextNomeUsuario.setText("");
            jPasswordSenhaDoUsuario.setText("");
            JOptionPane.showMessageDialog(null, "Dados Inválidos");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEncerrarSistema;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordSenhaDoUsuario;
    private javax.swing.JTextField jTextNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
