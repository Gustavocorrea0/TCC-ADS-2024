package Maquina.CRUDCarregador;

import Maquina.ControleMaquina;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class TelaDeCadastroCarregador extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();

    private String estado = null;
    private String tipoMaquina = null;
    private String nomeMaquina = null;
    private String marcaMaquina = null;
    private int anoMaquina;
    private String chassiMaquina = null;

    private Double pesoSuportado;

    public TelaDeCadastroCarregador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldPesoSuportado = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jButtonCancelarCadastroDeMaquina = new javax.swing.JButton();
        jButtonConfirmarCadastroDeMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox<>();
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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 304, 272, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 395, 272, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 218, 272, 29));

        jTextFieldPesoSuportado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPesoSuportado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPesoSuportado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPesoSuportado.setBorder(null);
        jTextFieldPesoSuportado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPesoSuportado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoSuportadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesoSuportado, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 132, 272, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 135, 272, 29));

        jButtonCancelarCadastroDeMaquina.setBorder(null);
        jButtonCancelarCadastroDeMaquina.setBorderPainted(false);
        jButtonCancelarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonCancelarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 600, 280, 34));

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

        jButtonSairDaTelaDeConsulta.setBorder(null);
        jButtonSairDaTelaDeConsulta.setBorderPainted(false);
        jButtonSairDaTelaDeConsulta.setContentAreaFilled(false);
        jButtonSairDaTelaDeConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaDeConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaDeConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaDeConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 40, 28));

        jComboBoxEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ativo", "Inativo" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasCarregador/img_tela_cadastro_de_carregador.png"))); // NOI18N
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

    private void jTextFieldPesoSuportadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoSuportadoActionPerformed

    }//GEN-LAST:event_jTextFieldPesoSuportadoActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed

        this.dispose();
        new TelaCRUDCarregador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed
        cadastrarCarregador();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jButtonCancelarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDeMaquinaActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro Cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroDeMaquinaActionPerformed

    public void cadastrarCarregador() {
        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do carregador");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do carregador");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do carregador");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do carregador (17 Digitos)");
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

        if (anoMaquina > (anoAtual + 1) || anoMaquina < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (chassiMaquina.length() != 17) {
            JOptionPane.showMessageDialog(null, "Chassi Inválido (17 Digitos");
            return;
        }

        if (estado.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Adicione o estado");
            return;
        }

        if (estado.equals("Ativo")) {
            estado = "A";
        }

        if (estado.equals("Inativo")) {
            estado = "I";
        }

        tipoMaquina = "Carregador";

        try {
            pesoSuportado = Double.valueOf(jTextFieldPesoSuportado.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O peso suportado deve ser numérico");
            return;
        }

        if (pesoSuportado <= 0) {
            JOptionPane.showMessageDialog(null, "Peso Inválido");
            return;
        }

        try {
            controleMaquina.carregador.setTipoMaquina(tipoMaquina);
            controleMaquina.carregador.setNomeMaquina(nomeMaquina);
            controleMaquina.carregador.setMarcaMaquina(marcaMaquina);
            controleMaquina.carregador.setAnoMaquina(anoMaquina);
            controleMaquina.carregador.setChassiMaquina(chassiMaquina);
            controleMaquina.carregador.setEstadoMaquina(estado);
            controleMaquina.carregador.setPesoSuportado(pesoSuportado);

            String msg = controleMaquina.cadastrarCarregador(ControleMaquina.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Problema no sistema, tipo: " + ex.getMessage());
        }

    }

    private void limparCampos() {
        jTextFieldAnoMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldNomeMaquina.setText("");
        jTextFieldPesoSuportado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastroDeMaquina;
    private javax.swing.JButton jButtonConfirmarCadastroDeMaquina;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldPesoSuportado;
    // End of variables declaration//GEN-END:variables
}
