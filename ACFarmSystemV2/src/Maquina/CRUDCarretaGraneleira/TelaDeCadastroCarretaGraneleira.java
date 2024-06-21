package Maquina.CRUDCarretaGraneleira;

import Maquina.ControleMaquina;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class TelaDeCadastroCarretaGraneleira extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();

    private String estado = null;
    private String tipoMaquina = null;
    private String nomeMaquina = null;
    private String marcaMaquina = null;
    private int anoMaquina;
    private String chassiMaquina = null;
    private Double capacidadeCargaEmKG;
    private int capacidadeDeSacas;

    public TelaDeCadastroCarretaGraneleira() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldCapacidadeDeSacas = new javax.swing.JTextField();
        jTextFieldCapacidadeDePeso = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jButtonCancelarCadastroDeMaquina = new javax.swing.JButton();
        jButtonConfirmarCadastroDeMaquina = new javax.swing.JButton();
        jButtonSairDaTelaCadastrarCarretaGraneleira = new javax.swing.JButton();
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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 304, 271, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 395, 271, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 219, 271, 29));

        jTextFieldCapacidadeDeSacas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeSacas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeSacas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSacas.setBorder(null);
        jTextFieldCapacidadeDeSacas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeSacasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeSacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 219, 270, 29));

        jTextFieldCapacidadeDePeso.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDePeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDePeso.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDePeso.setBorder(null);
        jTextFieldCapacidadeDePeso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDePeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDePesoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDePeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 133, 271, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 136, 271, 29));

        jButtonCancelarCadastroDeMaquina.setBorder(null);
        jButtonCancelarCadastroDeMaquina.setBorderPainted(false);
        jButtonCancelarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonCancelarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 600, 280, 35));

        jButtonConfirmarCadastroDeMaquina.setBorder(null);
        jButtonConfirmarCadastroDeMaquina.setBorderPainted(false);
        jButtonConfirmarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonConfirmarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 550, 280, 35));

        jButtonSairDaTelaCadastrarCarretaGraneleira.setBorder(null);
        jButtonSairDaTelaCadastrarCarretaGraneleira.setContentAreaFilled(false);
        jButtonSairDaTelaCadastrarCarretaGraneleira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaCadastrarCarretaGraneleira.setDefaultCapable(false);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasCarretaGraneleira/img_tela_cadastro_de_carreta_graneleira.png"))); // NOI18N
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

    private void jTextFieldCapacidadeDeSacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeSacasActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeSacasActionPerformed

    private void jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed
        this.dispose();
        new TelaCRUDCarretaGraneleira().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldCapacidadeDePesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDePesoActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDePesoActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

        cadastrarCarretaGraneleira();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jButtonCancelarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDeMaquinaActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro Cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroDeMaquinaActionPerformed

    public void cadastrarCarretaGraneleira() {
        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da graneleira");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca da graneleira");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano da graneleira");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi da graneleira (17 Digitos)");
            return;
        }

        if (jTextFieldCapacidadeDePeso.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade de peso da graneleira");
            return;
        }
        
        if (jTextFieldCapacidadeDeSacas.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade de sacas da graneleira");
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

        try {
            capacidadeCargaEmKG = Double.valueOf(jTextFieldCapacidadeDePeso.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A capacidade de peso deve ser numérica");
            return;
        }

        chassiMaquina = jTextFieldChassiMaquina.getText();
        estado = jComboBoxEstado.getSelectedItem().toString();
        tipoMaquina = "Carreta Graneleira";

        try {
            capacidadeDeSacas = Integer.parseInt(jTextFieldCapacidadeDeSacas.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A capacidade de sacas deve ser numérica (ex: 1910)");
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

        if (estado.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Escolha apenas um nivel de acesso");
            return;
        }

        if (capacidadeDeSacas <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade de Sacas inválida");
            return;
        }

        if (capacidadeCargaEmKG <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade de carga inválida");
            return;
        }

        if (estado.equals("Ativo")) {
            estado = "A";
        }

        if (estado.equals("Inativo")) {
            estado = "I";
        }

        try {
            controleMaquina.carretaGraneleira.setTipoMaquina(tipoMaquina);
            controleMaquina.carretaGraneleira.setNomeMaquina(nomeMaquina);
            controleMaquina.carretaGraneleira.setMarcaMaquina(marcaMaquina);
            controleMaquina.carretaGraneleira.setAnoMaquina(anoMaquina);
            controleMaquina.carretaGraneleira.setChassiMaquina(chassiMaquina);
            controleMaquina.carretaGraneleira.setEstadoMaquina(estado);
            controleMaquina.carretaGraneleira.setCapacidadeDePeso(capacidadeCargaEmKG);
            controleMaquina.carretaGraneleira.setCapacidadeDeSacas(capacidadeDeSacas);

            String msg = controleMaquina.cadastrarCarretaGraneleira(ControleMaquina.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha tipo: " + ex);
        }
    }

    private void limparCampos() {
        jTextFieldNomeMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldCapacidadeDeSacas.setText("");
        jTextFieldCapacidadeDePeso.setText("");
        jTextFieldAnoMaquina.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastroDeMaquina;
    private javax.swing.JButton jButtonConfirmarCadastroDeMaquina;
    private javax.swing.JButton jButtonSairDaTelaCadastrarCarretaGraneleira;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDePeso;
    private javax.swing.JTextField jTextFieldCapacidadeDeSacas;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    // End of variables declaration//GEN-END:variables

}
