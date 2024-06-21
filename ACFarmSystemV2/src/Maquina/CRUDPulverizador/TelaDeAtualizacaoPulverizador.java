package Maquina.CRUDPulverizador;

import Maquina.ControleMaquina;
import Maquina.Pulverizador;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoPulverizador extends javax.swing.JFrame {

    ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private int anoAtualizado;
    private String nomeAtualizado;
    private String marcaAtualizado;
    private String chassiAtualizado;
    private String estadoAtualizado;
    private String nomeMaquina;
    private int idMaquina;
    private Double capacidadeDoReservatorioAtualizado;

    public TelaDeAtualizacaoPulverizador() {
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
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jLabelFundoAtualizacao = new javax.swing.JLabel();

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
        getContentPane().add(jTextFieldNomePulverizadorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 112, 304, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 221, 271, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 304, 271, 29));

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 389, 271, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 480, 271, 29));

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
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 572, 271, 29));

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
        getContentPane().add(jTextFieldCapacidadeDoReservatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 222, 271, 29));

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
        getContentPane().add(jTextFieldTipoDeCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 304, 271, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 101, 281, 44));

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

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setBorderPainted(false);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 544, 281, 35));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 594, 280, 34));

        jLabelFundoAtualizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasPulverizador/img_tela_atualizacao_pulverizador.png"))); // NOI18N
        getContentPane().add(jLabelFundoAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            buscarPulverizador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoPulverizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDPulverizador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarPulverizador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoPulverizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

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

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    public void atualizarPulverizador() throws SQLException {
        if (jTextFieldNomePulverizadorBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma pulverizador");
            return;
        }

        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do pulverizador");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do pulverizador");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do pulverizador");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do pulverizador (17 Digitos)");
            return;
        }

        if (jTextFieldEstadoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado da maquina:\nA para Ativo\nI para Inativo");
            return;
        }

        if (jTextFieldCapacidadeDoReservatorio.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do pulverizador");
            return;
        }

        if (jTextFieldTipoDeCultura.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o tipo de cultura:\nMilho\nSoja");
            return;
        }

        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        nomeAtualizado = jTextFieldNomeMaquina.getText();
        marcaAtualizado = jTextFieldMarcaMaquina.getText();
        chassiAtualizado = jTextFieldChassiMaquina.getText();
        estadoAtualizado = jTextFieldEstadoMaquina.getText();

        String tipoCultura = jTextFieldTipoDeCultura.getText();

        try {
            anoAtualizado = Integer.parseInt(jTextFieldAnoMaquina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ano é um valor numérico (Ex: 2024)");
            return;
        }

        try {
            capacidadeDoReservatorioAtualizado = Double.valueOf(jTextFieldCapacidadeDoReservatorio.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A capacidade do reservatorio é um valor numérico");
            return;
        }

        if (chassiAtualizado.length() != 17) {
            JOptionPane.showMessageDialog(this, "Chassi Inválido");
            return;
        }

        if (anoAtualizado > (anoAtual + 1) || anoAtualizado < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (capacidadeDoReservatorioAtualizado <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade do reservatorio Inválida");
            return;
        }

        if (tipoCultura.equalsIgnoreCase("soja") || tipoCultura.equalsIgnoreCase("milho")) {
            if (estadoAtualizado.equalsIgnoreCase("A") || estadoAtualizado.equalsIgnoreCase("I")) {
                Pulverizador pulverizadorAtualizado = new Pulverizador();
                pulverizadorAtualizado.setNomeMaquina(nomeAtualizado);
                pulverizadorAtualizado.setMarcaMaquina(marcaAtualizado);
                pulverizadorAtualizado.setAnoMaquina(anoAtualizado);
                pulverizadorAtualizado.setEstadoMaquina(estadoAtualizado);
                pulverizadorAtualizado.setChassiMaquina(chassiAtualizado);
                pulverizadorAtualizado.setTipoDeCultura(tipoCultura);
                pulverizadorAtualizado.setCapacidadeDoReservatorio(capacidadeDoReservatorioAtualizado);
                pulverizadorAtualizado.setIdPulverizador(idMaquina);

                controleMaquina = new ControleMaquina();
                String msgAtualizacao = controleMaquina.atualizarPulverizador(pulverizadorAtualizado);
                JOptionPane.showMessageDialog(null, msgAtualizacao);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Estado inválido\nA para Ativo\nI para Inativo");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cultura Inválida:\nMilho\nSoja");
            return;
        }

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
            idMaquina = pulverizadorEncontrado.getIdPulverizador();
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
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoAtualizacao;
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
