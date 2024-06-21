package Maquina.CRUDSubsolador;

import Maquina.ControleMaquina;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class TelaDeCadastroSubsolador extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String msg = null;
    private String estado = null;
    private String tipoMaquina = null;
    private String nomeMaquina = null;
    private String marcaMaquina = null;
    private int anoMaquina;
    private String chassiMaquina = null;

    private Double peso;
    private Double largura;
    private int numeroDeHastes;
    private int potenciaNecessariaDoTrator;

    public TelaDeCadastroSubsolador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldPotenciaNecessariaDoTrator = new javax.swing.JTextField();
        jTextFieldPesoDoSubsolador = new javax.swing.JTextField();
        jTextFieldLarguraEmMM = new javax.swing.JTextField();
        jTextFieldNumeroDeHastes = new javax.swing.JTextField();
        jButtonCancelarCadastroDeMaquina = new javax.swing.JButton();
        jButtonConfirmarCadastroDeMaquina = new javax.swing.JButton();
        jButtonSairDaTelaCadastrarCarretaGraneleira = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabelFundoCadastroSubsolador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeMaquina.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeMaquina.setBorder(null);
        jTextFieldNomeMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 135, 271, 29));

        jTextFieldMarcaMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaMaquina.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaMaquina.setBorder(null);
        jTextFieldMarcaMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 218, 272, 29));

        jTextFieldAnoMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoMaquina.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoMaquina.setBorder(null);
        jTextFieldAnoMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAnoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 303, 271, 29));

        jTextFieldChassiMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiMaquina.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiMaquina.setBorder(null);
        jTextFieldChassiMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldChassiMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 394, 271, 29));

        jTextFieldPotenciaNecessariaDoTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPotenciaNecessariaDoTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPotenciaNecessariaDoTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaNecessariaDoTrator.setBorder(null);
        jTextFieldPotenciaNecessariaDoTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaNecessariaDoTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPotenciaNecessariaDoTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPotenciaNecessariaDoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 419, 271, 29));

        jTextFieldPesoDoSubsolador.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPesoDoSubsolador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPesoDoSubsolador.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPesoDoSubsolador.setBorder(null);
        jTextFieldPesoDoSubsolador.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPesoDoSubsolador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoDoSubsoladorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesoDoSubsolador, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 132, 270, 29));

        jTextFieldLarguraEmMM.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLarguraEmMM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldLarguraEmMM.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLarguraEmMM.setBorder(null);
        jTextFieldLarguraEmMM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldLarguraEmMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLarguraEmMMActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLarguraEmMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 218, 270, 29));

        jTextFieldNumeroDeHastes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroDeHastes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNumeroDeHastes.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeHastes.setBorder(null);
        jTextFieldNumeroDeHastes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeHastes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDeHastesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroDeHastes, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 303, 272, 29));

        jButtonCancelarCadastroDeMaquina.setBorder(null);
        jButtonCancelarCadastroDeMaquina.setBorderPainted(false);
        jButtonCancelarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonCancelarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 599, 280, 35));

        jButtonConfirmarCadastroDeMaquina.setBorder(null);
        jButtonConfirmarCadastroDeMaquina.setBorderPainted(false);
        jButtonConfirmarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonConfirmarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 549, 280, 35));

        jButtonSairDaTelaCadastrarCarretaGraneleira.setBorder(null);
        jButtonSairDaTelaCadastrarCarretaGraneleira.setBorderPainted(false);
        jButtonSairDaTelaCadastrarCarretaGraneleira.setContentAreaFilled(false);
        jButtonSairDaTelaCadastrarCarretaGraneleira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaCadastrarCarretaGraneleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaCadastrarCarretaGraneleira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 40, 28));

        jComboBoxEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ativo", "Inativo" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, -1));

        jLabelFundoCadastroSubsolador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasSubsolador/img_tela_cadastro_de_subsolador.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadastroSubsolador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPotenciaNecessariaDoTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPotenciaNecessariaDoTratorActionPerformed

    }//GEN-LAST:event_jTextFieldPotenciaNecessariaDoTratorActionPerformed

    private void jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed
        this.dispose();
        new TelaCRUDSubsolador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed

    private void jTextFieldPesoDoSubsoladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoDoSubsoladorActionPerformed

    }//GEN-LAST:event_jTextFieldPesoDoSubsoladorActionPerformed

    private void jTextFieldLarguraEmMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLarguraEmMMActionPerformed

    }//GEN-LAST:event_jTextFieldLarguraEmMMActionPerformed

    private void jTextFieldNumeroDeHastesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeHastesActionPerformed

    }//GEN-LAST:event_jTextFieldNumeroDeHastesActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed
        cadastrarSubsolador();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jButtonCancelarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDeMaquinaActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroDeMaquinaActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    public void cadastrarSubsolador() {
        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do subsolador");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do subsolador");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do subsolador");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do subsolador (17 Digitos)");
            return;
        }
        
        if (jTextFieldPesoDoSubsolador.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o peso do subdolador");
            return;
        }
        
        if (jTextFieldLarguraEmMM.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a larguara em MM do subdolador");
            return;
        }
        
        if (jTextFieldNumeroDeHastes.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o número de hastes do subdolador");
            return;
        }
        
        if (jTextFieldPotenciaNecessariaDoTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a potência necessaria do trator");
            return;
        }
        
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        nomeMaquina = jTextFieldNomeMaquina.getText();
        marcaMaquina = jTextFieldMarcaMaquina.getText();
        chassiMaquina = jTextFieldChassiMaquina.getText();
        estado = jComboBoxEstado.getSelectedItem().toString();

        try {
            anoMaquina = Integer.parseInt(jTextFieldAnoMaquina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ano é um valor numérico (Ex: 2024)");
            return;
        }

        try {
            peso = Double.valueOf(jTextFieldPesoDoSubsolador.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Peso é um valor numérico (Ex: 12.5)");
            return;
        }

        try {
            largura = Double.valueOf(jTextFieldLarguraEmMM.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Largura em MM é um valor numérico (Ex: 1.5)");
            return;
        }

        try {
            numeroDeHastes = Integer.parseInt(jTextFieldNumeroDeHastes.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Número de hastes é um valor numérico (Ex: 10)");
            return;
        }

        try {
            potenciaNecessariaDoTrator = Integer.parseInt(jTextFieldPotenciaNecessariaDoTrator.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Potência necessaria do trator é um valor numérico (Ex: 75)");
            return;
        }

        tipoMaquina = "Subsolador ";

        if (anoMaquina > (anoAtual + 1) || anoMaquina < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (chassiMaquina.length() != 17) {
            JOptionPane.showMessageDialog(null, "Chassi Inválido");
            return;
        }

        if (estado.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Adicione um estado");
            return;
        }

        if (estado.equals("Ativo")) {
            estado = "A";
        }

        if (estado.equals("Inativo")) {
            estado = "I";
        }

        if (peso <= 0) {
            JOptionPane.showMessageDialog(null, "Peso Inválido");
            return;
        }

        if (largura <= 0) {
            JOptionPane.showMessageDialog(null, "Largura Inválida");
            return;
        }

        if (numeroDeHastes <= 0) {
            JOptionPane.showMessageDialog(null, "Numero de hastes Inválido");
            return;
        }

        if (potenciaNecessariaDoTrator <= 10) {
            JOptionPane.showMessageDialog(null, "Potencia do Trator Inválida, apenas acima de 10CV");
            return;
        }

        try {
            controleMaquina.subsolador.setTipoMaquina(tipoMaquina);
            controleMaquina.subsolador.setNomeMaquina(nomeMaquina);
            controleMaquina.subsolador.setMarcaMaquina(marcaMaquina);
            controleMaquina.subsolador.setAnoMaquina(anoMaquina);
            controleMaquina.subsolador.setChassiMaquina(chassiMaquina);
            controleMaquina.subsolador.setEstadoMaquina(estado);
            controleMaquina.subsolador.setPeso(peso);
            controleMaquina.subsolador.setLarguraEmMM(largura);
            controleMaquina.subsolador.setNumeroDeHastes(numeroDeHastes);
            controleMaquina.subsolador.setPotenciaNecessariaTratorEmCv(potenciaNecessariaDoTrator);

            msg = controleMaquina.cadastrarSubSolador(ControleMaquina.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();
        } catch (NullPointerException ex) {
            System.out.println("Problema no sistema, tipo: ");
            ex.printStackTrace();
        }
    }

    public void limparCampos() {
        jTextFieldPotenciaNecessariaDoTrator.setText("");
        jTextFieldPesoDoSubsolador.setText("");
        jTextFieldNumeroDeHastes.setText("");
        jTextFieldNomeMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldLarguraEmMM.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldAnoMaquina.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastroDeMaquina;
    private javax.swing.JButton jButtonConfirmarCadastroDeMaquina;
    private javax.swing.JButton jButtonSairDaTelaCadastrarCarretaGraneleira;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabelFundoCadastroSubsolador;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldLarguraEmMM;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNumeroDeHastes;
    private javax.swing.JTextField jTextFieldPesoDoSubsolador;
    private javax.swing.JTextField jTextFieldPotenciaNecessariaDoTrator;
    // End of variables declaration//GEN-END:variables
}
