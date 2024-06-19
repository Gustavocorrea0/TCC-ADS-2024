package Veiculo.CRUDTrator;

import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDTrator;
import Veiculo.Trator;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Gustavo
 */
public class TelaDeVerificacaoDeTrator extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String anoVeiculo;
    private String capacidadeDoTanque;
    private String numeroDeMarchas;
    private String potenciaTrator;
    private String quantidadeDeRodas;

    public TelaDeVerificacaoDeTrator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeVeiculo = new javax.swing.JButton();
        jTextFieldNomeTratorBuscado = new javax.swing.JTextField();
        jTextFieldMarcaTrator = new javax.swing.JTextField();
        jTextFieldAnoTrator = new javax.swing.JTextField();
        jTextFieldChassiTrator = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueTrator = new javax.swing.JTextField();
        jTextFieldEstadoTrator = new javax.swing.JTextField();
        jTextFieldNomeTrator = new javax.swing.JTextField();
        jTextFieldPotenciaEmCVTrator = new javax.swing.JTextField();
        jTextFieldQuantidadeDeRodasTrator = new javax.swing.JTextField();
        jTextFieldNumeroDeMarchasTrator = new javax.swing.JTextField();
        jButtonBuscarTrator = new javax.swing.JButton();
        jLabelTelaVerificacaoDeTrator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarAoTelaDeVeiculo.setBorder(null);
        jButtonVoltarAoTelaDeVeiculo.setBorderPainted(false);
        jButtonVoltarAoTelaDeVeiculo.setContentAreaFilled(false);
        jButtonVoltarAoTelaDeVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoTelaDeVeiculo.setDefaultCapable(false);
        jButtonVoltarAoTelaDeVeiculo.setFocusPainted(false);
        jButtonVoltarAoTelaDeVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoTelaDeVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoTelaDeVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 24));

        jTextFieldNomeTratorBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeTratorBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeTratorBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeTratorBuscado.setBorder(null);
        jTextFieldNomeTratorBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeTratorBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeTratorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 116, 272, 28));

        jTextFieldMarcaTrator.setEditable(false);
        jTextFieldMarcaTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaTrator.setBorder(null);
        jTextFieldMarcaTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 316, 271, 28));

        jTextFieldAnoTrator.setEditable(false);
        jTextFieldAnoTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoTrator.setBorder(null);
        jTextFieldAnoTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAnoTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 399, 271, 29));

        jTextFieldChassiTrator.setEditable(false);
        jTextFieldChassiTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiTrator.setBorder(null);
        jTextFieldChassiTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldChassiTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldChassiTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 484, 271, 29));

        jTextFieldCapacidadeDoTanqueTrator.setEditable(false);
        jTextFieldCapacidadeDoTanqueTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueTrator.setBorder(null);
        jTextFieldCapacidadeDoTanqueTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoTanqueTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoTanqueTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 225, 271, 29));

        jTextFieldEstadoTrator.setEditable(false);
        jTextFieldEstadoTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoTrator.setBorder(null);
        jTextFieldEstadoTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 484, 63, 29));

        jTextFieldNomeTrator.setEditable(false);
        jTextFieldNomeTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeTrator.setBorder(null);
        jTextFieldNomeTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 224, 271, 29));

        jTextFieldPotenciaEmCVTrator.setEditable(false);
        jTextFieldPotenciaEmCVTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPotenciaEmCVTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPotenciaEmCVTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaEmCVTrator.setBorder(null);
        jTextFieldPotenciaEmCVTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaEmCVTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPotenciaEmCVTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPotenciaEmCVTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 316, 271, 29));

        jTextFieldQuantidadeDeRodasTrator.setEditable(false);
        jTextFieldQuantidadeDeRodasTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeDeRodasTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeDeRodasTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeRodasTrator.setBorder(null);
        jTextFieldQuantidadeDeRodasTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeRodasTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeDeRodasTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeDeRodasTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 571, 271, 29));

        jTextFieldNumeroDeMarchasTrator.setEditable(false);
        jTextFieldNumeroDeMarchasTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroDeMarchasTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNumeroDeMarchasTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeMarchasTrator.setBorder(null);
        jTextFieldNumeroDeMarchasTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeMarchasTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDeMarchasTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroDeMarchasTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 400, 271, 29));

        jButtonBuscarTrator.setBorder(null);
        jButtonBuscarTrator.setContentAreaFilled(false);
        jButtonBuscarTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 103, 280, 45));

        jLabelTelaVerificacaoDeTrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgTrator/img_tela_de_verificacao_de_trator.png"))); // NOI18N
        getContentPane().add(jLabelTelaVerificacaoDeTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoTelaDeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeVeiculoActionPerformed
        this.dispose();
        new TelaCRUDTrator().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeVeiculoActionPerformed

    private void jTextFieldNomeTratorBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeTratorBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeTratorBuscadoActionPerformed

    private void jTextFieldEstadoTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoTratorActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoTratorActionPerformed

    private void jTextFieldAnoTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoTratorActionPerformed

    }//GEN-LAST:event_jTextFieldAnoTratorActionPerformed

    private void jTextFieldChassiTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiTratorActionPerformed

    }//GEN-LAST:event_jTextFieldChassiTratorActionPerformed

    private void jTextFieldCapacidadeDoTanqueTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoTanqueTratorActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoTanqueTratorActionPerformed

    private void jTextFieldMarcaTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaTratorActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaTratorActionPerformed

    private void jTextFieldNomeTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeTratorActionPerformed

    }//GEN-LAST:event_jTextFieldNomeTratorActionPerformed

    private void jButtonBuscarTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTratorActionPerformed
        try {
            buscarTrator();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeVerificacaoDeTrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarTratorActionPerformed

    private void jTextFieldPotenciaEmCVTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPotenciaEmCVTratorActionPerformed

    }//GEN-LAST:event_jTextFieldPotenciaEmCVTratorActionPerformed

    private void jTextFieldQuantidadeDeRodasTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeDeRodasTratorActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeDeRodasTratorActionPerformed

    private void jTextFieldNumeroDeMarchasTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeMarchasTratorActionPerformed

    }//GEN-LAST:event_jTextFieldNumeroDeMarchasTratorActionPerformed

    public void buscarTrator() throws SQLException {
        if (jTextFieldNomeTratorBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do trator");
            return;
        }
        String nomeBuscaTrator = jTextFieldNomeTratorBuscado.getText();
        Trator tratorEncontrado = controleVeiculo.buscarTratorPorNome(nomeBuscaTrator);

        if (tratorEncontrado != null) {
            anoVeiculo = Integer.toString(tratorEncontrado.getAnoVeiculo());
            capacidadeDoTanque = Double.toString(tratorEncontrado.getCapacidadeDoTanqueDeCombustivel());
            numeroDeMarchas = Integer.toString(tratorEncontrado.getQuantidadeDeMarchas());
            potenciaTrator = Integer.toString(tratorEncontrado.getPotenciaEmCV());
            quantidadeDeRodas = Integer.toString(tratorEncontrado.getQuantidadeDeRodas());

            jTextFieldAnoTrator.setText(anoVeiculo);
            jTextFieldCapacidadeDoTanqueTrator.setText(capacidadeDoTanque);
            jTextFieldChassiTrator.setText(tratorEncontrado.getChassiVeiculo());
            jTextFieldEstadoTrator.setText(tratorEncontrado.getEstadoVeiculo());
            jTextFieldMarcaTrator.setText(tratorEncontrado.getMarcaVeiculo());
            jTextFieldNomeTrator.setText(tratorEncontrado.getNomeVeiculo());
            jTextFieldNumeroDeMarchasTrator.setText(numeroDeMarchas);
            jTextFieldPotenciaEmCVTrator.setText(potenciaTrator);
            jTextFieldQuantidadeDeRodasTrator.setText(quantidadeDeRodas);

            jTextFieldAnoTrator.setEnabled(false);
            jTextFieldCapacidadeDoTanqueTrator.setEnabled(false);
            jTextFieldChassiTrator.setEnabled(false);
            jTextFieldEstadoTrator.setEnabled(false);
            jTextFieldMarcaTrator.setEnabled(false);
            jTextFieldNomeTrator.setEnabled(false);
            jTextFieldNumeroDeMarchasTrator.setEnabled(false);
            jTextFieldPotenciaEmCVTrator.setEnabled(false);
            jTextFieldQuantidadeDeRodasTrator.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Veiculo não encontrado");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldAnoTrator.setText("");
        jTextFieldCapacidadeDoTanqueTrator.setText("");
        jTextFieldChassiTrator.setText("");
        jTextFieldEstadoTrator.setText("");
        jTextFieldMarcaTrator.setText("");
        jTextFieldNomeTrator.setText("");
        jTextFieldNomeTratorBuscado.setText("");
        jTextFieldNumeroDeMarchasTrator.setText("");
        jTextFieldPotenciaEmCVTrator.setText("");
        jTextFieldQuantidadeDeRodasTrator.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTrator;
    private javax.swing.JButton jButtonVoltarAoTelaDeVeiculo;
    private javax.swing.JLabel jLabelTelaVerificacaoDeTrator;
    private javax.swing.JTextField jTextFieldAnoTrator;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueTrator;
    private javax.swing.JTextField jTextFieldChassiTrator;
    private javax.swing.JTextField jTextFieldEstadoTrator;
    private javax.swing.JTextField jTextFieldMarcaTrator;
    private javax.swing.JTextField jTextFieldNomeTrator;
    private javax.swing.JTextField jTextFieldNomeTratorBuscado;
    private javax.swing.JTextField jTextFieldNumeroDeMarchasTrator;
    private javax.swing.JTextField jTextFieldPotenciaEmCVTrator;
    private javax.swing.JTextField jTextFieldQuantidadeDeRodasTrator;
    // End of variables declaration//GEN-END:variables

}
