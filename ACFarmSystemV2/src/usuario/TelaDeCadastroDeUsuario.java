package usuario;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        jButtonConfirmarCadastroDeUsuario = new javax.swing.JButton();
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
        getContentPane().add(jTextFieldNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 189, 306, 29));
        jTextFieldNomeUsuario.getAccessibleContext().setAccessibleName("");

        jPasswordSenhaDoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordSenhaDoUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordSenhaDoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordSenhaDoUsuario.setBorder(null);
        jPasswordSenhaDoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordSenhaDoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordSenhaDoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 341, 305, 29));

        jButtonConfirmarCadastroDeUsuario.setBorder(null);
        jButtonConfirmarCadastroDeUsuario.setBorderPainted(false);
        jButtonConfirmarCadastroDeUsuario.setContentAreaFilled(false);
        jButtonConfirmarCadastroDeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDeUsuario.setFocusPainted(false);
        jButtonConfirmarCadastroDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 548, 283, 35));

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
        getContentPane().add(jButtonCancelarCadastroDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 597, 280, 36));

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
        getContentPane().add(jComboBoxNivelDeAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 250, -1));

        jLabelIMGCadastroDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasUsuario/img_tela_de_cadastro_de_usuario.png"))); // NOI18N
        getContentPane().add(jLabelIMGCadastroDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDeUsuarioActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroDeUsuarioActionPerformed

    private void jButtonConfirmarCadastroDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeUsuarioActionPerformed
        try {
            cadastrarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroDeUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarCadastroDeUsuarioActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jTextFieldNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldNomeUsuarioActionPerformed

    private void jComboBoxNivelDeAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNivelDeAcessoActionPerformed

    }//GEN-LAST:event_jComboBoxNivelDeAcessoActionPerformed

    private void jPasswordSenhaDoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordSenhaDoUsuarioActionPerformed

    }//GEN-LAST:event_jPasswordSenhaDoUsuarioActionPerformed

    public void cadastrarUsuario() throws SQLException {
        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();

        if (jTextFieldNomeUsuario.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome");
            return;
        }

        nivelDeAcesso = jComboBoxNivelDeAcesso.getSelectedItem().toString();
        senhaInserida = new String(jPasswordSenhaDoUsuario.getPassword());
        nomeUsuario = jTextFieldNomeUsuario.getText();
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

        if (senhaInserida.isBlank()) {
            JOptionPane.showMessageDialog(null, "A Senha não pode ser Validada");
            return;
        }

        if (senhaInserida.length() < 6) {
            JOptionPane.showMessageDialog(null, "A senha deve possuir no minimo 6 caracteres");
            return;
        }

        if (senhasFracas.contains(senhaInserida)) {
            JOptionPane.showMessageDialog(null, "Está senha é muito fraca");
            return;
        }

        if (jPasswordSenhaDoUsuario.getText().equals(jTextFieldNomeUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Nome de usuário e senha não devem ser iguais");
            return;
        }

        if (nomeUsuario.isBlank()) {
            JOptionPane.showMessageDialog(null, "O nome não é válido");
            return;
        }

        senhaCriptograda = passwordEncryptor.encryptPassword(senhaInserida);
        
        if (usuario.buscarUsuario(nomeUsuario) != null) {
            JOptionPane.showMessageDialog(null, "Este nome de usuário já existe");
            return;
        }
        
        if (nivelDeAcesso.equals("Master")) {
            nivelDeAcesso = "M";
            usuario.usuario.setNome(nomeUsuario);
            usuario.usuario.setSenha(senhaCriptograda);
            usuario.usuario.setNivelDeAcesso(nivelDeAcesso);

            String msg = usuario.cadastrar(ControleUsuario.INCLUSAO);

            JOptionPane.showMessageDialog(this, msg);

            limparCampos();

        } else if (nivelDeAcesso.equals("Comum")) {

            nivelDeAcesso = "C";
            usuario.usuario.setNome(nomeUsuario);
            usuario.usuario.setSenha(senhaCriptograda);
            usuario.usuario.setNivelDeAcesso(nivelDeAcesso);

            String msg = usuario.cadastrar(ControleUsuario.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();

        } else if (nivelDeAcesso.equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Adicione o nivel de acesso");
            return;
        }
    }

    public void limparCampos() {
        jTextFieldNomeUsuario.setText("");
        jPasswordSenhaDoUsuario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoNivelDeAcesso;
    private javax.swing.JButton jButtonCancelarCadastroDeUsuario;
    private javax.swing.JButton jButtonConfirmarCadastroDeUsuario;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JComboBox<String> jComboBoxNivelDeAcesso;
    private javax.swing.JLabel jLabelIMGCadastroDeUsuario;
    private javax.swing.JPasswordField jPasswordSenhaDoUsuario;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
