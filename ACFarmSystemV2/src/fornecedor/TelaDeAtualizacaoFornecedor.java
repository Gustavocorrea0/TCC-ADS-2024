package fornecedor;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validacoes.ValidarCNPJ;

public class TelaDeAtualizacaoFornecedor extends javax.swing.JFrame {

    public TelaDeAtualizacaoFornecedor() {
        initComponents();
    }

    private String nomeBuscado;
    private ControleFornecedor controleFornecedor = new ControleFornecedor();

    private String cepAtualizadoFornecedor;
    private String cnpjAtualizadoFornecedor;
    private String cidadeAtualizadoFornecedor;
    private String emailAtualizadoFornecedor;
    private String enderecoAtualizadoFornecedor;
    private String estadoAtualizadoFornecedor;
    private String nomeFantasiaAtualizadoFornecedor;
    private String razaoSocialAtualizadoFornecedor;
    private String telefoneAtualizadoFornecedor;
    private int idFornecedor;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonBuscarFornecedor = new javax.swing.JButton();
        jTextFieldEstadoFornecedor = new javax.swing.JTextField();
        jTextFieldFornecedorBuscado = new javax.swing.JTextField();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jTextFieldTelefoneFornecedor = new javax.swing.JTextField();
        jTextFieldEmailFornecedor = new javax.swing.JTextField();
        jTextFieldEnderecoFornecedor = new javax.swing.JTextField();
        jTextFieldCidadeFornecedor = new javax.swing.JTextField();
        jTextFieldCEPFornecedor = new javax.swing.JTextField();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
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

        jButtonBuscarFornecedor.setBorder(null);
        jButtonBuscarFornecedor.setContentAreaFilled(false);
        jButtonBuscarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 107, 280, 44));

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
        getContentPane().add(jTextFieldEstadoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 314, 63, 29));

        jTextFieldFornecedorBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFornecedorBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldFornecedorBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFornecedorBuscado.setBorder(null);
        jTextFieldFornecedorBuscado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldFornecedorBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFornecedorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 115, 271, 29));

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
        getContentPane().add(jTextFieldRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 223, 321, 29));

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
        getContentPane().add(jTextFieldNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 314, 322, 29));

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
        getContentPane().add(jTextFieldCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 404, 319, 29));

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
        getContentPane().add(jTextFieldTelefoneFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 500, 320, 29));

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
        getContentPane().add(jTextFieldEmailFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 597, 366, 29));

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
        getContentPane().add(jTextFieldEnderecoFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 501, 407, 29));

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
        getContentPane().add(jTextFieldCidadeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 404, 323, 29));

        jTextFieldCEPFornecedor.setEditable(false);
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
        getContentPane().add(jTextFieldCEPFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 223, 232, 29));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 545, 280, 35));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 596, 280, 35));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasFornecedor/img_tela_de_atualizacao_fornecedor.png"))); // NOI18N
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

    private void jTextFieldFornecedorBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldFornecedorBuscadoActionPerformed

    private void jTextFieldCidadeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldCidadeFornecedorActionPerformed

    private void jTextFieldCEPFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCEPFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldCEPFornecedorActionPerformed

    private void jTextFieldRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazaoSocialActionPerformed

    }//GEN-LAST:event_jTextFieldRazaoSocialActionPerformed

    private void jTextFieldEnderecoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoFornecedorActionPerformed

    private void jButtonBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFornecedorActionPerformed
        try {
            buscarFornecedor();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFornecedorActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarFornecedor();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    private void jTextFieldEstadoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoFornecedorActionPerformed

    public void buscarFornecedor() throws SQLException {
        if (jTextFieldFornecedorBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do fornecedor");
            return;
        }

        nomeBuscado = jTextFieldFornecedorBuscado.getText();

        Fornecedor fornecedorEncontrado = controleFornecedor.buscarFornecedor(nomeBuscado);

        if (fornecedorEncontrado != null) {
            jTextFieldCEPFornecedor.setText(fornecedorEncontrado.getCepFornecedor());
            jTextFieldCNPJ.setText(fornecedorEncontrado.getCnpj());
            jTextFieldCidadeFornecedor.setText(fornecedorEncontrado.getCidadeFornecedor());
            jTextFieldEmailFornecedor.setText(fornecedorEncontrado.getEmailFornecedor());
            jTextFieldEnderecoFornecedor.setText(fornecedorEncontrado.getEnderecoFornecedor());
            jTextFieldEstadoFornecedor.setText(fornecedorEncontrado.getEstadoFornecedor());
            jTextFieldNomeFantasia.setText(fornecedorEncontrado.getNomeFantasia());
            jTextFieldRazaoSocial.setText(fornecedorEncontrado.getRazaoSocial());
            jTextFieldTelefoneFornecedor.setText(fornecedorEncontrado.getTelefoneFornecedor());
            idFornecedor = fornecedorEncontrado.getIdFornecedor();

        } else {
            JOptionPane.showMessageDialog(this, "Fornecedor não encontrado");
            limparCampos();
        }
    }

    public void atualizarFornecedor() throws SQLException {
        if (jTextFieldFornecedorBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque o fornecedor desejado");
            return;
        }

        cepAtualizadoFornecedor = jTextFieldCEPFornecedor.getText();
        cnpjAtualizadoFornecedor = jTextFieldCNPJ.getText();
        cidadeAtualizadoFornecedor = jTextFieldCidadeFornecedor.getText();
        emailAtualizadoFornecedor = jTextFieldEmailFornecedor.getText();
        enderecoAtualizadoFornecedor = jTextFieldEnderecoFornecedor.getText();
        estadoAtualizadoFornecedor = jTextFieldEstadoFornecedor.getText();
        nomeFantasiaAtualizadoFornecedor = jTextFieldNomeFantasia.getText();
        razaoSocialAtualizadoFornecedor = jTextFieldRazaoSocial.getText();
        telefoneAtualizadoFornecedor = jTextFieldTelefoneFornecedor.getText();

        if (razaoSocialAtualizadoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Razao social Inválida");
            return;
        }

        if (nomeFantasiaAtualizadoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Nome Fantasia Inválido");
            return;
        }

        if (!ValidarCNPJ.validaCNPJ(cnpjAtualizadoFornecedor)) {
            JOptionPane.showMessageDialog(null, "CNPJ Inválido(14 digitos)");
            return;
        }

        if (telefoneAtualizadoFornecedor.length() < 10 || telefoneAtualizadoFornecedor.length() > 15) {
            JOptionPane.showMessageDialog(null, "Telefone Inválido");
            return;
        }

        if (emailAtualizadoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Email Inválido");
            return;
        }

        if (enderecoAtualizadoFornecedor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Endereço Inválido");
            return;
        }

        Fornecedor fornecedorAtualizado = new Fornecedor();
        fornecedorAtualizado.setCepFornecedor(cepAtualizadoFornecedor);
        fornecedorAtualizado.setCidadeFornecedor(cidadeAtualizadoFornecedor);
        fornecedorAtualizado.setCnpj(cnpjAtualizadoFornecedor);
        fornecedorAtualizado.setEmailFornecedor(emailAtualizadoFornecedor);
        fornecedorAtualizado.setEnderecoFornecedor(enderecoAtualizadoFornecedor);
        fornecedorAtualizado.setEstadoFornecedor(estadoAtualizadoFornecedor);
        fornecedorAtualizado.setNomeFantasia(nomeFantasiaAtualizadoFornecedor);
        fornecedorAtualizado.setRazaoSocial(razaoSocialAtualizadoFornecedor);
        fornecedorAtualizado.setTelefoneFornecedor(telefoneAtualizadoFornecedor);
        fornecedorAtualizado.setIdFornecedor(idFornecedor);

        controleFornecedor = new ControleFornecedor();
        String msgAtualizacao = controleFornecedor.atualizarFornecedor(fornecedorAtualizado);
        JOptionPane.showMessageDialog(null, msgAtualizacao);
        limparCampos();
    }

    public void limparCampos() {
        jTextFieldFornecedorBuscado.setText("");
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
    private javax.swing.JButton jButtonBuscarFornecedor;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JTextField jTextFieldCEPFornecedor;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCidadeFornecedor;
    private javax.swing.JTextField jTextFieldEmailFornecedor;
    private javax.swing.JTextField jTextFieldEnderecoFornecedor;
    private javax.swing.JTextField jTextFieldEstadoFornecedor;
    private javax.swing.JTextField jTextFieldFornecedorBuscado;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables
}
