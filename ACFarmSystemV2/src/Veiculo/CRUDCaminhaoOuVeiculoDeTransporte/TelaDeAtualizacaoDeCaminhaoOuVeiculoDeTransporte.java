package Veiculo.CRUDCaminhaoOuVeiculoDeTransporte;

import Veiculo.CaminhaoOuVeiculoDeTransporte;
import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDCaminhaoOuVeiculoDeTransporte;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoDeCaminhaoOuVeiculoDeTransporte extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String nomeParaBuscaCaminhao;
    private String nomeVeiculoAtualizado;
    private String marcaVeiculoAtualizado;
    private int anoVeiculoAtualizado;
    private String chassiVeiculoAtualizado;
    private String estadoVeiculoAtualizado;
    private Double capacidadeTanqueDeCombustivelAtualizado;
    private Double capacidadeDeCargaCaminhaoOuVeiculoDeTransporteAtualizada;

    private int idParaBuscaCaminhao;

    public TelaDeAtualizacaoDeCaminhaoOuVeiculoDeTransporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeEscolhaDeVeiculo = new javax.swing.JButton();
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado = new javax.swing.JTextField();
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldEstadoCaminhao = new javax.swing.JTextField();
        jButtonBuscarTrator = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jLabelTelaVerificacaoDeCaminhao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setBorder(null);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setBorderPainted(false);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setContentAreaFilled(false);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setDefaultCapable(false);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.setFocusPainted(false);
        jButtonVoltarAoTelaDeEscolhaDeVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoTelaDeEscolhaDeVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 24));

        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setBorder(null);
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 114, 271, 28));

        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 332, 270, 29));

        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 416, 271, 29));

        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldChassiCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 241, 272, 29));

        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 241, 271, 29));

        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 507, 271, 29));

        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 330, 272, 29));

        jTextFieldEstadoCaminhao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoCaminhao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoCaminhao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCaminhao.setBorder(null);
        jTextFieldEstadoCaminhao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoCaminhaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoCaminhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 414, 65, 29));

        jButtonBuscarTrator.setBorder(null);
        jButtonBuscarTrator.setContentAreaFilled(false);
        jButtonBuscarTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 105, 280, 45));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.setDefaultCapable(false);
        jButtonCancelarAtualizacao.setFocusPainted(false);
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 594, 282, 37));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setBorderPainted(false);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.setDefaultCapable(false);
        jButtonConfirmarAtualizacao.setFocusPainted(false);
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 545, 282, 37));

        jLabelTelaVerificacaoDeCaminhao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgCaminhao/img_tela_de_atualizacao_de_caminhao.png"))); // NOI18N
        getContentPane().add(jLabelTelaVerificacaoDeCaminhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed
        this.dispose();
        new TelaCRUDCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed

    private void jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscadoActionPerformed

    private void jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jButtonBuscarTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTratorActionPerformed
        try {
            buscarCaminhaoOuVeiculoDeTransporte();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDeCaminhaoOuVeiculoDeTransporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarTratorActionPerformed

    private void jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(null, "Atualização cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarCaminhaoOuVeiculoDeTransporte();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDeCaminhaoOuVeiculoDeTransporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    private void jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldEstadoCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoCaminhaoActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoCaminhaoActionPerformed

    public void atualizarCaminhaoOuVeiculoDeTransporte() throws SQLException {
        if (jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um caminhão");
            limparCampos();
            return;
        }
        
        if (jTextFieldNomeCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do caminhão");
            return;
        }

        if (jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do caminhão");
            return;
        }

        if (jTextFieldAnoCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do caminhão");
            return;
        }

        if (jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do tanque do caminhão");
            return;
        }

        if (jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade de carga do caminhão");
            return;
        }

        if (jTextFieldChassiCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do caminhão (17 Digitos)");
            return;
        }

        if (jTextFieldChassiCaminhaoOuVeiculoDeTransporte.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado do caminhão\nA para Ativo\nI para Inativo");
            return;
        }

        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        nomeVeiculoAtualizado = jTextFieldNomeCaminhaoOuVeiculoDeTransporte.getText();
        marcaVeiculoAtualizado = jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.getText();
        try {
            anoVeiculoAtualizado = Integer.parseInt(jTextFieldAnoCaminhaoOuVeiculoDeTransporte.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O ano deve ser númerico");
            return;
        }

        chassiVeiculoAtualizado = jTextFieldChassiCaminhaoOuVeiculoDeTransporte.getText();
        estadoVeiculoAtualizado = jTextFieldEstadoCaminhao.getText();

        try {
            capacidadeTanqueDeCombustivelAtualizado = Double.valueOf(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A capacidade do tanque deve ser númerica");
            return;
        }

        try {
            capacidadeDeCargaCaminhaoOuVeiculoDeTransporteAtualizada = Double.valueOf(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A capacidade de carga deve ser númerica");
            return;
        }

        try {
            if (anoVeiculoAtualizado > (anoAtual + 1) || anoVeiculoAtualizado < 1970) {
                JOptionPane.showMessageDialog(this, "Ano Inválido");
                return;
            }

            if (chassiVeiculoAtualizado.length() != 17) {
                JOptionPane.showMessageDialog(this, "Chassi Inválido");
                return;
            }

            if (estadoVeiculoAtualizado.isBlank()) {
                JOptionPane.showMessageDialog(this, "Estado Inválido");
                return;
            }

            if (capacidadeTanqueDeCombustivelAtualizado <= 0) {
                JOptionPane.showMessageDialog(this, "Capacidade do tanque Inválida");
                return;
            }

            if (capacidadeDeCargaCaminhaoOuVeiculoDeTransporteAtualizada <= 0) {
                JOptionPane.showMessageDialog(this, "Capacidade de carga Inválida");
                return;
            }

            if (estadoVeiculoAtualizado.equalsIgnoreCase("A") || estadoVeiculoAtualizado.equalsIgnoreCase("I")) {
                CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporteAtualizado = new CaminhaoOuVeiculoDeTransporte();
                caminhaoOuVeiculoDeTransporteAtualizado.setNomeVeiculo(nomeVeiculoAtualizado);
                caminhaoOuVeiculoDeTransporteAtualizado.setMarcaVeiculo(marcaVeiculoAtualizado);
                caminhaoOuVeiculoDeTransporteAtualizado.setAnoVeiculo(anoVeiculoAtualizado);
                caminhaoOuVeiculoDeTransporteAtualizado.setChassiVeiculo(chassiVeiculoAtualizado);
                caminhaoOuVeiculoDeTransporteAtualizado.setEstadoVeiculo(estadoVeiculoAtualizado);
                caminhaoOuVeiculoDeTransporteAtualizado.setCapacidadeDoTanqueDeCombustivel(capacidadeTanqueDeCombustivelAtualizado);
                caminhaoOuVeiculoDeTransporteAtualizado.setCapacidadeDeCarga(capacidadeDeCargaCaminhaoOuVeiculoDeTransporteAtualizada);
                caminhaoOuVeiculoDeTransporteAtualizado.setIdCaminhaoOuVeiculoDeTransporte(idParaBuscaCaminhao);

                controleVeiculo = new ControleVeiculo();
                String msgAtualizacao = controleVeiculo.atualizarCaminhaoOuVeiculoDeTransporte(caminhaoOuVeiculoDeTransporteAtualizado);
                JOptionPane.showMessageDialog(null, msgAtualizacao);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Estado inválido\nA para Ativo\nI para Inativo");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha tipo:" + ex);
        }
    }

    public void buscarCaminhaoOuVeiculoDeTransporte() throws SQLException {
        try {

            if (jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Insira o nome do veículo");
                limparCampos();
                return;
            }

            nomeParaBuscaCaminhao = jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.getText();
            CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporteEncontrado = controleVeiculo.buscarCaminhaoOuVeiculoDeTransportePorNome(nomeParaBuscaCaminhao);

            if (caminhaoOuVeiculoDeTransporteEncontrado != null) {
                String anoCaminhaoOuVeiculoDeTransporte = Integer.toString(caminhaoOuVeiculoDeTransporteEncontrado.getAnoVeiculo());
                String capacidadeDeCargaCaminhaoOuVeiculoDeTransporte = Double.toString(caminhaoOuVeiculoDeTransporteEncontrado.getCapacidadeDeCarga());
                String capacidadeDoTanqueCaminhaoOuVeiculoDeTransporte = Double.toString(caminhaoOuVeiculoDeTransporteEncontrado.getCapacidadeDoTanqueDeCombustivel());

                jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getChassiVeiculo());
                jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getMarcaVeiculo());
                jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getNomeVeiculo());
                jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText(anoCaminhaoOuVeiculoDeTransporte);
                jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setText(capacidadeDoTanqueCaminhaoOuVeiculoDeTransporte);
                jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText(capacidadeDeCargaCaminhaoOuVeiculoDeTransporte);
                jTextFieldEstadoCaminhao.setText(caminhaoOuVeiculoDeTransporteEncontrado.getEstadoVeiculo());
                idParaBuscaCaminhao = caminhaoOuVeiculoDeTransporteEncontrado.getIdCaminhaoOuVeiculoDeTransporte();
            } else {
                JOptionPane.showMessageDialog(this, "Veiculo não encontrado");
                limparCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha tipo: " + ex.getMessage());
        }

    }

    private void limparCampos() {
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldEstadoCaminhao.setText("");
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTrator;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonVoltarAoTelaDeEscolhaDeVeiculo;
    private javax.swing.JLabel jLabelTelaVerificacaoDeCaminhao;
    private javax.swing.JTextField jTextFieldAnoCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldChassiCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldEstadoCaminhao;
    private javax.swing.JTextField jTextFieldMarcaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldNomeCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldNomeCaminhaoOuVeiculoDeTransporteBuscado;
    // End of variables declaration//GEN-END:variables
}
