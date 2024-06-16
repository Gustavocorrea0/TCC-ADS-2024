package cliente;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeRemocaoCliente extends javax.swing.JFrame {

    public TelaDeRemocaoCliente() {
        initComponents();
    }

    private String nomeBuscado;
    private ControleCliente controleCliente = new ControleCliente();
    private String msg;

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
        getContentPane().add(jButtonBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 107, 280, 44));

        jTextFieldEndereco.setEditable(false);
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
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 225, 420, 29));

        jTextFieldCNPJOuCPF.setEditable(false);
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
        getContentPane().add(jTextFieldCNPJOuCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 315, 235, 29));

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
        getContentPane().add(jTextFieldCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 406, 318, 29));

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
        getContentPane().add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 496, 320, 29));

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
        getContentPane().add(jTextFieldClienteBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 114, 272, 30));

        jTextFieldTelefone.setEditable(false);
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
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 315, 320, 29));

        jTextFieldTipo.setEditable(false);
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
        getContentPane().add(jTextFieldTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 406, 319, 29));

        jTextFieldNome.setEditable(false);
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
        getContentPane().add(jTextFieldEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 587, 319, 30));

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

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasCliente/img_tela_remover_cliente.png"))); // NOI18N
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
            Logger.getLogger(TelaDeRemocaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFornecedorActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jButtonValidarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarRemocaoActionPerformed
        removerCliente();
    }//GEN-LAST:event_jButtonValidarRemocaoActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void buscarCliente() throws SQLException {
        if (jTextFieldClienteBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do cliente");
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
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
            limparCampos();
        }
    }

    public void removerCliente() {
        if (jTextFieldClienteBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um cliente");
            return;
        }

        nomeBuscado = jTextFieldClienteBuscado.getText();
        msg = controleCliente.removerCliente(nomeBuscado);

        JOptionPane.showMessageDialog(this, msg);
        limparCampos();
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
