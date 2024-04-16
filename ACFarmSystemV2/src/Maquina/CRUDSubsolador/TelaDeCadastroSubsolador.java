/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Maquina.CRUDSubsolador;


import Maquina.ControleMaquina;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Camacho
 */
public class TelaDeCadastroSubsolador extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String msg = null;
    private String estado = null;
    private String tipoMaquina = null;
    private String nomeMaquina = null;
    private String marcaMaquina = null;
    private int anoMaquina;
    private String chassiMaquina = null;
    public TelaDeCadastroSubsolador() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldPotenciaNecessariaDoTrator = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldPesoDoSubsolador = new javax.swing.JTextField();
        jTextFieldLarguraEmMM = new javax.swing.JTextField();
        jTextFieldNumeroDeHastes = new javax.swing.JTextField();
        jRadioEstadoInativo = new javax.swing.JRadioButton();
        jRadioEstadoAtivo = new javax.swing.JRadioButton();
        jButtonCancelarCadastroDeMaquina = new javax.swing.JButton();
        jButtonConfirmarCadastroDeMaquina = new javax.swing.JButton();
        jButtonSairDaTelaCadastrarCarretaGraneleira = new javax.swing.JButton();
        jLabelFundoCadastroSubsolador = new javax.swing.JLabel();

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 304, 270, 27));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 395, 270, 27));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 219, 270, 27));

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
        getContentPane().add(jTextFieldPotenciaNecessariaDoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 419, 270, 27));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 136, 270, 27));

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
        getContentPane().add(jTextFieldPesoDoSubsolador, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 133, 270, 27));

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
        getContentPane().add(jTextFieldLarguraEmMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 219, 270, 27));

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
        getContentPane().add(jTextFieldNumeroDeHastes, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 304, 270, 27));

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
        getContentPane().add(jButtonCancelarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 599, 280, 33));

        jButtonConfirmarCadastroDeMaquina.setBorder(null);
        jButtonConfirmarCadastroDeMaquina.setBorderPainted(false);
        jButtonConfirmarCadastroDeMaquina.setContentAreaFilled(false);
        jButtonConfirmarCadastroDeMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDeMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDeMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 549, 280, 33));

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

        jLabelFundoCadastroSubsolador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasDeCadastro/img_tela_cadastro_de_subsolador.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadastroSubsolador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

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

    private void jTextFieldPotenciaNecessariaDoTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPotenciaNecessariaDoTratorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPotenciaNecessariaDoTratorActionPerformed

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
        new TelaCRUDSubsolador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaCadastrarCarretaGraneleiraActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldPesoDoSubsoladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoDoSubsoladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesoDoSubsoladorActionPerformed

    private void jTextFieldLarguraEmMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLarguraEmMMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLarguraEmMMActionPerformed

    private void jTextFieldNumeroDeHastesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeHastesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroDeHastesActionPerformed

    private void jButtonConfirmarCadastroDeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed
        // TODO add your handling code here:
        cadastrarSubsolador();
    }//GEN-LAST:event_jButtonConfirmarCadastroDeMaquinaActionPerformed

    public void cadastrarSubsolador(){
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        nomeMaquina = jTextFieldNomeMaquina.getText();
        marcaMaquina = jTextFieldMarcaMaquina.getText();
        anoMaquina = Integer.parseInt(jTextFieldAnoMaquina.getText());
        chassiMaquina = jTextFieldChassiMaquina.getText();
        buttonGroupEstado.add(jRadioEstadoAtivo);
        buttonGroupEstado.add(jRadioEstadoInativo);
        
         tipoMaquina = "Subsolador ";
         
         Double peso = Double.valueOf(jTextFieldPesoDoSubsolador.getText());
         Double largura = Double.valueOf(jTextFieldLarguraEmMM.getText());
         int numeroDeHastes = Integer.parseInt(jTextFieldNumeroDeHastes.getText());
         int potenciaNecessariaDoTrator =  Integer.parseInt(jTextFieldPotenciaNecessariaDoTrator.getText());
         
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
    private javax.swing.JLabel jLabelFundoCadastroSubsolador;
    private javax.swing.JRadioButton jRadioEstadoAtivo;
    private javax.swing.JRadioButton jRadioEstadoInativo;
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
