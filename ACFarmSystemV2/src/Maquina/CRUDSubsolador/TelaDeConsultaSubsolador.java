package Maquina.CRUDSubsolador;

import Maquina.ControleMaquina;
import Maquina.Subsolador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeConsultaSubsolador extends javax.swing.JFrame {

    ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private String nomeMaquina;

    private String larguraEmMM;
    private String peso;
    private String numeroDeHastes;
    private String potenciaTrator;

    public TelaDeConsultaSubsolador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeMaquinaBuscada = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldNumeroDeHastes = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldPotenciaDoTrator = new javax.swing.JTextField();
        jTextFieldEstadoMaquina = new javax.swing.JTextField();
        jTextFieldLarguraEmMM = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jLabelFundoConsultaCarregador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeMaquinaBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeMaquinaBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeMaquinaBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeMaquinaBuscada.setBorder(null);
        jTextFieldNomeMaquinaBuscada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeMaquinaBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMaquinaBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeMaquinaBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 116, 304, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 219, 271, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 302, 271, 29));

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
        getContentPane().add(jTextFieldNumeroDeHastes, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 306, 271, 29));

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 387, 271, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 478, 270, 29));

        jTextFieldPotenciaDoTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPotenciaDoTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPotenciaDoTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaDoTrator.setBorder(null);
        jTextFieldPotenciaDoTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaDoTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPotenciaDoTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPotenciaDoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 397, 271, 29));

        jTextFieldEstadoMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoMaquina.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoMaquina.setBorder(null);
        jTextFieldEstadoMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 574, 271, 29));

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
        getContentPane().add(jTextFieldLarguraEmMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 221, 271, 29));

        jTextFieldPeso.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPeso.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPeso.setBorder(null);
        jTextFieldPeso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 478, 271, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 108, 282, 42));

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

        jLabelFundoConsultaCarregador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasSubsolador/img_tela_consulta_subsolador.png"))); // NOI18N
        getContentPane().add(jLabelFundoConsultaCarregador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroDeHastesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeHastesActionPerformed

    }//GEN-LAST:event_jTextFieldNumeroDeHastesActionPerformed

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            buscarSubsolador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeConsultaSubsolador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDSubsolador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jTextFieldPotenciaDoTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPotenciaDoTratorActionPerformed

    }//GEN-LAST:event_jTextFieldPotenciaDoTratorActionPerformed

    private void jTextFieldEstadoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoMaquinaActionPerformed

    private void jTextFieldLarguraEmMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLarguraEmMMActionPerformed

    }//GEN-LAST:event_jTextFieldLarguraEmMMActionPerformed

    private void jTextFieldPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoActionPerformed

    }//GEN-LAST:event_jTextFieldPesoActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldNomeMaquinaBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    public void buscarSubsolador() throws SQLException {
        if (jTextFieldNomeMaquinaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do subsolador");
            return;
        }

        nomeMaquina = jTextFieldNomeMaquinaBuscada.getText();
        Subsolador subsoladorEncontrado = controleMaquina.buscarSubsolador(nomeMaquina);

        if (subsoladorEncontrado != null) {
            ano = Integer.toString(subsoladorEncontrado.getAnoMaquina());
            larguraEmMM = Double.toString(subsoladorEncontrado.getLarguraEmMM());
            peso = Double.toString(subsoladorEncontrado.getPeso());
            numeroDeHastes = Integer.toString(subsoladorEncontrado.getNumeroDeHastes());
            potenciaTrator = Integer.toString(subsoladorEncontrado.getPotenciaNecessariaTratorEmCv());

            jTextFieldNomeMaquina.setText(subsoladorEncontrado.getNomeMaquina());
            jTextFieldMarcaMaquina.setText(subsoladorEncontrado.getMarcaMaquina());
            jTextFieldAnoMaquina.setText(ano);
            jTextFieldChassiMaquina.setText(subsoladorEncontrado.getChassiMaquina());
            jTextFieldEstadoMaquina.setText(subsoladorEncontrado.getEstadoMaquina());
            jTextFieldPotenciaDoTrator.setText(potenciaTrator);
            jTextFieldPeso.setText(peso);
            jTextFieldNumeroDeHastes.setText(numeroDeHastes);
            jTextFieldLarguraEmMM.setText(larguraEmMM);

            jTextFieldNomeMaquina.setEnabled(false);
            jTextFieldMarcaMaquina.setEnabled(false);
            jTextFieldAnoMaquina.setEnabled(false);
            jTextFieldChassiMaquina.setEnabled(false);
            jTextFieldEstadoMaquina.setEnabled(false);
            jTextFieldPotenciaDoTrator.setEnabled(false);
            jTextFieldPeso.setEnabled(false);
            jTextFieldNumeroDeHastes.setEnabled(false);
            jTextFieldLarguraEmMM.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Subsolador não encontrado");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldNomeMaquinaBuscada.setText("");
        jTextFieldNomeMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldAnoMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldEstadoMaquina.setText("");
        jTextFieldPotenciaDoTrator.setText("");
        jTextFieldPeso.setText("");
        jTextFieldNumeroDeHastes.setText("");
        jTextFieldLarguraEmMM.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMaquina;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoConsultaCarregador;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldEstadoMaquina;
    private javax.swing.JTextField jTextFieldLarguraEmMM;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquinaBuscada;
    private javax.swing.JTextField jTextFieldNumeroDeHastes;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPotenciaDoTrator;
    // End of variables declaration//GEN-END:variables
}
