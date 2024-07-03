package cliente;

import buscarCEP.ViaCEP;
import buscarCEP.ViaCEPEvents;
import buscarCEP.ViaCEPException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validacoes.ValidarCNPJ;
import validacoes.ValidarCPF;

public class TelaDeCadastroCliente extends javax.swing.JFrame implements ViaCEPEvents {

    private ControleCliente controleCliente = new ControleCliente();
    private String nomeClienteNovo;
    private String cnpjOuCpfClienteNovo;
    private String cepClienteNovo;
    private String cidadeClienteNovo;
    private String estadoClienteNovo;
    private String enderecoClienteNovo;
    private String telefoneClienteNovo;
    private String tipoClienteNovo;
    private String msg;

    public TelaDeCadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoTipoCliente = new javax.swing.ButtonGroup();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jTextFieldCNPJOuCPF = new javax.swing.JTextField();
        jTextFieldCep = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jButtonBuscarCEP = new javax.swing.JButton();
        jComboBoxTipoCliente = new javax.swing.JComboBox<>();
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

        jTextFieldCNPJOuCPF.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCNPJOuCPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCNPJOuCPF.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCNPJOuCPF.setBorder(null);
        jTextFieldCNPJOuCPF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCNPJOuCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCNPJOuCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCNPJOuCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 243, 234, 29));

        jTextFieldCep.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCep.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCep.setBorder(null);
        jTextFieldCep.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCepActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 348, 322, 29));

        jTextFieldCidade.setEditable(false);
        jTextFieldCidade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCidade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCidade.setBorder(null);
        jTextFieldCidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 452, 322, 29));

        jTextFieldEstado.setEditable(false);
        jTextFieldEstado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstado.setBorder(null);
        jTextFieldEstado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 557, 322, 29));

        jTextFieldEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEndereco.setBorder(null);
        jTextFieldEndereco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 138, 402, 29));

        jTextFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTelefone.setBorder(null);
        jTextFieldTelefone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 243, 295, 29));

        jTextFieldNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCliente.setBorder(null);
        jTextFieldNomeCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 139, 325, 29));

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
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 545, 280, 35));

        jButtonBuscarCEP.setBorder(null);
        jButtonBuscarCEP.setContentAreaFilled(false);
        jButtonBuscarCEP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCEPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 344, 60, 35));

        jComboBoxTipoCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "cooperativa", "empresa", "pessoa" }));
        jComboBoxTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 300, 30));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasCliente/img_tela_cadastro_cliente.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioCliente().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jTextFieldCNPJOuCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCNPJOuCPFActionPerformed

    }//GEN-LAST:event_jTextFieldCNPJOuCPFActionPerformed

    private void jTextFieldCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCepActionPerformed

    }//GEN-LAST:event_jTextFieldCepActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed

    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed

    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jTextFieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeClienteActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        try {
            ValidarCliente();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed

    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jComboBoxTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoClienteActionPerformed

    }//GEN-LAST:event_jComboBoxTipoClienteActionPerformed

    private void jButtonBuscarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCEPActionPerformed
        ViaCEP viaCEP = new ViaCEP(this);
        String cep = jTextFieldCep.getText();

        if (cep.length() != 8) {
            jTextFieldEstado.setText("");
            jTextFieldCidade.setText("");
            JOptionPane.showMessageDialog(this, "CEP inválido, apenas 8 digitos(sem pontos)");
            return;
        }

        try {
            viaCEP.buscar(cep);
        } catch (ViaCEPException ex) {
            System.out.print("CEP INVÁLIDO");
        }
    }//GEN-LAST:event_jButtonBuscarCEPActionPerformed

    public void ValidarCliente() throws ParseException, SQLException {
        nomeClienteNovo = jTextFieldNomeCliente.getText();
        cnpjOuCpfClienteNovo = jTextFieldCNPJOuCPF.getText();
        cepClienteNovo = jTextFieldCep.getText();
        cidadeClienteNovo = jTextFieldCidade.getText();
        estadoClienteNovo = jTextFieldEstado.getText();
        enderecoClienteNovo = jTextFieldEndereco.getText();
        telefoneClienteNovo = jTextFieldTelefone.getText();

        tipoClienteNovo = jComboBoxTipoCliente.getSelectedItem().toString();

        if (nomeClienteNovo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (jTextFieldCep.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Adicione o cep, 8 digitos numéricos");
            return;
        }

        if (cepClienteNovo.length() != 8) {
            JOptionPane.showMessageDialog(null, "CEP Inválido, 8 digitos numéricos");
            return;
        }

        if (cidadeClienteNovo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Cidade Inválida");
            return;
        }

        if (enderecoClienteNovo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Endereço Inválido");
            return;
        }

        if (telefoneClienteNovo.length() < 10 || telefoneClienteNovo.length() > 15) {
            JOptionPane.showMessageDialog(null, "Telefone Inválido, deve possuir 14 digitos (ex: 5511933445566)");
            return;
        }

        switch (tipoClienteNovo.toLowerCase()) {
            case "pessoa":
                if (cnpjOuCpfClienteNovo.length() == 11) {

                    if (ValidarCPF.validaCPF(cnpjOuCpfClienteNovo)) {
                        cadastrarCliente();
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null, "CPF inválido");
                        return;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Se desejada cadastrar uma pessoa adicione um  CPF(11 digitos) sem pontos");
                    return;
                }

            case "cooperativa":
            case "empresa":
                if (cnpjOuCpfClienteNovo.length() == 14) {
                    if (ValidarCNPJ.validaCNPJ(cnpjOuCpfClienteNovo)) {
                        cadastrarCliente();
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null, "CNPJ inválido");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Se desejada cadastrar uma empresa ou cooperativa adicione um CNPJ(14 digitos) sem pontos");
                    return;
                }

            default:
                JOptionPane.showMessageDialog(null, "Adicione o tipo de Cliente");
                return;
        }

    }

    public void cadastrarCliente() throws SQLException {
        try {

            if (controleCliente.buscarCliente(nomeClienteNovo) != null) {
                JOptionPane.showMessageDialog(null, "Já existe um cliente com este nome");
                return;
            }

            controleCliente.cliente.setNomeCliente(nomeClienteNovo);
            controleCliente.cliente.setCnpjOuCpfCliente(cnpjOuCpfClienteNovo);
            controleCliente.cliente.setCepCliente(cepClienteNovo);
            controleCliente.cliente.setCidadeCliente(cidadeClienteNovo);
            controleCliente.cliente.setEstadoCliente(estadoClienteNovo);
            controleCliente.cliente.setEnderecoCliente(enderecoClienteNovo);
            controleCliente.cliente.setTelefoneCliente(telefoneClienteNovo);
            controleCliente.cliente.setTipoCliente(tipoClienteNovo);

            msg = controleCliente.cadastrarCliente(ControleCliente.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();

        } catch (NullPointerException ex) {
            System.out.println("Falha no sistema, tipo: ");
            ex.printStackTrace();
        }
    }

    public void limparCampos() {
        jTextFieldTelefone.setText("");
        jTextFieldCep.setText("");
        jTextFieldEstado.setText("");
        jTextFieldCNPJOuCPF.setText("");
        jTextFieldNomeCliente.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEndereco.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoTipoCliente;
    private javax.swing.JButton jButtonBuscarCEP;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JComboBox<String> jComboBoxTipoCliente;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JTextField jTextFieldCNPJOuCPF;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onCEPSuccess(ViaCEP cep) {
        jTextFieldEstado.setText(cep.getUf());
        jTextFieldCidade.setText(cep.getLocalidade());
    }

    @Override
    public void onCEPError(String cep) {
        jTextFieldEstado.setText("");
        jTextFieldCidade.setText("");
        JOptionPane.showMessageDialog(this, "CEP inválido");
    }
}
