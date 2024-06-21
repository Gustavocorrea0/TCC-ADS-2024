package Maquina.CRUDColheitadeira;

import Maquina.Colheitadeira;
import Maquina.ControleMaquina;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeRemocaoColheitadeira extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private String limparCampo = "";
    private String mensagem;
    private String nomeMaquina;

    public TelaDeRemocaoColheitadeira() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeColheitadeiraBuscada = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldEstadoMaquina = new javax.swing.JTextField();
        jTextFieldQuantidadeDeSacas = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueDeCombustivel = new javax.swing.JTextField();
        jTextFieldTipoDeCultura = new javax.swing.JTextField();
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jLabelFundoConsultaCarregador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeColheitadeiraBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeColheitadeiraBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeColheitadeiraBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeColheitadeiraBuscada.setBorder(null);
        getContentPane().add(jTextFieldNomeColheitadeiraBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 116, 305, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 219, 271, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 301, 271, 29));

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 387, 271, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 478, 271, 29));

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
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 574, 271, 29));

        jTextFieldQuantidadeDeSacas.setEditable(false);
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
        getContentPane().add(jTextFieldQuantidadeDeSacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 223, 272, 29));

        jTextFieldCapacidadeDoTanqueDeCombustivel.setEditable(false);
        jTextFieldCapacidadeDoTanqueDeCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueDeCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueDeCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueDeCombustivel.setBorder(null);
        jTextFieldCapacidadeDoTanqueDeCombustivel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueDeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoTanqueDeCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoTanqueDeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 309, 352, 29));

        jTextFieldTipoDeCultura.setEditable(false);
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
        getContentPane().add(jTextFieldTipoDeCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 394, 270, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 106, 282, 44));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 280, 35));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 599, 280, 35));

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

        jLabelFundoConsultaCarregador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasColheitadeira/img_tela_remocao_colheitadeira.png"))); // NOI18N
        getContentPane().add(jLabelFundoConsultaCarregador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            consultarColheitadeira();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoColheitadeira.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDColheitadeira().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerColheitadeira();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    private void jTextFieldEstadoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoMaquinaActionPerformed

    private void jTextFieldQuantidadeDeSacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeDeSacasActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeDeSacasActionPerformed

    private void jTextFieldCapacidadeDoTanqueDeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoTanqueDeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoTanqueDeCombustivelActionPerformed

    private void jTextFieldTipoDeCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoDeCulturaActionPerformed

    }//GEN-LAST:event_jTextFieldTipoDeCulturaActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoção Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void removerColheitadeira() {
        if (jTextFieldNomeColheitadeiraBuscada.getText().isBlank() || jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma colheitadeira");
            return;
        }

        nomeMaquina = jTextFieldNomeColheitadeiraBuscada.getText();
        mensagem = controleMaquina.removerColheitadeira(nomeMaquina);
        JOptionPane.showMessageDialog(this, mensagem);
        limparCampos();
    }

    public void consultarColheitadeira() throws SQLException {
        if (jTextFieldNomeColheitadeiraBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da colheitadeira");
            return;
        }

        nomeMaquina = jTextFieldNomeColheitadeiraBuscada.getText();
        Colheitadeira colheitadeiraEncontrado = controleMaquina.buscarColheitadeira(nomeMaquina);

        if (colheitadeiraEncontrado != null) {

            ano = Integer.toString(colheitadeiraEncontrado.getAnoMaquina());
            String quantidadeDeSacos = Integer.toString(colheitadeiraEncontrado.getQuantidadeDeSacos());
            String capacidadeDoTanqueDeCombustivel = Double.toString(colheitadeiraEncontrado.getCapacidadeDoTanqueDeCombustivel());

            jTextFieldNomeMaquina.setText(colheitadeiraEncontrado.getNomeMaquina());
            jTextFieldMarcaMaquina.setText(colheitadeiraEncontrado.getMarcaMaquina());
            jTextFieldAnoMaquina.setText(ano);
            jTextFieldChassiMaquina.setText(colheitadeiraEncontrado.getChassiMaquina());
            jTextFieldEstadoMaquina.setText(colheitadeiraEncontrado.getEstadoMaquina());
            jTextFieldQuantidadeDeSacas.setText(quantidadeDeSacos);
            jTextFieldCapacidadeDoTanqueDeCombustivel.setText(capacidadeDoTanqueDeCombustivel);
            jTextFieldTipoDeCultura.setText(colheitadeiraEncontrado.getCultura());

            jTextFieldNomeMaquina.setEnabled(false);
            jTextFieldMarcaMaquina.setEnabled(false);
            jTextFieldAnoMaquina.setEnabled(false);
            jTextFieldTipoDeCultura.setEnabled(false);
            jTextFieldEstadoMaquina.setEnabled(false);
            jTextFieldQuantidadeDeSacas.setEnabled(false);
            jTextFieldCapacidadeDoTanqueDeCombustivel.setEnabled(false);
            jTextFieldEstadoMaquina.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Colheitadeira não encontrada");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldChassiMaquina.setText("");
        jTextFieldAnoMaquina.setText("");
        jTextFieldCapacidadeDoTanqueDeCombustivel.setText("");
        jTextFieldQuantidadeDeSacas.setText("");
        jTextFieldTipoDeCultura.setText("");
        jTextFieldEstadoMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldNomeMaquina.setText("");
        jTextFieldNomeColheitadeiraBuscada.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMaquina;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoConsultaCarregador;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueDeCombustivel;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldEstadoMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeColheitadeiraBuscada;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldQuantidadeDeSacas;
    private javax.swing.JTextField jTextFieldTipoDeCultura;
    // End of variables declaration//GEN-END:variables
}
