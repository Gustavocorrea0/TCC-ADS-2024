package cliente;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validacoes.ValidarCNPJ;
import validacoes.ValidarCPF;

public class TelaDeAtualizacaoCliente extends javax.swing.JFrame {

    public TelaDeAtualizacaoCliente() {
        initComponents();
    }

    private String nomeBuscado;
    private ControleCliente controleCliente = new ControleCliente();
    private String msg;

    private String nomeClienteAtualizado;
    private String cnpjOuCpfClienteAtualizado;
    private String cepClienteAtualizado;
    private String cidadeClienteAtualizado;
    private String estadoClienteAtualizado;
    private String enderecoClienteAtualizado;
    private String telefoneClienteAtualizado;
    private String tipoClienteAtualizado;
    private int idClienteAtualizado;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonBuscarFornecedor = new javax.swing.JButton();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldCNPJOuCPF = new javax.swing.JTextField();
        jTextFieldCEP = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldClienteBuscado = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jButtonValidarRemocao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
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
        getContentPane().add(jButtonBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 107, 280, 44));

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
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 225, 420, 29));

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
        getContentPane().add(jTextFieldCNPJOuCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 315, 237, 29));

        jTextFieldCEP.setEditable(false);
        jTextFieldCEP.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCEP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCEP.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCEP.setBorder(null);
        jTextFieldCEP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCEPActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 406, 320, 29));

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
        getContentPane().add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 496, 320, 29));

        jTextFieldClienteBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldClienteBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldClienteBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldClienteBuscado.setBorder(null);
        jTextFieldClienteBuscado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldClienteBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldClienteBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 114, 270, 30));

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
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 315, 320, 29));

        jTextFieldTipo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldTipo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTipo.setBorder(null);
        jTextFieldTipo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 406, 320, 29));

        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setBorder(null);
        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 224, 323, 30));

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
        getContentPane().add(jTextFieldEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 586, 319, 30));

        jButtonValidarRemocao.setBorder(null);
        jButtonValidarRemocao.setContentAreaFilled(false);
        jButtonValidarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonValidarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonValidarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 545, 280, 35));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 595, 280, 35));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasCliente/img_tela_atualizar_cliente.png"))); // NOI18N
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

    private void jTextFieldCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCEPActionPerformed

    }//GEN-LAST:event_jTextFieldCEPActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed

    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldClienteBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldClienteBuscadoActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed

    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jTextFieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoActionPerformed

    }//GEN-LAST:event_jTextFieldTipoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jButtonBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFornecedorActionPerformed
        try {
            buscarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFornecedorActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed

    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jButtonValidarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarRemocaoActionPerformed
        try {
            validarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonValidarRemocaoActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(null, "Atualização cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void buscarCliente() throws SQLException {
        if (jTextFieldClienteBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do cliente para a busca");
            return;
        }

        nomeBuscado = jTextFieldClienteBuscado.getText();

        Cliente clienteEncontrado = controleCliente.buscarCliente(nomeBuscado);

        if (clienteEncontrado != null) {
            jTextFieldEstado.setText(clienteEncontrado.getEstadoCliente());
            jTextFieldCEP.setText(clienteEncontrado.getCepCliente());
            jTextFieldTelefone.setText(clienteEncontrado.getTelefoneCliente());
            jTextFieldTipo.setText(clienteEncontrado.getTipoCliente());
            jTextFieldEndereco.setText(clienteEncontrado.getEnderecoCliente());
            jTextFieldCNPJOuCPF.setText(clienteEncontrado.getCnpjOuCpfCliente());
            jTextFieldNome.setText(clienteEncontrado.getNomeCliente());
            jTextFieldCidade.setText(clienteEncontrado.getCidadeCliente());
            idClienteAtualizado = clienteEncontrado.getIdCliente();
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
            limparCampos();
        }
    }

    public void validarCliente() throws SQLException {
        if (jTextFieldClienteBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Busque um cliente");
            return;
        }

        nomeClienteAtualizado = jTextFieldNome.getText();
        cnpjOuCpfClienteAtualizado = jTextFieldCNPJOuCPF.getText();
        cepClienteAtualizado = jTextFieldCEP.getText();
        cidadeClienteAtualizado = jTextFieldCidade.getText();
        estadoClienteAtualizado = jTextFieldEstado.getText();
        enderecoClienteAtualizado = jTextFieldEndereco.getText();
        telefoneClienteAtualizado = jTextFieldTelefone.getText();
        tipoClienteAtualizado = jTextFieldTipo.getText();

        if (nomeClienteAtualizado.isBlank()) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (cidadeClienteAtualizado.isBlank()) {
            JOptionPane.showMessageDialog(null, "Cidade Inválida");
            return;
        }

        if (enderecoClienteAtualizado.isBlank()) {
            JOptionPane.showMessageDialog(null, "Endereço Inválido");
            return;
        }

        if (telefoneClienteAtualizado.length() < 10 || telefoneClienteAtualizado.length() > 15) {
            JOptionPane.showMessageDialog(null, "Telefone Inválido");
            return;
        }

        if (cepClienteAtualizado.length() != 8) {
            JOptionPane.showMessageDialog(null, "CEP Inválido, 8 digitos sem pontos");
            return;
        }

        switch (tipoClienteAtualizado.toLowerCase()) {
            case "pessoa":
                if (cnpjOuCpfClienteAtualizado.length() == 11) {

                    if (ValidarCPF.validaCPF(cnpjOuCpfClienteAtualizado)) {
                        atualizarCliente();
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null, "CPF inválido");
                        return;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Se desejada atualizar uma pessoa adicione um  CPF(11 digitos) sem pontos");
                    return;
                }

            case "cooperativa":
            case "empresa":
                if (cnpjOuCpfClienteAtualizado.length() == 14) {
                    if (ValidarCNPJ.validaCNPJ(cnpjOuCpfClienteAtualizado)) {
                        atualizarCliente();
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null, "CNPJ inválido");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Se desejada atualizar uma empresa ou cooperativa adicione um CNPJ(14 digitos) sem pontos");
                    return;
                }

            default:
                JOptionPane.showMessageDialog(null, "Tipo de Cliente inválido, APENAS:\npessoa\nempresa\ncooperativa");
                return;
        }

    }

    public void atualizarCliente() {
        try {

            Cliente clienteAtualizado = new Cliente();
            clienteAtualizado.setNomeCliente(nomeClienteAtualizado);
            clienteAtualizado.setCnpjOuCpfCliente(cnpjOuCpfClienteAtualizado);
            clienteAtualizado.setCepCliente(cepClienteAtualizado);
            clienteAtualizado.setCidadeCliente(cidadeClienteAtualizado);
            clienteAtualizado.setEstadoCliente(estadoClienteAtualizado);
            clienteAtualizado.setEnderecoCliente(enderecoClienteAtualizado);
            clienteAtualizado.setTelefoneCliente(telefoneClienteAtualizado);
            clienteAtualizado.setTipoCliente(tipoClienteAtualizado);
            clienteAtualizado.setIdCliente(idClienteAtualizado);

            controleCliente = new ControleCliente();
            String msgAtualizacao = controleCliente.atualizarCliente(clienteAtualizado);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            limparCampos();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Falha no sistema, tipo: " + ex.getMessage());
        }
    }

    public void limparCampos() {
        jTextFieldClienteBuscado.setText("");
        jTextFieldEstado.setText("");
        jTextFieldCEP.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldTipo.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCNPJOuCPF.setText("");
        jTextFieldNome.setText("");
        jTextFieldCidade.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarFornecedor;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonValidarRemocao;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCNPJOuCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldClienteBuscado;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTipo;
    // End of variables declaration//GEN-END:variables
}
