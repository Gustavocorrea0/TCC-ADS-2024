package Veiculo.CRUDCarro;

import Veiculo.Carro;
import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDCarro;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoDeCarro extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String nomeOuPlacaBuscaCarro;

    private String anoCarro;
    private String corCarro;
    private String capacidadeDoTanqueCarro;
    private String quilometragemCarro;

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
    private int idCarro;

    public TelaDeAtualizacaoDeCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoTelaDeEscolhaDeVeiculo = new javax.swing.JButton();
        jTextFieldPlacaCarroBuscado = new javax.swing.JTextField();
        jTextFieldMarcaCarro = new javax.swing.JTextField();
        jTextFieldAnoCarro = new javax.swing.JTextField();
        jTextFieldChassiCarro = new javax.swing.JTextField();
        jTextFieldNomeCarro = new javax.swing.JTextField();
        jTextFieldQuilometragemCarro = new javax.swing.JTextField();
        jTextFieldCapacidadeDeCombustivelCarro = new javax.swing.JTextField();
        jTextFieldEstadoCarro = new javax.swing.JTextField();
        jTextFieldPlacaCarro = new javax.swing.JTextField();
        jTextFieldCorCarro = new javax.swing.JTextField();
        jButtonBuscarCarroPorPlaca = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jLabelTelaVerificacaoDeTrator = new javax.swing.JLabel();

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

        jTextFieldPlacaCarroBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPlacaCarroBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPlacaCarroBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPlacaCarroBuscado.setBorder(null);
        jTextFieldPlacaCarroBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacaCarroBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPlacaCarroBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 111, 271, 29));

        jTextFieldMarcaCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaCarro.setBorder(null);
        jTextFieldMarcaCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 303, 271, 29));

        jTextFieldAnoCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCarro.setBorder(null);
        jTextFieldAnoCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 388, 272, 29));

        jTextFieldChassiCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCarro.setBorder(null);
        jTextFieldChassiCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldChassiCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 479, 271, 29));

        jTextFieldNomeCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCarro.setBorder(null);
        jTextFieldNomeCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 220, 271, 29));

        jTextFieldQuilometragemCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuilometragemCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuilometragemCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuilometragemCarro.setBorder(null);
        jTextFieldQuilometragemCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuilometragemCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuilometragemCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuilometragemCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 500, 271, 29));

        jTextFieldCapacidadeDeCombustivelCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeCombustivelCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeCombustivelCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCombustivelCarro.setBorder(null);
        jTextFieldCapacidadeDeCombustivelCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeCombustivelCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeCombustivelCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeCombustivelCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 319, 271, 29));

        jTextFieldEstadoCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCarro.setBorder(null);
        jTextFieldEstadoCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 567, 60, 30));

        jTextFieldPlacaCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPlacaCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPlacaCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPlacaCarro.setBorder(null);
        jTextFieldPlacaCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPlacaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacaCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPlacaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 403, 271, 29));

        jTextFieldCorCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCorCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCorCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCorCarro.setBorder(null);
        jTextFieldCorCarro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCorCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCorCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 219, 271, 29));

        jButtonBuscarCarroPorPlaca.setBorder(null);
        jButtonBuscarCarroPorPlaca.setContentAreaFilled(false);
        jButtonBuscarCarroPorPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarCarroPorPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCarroPorPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCarroPorPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 103, 282, 45));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.setDefaultCapable(false);
        jButtonCancelarRemocao.setFocusPainted(false);
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 594, 280, 36));

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
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 544, 280, 36));

        jLabelTelaVerificacaoDeTrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgCarro/img_tela_de_atualizacao_de_carro.png"))); // NOI18N
        getContentPane().add(jLabelTelaVerificacaoDeTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed
        this.dispose();
        new TelaCRUDCarro().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeEscolhaDeVeiculoActionPerformed

    private void jTextFieldPlacaCarroBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacaCarroBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldPlacaCarroBuscadoActionPerformed

    private void jTextFieldAnoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoCarroActionPerformed

    }//GEN-LAST:event_jTextFieldAnoCarroActionPerformed

    private void jTextFieldChassiCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiCarroActionPerformed

    }//GEN-LAST:event_jTextFieldChassiCarroActionPerformed

    private void jTextFieldMarcaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaCarroActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaCarroActionPerformed

    private void jTextFieldNomeCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCarroActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCarroActionPerformed

    private void jTextFieldQuilometragemCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuilometragemCarroActionPerformed

    }//GEN-LAST:event_jTextFieldQuilometragemCarroActionPerformed

    private void jTextFieldCapacidadeDeCombustivelCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeCombustivelCarroActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeCombustivelCarroActionPerformed

    private void jTextFieldEstadoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoCarroActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoCarroActionPerformed

    private void jTextFieldPlacaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacaCarroActionPerformed

    }//GEN-LAST:event_jTextFieldPlacaCarroActionPerformed

    private void jTextFieldCorCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorCarroActionPerformed

    }//GEN-LAST:event_jTextFieldCorCarroActionPerformed

    private void jButtonBuscarCarroPorPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCarroPorPlacaActionPerformed
        try {
            buscarCarroPorPlaca();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDeCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarCarroPorPlacaActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    private void limparCampos() {
        jTextFieldAnoCarro.setText("");
        jTextFieldCapacidadeDeCombustivelCarro.setText("");
        jTextFieldChassiCarro.setText("");
        jTextFieldCorCarro.setText("");
        jTextFieldEstadoCarro.setText("");
        jTextFieldMarcaCarro.setText("");
        jTextFieldNomeCarro.setText("");
        jTextFieldPlacaCarro.setText("");
        jTextFieldQuilometragemCarro.setText("");
        jTextFieldPlacaCarroBuscado.setText("");
    }

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        atualizarCarro();
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    public void buscarCarroPorPlaca() throws SQLException {
        try {
            if (jTextFieldPlacaCarroBuscado.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Insira a placa do carro");
                return;
            }

            nomeOuPlacaBuscaCarro = jTextFieldPlacaCarroBuscado.getText().toUpperCase();
            Carro carroEncontrado = controleVeiculo.buscarCarroPorPlaca(nomeOuPlacaBuscaCarro);

            if (carroEncontrado != null) {
                anoCarro = Integer.toString(carroEncontrado.getAnoVeiculo());
                corCarro = carroEncontrado.getCorCarro();
                capacidadeDoTanqueCarro = Double.toString(carroEncontrado.getCapacidadeDoTanqueDeCombustivel());
                quilometragemCarro = Integer.toString(carroEncontrado.getQuilometragemCarro());

                jTextFieldAnoCarro.setText(anoCarro);
                jTextFieldCapacidadeDeCombustivelCarro.setText(capacidadeDoTanqueCarro);
                jTextFieldChassiCarro.setText(carroEncontrado.getChassiVeiculo());
                jTextFieldCorCarro.setText(corCarro);
                jTextFieldEstadoCarro.setText(carroEncontrado.getEstadoVeiculo());
                jTextFieldMarcaCarro.setText(carroEncontrado.getMarcaVeiculo());
                jTextFieldNomeCarro.setText(carroEncontrado.getNomeVeiculo());
                jTextFieldPlacaCarro.setText(carroEncontrado.getPlacaCarro());
                jTextFieldQuilometragemCarro.setText(quilometragemCarro);
                idCarro = carroEncontrado.getIdCarro();

            } else {
                JOptionPane.showMessageDialog(this, "Veiculo não encontrado.");
                limparCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha tipo: " + ex);
        }

    }

    public void atualizarCarro() {
        if (jTextFieldPlacaCarroBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um carro");
            return;
        }

        if (jTextFieldNomeCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do carro");
            return;
        }

        if (jTextFieldMarcaCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do carro");
            return;
        }

        if (jTextFieldAnoCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do carro");
            return;
        }

        if (jTextFieldChassiCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do carro");
            return;
        }

        if (jTextFieldEstadoCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado do carro\nA para Ativo\nI para Inativo");
            return;
        }

        if (jTextFieldCorCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a cor do carro");
            return;
        }

        if (jTextFieldCapacidadeDeCombustivelCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do tanque do carro");
            return;
        }

        if (jTextFieldPlacaCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a placa do carro");
            return;
        }

        if (jTextFieldQuilometragemCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a quilometragem do carro");
            return;
        }

        try {
            anoVeiculoAtualizado = Integer.parseInt(jTextFieldAnoCarro.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O ano deve ser numérico");
            return;
        }

        try {
            capacidadeTanqueDeCombustivelAtualizado = Double.valueOf(jTextFieldCapacidadeDeCombustivelCarro.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A capacidade do tanque deve ser numérica");
            return;
        }

        try {
            quilometragemCarroAtualizado = Integer.parseInt(jTextFieldQuilometragemCarro.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A quilometragem deve ser numérica");
            return;
        }

        try {
            nomeVeiculoAtualizado = jTextFieldNomeCarro.getText();
            marcaVeiculoAtualizado = jTextFieldMarcaCarro.getText();

            chassiVeiculoAtualizado = jTextFieldChassiCarro.getText();
            estadoVeiculoAtualizado = jTextFieldEstadoCarro.getText();

            tipoVeiculoAtualizado = "carro";
            placaCarroAtualizado = jTextFieldPlacaCarro.getText();
            corCarroAtualizado = jTextFieldCorCarro.getText();

            Calendar cal = Calendar.getInstance();

            int anoAtual = cal.get(Calendar.YEAR);

            if (placaCarroAtualizado.length() != 7) {
                JOptionPane.showMessageDialog(null, "Placa Inválida, 7 digitos sem traço");
                return;
            }

            if (quilometragemCarroAtualizado < 1) {
                JOptionPane.showMessageDialog(null, "Quilometragem Inválida");
                return;
            }

            if (marcaVeiculoAtualizado.isBlank()) {
                JOptionPane.showMessageDialog(null, "Marca Inválida");
                return;
            }

            if (anoVeiculoAtualizado > (anoAtual + 1) || anoVeiculoAtualizado < 1970) {
                JOptionPane.showMessageDialog(null, "Ano Inválido");
                return;
            }

            if (chassiVeiculoAtualizado.length() != 17) {
                JOptionPane.showMessageDialog(null, "Chassi Inválido");
                return;
            }

            if (capacidadeTanqueDeCombustivelAtualizado <= 0) {
                JOptionPane.showMessageDialog(null, "Capacidade do tanque Inválida");
                return;
            }

            tipoVeiculoAtualizado = "Carro";
            
            if (estadoVeiculoAtualizado.equalsIgnoreCase("A") || estadoVeiculoAtualizado.equalsIgnoreCase("I")) {
                Carro carroAtualizado = new Carro();
                carroAtualizado.setNomeVeiculo(nomeVeiculoAtualizado);
                carroAtualizado.setMarcaVeiculo(marcaVeiculoAtualizado);
                carroAtualizado.setAnoVeiculo(anoVeiculoAtualizado);
                carroAtualizado.setChassiVeiculo(chassiVeiculoAtualizado);
                carroAtualizado.setEstadoVeiculo(estadoVeiculoAtualizado);
                carroAtualizado.setCapacidadeDoTanqueDeCombustivel(capacidadeTanqueDeCombustivelAtualizado);
                carroAtualizado.setPlacaCarro(placaCarroAtualizado);
                carroAtualizado.setCorCarro(corCarroAtualizado);
                carroAtualizado.setQuilometragemCarro(quilometragemCarroAtualizado);
                carroAtualizado.setIdCarro(idCarro);
                String msg = controleVeiculo.atualizarCarro(carroAtualizado);
                JOptionPane.showMessageDialog(this, msg);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Estado Inválido, A (Ativo) e I (Inativo)");
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha tipo:" + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarCarroPorPlaca;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonVoltarAoTelaDeEscolhaDeVeiculo;
    private javax.swing.JLabel jLabelTelaVerificacaoDeTrator;
    private javax.swing.JTextField jTextFieldAnoCarro;
    private javax.swing.JTextField jTextFieldCapacidadeDeCombustivelCarro;
    private javax.swing.JTextField jTextFieldChassiCarro;
    private javax.swing.JTextField jTextFieldCorCarro;
    private javax.swing.JTextField jTextFieldEstadoCarro;
    private javax.swing.JTextField jTextFieldMarcaCarro;
    private javax.swing.JTextField jTextFieldNomeCarro;
    private javax.swing.JTextField jTextFieldPlacaCarro;
    private javax.swing.JTextField jTextFieldPlacaCarroBuscado;
    private javax.swing.JTextField jTextFieldQuilometragemCarro;
    // End of variables declaration//GEN-END:variables
}
