/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Maquina.CRUDMaquinaDePlantio;

import Maquina.ControleMaquina;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Camacho
 */
public class TelaDeCadastroMaquinaDePlantio extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String msg = null;
    private String estado = null;
    private String tipoMaquina = null;
    private String nomeMaquina = null;
    private String marcaMaquina = null;
    private int anoMaquina;
    private String chassiMaquina = null;
    private String cultura = null;

    public TelaDeCadastroMaquinaDePlantio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldCapacidadeDeSementes = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldQuantidadeDeLinhas = new javax.swing.JTextField();
        jRadioEstadoInativo = new javax.swing.JRadioButton();
        jRadioEstadoAtivo = new javax.swing.JRadioButton();
        jButtonCancelarCadastroDeMaquina = new javax.swing.JButton();
        jButtonConfirmarCadastroDeMaquina = new javax.swing.JButton();
        jButtonSairDaTelaCadastrarCarretaGraneleira = new javax.swing.JButton();
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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 305, 270, 27));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 396, 270, 27));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 220, 270, 27));

        jTextFieldCapacidadeDeSementes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeSementes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeSementes.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSementes.setBorder(null);
        jTextFieldCapacidadeDeSementes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSementes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeSementesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeSementes, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 134, 270, 27));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 137, 270, 27));

        jTextFieldQuantidadeDeLinhas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeDeLinhas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeDeLinhas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeLinhas.setBorder(null);
        jTextFieldQuantidadeDeLinhas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeDeLinhasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeDeLinhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 220, 270, 27));

        jRadioEstadoInativo.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioEstadoInativo.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEstadoInativo.setText("Inativo");
        jRadioEstadoInativo.setBorder(null);
        jRadioEstadoInativo.setContentAreaFilled(false);
        jRadioEstadoInativo.setFocusable(false);
        jRadioEstadoInativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEstadoInativoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioEstadoInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, 20));

        jRadioEstadoAtivo.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jRadioEstadoAtivo.setForeground(new java.awt.Color(255, 255, 255));
        jRadioEstadoAtivo.setText("Ativo");
        jRadioEstadoAtivo.setBorder(null);
        jRadioEstadoAtivo.setContentAreaFilled(false);
        jRadioEstadoAtivo.setFocusable(false);
        jRadioEstadoAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEstadoAtivoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioEstadoAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 120, 20));

        jButtonCancelarCadastroDeMaquina.setBorder(null);
        jButtonCancelarCadastroDeMaquina.setBorderPainted(false);
        jButtonCancelarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonCancelarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButtonSairDaTelaCadastrarCarretaGraneleira.setFocusable(false);
        jButtonSairDaTelaCadastrarCarretaGraneleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaCadastrarCarretaGraneleira, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 40, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasDeCadastro/img_tela_cadastro_de_maquina_de_plantio.png"))); // NOI18N
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

    private void jTextFieldCapacidadeDeSementesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeSementesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCapacidadeDeSementesActionPerformed

    private void jRadioEstadoInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoInativoActionPerformed
        // TODO add your handling code here:
        estado = "I";
    }//GEN-LAST:event_jRadioEstadoInativoActionPerformed

    private void jRadioEstadoAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoAtivoActionPerformed
        // TODO add your handling code here:
        estado = "A";
    }//GEN-LAST:event_jRadioEstadoAtivoActionPerformed

    private void jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDMaquinaDePlantio().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldQuantidadeDeLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeDeLinhasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeDeLinhasActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed
        // TODO add your handling code here:
        cadastrarMaquinaDePlantio();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    public void cadastrarMaquinaDePlantio(){
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        nomeMaquina = jTextFieldNomeMaquina.getText();
        marcaMaquina = jTextFieldMarcaMaquina.getText();
        anoMaquina = Integer.parseInt(jTextFieldAnoMaquina.getText());
        chassiMaquina = jTextFieldChassiMaquina.getText();
        buttonGroupEstado.add(jRadioEstadoAtivo);
        buttonGroupEstado.add(jRadioEstadoInativo);
        
        tipoMaquina = "Maquina de Plantio";
        
        int quantidadeDeSacas = Integer.parseInt(jTextFieldCapacidadeDeSementes.getText());
        int quantidadeDeLinhas = Integer.parseInt(jTextFieldQuantidadeDeLinhas.getText());
        
        if (quantidadeDeSacas <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de sacas Inválida");
            return;
        }
        
        if (quantidadeDeLinhas <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de linhas Inválida");
            return;
        }
        
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
        
        if (buttonGroupEstado.equals("")) {
            JOptionPane.showMessageDialog(null, "Adicione o nivel de Acesso");
        }

        if (buttonGroupEstado.equals(jRadioEstadoAtivo) && buttonGroupEstado.equals(jRadioEstadoInativo)) {
            JOptionPane.showMessageDialog(null, "Escolha apenas um nivel de acesso");
        }
        
        try {
            controleMaquina.maquinaDePlantio.setTipoMaquina(tipoMaquina);
            controleMaquina.maquinaDePlantio.setNomeMaquina(nomeMaquina);
            controleMaquina.maquinaDePlantio.setMarcaMaquina(marcaMaquina);
            controleMaquina.maquinaDePlantio.setAnoMaquina(anoMaquina);
            controleMaquina.maquinaDePlantio.setChassiMaquina(chassiMaquina);
            controleMaquina.maquinaDePlantio.setEstadoMaquina(estado);
            controleMaquina.maquinaDePlantio.setCapacidadeDeSementes(quantidadeDeSacas);
            controleMaquina.maquinaDePlantio.setQuantidadeDeLinhas(quantidadeDeLinhas);
            
            msg = controleMaquina.cadastrarMaquinaDePlantio(ControleMaquina.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
        }catch (NullPointerException ex) {
            System.out.println("Problema no sistema, tipo: ");
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastroDeMaquina;
    private javax.swing.JButton jButtonConfirmarCadastroDeMaquina;
    private javax.swing.JButton jButtonSairDaTelaCadastrarCarretaGraneleira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioEstadoAtivo;
    private javax.swing.JRadioButton jRadioEstadoInativo;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDeSementes;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldQuantidadeDeLinhas;
    // End of variables declaration//GEN-END:variables
}
