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
        jTextFieldAnoMaquina.setBorder(null);
        jTextFieldAnoMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAnoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 305, 270, 27));

        jTextFieldChassiMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiMaquina.setBorder(null);
        jTextFieldChassiMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldChassiMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 396, 270, 27));

        jTextFieldMarcaMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaMaquina.setBorder(null);
        jTextFieldMarcaMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 220, 270, 27));

        jTextFieldCapacidadeDeSacas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeSacas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeSacas.setBorder(null);
        jTextFieldCapacidadeDeSacas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeSacasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeSacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 220, 270, 27));

        jTextFieldCapacidadeDePeso.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDePeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDePeso.setBorder(null);
        jTextFieldCapacidadeDePeso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDePeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDePesoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDePeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 134, 270, 27));

        jTextFieldNomeMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeMaquina.setBorder(null);
        jTextFieldNomeMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 137, 270, 27));

        jButtonCancelarCadastroDeMaquina.setBorder(null);
        jButtonCancelarCadastroDeMaquina.setBorderPainted(false);
        jButtonCancelarCadastroDeMaquina.setContentAreaFilled(false);
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
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasDeCadastro/img_tela_cadastro_de_carreta_graneleira.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    private void jTextFieldCapacidadeDeSacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeSacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCapacidadeDeSacasActionPerformed

    private void jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDCarretaGraneleira().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldCapacidadeDePesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDePesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCapacidadeDePesoActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed
        // TODO add your handling code here:
        cadastrarCarretaGraneleira();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    public void cadastrarCarretaGraneleira() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        nomeMaquina = jTextFieldNomeMaquina.getText();
        marcaMaquina = jTextFieldMarcaMaquina.getText();
        anoMaquina = Integer.parseInt(jTextFieldAnoMaquina.getText());
        chassiMaquina = jTextFieldChassiMaquina.getText();
        estado = jComboBoxEstado.getSelectedItem().toString();
        tipoMaquina = "Carreta Graneleira";
        
        Double capacidadeCargaEmKG = Double.parseDouble(jTextFieldCapacidadeDePeso.getText());
        int capacidadeDeSacas = Integer.parseInt(jTextFieldCapacidadeDePeso.getText());

        if (nomeMaquina.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
            return;
        }

        if (marcaMaquina.equals("")) {
            JOptionPane.showMessageDialog(null, "Marca Inválida");
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

        if(capacidadeDeSacas <= 0){
            JOptionPane.showMessageDialog(null, "Capacidade de Sacas inválida");
            return;
        }
        
        if(capacidadeCargaEmKG <= 0){
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
        } catch (NullPointerException ex) {
            System.out.println("Problema no sistema, tipo: ");
            ex.printStackTrace();
        }
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
