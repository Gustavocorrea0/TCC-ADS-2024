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
    private String nomeVeiculoAtualizado;
    private String marcaVeiculoAtualizado;
    private int anoVeiculoAtualizado;
    private String chassiVeiculoAtualizado;
    private String estadoVeiculoAtualizado;
    private Double capacidadeTanqueDeCombustivelAtualizado;
    private String tipoVeiculoAtualizado;
    private String placaCarroAtualizado;
    private String corCarroAtualizado;
    private int quilometragemCarroAtualizado;
    private int idParaBuscaCaminhao;

    public TelaDeAtualizacaoDeCaminhaoOuVeiculoDeTransporte() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeEscolhaDeVeiculo = new javax.swing.JButton();
        jTextFieldIdCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
        jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte = new javax.swing.JTextField();
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

        jTextFieldIdCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldIdCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 114, 267, 28));

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
        getContentPane().add(jTextFieldMarcaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 331, 270, 28));

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
        getContentPane().add(jTextFieldAnoCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 414, 269, 29));

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
        getContentPane().add(jTextFieldChassiCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 240, 268, 29));

        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setBorder(null);
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoCaminhaoOuVeiculoDeTransporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 414, 60, 29));

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
        getContentPane().add(jTextFieldNomeCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 240, 270, 28));

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
        getContentPane().add(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 506, 269, 29));

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
        getContentPane().add(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 329, 269, 29));

        jButtonBuscarTrator.setBorder(null);
        jButtonBuscarTrator.setContentAreaFilled(false);
        jButtonBuscarTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 104, 260, 45));

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
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 592, 282, 37));

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
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 541, 282, 37));

        jLabelTelaVerificacaoDeCaminhao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/img_tela_de_atualizacao_de_caminhao.png"))); // NOI18N
        getContentPane().add(jLabelTelaVerificacaoDeCaminhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed
        this.dispose();
        new TelaCRUDCaminhaoOuVeiculoDeTransporte().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed

    private void jTextFieldIdCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldIdCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldAnoCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldChassiCaminhaoOuVeiculoDeTransporteActionPerformed

    private void jTextFieldEstadoCaminhaoOuVeiculoDeTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoCaminhaoOuVeiculoDeTransporteActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoCaminhaoOuVeiculoDeTransporteActionPerformed

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
        jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setText("");
        jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setText("");
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

    public void atualizarCaminhaoOuVeiculoDeTransporte() throws SQLException {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        nomeVeiculoAtualizado = jTextFieldNomeCaminhaoOuVeiculoDeTransporte.getText();
        marcaVeiculoAtualizado = jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.getText();
        anoVeiculoAtualizado = Integer.parseInt(jTextFieldAnoCaminhaoOuVeiculoDeTransporte.getText());
        chassiVeiculoAtualizado = jTextFieldChassiCaminhaoOuVeiculoDeTransporte.getText();
        estadoVeiculoAtualizado = jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.getText();
        capacidadeTanqueDeCombustivelAtualizado = Double.parseDouble(jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.getText());

        Double capacidadeDeCargaCaminhaoOuVeiculoDeTransporteAtualizada = Double.parseDouble(jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.getText());

        if (nomeVeiculoAtualizado.equals("")) {
            JOptionPane.showMessageDialog(this, "Nome Inválido");
            return;
        }

        if (marcaVeiculoAtualizado.equals("")) {
            JOptionPane.showMessageDialog(this, "Marca Inválida");
            return;
        }

        if (anoVeiculoAtualizado > (anoAtual + 1) || anoVeiculoAtualizado < 1970) {
            JOptionPane.showMessageDialog(this, "Ano Inválido");
            return;
        }

        if (chassiVeiculoAtualizado.length() != 17) {
            JOptionPane.showMessageDialog(this, "Chassi Inválido");
            return;
        }

        if (estadoVeiculoAtualizado.equals("")) {
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
        } else {
            JOptionPane.showMessageDialog(this, "Estado inválido, apenas A ou I");
        }
    }

    public void buscarCaminhaoOuVeiculoDeTransporte() throws SQLException {

        String nomeParaBuscaCaminhao = jTextFieldIdCaminhaoOuVeiculoDeTransporte.getText();
        CaminhaoOuVeiculoDeTransporte caminhaoOuVeiculoDeTransporteEncontrado = controleVeiculo.buscarCaminhaoOuVeiculoDeTransportePorNome(nomeParaBuscaCaminhao);

        if (caminhaoOuVeiculoDeTransporteEncontrado != null) {

            String anoCaminhaoOuVeiculoDeTransporte = Integer.toString(caminhaoOuVeiculoDeTransporteEncontrado.getAnoVeiculo());
            String capacidadeDeCargaCaminhaoOuVeiculoDeTransporte = Double.toString(caminhaoOuVeiculoDeTransporteEncontrado.getCapacidadeDeCarga());
            String estadoCaminhaoOuVeiculoDeTransporte = caminhaoOuVeiculoDeTransporteEncontrado.getEstadoVeiculo();
            String capacidadeDoTanque = Double.toString(caminhaoOuVeiculoDeTransporteEncontrado.getCapacidadeDoTanqueDeCombustivel());

            jTextFieldChassiCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getChassiVeiculo());
            jTextFieldMarcaCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getMarcaVeiculo());
            jTextFieldNomeCaminhaoOuVeiculoDeTransporte.setText(caminhaoOuVeiculoDeTransporteEncontrado.getNomeVeiculo());
            jTextFieldAnoCaminhaoOuVeiculoDeTransporte.setText(anoCaminhaoOuVeiculoDeTransporte);
            jTextFieldEstadoCaminhaoOuVeiculoDeTransporte.setText(estadoCaminhaoOuVeiculoDeTransporte);
            jTextFieldCapacidadeDeCargaCaminhaoOuVeiculoDeTransporte.setText(capacidadeDeCargaCaminhaoOuVeiculoDeTransporte);
            jTextFieldCapacidadeDoTanqueCaminhaoOuVeiculoDeTransporte.setText(capacidadeDoTanque);
            idParaBuscaCaminhao = caminhaoOuVeiculoDeTransporteEncontrado.getIdCaminhaoOuVeiculoDeTransporte();

        } else {
            JOptionPane.showMessageDialog(this, "Veiculo não encontrado.");
        }
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
    private javax.swing.JTextField jTextFieldEstadoCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldIdCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldMarcaCaminhaoOuVeiculoDeTransporte;
    private javax.swing.JTextField jTextFieldNomeCaminhaoOuVeiculoDeTransporte;
    // End of variables declaration//GEN-END:variables
}
