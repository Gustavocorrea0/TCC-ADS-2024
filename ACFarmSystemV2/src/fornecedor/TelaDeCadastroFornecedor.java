package fornecedor;

import buscarCEP.ViaCEP;
import buscarCEP.ViaCEPEvents;
import buscarCEP.ViaCEPException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validacoes.ValidarCNPJ;

public class TelaDeCadastroFornecedor extends javax.swing.JFrame implements ViaCEPEvents {

    public TelaDeCadastroFornecedor() {
        initComponents();
    }

    private ControleFornecedor controleFornecedor = new ControleFornecedor();

    private String cepNovoFornecedor;
    private String cnpjNovoFornecedor;
    private String cidadeNovoFornecedor;
    private String emailNovoFornecedor;
    private String enderecoNovoFornecedor;
    private String estadoNovoFornecedor;
    private String nomeFantasiaNovoFornecedor;
    private String razaoSocialNovoFornecedor;
    private String telefoneNovoFornecedor;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoInicio = new javax.swing.JButton();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jTextFieldTelefoneFornecedor = new javax.swing.JTextField();
        jTextFieldEmailFornecedor = new javax.swing.JTextField();
        jTextFieldEstadoFornecedor = new javax.swing.JTextField();
        jTextFieldCEPFornecedor = new javax.swing.JTextField();
        jTextFieldEnderecoFornecedor = new javax.swing.JTextField();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jTextFieldCidadeFornecedor = new javax.swing.JTextField();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonBuscarCEP = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jLabelIMGTelaInicialFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 25));

        jTextFieldNomeFantasia.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFantasia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeFantasia.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFantasia.setBorder(null);
        jTextFieldNomeFantasia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFantasiaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 221, 322, 29));

        jTextFieldCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCNPJ.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCNPJ.setBorder(null);
        jTextFieldCNPJ.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCNPJActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 323, 270, 29));

        jTextFieldTelefoneFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelefoneFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldTelefoneFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTelefoneFornecedor.setBorder(null);
        jTextFieldTelefoneFornecedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTelefoneFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefoneFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 423, 270, 29));

        jTextFieldEmailFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmailFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEmailFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEmailFornecedor.setBorder(null);
        jTextFieldEmailFornecedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEmailFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmailFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 529, 366, 29));

        jTextFieldEstadoFornecedor.setEditable(false);
        jTextFieldEstadoFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoFornecedor.setBorder(null);
        jTextFieldEstadoFornecedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 221, 110, 29));

        jTextFieldCEPFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCEPFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCEPFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCEPFornecedor.setBorder(null);
        jTextFieldCEPFornecedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCEPFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCEPFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCEPFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 118, 231, 29));

        jTextFieldEnderecoFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEnderecoFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEnderecoFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEnderecoFornecedor.setBorder(null);
        jTextFieldEnderecoFornecedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEnderecoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEnderecoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 423, 407, 29));

        jTextFieldRazaoSocial.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldRazaoSocial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldRazaoSocial.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldRazaoSocial.setBorder(null);
        jTextFieldRazaoSocial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRazaoSocialActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 118, 323, 29));

        jTextFieldCidadeFornecedor.setEditable(false);
        jTextFieldCidadeFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCidadeFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCidadeFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCidadeFornecedor.setBorder(null);
        jTextFieldCidadeFornecedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCidadeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidadeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 323, 322, 29));

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 592, 280, 36));

        jButtonBuscarCEP.setBorder(null);
        jButtonBuscarCEP.setContentAreaFilled(false);
        jButtonBuscarCEP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCEPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 112, 60, 40));

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 544, 280, 35));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasFornecedor/img_tela_de_cadastro_de_fornecedor.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jTextFieldNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFantasiaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeFantasiaActionPerformed

    private void jTextFieldCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCNPJActionPerformed

    }//GEN-LAST:event_jTextFieldCNPJActionPerformed

    private void jTextFieldTelefoneFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldTelefoneFornecedorActionPerformed

    private void jTextFieldEmailFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldEmailFornecedorActionPerformed

    private void jTextFieldEnderecoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldEnderecoFornecedorActionPerformed

    private void jTextFieldRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazaoSocialActionPerformed

    }//GEN-LAST:event_jTextFieldRazaoSocialActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonBuscarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCEPActionPerformed
        buscarCEP();
    }//GEN-LAST:event_jButtonBuscarCEPActionPerformed

    private void jTextFieldCEPFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCEPFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldCEPFornecedorActionPerformed

    private void jTextFieldCidadeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldCidadeFornecedorActionPerformed

    private void jTextFieldEstadoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoFornecedorActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        try {
            cadastrarFornecedor();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    @Override
    public void onCEPSuccess(ViaCEP cep) {
        jTextFieldEstadoFornecedor.setText(cep.getUf());
        jTextFieldCidadeFornecedor.setText(cep.getLocalidade());
    }

    @Override
    public void onCEPError(String cep) {
        JOptionPane.showMessageDialog(this, "CEP inválido");
    }

    public void buscarCEP() {
        ViaCEP viaCEP = new ViaCEP(this);
        String cep = jTextFieldCEPFornecedor.getText();

        if (cep.length() != 8) {
            JOptionPane.showMessageDialog(this, "CEP inválido apenas números");
            return;
        }

        try {
            viaCEP.buscar(cep);
        } catch (ViaCEPException ex) {
            System.out.print("CEP INVÁLIDO");
        }
    }

    public void cadastrarFornecedor() throws SQLException {
        cepNovoFornecedor = jTextFieldCEPFornecedor.getText();
        cnpjNovoFornecedor = jTextFieldCNPJ.getText();
        estadoNovoFornecedor = jTextFieldEstadoFornecedor.getText();
        emailNovoFornecedor = jTextFieldEmailFornecedor.getText();
        enderecoNovoFornecedor = jTextFieldEnderecoFornecedor.getText();
        cidadeNovoFornecedor = jTextFieldCidadeFornecedor.getText();
        nomeFantasiaNovoFornecedor = jTextFieldNomeFantasia.getText();
        razaoSocialNovoFornecedor = jTextFieldRazaoSocial.getText();
        telefoneNovoFornecedor = jTextFieldTelefoneFornecedor.getText();

        if (razaoSocialNovoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Razao social Inválida");
            return;
        }

        if (nomeFantasiaNovoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Nome Fantasia Inválido");
            return;
        }

        if (cnpjNovoFornecedor.length() != 14) {
            JOptionPane.showMessageDialog(null, "CNPJ Inválido, apenas 14 digitos (não utilize pontos)");
            return;
        }

        if (!ValidarCNPJ.validaCNPJ(cnpjNovoFornecedor)) {
            JOptionPane.showMessageDialog(null, "CNPJ Inválido");
            return;
        }

        if (telefoneNovoFornecedor.length() < 10 || telefoneNovoFornecedor.length() > 15) {
            JOptionPane.showMessageDialog(null, "Telefone Inválido");
            return;
        }

        if (emailNovoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Email Inválido");
            return;
        }

        if (cepNovoFornecedor.length() != 8) {
            JOptionPane.showMessageDialog(this, "CEP inválido, 8 digitos");
            return;
        }

        if (cidadeNovoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Cidade Inválida");
            return;
        }

        if (estadoNovoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Estado Inválido");
            return;
        }

        if (enderecoNovoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Endereço Inválido");
            return;
        }

        try {
            if (controleFornecedor.buscarFornecedor(nomeFantasiaNovoFornecedor) != null) {
                JOptionPane.showMessageDialog(this, "Já existe um fornecedor com este nome");
                return;
            }

            controleFornecedor.fornecedor.setCepFornecedor(cepNovoFornecedor);
            controleFornecedor.fornecedor.setCidadeFornecedor(cidadeNovoFornecedor);
            controleFornecedor.fornecedor.setCnpj(cnpjNovoFornecedor);
            controleFornecedor.fornecedor.setEmailFornecedor(emailNovoFornecedor);
            controleFornecedor.fornecedor.setEnderecoFornecedor(enderecoNovoFornecedor);
            controleFornecedor.fornecedor.setEstadoFornecedor(estadoNovoFornecedor);
            controleFornecedor.fornecedor.setNomeFantasia(nomeFantasiaNovoFornecedor);
            controleFornecedor.fornecedor.setRazaoSocial(razaoSocialNovoFornecedor);
            controleFornecedor.fornecedor.setTelefoneFornecedor(telefoneNovoFornecedor);

            String msg = controleFornecedor.cadastrarFornecedor(ControleFornecedor.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();

        } catch (NullPointerException ex) {
            System.out.println("Falha no sistema, tipo: ");
            ex.printStackTrace();
        }
    }

    public void limparCampos() {
        jTextFieldCEPFornecedor.setText("");
        jTextFieldCNPJ.setText("");
        jTextFieldCidadeFornecedor.setText("");
        jTextFieldEmailFornecedor.setText("");
        jTextFieldEnderecoFornecedor.setText("");
        jTextFieldEstadoFornecedor.setText("");
        jTextFieldNomeFantasia.setText("");
        jTextFieldRazaoSocial.setText("");
        jTextFieldTelefoneFornecedor.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarCEP;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JTextField jTextFieldCEPFornecedor;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCidadeFornecedor;
    private javax.swing.JTextField jTextFieldEmailFornecedor;
    private javax.swing.JTextField jTextFieldEnderecoFornecedor;
    private javax.swing.JTextField jTextFieldEstadoFornecedor;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables

}
