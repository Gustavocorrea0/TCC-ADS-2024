package fornecedor;

import javax.swing.JOptionPane;

public class TelaDeCadastroFornecedor extends javax.swing.JFrame {

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
        jTextFieldCEPFornecedor = new javax.swing.JTextField();
        jTextFieldEstadoFornecedor = new javax.swing.JTextField();
        jTextFieldEnderecoFornecedor = new javax.swing.JTextField();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jTextFieldCidadeFornecedor = new javax.swing.JTextField();
        jButtonCancelarCadastro = new javax.swing.JButton();
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
        getContentPane().add(jTextFieldNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 222, 323, 29));

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
        getContentPane().add(jTextFieldCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 325, 270, 29));

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
        getContentPane().add(jTextFieldTelefoneFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 425, 270, 29));

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
        getContentPane().add(jTextFieldEmailFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 531, 366, 29));

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
        getContentPane().add(jTextFieldCEPFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 233, 29));

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
        getContentPane().add(jTextFieldEstadoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 222, 65, 29));

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
        getContentPane().add(jTextFieldEnderecoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 424, 407, 29));

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
        getContentPane().add(jTextFieldRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 120, 323, 29));

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
        getContentPane().add(jTextFieldCidadeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 324, 323, 29));

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 595, 280, 35));

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

    private void jTextFieldEstadoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoFornecedorActionPerformed

    private void jTextFieldEnderecoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldEnderecoFornecedorActionPerformed

    private void jTextFieldRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazaoSocialActionPerformed

    }//GEN-LAST:event_jTextFieldRazaoSocialActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        jTextFieldEstadoFornecedor.setText("");
        jTextFieldCNPJ.setText("");
        jTextFieldEstadoFornecedor.setText("");
        jTextFieldEmailFornecedor.setText("");
        jTextFieldEnderecoFornecedor.setText("");
        jTextFieldEstadoFornecedor.setText("");
        jTextFieldNomeFantasia.setText("");
        jTextFieldRazaoSocial.setText("");
        jTextFieldTelefoneFornecedor.setText("");
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        cadastrarFornecedor();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jTextFieldCEPFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCEPFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCEPFornecedorActionPerformed

    private void jTextFieldCidadeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeFornecedorActionPerformed

    public void cadastrarFornecedor() {
        cepNovoFornecedor = jTextFieldCEPFornecedor.getText();
        cnpjNovoFornecedor = jTextFieldCNPJ.getText();
        cidadeNovoFornecedor = jTextFieldCidadeFornecedor.getText();
        emailNovoFornecedor = jTextFieldEmailFornecedor.getText();
        enderecoNovoFornecedor = jTextFieldEnderecoFornecedor.getText();
        estadoNovoFornecedor = jTextFieldEstadoFornecedor.getText();
        nomeFantasiaNovoFornecedor = jTextFieldNomeFantasia.getText();
        razaoSocialNovoFornecedor = jTextFieldRazaoSocial.getText();
        telefoneNovoFornecedor = jTextFieldTelefoneFornecedor.getText();

        if (cepNovoFornecedor.length() != 8) {
            JOptionPane.showMessageDialog(null, "CEP Inválido, apenas 8 digitos");
            return;
        }

        if (cnpjNovoFornecedor.length() != 14) {
            JOptionPane.showMessageDialog(null, "CEP Inválido, apenas 14 digitos");
            return;
        }

        if (cidadeNovoFornecedor.equals("")) {
            JOptionPane.showMessageDialog(null, "Cidade Inválida");
            return;
        }

        if (emailNovoFornecedor.equals("")) {
            JOptionPane.showMessageDialog(null, "Email Inválido");
            return;
        }

        if (estadoNovoFornecedor.equals("")) {
            JOptionPane.showMessageDialog(null, "Estado Inválido");
            return;
        }

        if (nomeFantasiaNovoFornecedor.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Fantasia Inválido");
            return;
        }

        if (razaoSocialNovoFornecedor.equals("")) {
            JOptionPane.showMessageDialog(null, "Razao social Inválida");
            return;
        }

        if (telefoneNovoFornecedor.length() != 13) {
            JOptionPane.showMessageDialog(null, "Telefone Inválido");
            return;
        }

        if (enderecoNovoFornecedor.equals("")){
            JOptionPane.showMessageDialog(null, "Endereço Inválido");
            return;
        }
        
        try {
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
            
        } catch (NullPointerException ex) {
            System.out.println("Falha no sistema, tipo: ");
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
