package Maquina.CRUDMaquinaDePlantio;

import Maquina.ControleMaquina;
import Maquina.MaquinaDePlantio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeConsultaMaquinaDePlantio extends javax.swing.JFrame {

    ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private String nomeMaquina;

    public TelaDeConsultaMaquinaDePlantio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCapacidadeDeSementes = new javax.swing.JTextField();
        jTextFieldQuantidadeDeLinhas = new javax.swing.JTextField();
        jTextFieldNomePlantadeiraBuscada = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldEstadoMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jLabelFundoConsultaCarregador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCapacidadeDeSementes.setEditable(false);
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
        getContentPane().add(jTextFieldCapacidadeDeSementes, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 222, 271, 29));

        jTextFieldQuantidadeDeLinhas.setEditable(false);
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
        getContentPane().add(jTextFieldQuantidadeDeLinhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 308, 272, 29));

        jTextFieldNomePlantadeiraBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePlantadeiraBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePlantadeiraBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePlantadeiraBuscada.setBorder(null);
        getContentPane().add(jTextFieldNomePlantadeiraBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 116, 304, 29));

        jTextFieldNomeMaquina.setEditable(false);
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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 219, 271, 29));

        jTextFieldAnoMaquina.setEditable(false);
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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 387, 271, 29));

        jTextFieldChassiMaquina.setEditable(false);
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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 478, 271, 29));

        jTextFieldEstadoMaquina.setEditable(false);
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
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 574, 271, 29));

        jTextFieldMarcaMaquina.setEditable(false);
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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 301, 271, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 108, 282, 43));

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

        jLabelFundoConsultaCarregador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasMaquinaDePlantio/img_tela_consulta_maquina_de_plantio.png"))); // NOI18N
        getContentPane().add(jLabelFundoConsultaCarregador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCapacidadeDeSementesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeSementesActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeSementesActionPerformed

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            buscarMaquinaDePlantio();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeConsultaMaquinaDePlantio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDMaquinaDePlantio().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jTextFieldQuantidadeDeLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeDeLinhasActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeDeLinhasActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    private void jTextFieldEstadoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoMaquinaActionPerformed

    public void buscarMaquinaDePlantio() throws SQLException {
        if (jTextFieldNomePlantadeiraBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da maquina de plantio");
            return;
        }
        nomeMaquina = jTextFieldNomePlantadeiraBuscada.getText();
        MaquinaDePlantio maquinaDePlantioEncontrada = controleMaquina.buscarMaquinaDePlantio(nomeMaquina);

        if (maquinaDePlantioEncontrada != null) {

            ano = Integer.toString(maquinaDePlantioEncontrada.getAnoMaquina());
            String quantidadeDeLihas = Integer.toString(maquinaDePlantioEncontrada.getQuantidadeDeLinhas());
            String capacidadeDeSementes = Integer.toString(maquinaDePlantioEncontrada.getCapacidadeDeSementes());

            jTextFieldNomeMaquina.setText(maquinaDePlantioEncontrada.getNomeMaquina());
            jTextFieldMarcaMaquina.setText(maquinaDePlantioEncontrada.getMarcaMaquina());
            jTextFieldAnoMaquina.setText(ano);
            jTextFieldChassiMaquina.setText(maquinaDePlantioEncontrada.getChassiMaquina());
            jTextFieldEstadoMaquina.setText(maquinaDePlantioEncontrada.getEstadoMaquina());
            jTextFieldQuantidadeDeLinhas.setText(quantidadeDeLihas);
            jTextFieldCapacidadeDeSementes.setText(capacidadeDeSementes);

            jTextFieldNomeMaquina.setEnabled(false);
            jTextFieldMarcaMaquina.setEnabled(false);
            jTextFieldAnoMaquina.setEnabled(false);
            jTextFieldChassiMaquina.setEnabled(false);
            jTextFieldEstadoMaquina.setEnabled(false);
            jTextFieldQuantidadeDeLinhas.setEnabled(false);
            jTextFieldCapacidadeDeSementes.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Maquina de plantio não encontrada");

            jTextFieldNomeMaquina.setText("");
            jTextFieldMarcaMaquina.setText("");
            jTextFieldAnoMaquina.setText("");
            jTextFieldChassiMaquina.setText("");
            jTextFieldEstadoMaquina.setText("");
            jTextFieldQuantidadeDeLinhas.setText("");
            jTextFieldCapacidadeDeSementes.setText("");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMaquina;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoConsultaCarregador;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDeSementes;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldEstadoMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNomePlantadeiraBuscada;
    private javax.swing.JTextField jTextFieldQuantidadeDeLinhas;
    // End of variables declaration//GEN-END:variables
}
