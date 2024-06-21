package Maquina.CRUDCarregador;

import Maquina.Carregador;
import Maquina.ControleMaquina;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoCarregador extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private int anoAtualizado;
    private String nomeAtualizado;
    private String marcaAtualizado;
    private String chassiAtualizado;
    private String estadoAtualizado;
    private int idParaBuscaCarregador;
    private Double pesoSuportado1;

    public TelaDeAtualizacaoCarregador() {
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
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jLabelFundoAtualizacao = new javax.swing.JLabel();

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
        getContentPane().add(jTextFieldNomeMaquinaBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 117, 305, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 226, 272, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 308, 271, 29));

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 394, 271, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 485, 271, 29));

        jTextFieldEstadoMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoMaquina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoMaquina.setBorder(null);
        jTextFieldEstadoMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 581, 271, 29));

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
        getContentPane().add(jTextFieldPesoSuportado, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 226, 271, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 108, 281, 42));

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
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 550, 282, 36));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 598, 282, 37));

        jLabelFundoAtualizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasCarregador/img_tela_atualizacao_carregador.png"))); // NOI18N
        getContentPane().add(jLabelFundoAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            consultarCarregador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoCarregador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDCarregador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarCarregador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoCarregador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

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

    private void jTextFieldPesoSuportadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoSuportadoActionPerformed

    }//GEN-LAST:event_jTextFieldPesoSuportadoActionPerformed

    private void jTextFieldNomeMaquinaBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    public void atualizarCarregador() throws SQLException {

        if (jTextFieldNomeMaquinaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um carregador");
            return;
        }

        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do carregador");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do carregador");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do carregador");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do carregador (17 Digitos)");
            return;
        }

        if (jTextFieldEstadoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado do carregador:\nA para Ativo\nI para Inativo");
            return;
        }

        if (jTextFieldPesoSuportado.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o peso do carregador");
            return;
        }
        nomeAtualizado = jTextFieldNomeMaquina.getText();
        marcaAtualizado = jTextFieldMarcaMaquina.getText();
        chassiAtualizado = jTextFieldChassiMaquina.getText();
        estadoAtualizado = jTextFieldEstadoMaquina.getText().toUpperCase();

        try {
            anoAtualizado = Integer.parseInt(jTextFieldAnoMaquina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ano é um valor numérico (Ex: 2024)");
            return;
        }

        try {
            pesoSuportado1 = Double.valueOf(jTextFieldPesoSuportado.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O peso deve ser numérico");
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

        if (pesoSuportado1 < 0) {
            JOptionPane.showMessageDialog(null, "Peso Inválido");
            return;
        }

        if (estadoAtualizado.equalsIgnoreCase("A") || estadoAtualizado.equalsIgnoreCase("I")) {
            Carregador carregadorAtualizado = new Carregador();
            carregadorAtualizado.setNomeMaquina(nomeAtualizado);
            carregadorAtualizado.setMarcaMaquina(marcaAtualizado);
            carregadorAtualizado.setAnoMaquina(anoAtualizado);
            carregadorAtualizado.setEstadoMaquina(estadoAtualizado);
            carregadorAtualizado.setChassiMaquina(chassiAtualizado);
            carregadorAtualizado.setPesoSuportado(pesoSuportado1);
            carregadorAtualizado.setIdCarregador(idParaBuscaCarregador);

            controleMaquina = new ControleMaquina();
            String msgAtualizacao = controleMaquina.atualizarCarregador(carregadorAtualizado);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Estado inválido\nA para Ativo\nI para Inativo");
        }
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
            idParaBuscaCarregador = carregadorEncontrado.getIdCarregador();
        } else {
            JOptionPane.showMessageDialog(this, "Carregador não encontrado");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldAnoMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldEstadoMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldNomeMaquina.setText("");
        jTextFieldNomeMaquinaBuscada.setText("");
        jTextFieldPesoSuportado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMaquina;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoAtualizacao;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldEstadoMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquinaBuscada;
    private javax.swing.JTextField jTextFieldPesoSuportado;
    // End of variables declaration//GEN-END:variables
}
