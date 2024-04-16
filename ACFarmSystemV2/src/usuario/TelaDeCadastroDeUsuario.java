package usuario;

import java.util.HashSet;
import javax.swing.JOptionPane;
import org.jasypt.util.password.BasicPasswordEncryptor;

public class TelaDeCadastroDeUsuario extends javax.swing.JFrame {

    private ControleUsuario usuario = new ControleUsuario();
    private String nivelDeAcesso;
    private String nomeUsuario;
    private String senhaInserida;
    private String senhaCriptograda;
    private HashSet<String> senhasFracas = new HashSet<>();

    public TelaDeCadastroDeUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNivelDeAcesso = new javax.swing.ButtonGroup();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jPasswordSenhaDoUsuario = new javax.swing.JPasswordField();
        jButtonConfirmarCadastroDeUsuario1 = new javax.swing.JButton();
        jButtonCancelarCadastroDeUsuario = new javax.swing.JButton();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jComboBoxNivelDeAcesso = new javax.swing.JComboBox<>();
        jLabelIMGCadastroDeUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeUsuario.setBorder(null);
        jTextFieldNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 189, 306, 28));
        jTextFieldNomeUsuario.getAccessibleContext().setAccessibleName("");

        jPasswordSenhaDoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordSenhaDoUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordSenhaDoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordSenhaDoUsuario.setBorder(null);
        getContentPane().add(jPasswordSenhaDoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 341, 303, 28));

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
        getContentPane().add(jButtonConfirmarCadastroDeUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 512, 280, 35));

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
        getContentPane().add(jButtonCancelarCadastroDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 562, 280, 35));

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
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 40, 25));

        jComboBoxNivelDeAcesso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxNivelDeAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Master", "Comum" }));
        jComboBoxNivelDeAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNivelDeAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxNivelDeAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 200, -1));

        jLabelIMGCadastroDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasUsuario/img_tela_de_cadastro_de_usuario.png"))); // NOI18N
        getContentPane().add(jLabelIMGCadastroDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDeUsuarioActionPerformed
        jTextFieldNomeUsuario.setText("");
        jPasswordSenhaDoUsuario.setText("");
    }//GEN-LAST:event_jButtonCancelarCadastroDeUsuarioActionPerformed

    private void jButtonConfirmarCadastroDeUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeUsuario1ActionPerformed
        cadastrarUsuario();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeUsuario1ActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jTextFieldNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldNomeUsuarioActionPerformed

    private void jComboBoxNivelDeAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNivelDeAcessoActionPerformed

    }//GEN-LAST:event_jComboBoxNivelDeAcessoActionPerformed

    public void cadastrarUsuario() {
        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();

        nivelDeAcesso = jComboBoxNivelDeAcesso.getSelectedItem().toString();
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

        if (jPasswordSenhaDoUsuario.getText().equals("")) {
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

        if (jTextFieldNomeUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "A Senha não pode ser Validada");
            jTextFieldNomeUsuario.requestFocus();
            return;
        }

        if (botaoNivelDeAcesso.equals("")) {
            JOptionPane.showMessageDialog(null, "Adicione o nivel de Acesso");
            return;
        }

        nomeUsuario = jTextFieldNomeUsuario.getText();
        senhaCriptograda = passwordEncryptor.encryptPassword(senhaInserida);

        if (nivelDeAcesso.equals("Master")) {

            nivelDeAcesso = "M";
            usuario.usuario.setNome(nomeUsuario);
            usuario.usuario.setSenha(senhaCriptograda);
            usuario.usuario.setNivelDeAcesso(nivelDeAcesso);

            String msg = usuario.cadastrar(ControleUsuario.INCLUSAO);

            JOptionPane.showMessageDialog(this, msg);

            jTextFieldNomeUsuario.setText("");
            jPasswordSenhaDoUsuario.setText("");

        } else if (nivelDeAcesso.equals("Comum")) {

            nivelDeAcesso = "C";
            usuario.usuario.setNome(nomeUsuario);
            usuario.usuario.setSenha(senhaCriptograda);
            usuario.usuario.setNivelDeAcesso(nivelDeAcesso);

            String msg = usuario.cadastrar(ControleUsuario.INCLUSAO);

            JOptionPane.showMessageDialog(this, msg);

            jTextFieldNomeUsuario.setText("");
            jPasswordSenhaDoUsuario.setText("");

        } else if (nivelDeAcesso.equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Adicione o nivel de acesso");
            return;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoNivelDeAcesso;
    private javax.swing.JButton jButtonCancelarCadastroDeUsuario;
    private javax.swing.JButton jButtonConfirmarCadastroDeUsuario1;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JComboBox<String> jComboBoxNivelDeAcesso;
    private javax.swing.JLabel jLabelIMGCadastroDeUsuario;
    private javax.swing.JPasswordField jPasswordSenhaDoUsuario;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
