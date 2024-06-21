package Maquina.CRUDPulverizador;

import Maquina.ControleMaquina;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class TelaDeCadastroPulverizador extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String msg = null;
    private String estado = null;
    private String tipoMaquina = null;
    private String nomeMaquina = null;
    private String marcaMaquina = null;
    private int anoMaquina;
    private String chassiMaquina = null;
    private String cultura = null;
    private Double capacidadeDoReservatorio;

    public TelaDeCadastroPulverizador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        buttonGroupCultura = new javax.swing.ButtonGroup();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldCapacidadeDoReservatorio = new javax.swing.JTextField();
        jButtonCancelarCadastroDeMaquina = new javax.swing.JButton();
        jButtonConfirmarCadastroDeMaquina = new javax.swing.JButton();
        jButtonSairDaTelaCadastrarCarretaGraneleira = new javax.swing.JButton();
        jComboBoxCultura = new javax.swing.JComboBox<>();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabelFundoCadastroPulverizador = new javax.swing.JLabel();

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

        jTextFieldCapacidadeDoReservatorio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoReservatorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoReservatorio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoReservatorio.setBorder(null);
        jTextFieldCapacidadeDoReservatorio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoReservatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoReservatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoReservatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 133, 271, 29));

        jButtonCancelarCadastroDeMaquina.setBorder(null);
        jButtonCancelarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonCancelarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastroDeMaquina.setDefaultCapable(false);
        jButtonCancelarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 599, 280, 34));

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

        jComboBoxCultura.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxCultura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Milho", "Soja" }));
        jComboBoxCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 280, 30));

        jComboBoxEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ativo", "Inativo" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 493, 280, 30));

        jLabelFundoCadastroPulverizador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasPulverizador/img_tela_cadastro_de_pulverizador.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadastroPulverizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed
        this.dispose();
        new TelaCRUDPulverizador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed
        cadastrarPulverizador();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    private void jComboBoxCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCulturaActionPerformed

    }//GEN-LAST:event_jComboBoxCulturaActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jButtonCancelarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDeMaquinaActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro Cancelado");
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

    private void jTextFieldCapacidadeDoReservatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoReservatorioActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoReservatorioActionPerformed

    public void cadastrarPulverizador() {
        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do pulverizador");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do pulverizador");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do pulverizador");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do pulverizador (17 Digitos)");
            return;
        }

        if (jTextFieldCapacidadeDoReservatorio.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do pulverizador");
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

        tipoMaquina = "Pulverizador";

        try {
            capacidadeDoReservatorio = Double.valueOf(jTextFieldCapacidadeDoReservatorio.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A capacidade do reservatorio de deve ser numérica");
            return;
        }

        try {
            if (anoMaquina > (anoAtual + 1) || anoMaquina < 1970) {
                JOptionPane.showMessageDialog(null, "Ano Inválido");
                return;
            }

            if (chassiMaquina.length() != 17) {
                JOptionPane.showMessageDialog(null, "Chassi Inválido");
                return;
            }

            if (capacidadeDoReservatorio <= 0) {
                JOptionPane.showMessageDialog(null, "Capacidade do reservatorio Inválida");
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

            controleMaquina.pulverizador.setTipoMaquina(tipoMaquina);
            controleMaquina.pulverizador.setNomeMaquina(nomeMaquina);
            controleMaquina.pulverizador.setMarcaMaquina(marcaMaquina);
            controleMaquina.pulverizador.setAnoMaquina(anoMaquina);
            controleMaquina.pulverizador.setChassiMaquina(chassiMaquina);
            controleMaquina.pulverizador.setEstadoMaquina(estado);
            controleMaquina.pulverizador.setCapacidadeDoReservatorio(capacidadeDoReservatorio);
            controleMaquina.pulverizador.setTipoDeCultura(cultura);

            msg = controleMaquina.cadastrarPulverizador(ControleMaquina.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha tipo: " + ex.getMessage());
            return;
        }

    }

    public void limparCampos() {
        jTextFieldAnoMaquina.setText("");
        jTextFieldCapacidadeDoReservatorio.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldNomeMaquina.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCultura;
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastroDeMaquina;
    private javax.swing.JButton jButtonConfirmarCadastroDeMaquina;
    private javax.swing.JButton jButtonSairDaTelaCadastrarCarretaGraneleira;
    private javax.swing.JComboBox<String> jComboBoxCultura;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabelFundoCadastroPulverizador;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDoReservatorio;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    // End of variables declaration//GEN-END:variables
}
