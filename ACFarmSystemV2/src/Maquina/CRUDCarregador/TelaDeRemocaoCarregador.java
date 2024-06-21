package Maquina.CRUDCarregador;

import Maquina.Carregador;
import Maquina.ControleMaquina;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeRemocaoCarregador extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private String nomeMaquina;
    private String mensagem;

    public TelaDeRemocaoCarregador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeMaquinaBuscada = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldEstadoMaquina = new javax.swing.JTextField();
        jTextFieldPesoSuportado = new javax.swing.JTextField();
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jLabelFundoConsultaCarregador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeMaquinaBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeMaquinaBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeMaquinaBuscada.setBorder(null);
        jTextFieldNomeMaquinaBuscada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeMaquinaBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMaquinaBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeMaquinaBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 111, 305, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 214, 271, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 296, 271, 29));

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 382, 271, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 473, 271, 29));

        jTextFieldEstadoMaquina.setEditable(false);
        jTextFieldEstadoMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoMaquina.setBorder(null);
        jTextFieldEstadoMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 569, 271, 29));

        jTextFieldPesoSuportado.setEditable(false);
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
        getContentPane().add(jTextFieldPesoSuportado, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 221, 270, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 102, 280, 42));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 544, 282, 37));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 593, 280, 35));

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

        jLabelFundoConsultaCarregador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasCarregador/img_tela_remocao_carregador.png"))); // NOI18N
        getContentPane().add(jLabelFundoConsultaCarregador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            consultarCarregador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoCarregador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDCarregador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerCarregador();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jTextFieldNomeMaquinaBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    private void jTextFieldNomeMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaActionPerformed

    private void jTextFieldChassiMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldChassiMaquinaActionPerformed

    private void jTextFieldEstadoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoMaquinaActionPerformed

    private void jTextFieldPesoSuportadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoSuportadoActionPerformed

    }//GEN-LAST:event_jTextFieldPesoSuportadoActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoção Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    private void jTextFieldMarcaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaMaquinaActionPerformed

    private void jTextFieldAnoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoMaquinaActionPerformed

    }//GEN-LAST:event_jTextFieldAnoMaquinaActionPerformed

    public void removerCarregador() {
        if (jTextFieldNomeMaquinaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um carregador");
            return;
        }

        nomeMaquina = jTextFieldNomeMaquinaBuscada.getText();
        mensagem = controleMaquina.removerCarregador(nomeMaquina);
        JOptionPane.showMessageDialog(this, mensagem);
        limparCampos();
    }

    public void consultarCarregador() throws SQLException {
        if (jTextFieldNomeMaquinaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do carregador");
            return;
        }

        String nomeParaBusca = jTextFieldNomeMaquinaBuscada.getText();
        Carregador carregadorEncontrado = controleMaquina.buscarCarregador(nomeParaBusca);

        if (carregadorEncontrado != null) {

            String pesoSuportado = Double.toString(carregadorEncontrado.getPesoSuportado());
            ano = Integer.toString(carregadorEncontrado.getAnoMaquina());
            jTextFieldNomeMaquina.setText(carregadorEncontrado.getNomeMaquina());
            jTextFieldMarcaMaquina.setText(carregadorEncontrado.getMarcaMaquina());
            jTextFieldAnoMaquina.setText(ano);
            jTextFieldChassiMaquina.setText(carregadorEncontrado.getChassiMaquina());
            jTextFieldEstadoMaquina.setText(carregadorEncontrado.getEstadoMaquina());
            jTextFieldPesoSuportado.setText(pesoSuportado);
            int idMaquina = carregadorEncontrado.getIdCarregador();

            jTextFieldNomeMaquina.setEnabled(false);
            jTextFieldMarcaMaquina.setEnabled(false);
            jTextFieldAnoMaquina.setEnabled(false);
            jTextFieldChassiMaquina.setEnabled(false);
            jTextFieldEstadoMaquina.setEnabled(false);
            jTextFieldPesoSuportado.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Carregador não encontrado");
            limparCampos();
        }
    }

    public void limparCampos() {
        jTextFieldNomeMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldAnoMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldEstadoMaquina.setText("");
        jTextFieldPesoSuportado.setText("");
        jTextFieldNomeMaquinaBuscada.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMaquina;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoConsultaCarregador;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldEstadoMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquinaBuscada;
    private javax.swing.JTextField jTextFieldPesoSuportado;
    // End of variables declaration//GEN-END:variables
}
