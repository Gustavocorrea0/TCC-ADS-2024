package Maquina.CRUDPulverizador;

import Maquina.ControleMaquina;
import Maquina.Pulverizador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeRemocaoPulverizador extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private String limparCampo = "";
    private int idMaquina;
    private String mensagem;
    private String nomeMaquina;

    public TelaDeRemocaoPulverizador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomePulverizadorBuscado = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldEstadoMaquina = new javax.swing.JTextField();
        jTextFieldCapacidadeDoReservatorio = new javax.swing.JTextField();
        jTextFieldTipoDeCultura = new javax.swing.JTextField();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jLabelFundoConsultaCarregador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomePulverizadorBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePulverizadorBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePulverizadorBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePulverizadorBuscado.setBorder(null);
        jTextFieldNomePulverizadorBuscado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomePulverizadorBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePulverizadorBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePulverizadorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 116, 304, 29));

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

        jTextFieldCapacidadeDoReservatorio.setEditable(false);
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
        getContentPane().add(jTextFieldCapacidadeDoReservatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 227, 271, 29));

        jTextFieldTipoDeCultura.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTipoDeCultura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldTipoDeCultura.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTipoDeCultura.setBorder(null);
        jTextFieldTipoDeCultura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTipoDeCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoDeCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipoDeCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 309, 271, 29));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 550, 282, 35));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 598, 280, 36));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 106, 281, 45));

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

        jLabelFundoConsultaCarregador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasPulverizador/img_tela_remocao_pulverizador.png"))); // NOI18N
        getContentPane().add(jLabelFundoConsultaCarregador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            buscarPulverizador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoPulverizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDPulverizador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerPulverizador();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jTextFieldNomePulverizadorBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePulverizadorBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomePulverizadorBuscadoActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    private void jTextFieldEstadoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoMaquinaActionPerformed

    private void jTextFieldCapacidadeDoReservatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoReservatorioActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoReservatorioActionPerformed

    private void jTextFieldTipoDeCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoDeCulturaActionPerformed

    }//GEN-LAST:event_jTextFieldTipoDeCulturaActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoção Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void removerPulverizador() {
        if (jTextFieldNomePulverizadorBuscado.getText().isBlank() || jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um pulverizador");
            return;
        }

        nomeMaquina = jTextFieldNomePulverizadorBuscado.getText();
        mensagem = controleMaquina.removerPulverizador(nomeMaquina);
        JOptionPane.showMessageDialog(this, mensagem);
        limparCampos();
    }

    public void buscarPulverizador() throws SQLException {
        if (jTextFieldNomePulverizadorBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do pulverizador");
            return;
        }

        nomeMaquina = jTextFieldNomePulverizadorBuscado.getText();
        Pulverizador pulverizadorEncontrado = controleMaquina.buscarPulverizador(nomeMaquina);

        if (pulverizadorEncontrado != null) {
            String capacidadeDoReservatorio = Double.toString(pulverizadorEncontrado.getCapacidadeDoReservatorio());
            ano = Integer.toString(pulverizadorEncontrado.getAnoMaquina());

            jTextFieldNomeMaquina.setText(pulverizadorEncontrado.getNomeMaquina());
            jTextFieldMarcaMaquina.setText(pulverizadorEncontrado.getMarcaMaquina());
            jTextFieldAnoMaquina.setText(ano);
            jTextFieldChassiMaquina.setText(pulverizadorEncontrado.getChassiMaquina());
            jTextFieldEstadoMaquina.setText(pulverizadorEncontrado.getEstadoMaquina());
            jTextFieldCapacidadeDoReservatorio.setText(capacidadeDoReservatorio);
            jTextFieldTipoDeCultura.setText(pulverizadorEncontrado.getTipoDeCultura());

            jTextFieldNomeMaquina.setEnabled(false);
            jTextFieldMarcaMaquina.setEnabled(false);
            jTextFieldAnoMaquina.setEnabled(false);
            jTextFieldChassiMaquina.setEnabled(false);
            jTextFieldEstadoMaquina.setEnabled(false);
            jTextFieldCapacidadeDoReservatorio.setEnabled(false);
            jTextFieldTipoDeCultura.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Pulverizador não encontrado");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldNomeMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldAnoMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldEstadoMaquina.setText("");
        jTextFieldCapacidadeDoReservatorio.setText("");
        jTextFieldTipoDeCultura.setText("");
        jTextFieldNomePulverizadorBuscado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMaquina;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoConsultaCarregador;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDoReservatorio;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldEstadoMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNomePulverizadorBuscado;
    private javax.swing.JTextField jTextFieldTipoDeCultura;
    // End of variables declaration//GEN-END:variables
}
