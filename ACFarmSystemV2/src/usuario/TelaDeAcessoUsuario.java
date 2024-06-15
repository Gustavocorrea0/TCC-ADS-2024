package usuario;

import acfarmsystemv2.telaDeInicio.TelaDeInicio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jasypt.util.password.BasicPasswordEncryptor;
import usuario.Usuario;

public class TelaDeAcessoUsuario extends javax.swing.JFrame {

    private ControleUsuario controleUsuario = new ControleUsuario();
    private Usuario usuarioEncontrado = new Usuario();
    private String nome;
    private String senha;
    private String senhaCriptografada;
    private boolean validaSenha;
    private String nivelDeAcesso;

    public TelaDeAcessoUsuario() {
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
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 415, 405, 55));

        jTextNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextNomeUsuario.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jTextNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextNomeUsuario.setBorder(null);
        jTextNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 215, 405, 45));

        jPasswordSenhaDoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordSenhaDoUsuario.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jPasswordSenhaDoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordSenhaDoUsuario.setBorder(null);
        getContentPane().add(jPasswordSenhaDoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 300, 405, 45));

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
        getContentPane().add(jButtonEncerrarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 20, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasUsuario/img_tela_de_acesso_usuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        try {
            executarLogin();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAcessoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonEncerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncerrarSistemaActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonEncerrarSistemaActionPerformed

    private void jTextNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeUsuarioActionPerformed

    }//GEN-LAST:event_jTextNomeUsuarioActionPerformed

    public void executarLogin() throws SQLException {
        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
        nome = jTextNomeUsuario.getText();
        senha = jPasswordSenhaDoUsuario.getText();

        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome inválido");
        }

        usuarioEncontrado = controleUsuario.executarLogin(nome);

        if (usuarioEncontrado != null) {
            senhaCriptografada = usuarioEncontrado.getSenha();
            nivelDeAcesso = usuarioEncontrado.getNivelDeAcesso();

            validaSenha = passwordEncryptor.checkPassword(senha, senhaCriptografada);

            if (validaSenha == false) {
                jTextNomeUsuario.setText("");
                jPasswordSenhaDoUsuario.setText("");
                JOptionPane.showMessageDialog(null, "Dados Inválidos");
            } else {
                if (nivelDeAcesso.equalsIgnoreCase("C")) {
                    JOptionPane.showMessageDialog(null, "Nível de Acesso ínválido");
                } else if (nivelDeAcesso.equalsIgnoreCase("M")) {
                    this.dispose();
                    new TelaDeInicioUsuario().setVisible(true);
                }

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
