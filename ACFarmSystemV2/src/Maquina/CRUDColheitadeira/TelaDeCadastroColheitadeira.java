package Maquina.CRUDColheitadeira;

import Maquina.ControleMaquina;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class TelaDeCadastroColheitadeira extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String msg = null;
    private String estado = null;
    private String tipoMaquina = null;
    private String nomeMaquina = null;
    private String marcaMaquina = null;
    private int anoMaquina;
    private String chassiMaquina = null;
    private String cultura = null;

    private int quantidadeDeSacas;
    private Double capacidadeDoTanqueDeCombustivel;

    public TelaDeCadastroColheitadeira() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanque = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldQuantidadeDeSacas = new javax.swing.JTextField();
        jButtonCancelarCadastroDeMaquina = new javax.swing.JButton();
        jButtonConfirmarCadastroDeMaquina = new javax.swing.JButton();
        jButtonSairDaTelaCadastrarCarretaGraneleira = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jComboBoxCultura = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 303, 270, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 395, 270, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 218, 270, 29));

        jTextFieldCapacidadeDoTanque.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanque.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanque.setBorder(null);
        jTextFieldCapacidadeDoTanque.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoTanqueActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoTanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 218, 353, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 135, 270, 29));

        jTextFieldQuantidadeDeSacas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeDeSacas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeDeSacas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeSacas.setBorder(null);
        jTextFieldQuantidadeDeSacas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeSacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeDeSacasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeDeSacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 132, 271, 29));

        jButtonCancelarCadastroDeMaquina.setBorder(null);
        jButtonCancelarCadastroDeMaquina.setBorderPainted(false);
        jButtonCancelarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonCancelarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 600, 280, 33));

        jButtonConfirmarCadastroDeMaquina.setBorder(null);
        jButtonConfirmarCadastroDeMaquina.setBorderPainted(false);
        jButtonConfirmarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonConfirmarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 550, 280, 33));

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
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, 30));

        jComboBoxCultura.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxCultura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Milho", "Soja" }));
        jComboBoxCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 300, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasColheitadeira/img_tela_cadastro_de_colheitadeira.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    private void jTextFieldCapacidadeDoTanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoTanqueActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoTanqueActionPerformed

    private void jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed
        this.dispose();
        new TelaCRUDColheitadeira().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldQuantidadeDeSacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeDeSacasActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeDeSacasActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed
        cadastrarColheitadeira();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jComboBoxCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCulturaActionPerformed

    }//GEN-LAST:event_jComboBoxCulturaActionPerformed

    private void jButtonCancelarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDeMaquinaActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroDeMaquinaActionPerformed

    public void cadastrarColheitadeira() {
        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da colheitadeira");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca da colheitadeira");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano da colheitadeira");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi da colheitadeira (17 Digitos)");
            return;
        }

        if (jTextFieldQuantidadeDeSacas.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a quantidade de sacas suporadas da colheitadeira");
            return;
        }

        if (jTextFieldCapacidadeDoTanque.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do tanque de combustivél da colheitadeira");
            return;
        }

        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        nomeMaquina = jTextFieldNomeMaquina.getText();
        marcaMaquina = jTextFieldMarcaMaquina.getText();

        try {
            anoMaquina = Integer.parseInt(jTextFieldAnoMaquina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ano é um valor numérico (Ex: 2024)");
            return;
        }

        chassiMaquina = jTextFieldChassiMaquina.getText();

        estado = jComboBoxEstado.getSelectedItem().toString();
        cultura = jComboBoxCultura.getSelectedItem().toString();

        tipoMaquina = "Colheitadeira";

        try {
            quantidadeDeSacas = Integer.parseInt(jTextFieldQuantidadeDeSacas.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A quantidade de sacas deve ser numérica");
            return;
        }

        try {
            capacidadeDoTanqueDeCombustivel = Double.valueOf(jTextFieldCapacidadeDoTanque.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A capacidade do tanque deve ser numérica");
            return;
        }

        if (anoMaquina > (anoAtual + 1) || anoMaquina < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (chassiMaquina.length() != 17) {
            JOptionPane.showMessageDialog(null, "Chassi Inválido");
            return;
        }

        if (quantidadeDeSacas <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de sacas Inválida");
            return;
        }

        if (capacidadeDoTanqueDeCombustivel <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade do tanque de combustivel Inválida");
            return;
        }

        if (estado.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Adicione um estado");
            return;
        }

        if (cultura.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Adicione uma cultura");
            return;
        }

        if (estado.equals("Ativo")) {
            estado = "A";
        }

        if (estado.equals("Inativo")) {
            estado = "I";
        }

        try {

            controleMaquina.colheitadeira.setTipoMaquina(tipoMaquina);
            controleMaquina.colheitadeira.setNomeMaquina(nomeMaquina);
            controleMaquina.colheitadeira.setMarcaMaquina(marcaMaquina);
            controleMaquina.colheitadeira.setAnoMaquina(anoMaquina);
            controleMaquina.colheitadeira.setChassiMaquina(chassiMaquina);
            controleMaquina.colheitadeira.setEstadoMaquina(estado);
            controleMaquina.colheitadeira.setQuantidadeDeSacos(quantidadeDeSacas);
            controleMaquina.colheitadeira.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanqueDeCombustivel);
            controleMaquina.colheitadeira.setCultura(cultura);

            msg = controleMaquina.cadastrarColheitadeira(ControleMaquina.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

            limparCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void limparCampos() {
        jTextFieldAnoMaquina.setText("");
        jTextFieldCapacidadeDoTanque.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldNomeMaquina.setText("");
        jTextFieldQuantidadeDeSacas.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCadastroDeMaquina;
    private javax.swing.JButton jButtonConfirmarCadastroDeMaquina;
    private javax.swing.JButton jButtonSairDaTelaCadastrarCarretaGraneleira;
    private javax.swing.JComboBox<String> jComboBoxCultura;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanque;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldQuantidadeDeSacas;
    // End of variables declaration//GEN-END:variables
}
