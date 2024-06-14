package acfarmsystemv2.telaDeInicio;

import java.util.HashSet;
import javax.swing.JOptionPane;
import org.jasypt.util.password.BasicPasswordEncryptor;
import usuario.ControleUsuario;

public class CadastrarUsuarioMaster1 extends javax.swing.JFrame {

    public CadastrarUsuarioMaster1() {
        initComponents();
    }

    public ControleUsuarioLogin controleUsuarioLogin = new ControleUsuarioLogin();
    private String nivelDeAcesso = "M";
    private String nomeUsuario;
    private String senhaInserida;
    private String senhaCriptograda;
    private HashSet<String> senhasFracas = new HashSet<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jPasswordSenhaDoUsuario = new javax.swing.JPasswordField();
        jButtonConfirmarCadastroDeUsuario1 = new javax.swing.JButton();
        jButtonCancelarCadastroDeUsuario = new javax.swing.JButton();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextFieldNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeUsuario.setBorder(null);
        jTextFieldNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 198, 448, 35));

        jPasswordSenhaDoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordSenhaDoUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPasswordSenhaDoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordSenhaDoUsuario.setBorder(null);
        getContentPane().add(jPasswordSenhaDoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 342, 443, 35));

        jButtonConfirmarCadastroDeUsuario1.setBorder(null);
        jButtonConfirmarCadastroDeUsuario1.setBorderPainted(false);
        jButtonConfirmarCadastroDeUsuario1.setContentAreaFilled(false);
        jButtonConfirmarCadastroDeUsuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDeUsuario1.setFocusPainted(false);
        jButtonConfirmarCadastroDeUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDeUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDeUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 462, 410, 54));

        jButtonCancelarCadastroDeUsuario.setBorder(null);
        jButtonCancelarCadastroDeUsuario.setBorderPainted(false);
        jButtonCancelarCadastroDeUsuario.setContentAreaFilled(false);
        jButtonCancelarCadastroDeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastroDeUsuario.setFocusable(false);
        jButtonCancelarCadastroDeUsuario.setRequestFocusEnabled(false);
        jButtonCancelarCadastroDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 535, 409, 50));

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
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_cadastro_master_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldNomeUsuarioActionPerformed

    private void jButtonConfirmarCadastroDeUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeUsuario1ActionPerformed
        cadastrarUsuarioMaster();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeUsuario1ActionPerformed

    private void jButtonCancelarCadastroDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDeUsuarioActionPerformed
        jTextFieldNomeUsuario.setText("");
        jPasswordSenhaDoUsuario.setText("");
    }//GEN-LAST:event_jButtonCancelarCadastroDeUsuarioActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    public void cadastrarUsuarioMaster() {
        nomeUsuario = jTextFieldNomeUsuario.getText();
        senhaInserida = new String(jPasswordSenhaDoUsuario.getPassword());

        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();

        senhaInserida = new String(jPasswordSenhaDoUsuario.getPassword());

        senhasFracas = new HashSet<>();

        senhasFracas.add("admin");
        senhasFracas.add("123456");
        senhasFracas.add("12345678");
        senhasFracas.add("102030");
        senhasFracas.add("12345");
        senhasFracas.add("gvt12345");
        senhasFracas.add("123mudar");
        senhasFracas.add("senha123");
        senhasFracas.add("142536");
        senhasFracas.add("********");
        senhasFracas.add("1234567890");

        if (jPasswordSenhaDoUsuario.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "A Senha não pode ser Validada");
            jPasswordSenhaDoUsuario.requestFocus();
            return;
        }

        if (jPasswordSenhaDoUsuario.getText().length() < 6) {
            JOptionPane.showMessageDialog(null, "A senha deve possuir no minimo 6 caracteres");
            jPasswordSenhaDoUsuario.requestFocus();
            return;
        }

        if (senhasFracas.contains(senhaInserida)) {
            JOptionPane.showMessageDialog(null, "Está senha é muito fraca");
            jPasswordSenhaDoUsuario.requestFocus();
            return;
        }

        if (jPasswordSenhaDoUsuario.getText().equals(jTextFieldNomeUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Os nome de usuario e senha são iguais");
            jPasswordSenhaDoUsuario.requestFocus();
            return;
        }

        if (jTextFieldNomeUsuario.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "A Senha não pode ser Validada");
            jTextFieldNomeUsuario.requestFocus();
            return;
        }

        nomeUsuario = jTextFieldNomeUsuario.getText();
        senhaCriptograda = passwordEncryptor.encryptPassword(senhaInserida);

        nivelDeAcesso = "M";
        controleUsuarioLogin.usuario.setNome(nomeUsuario);
        controleUsuarioLogin.usuario.setSenha(senhaCriptograda);
        controleUsuarioLogin.usuario.setNivelDeAcesso(nivelDeAcesso);

        String msg = controleUsuarioLogin.cadastrarPrimeiroUsuario(ControleUsuario.INCLUSAO);
        JOptionPane.showMessageDialog(this, msg);
        this.dispose();
        new TelaDeLogin().setVisible(true);

        jTextFieldNomeUsuario.setText("");
        jPasswordSenhaDoUsuario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCadastroDeUsuario;
    private javax.swing.JButton jButtonConfirmarCadastroDeUsuario1;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordSenhaDoUsuario;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
