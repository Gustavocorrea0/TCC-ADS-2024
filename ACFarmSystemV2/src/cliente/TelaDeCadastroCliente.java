package cliente;

import java.text.ParseException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeCadastroCliente extends javax.swing.JFrame {

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
    private HashSet<String> siglaEstado = new HashSet<>();

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
        getContentPane().add(jTextFieldCNPJOuCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 244, 234, 29));

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
        getContentPane().add(jTextFieldCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 348, 322, 29));

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
        getContentPane().add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 453, 322, 29));

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
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 139, 402, 29));

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
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 244, 295, 29));

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
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 544, 280, 35));

        jComboBoxTipoCliente.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Cooperativa", "Empresa", "Pessoa fisica" }));
        jComboBoxTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 300, -1));

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
        jTextFieldTelefone.setText("");
        jTextFieldCep.setText("");
        jTextFieldEstado.setText("");
        jTextFieldCNPJOuCPF.setText("");
        jTextFieldNomeCliente.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEndereco.setText("");
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        try {
            cadastrarCliente();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed

    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jComboBoxTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoClienteActionPerformed

    }//GEN-LAST:event_jComboBoxTipoClienteActionPerformed

    public void cadastrarCliente() throws ParseException {
        nomeClienteNovo = jTextFieldNomeCliente.getText();
        cnpjOuCpfClienteNovo = jTextFieldCNPJOuCPF.getText();
        cepClienteNovo = jTextFieldCep.getText();
        cidadeClienteNovo = jTextFieldCidade.getText();
        estadoClienteNovo = jTextFieldEstado.getText();
        enderecoClienteNovo = jTextFieldEndereco.getText();
        telefoneClienteNovo = jTextFieldTelefone.getText();

        siglaEstado = new HashSet<>();

        validarEstado(siglaEstado);

        tipoClienteNovo = jComboBoxTipoCliente.getSelectedItem().toString();

        if (nomeClienteNovo.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (cidadeClienteNovo.equals("")) {
            JOptionPane.showMessageDialog(null, "Cidade Inválida");
            return;
        }

        if (enderecoClienteNovo.equals("")) {
            JOptionPane.showMessageDialog(null, "Endereço Inválido");
            return;
        }

        if (telefoneClienteNovo.length() != 13) {
            JOptionPane.showMessageDialog(null, "Telefone Inválido, deve possuir 14 Digitos (ex: 5511933445566)");
            return;
        }

        if (cepClienteNovo.length() != 8) {
            JOptionPane.showMessageDialog(null, "CEP Inválido, 8 digitos");
            return;
        }

        if (tipoClienteNovo.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Adicione o tipo de Cliente");
            return;
        }

        if (!siglaEstado.contains(estadoClienteNovo)) {
            JOptionPane.showMessageDialog(null, "Estado Inválido");
            return;
        }

        try {

            if (cnpjOuCpfClienteNovo.length() == 11 || cnpjOuCpfClienteNovo.length() == 14) {
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

            } else {
                JOptionPane.showMessageDialog(null, "Apenas CPF(11 DIGITOS) ou CNPJ(14 Digitos)");
                return;
            }

        } catch (NullPointerException ex) {
            System.out.println("Falha no sistema, tipo: ");
            ex.printStackTrace();
        }

    }

    private static void validarEstado(HashSet<String> siglaEstado) {
        siglaEstado.add("AC"); // Acre
        siglaEstado.add("AL"); // Alagoas
        siglaEstado.add("AP"); // Amapá
        siglaEstado.add("AM"); // Amazonas
        siglaEstado.add("BA"); // Bahia
        siglaEstado.add("CE"); // Ceará
        siglaEstado.add("DF"); // Distrito Federal
        siglaEstado.add("ES"); // Espírito Santo
        siglaEstado.add("GO"); // Goiás
        siglaEstado.add("MA"); // Maranhão
        siglaEstado.add("MT"); // Mato Grosso
        siglaEstado.add("MS"); // Mato Grosso do Sul
        siglaEstado.add("MG"); // Minas Gerais
        siglaEstado.add("PA"); // Pará
        siglaEstado.add("PB"); // Paraíba
        siglaEstado.add("PR"); // Paraná
        siglaEstado.add("PE"); // Pernambuco
        siglaEstado.add("PI"); // Piauí
        siglaEstado.add("RJ"); // Rio de Janeiro
        siglaEstado.add("RN"); // Rio Grande do Norte
        siglaEstado.add("RS"); // Rio Grande do Sul
        siglaEstado.add("RO"); // Rondônia
        siglaEstado.add("RR"); // Roraima
        siglaEstado.add("SC"); // Santa Catarina
        siglaEstado.add("SP"); // São Paulo
        siglaEstado.add("SE"); // Sergipe
        siglaEstado.add("TO"); // Tocantins
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoTipoCliente;
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
}
