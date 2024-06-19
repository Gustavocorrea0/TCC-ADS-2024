package Propriedade;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class TelaDeCadastroDePropriedade extends javax.swing.JFrame {

    public TelaDeCadastroDePropriedade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoTipoDeCultura = new javax.swing.ButtonGroup();
        jButtonCancelarCadastroDePropriedade = new javax.swing.JButton();
        jButtonConfirmarCadastroDePropriedade = new javax.swing.JButton();
        jTextFieldAreaPropriedade = new javax.swing.JTextField();
        jTextFieldLocalPropriedade = new javax.swing.JTextField();
        jTextFieldCidadePropriedade = new javax.swing.JTextField();
        jTextFieldEstadoPropriedade = new javax.swing.JTextField();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jComboBoxCultura = new javax.swing.JComboBox<>();
        jLabelCadatroPropriedade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarCadastroDePropriedade.setBorder(null);
        jButtonCancelarCadastroDePropriedade.setContentAreaFilled(false);
        jButtonCancelarCadastroDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastroDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 598, 280, 36));

        jButtonConfirmarCadastroDePropriedade.setBorder(null);
        jButtonConfirmarCadastroDePropriedade.setContentAreaFilled(false);
        jButtonConfirmarCadastroDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 549, 282, 36));

        jTextFieldAreaPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAreaPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAreaPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAreaPropriedade.setBorder(null);
        jTextFieldAreaPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAreaPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAreaPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 286, 278, 28));

        jTextFieldLocalPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLocalPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldLocalPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLocalPropriedade.setBorder(null);
        jTextFieldLocalPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLocalPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLocalPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 397, 277, 29));

        jTextFieldCidadePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCidadePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCidadePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCidadePropriedade.setBorder(null);
        jTextFieldCidadePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCidadePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 167, 276, 29));

        jTextFieldEstadoPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoPropriedade.setBorder(null);
        jTextFieldEstadoPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 286, 277, 29));

        jTextFieldNomePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.setBorder(null);
        jTextFieldNomePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 167, 277, 29));

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
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 22, 35, 24));

        jComboBoxCultura.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxCultura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Soja", "Milho" }));
        jComboBoxCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 280, 30));

        jLabelCadatroPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPropriedade/img_tela_de_cadastro_de_propriedade.png"))); // NOI18N
        jLabelCadatroPropriedade.setText("jLabel1");
        getContentPane().add(jLabelCadatroPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ControlePropriedade propriedade = new ControlePropriedade();
    private Double areaCovertida;
    private String nomePropriedade;
    private String localPropriedade;
    private String estadoPropriedade;
    private String cidadePropriedade;
    private String tipoCultura;
    private HashSet<String> siglaEstado = new HashSet<>();

    private void jButtonCancelarCadastroDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDePropriedadeActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroDePropriedadeActionPerformed

    private void jTextFieldLocalPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocalPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldLocalPropriedadeActionPerformed

    private void jTextFieldCidadePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldCidadePropriedadeActionPerformed

    private void jTextFieldAreaPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldAreaPropriedadeActionPerformed

    private void jTextFieldEstadoPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoPropriedadeActionPerformed

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    private void jButtonConfirmarCadastroDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDePropriedadeActionPerformed
        cadastrarPropriedade();
    }//GEN-LAST:event_jButtonConfirmarCadastroDePropriedadeActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jComboBoxCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCulturaActionPerformed

    }//GEN-LAST:event_jComboBoxCulturaActionPerformed

    public void cadastrarPropriedade() {
        if (jTextFieldNomePropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da propriedade");
            return;
        }

        if (jTextFieldAreaPropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a area da propriedade");
            return;
        }

        if (jTextFieldLocalPropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o local da propriedade");
            return;
        }
        
        if (jTextFieldCidadePropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a cidade da propriedade");
            return;
        }
        
        if (jTextFieldEstadoPropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado(UF) da propriedade");
            return;
        }

        try {
            areaCovertida = Double.valueOf(jTextFieldAreaPropriedade.getText());
            nomePropriedade = jTextFieldNomePropriedade.getText();
            localPropriedade = jTextFieldLocalPropriedade.getText();
            estadoPropriedade = jTextFieldEstadoPropriedade.getText();
            cidadePropriedade = jTextFieldCidadePropriedade.getText();
            tipoCultura = jComboBoxCultura.getSelectedItem().toString();

            siglaEstado = new HashSet<>();

            validarEstado(siglaEstado);

            if (nomePropriedade.isBlank()) {
                JOptionPane.showMessageDialog(null, "Nome Inválido");
                jTextFieldNomePropriedade.requestFocus();
                return;
            }

            if (localPropriedade.isBlank()) {
                JOptionPane.showMessageDialog(null, "Local Inválido");
                jTextFieldLocalPropriedade.requestFocus();
                return;
            }

            if (areaCovertida <= 0) {
                JOptionPane.showMessageDialog(null, "Area Inválida");
                return;
            }

            if (estadoPropriedade.isBlank()) {
                JOptionPane.showMessageDialog(null, "Estado Inválido");
                jTextFieldEstadoPropriedade.requestFocus();
                return;
            }

            if (cidadePropriedade.isBlank()) {
                JOptionPane.showMessageDialog(null, "Cidade Inválida");
                jTextFieldCidadePropriedade.requestFocus();
                return;
            }

            if (!siglaEstado.contains(estadoPropriedade)) {
                JOptionPane.showMessageDialog(null, "Estado Inválido");
                return;
            }

            if (tipoCultura.equals("Soja") || tipoCultura.equals("Milho")) {

                propriedade.propriedade.setNomePropriedade(nomePropriedade);
                propriedade.propriedade.setLocalPropriedade(localPropriedade);
                propriedade.propriedade.setAreaPropriedade(areaCovertida);
                propriedade.propriedade.setTipoDeCulturaDaPropriedade(tipoCultura);
                propriedade.propriedade.setEstado(estadoPropriedade);
                propriedade.propriedade.setCidade(cidadePropriedade);

                String msg = propriedade.cadastrarPropriedade(ControlePropriedade.INCLUSAO);

                JOptionPane.showMessageDialog(this, msg);
                limparCampos();

            } else {
                JOptionPane.showMessageDialog(this, "Cultura Inválida");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Área deve ser númerica");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha tipo: " + e);
        }

    }

    private void limparCampos() {
        jTextFieldAreaPropriedade.setText("");
        jTextFieldCidadePropriedade.setText("");
        jTextFieldEstadoPropriedade.setText("");
        jTextFieldLocalPropriedade.setText("");
        jTextFieldNomePropriedade.setText("");
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
    private javax.swing.ButtonGroup botaoTipoDeCultura;
    private javax.swing.JButton jButtonCancelarCadastroDePropriedade;
    private javax.swing.JButton jButtonConfirmarCadastroDePropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JComboBox<String> jComboBoxCultura;
    private javax.swing.JLabel jLabelCadatroPropriedade;
    private javax.swing.JTextField jTextFieldAreaPropriedade;
    private javax.swing.JTextField jTextFieldCidadePropriedade;
    private javax.swing.JTextField jTextFieldEstadoPropriedade;
    private javax.swing.JTextField jTextFieldLocalPropriedade;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    // End of variables declaration//GEN-END:variables
}
