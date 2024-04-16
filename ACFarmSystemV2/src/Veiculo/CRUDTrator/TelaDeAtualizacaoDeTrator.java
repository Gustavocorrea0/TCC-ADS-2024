package Veiculo.CRUDTrator;

import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDTrator;

import Veiculo.Trator;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoDeTrator extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String capacidadeDoTanque;
    private String numeroDeMarchas;
    private String potenciaTrator;
    private String quantidadeDeRodas;
    private String estado;

    private int idTrator;
    private String anoTrator;
    private String nomeVeiculoAtualizado;
    private String marcaVeiculoAtualizado;
    private int anoVeiculoAtualizado;
    private String chassiVeiculoAtualizado;
    private String estadoVeiculoAtualizado;
    private Double capacidadeTanqueDeCombustivelAtualizado;

    public TelaDeAtualizacaoDeTrator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelarAtualizacaoDeTrator = new javax.swing.JButton();
        jTextFieldIdTrator = new javax.swing.JTextField();
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
        jButtonVoltarATelaDeEscolhaDeVeiculo = new javax.swing.JButton();
        jButtonConfirmarAtualizaoDeTrator = new javax.swing.JButton();
        jLabelTelaDeRemocao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarAtualizacaoDeTrator.setBorder(null);
        jButtonCancelarAtualizacaoDeTrator.setBorderPainted(false);
        jButtonCancelarAtualizacaoDeTrator.setContentAreaFilled(false);
        jButtonCancelarAtualizacaoDeTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacaoDeTrator.setDefaultCapable(false);
        jButtonCancelarAtualizacaoDeTrator.setFocusPainted(false);
        jButtonCancelarAtualizacaoDeTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoDeTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacaoDeTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 597, 282, 37));

        jTextFieldIdTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdTrator.setBorder(null);
        jTextFieldIdTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 120, 267, 28));

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
        getContentPane().add(jTextFieldMarcaTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 327, 270, 28));

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
        getContentPane().add(jTextFieldAnoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 410, 269, 29));

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
        getContentPane().add(jTextFieldChassiTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 496, 270, 29));

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
        getContentPane().add(jTextFieldCapacidadeDoTanqueTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 236, 269, 29));

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
        getContentPane().add(jTextFieldEstadoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 496, 60, 29));

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
        getContentPane().add(jTextFieldNomeTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 236, 270, 28));

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
        getContentPane().add(jTextFieldPotenciaEmCVTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 328, 268, 29));

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
        getContentPane().add(jTextFieldQuantidadeDeRodasTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 583, 268, 29));

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
        getContentPane().add(jTextFieldNumeroDeMarchasTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 411, 268, 29));

        jButtonBuscarTrator.setBorder(null);
        jButtonBuscarTrator.setContentAreaFilled(false);
        jButtonBuscarTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 111, 260, 45));

        jButtonVoltarATelaDeEscolhaDeVeiculo.setBorder(null);
        jButtonVoltarATelaDeEscolhaDeVeiculo.setBorderPainted(false);
        jButtonVoltarATelaDeEscolhaDeVeiculo.setContentAreaFilled(false);
        jButtonVoltarATelaDeEscolhaDeVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeEscolhaDeVeiculo.setDefaultCapable(false);
        jButtonVoltarATelaDeEscolhaDeVeiculo.setFocusPainted(false);
        jButtonVoltarATelaDeEscolhaDeVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeEscolhaDeVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeEscolhaDeVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 40, 24));

        jButtonConfirmarAtualizaoDeTrator.setBorder(null);
        jButtonConfirmarAtualizaoDeTrator.setBorderPainted(false);
        jButtonConfirmarAtualizaoDeTrator.setContentAreaFilled(false);
        jButtonConfirmarAtualizaoDeTrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizaoDeTrator.setDefaultCapable(false);
        jButtonConfirmarAtualizaoDeTrator.setFocusPainted(false);
        jButtonConfirmarAtualizaoDeTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizaoDeTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizaoDeTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 546, 282, 37));

        jLabelTelaDeRemocao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/img_tela_de_atualizacao_de_trator.png"))); // NOI18N
        getContentPane().add(jLabelTelaDeRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarAtualizacaoDeTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoDeTratorActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoDeTratorActionPerformed

    private void jTextFieldIdTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdTratorActionPerformed

    }//GEN-LAST:event_jTextFieldIdTratorActionPerformed

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
            Logger.getLogger(TelaDeAtualizacaoDeTrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarTratorActionPerformed

    private void jTextFieldPotenciaEmCVTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPotenciaEmCVTratorActionPerformed

    }//GEN-LAST:event_jTextFieldPotenciaEmCVTratorActionPerformed

    private void jTextFieldQuantidadeDeRodasTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeDeRodasTratorActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeDeRodasTratorActionPerformed

    private void jTextFieldNumeroDeMarchasTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeMarchasTratorActionPerformed

    }//GEN-LAST:event_jTextFieldNumeroDeMarchasTratorActionPerformed

    private void jButtonVoltarATelaDeEscolhaDeVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeEscolhaDeVeiculoActionPerformed
        this.dispose();
        new TelaCRUDTrator().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeEscolhaDeVeiculoActionPerformed

    private void jButtonConfirmarAtualizaoDeTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizaoDeTratorActionPerformed
        try {
            atualizarTrator();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoDeTrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizaoDeTratorActionPerformed

    public void buscarTrator() throws SQLException {
        String nomeBuscaTrator = jTextFieldIdTrator.getText();
        Trator tratorEncontrado = controleVeiculo.buscarTratorPorNome(nomeBuscaTrator);

        if (tratorEncontrado != null) {
            anoTrator = Integer.toString(tratorEncontrado.getAnoVeiculo());
            capacidadeDoTanque = Double.toString(tratorEncontrado.getCapacidadeDoTanqueDeCombustivel());
            numeroDeMarchas = Integer.toString(tratorEncontrado.getQuantidadeDeMarchas());
            potenciaTrator = Integer.toString(tratorEncontrado.getPotenciaEmCV());
            quantidadeDeRodas = Integer.toString(tratorEncontrado.getQuantidadeDeRodas());

            jTextFieldAnoTrator.setText(anoTrator);
            jTextFieldCapacidadeDoTanqueTrator.setText(capacidadeDoTanque);
            jTextFieldChassiTrator.setText(tratorEncontrado.getChassiVeiculo());
            jTextFieldEstadoTrator.setText(tratorEncontrado.getEstadoVeiculo());
            jTextFieldMarcaTrator.setText(tratorEncontrado.getMarcaVeiculo());
            jTextFieldNomeTrator.setText(tratorEncontrado.getNomeVeiculo());
            jTextFieldNumeroDeMarchasTrator.setText(numeroDeMarchas);
            jTextFieldPotenciaEmCVTrator.setText(potenciaTrator);
            jTextFieldQuantidadeDeRodasTrator.setText(quantidadeDeRodas);
            idTrator = tratorEncontrado.getIdTrator();
            
        } else {
            JOptionPane.showMessageDialog(this, "Veiculo não encontrado");
        }
    }

    public void atualizarTrator() throws SQLException {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        nomeVeiculoAtualizado = jTextFieldNomeTrator.getText();
        marcaVeiculoAtualizado = jTextFieldMarcaTrator.getText();
        anoVeiculoAtualizado = Integer.parseInt(jTextFieldAnoTrator.getText());
        chassiVeiculoAtualizado = jTextFieldChassiTrator.getText();
        estadoVeiculoAtualizado = jTextFieldEstadoTrator.getText();
        capacidadeTanqueDeCombustivelAtualizado = Double.parseDouble(jTextFieldCapacidadeDoTanqueTrator.getText());

        int quantidadeDeMarchasAtualizado = Integer.parseInt(jTextFieldNumeroDeMarchasTrator.getText());
        int quantidadeDeRodasAtualizado = Integer.parseInt(jTextFieldQuantidadeDeRodasTrator.getText());
        int potenciaTratorAtualizado = Integer.parseInt(jTextFieldPotenciaEmCVTrator.getText());

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

        if (quantidadeDeMarchasAtualizado <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade de marchas Inválida");
            return;
        }

        if (quantidadeDeRodasAtualizado <= 4) {
            JOptionPane.showMessageDialog(this, "Quantidade de rodas Inválida");
            return;
        }

        if (potenciaTratorAtualizado <= 0) {
            JOptionPane.showMessageDialog(this, "Potência do trator Inválida");
            return;
        }

        if (estadoVeiculoAtualizado.equalsIgnoreCase("A") || estadoVeiculoAtualizado.equalsIgnoreCase("I")) {
            Trator tratorAtualizado = new Trator();
            tratorAtualizado.setNomeVeiculo(nomeVeiculoAtualizado);
            tratorAtualizado.setMarcaVeiculo(marcaVeiculoAtualizado);
            tratorAtualizado.setAnoVeiculo(anoVeiculoAtualizado);
            tratorAtualizado.setChassiVeiculo(chassiVeiculoAtualizado);
            tratorAtualizado.setEstadoVeiculo(estadoVeiculoAtualizado);
            tratorAtualizado.setCapacidadeDoTanqueDeCombustivel(capacidadeTanqueDeCombustivelAtualizado);
            tratorAtualizado.setQuantidadeDeMarchas(quantidadeDeMarchasAtualizado);
            tratorAtualizado.setQuantidadeDeRodas(quantidadeDeRodasAtualizado);
            tratorAtualizado.setPotenciaEmCV(potenciaTratorAtualizado);
            tratorAtualizado.setIdTrator(idTrator);

            controleVeiculo = new ControleVeiculo();
            String msgAtualizacao = controleVeiculo.atualizarTrator(tratorAtualizado);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
        } else {
            JOptionPane.showMessageDialog(this, "Estado inválido, apenas A ou I");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTrator;
    private javax.swing.JButton jButtonCancelarAtualizacaoDeTrator;
    private javax.swing.JButton jButtonConfirmarAtualizaoDeTrator;
    private javax.swing.JButton jButtonVoltarATelaDeEscolhaDeVeiculo;
    private javax.swing.JLabel jLabelTelaDeRemocao;
    private javax.swing.JTextField jTextFieldAnoTrator;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueTrator;
    private javax.swing.JTextField jTextFieldChassiTrator;
    private javax.swing.JTextField jTextFieldEstadoTrator;
    private javax.swing.JTextField jTextFieldIdTrator;
    private javax.swing.JTextField jTextFieldMarcaTrator;
    private javax.swing.JTextField jTextFieldNomeTrator;
    private javax.swing.JTextField jTextFieldNumeroDeMarchasTrator;
    private javax.swing.JTextField jTextFieldPotenciaEmCVTrator;
    private javax.swing.JTextField jTextFieldQuantidadeDeRodasTrator;
    // End of variables declaration//GEN-END:variables
}
