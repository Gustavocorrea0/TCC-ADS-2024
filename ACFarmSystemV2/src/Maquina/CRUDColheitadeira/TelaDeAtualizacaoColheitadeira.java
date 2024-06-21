package Maquina.CRUDColheitadeira;

import Maquina.Colheitadeira;
import Maquina.ControleMaquina;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeAtualizacaoColheitadeira extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private int anoAtualizado;
    private String nomeAtualizado;
    private String marcaAtualizado;
    private String chassiAtualizado;
    private String estadoAtualizado;
    private String nomeMaquina;
    private int idMaquina;

    private int quantidadeDeSacosAtualizado;
    private Double capacidadeDoTanqueDeCombustivelAtualizado;

    public TelaDeAtualizacaoColheitadeira() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldEstadoMaquina = new javax.swing.JTextField();
        jTextFieldQuantidadeDeSacas = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueDeCombustivel = new javax.swing.JTextField();
        jTextFieldTipoDeCultura = new javax.swing.JTextField();
        jTextFieldNomeColheitadeiraBuscada = new javax.swing.JTextField();
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeAtualizacao = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jLabelFundoAtualizacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 224, 271, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 307, 271, 29));

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 392, 271, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 483, 271, 29));

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
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 580, 271, 29));

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
        getContentPane().add(jTextFieldQuantidadeDeSacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 221, 272, 29));

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
        getContentPane().add(jTextFieldCapacidadeDoTanqueDeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 306, 352, 29));

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
        getContentPane().add(jTextFieldTipoDeCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 392, 271, 29));

        jTextFieldNomeColheitadeiraBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeColheitadeiraBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeColheitadeiraBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeColheitadeiraBuscada.setBorder(null);
        getContentPane().add(jTextFieldNomeColheitadeiraBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 115, 305, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 105, 260, 42));

        jButtonSairDaTelaDeAtualizacao.setBorder(null);
        jButtonSairDaTelaDeAtualizacao.setBorderPainted(false);
        jButtonSairDaTelaDeAtualizacao.setContentAreaFilled(false);
        jButtonSairDaTelaDeAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaDeAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaDeAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaDeAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 40, 28));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setBorderPainted(false);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 547, 282, 36));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 597, 280, 34));

        jLabelFundoAtualizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasColheitadeira/img_tela_atualizacao_colheitadeira.png"))); // NOI18N
        getContentPane().add(jLabelFundoAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            consultarColheitadeira();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoColheitadeira.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeAtualizacaoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDColheitadeira().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeAtualizacaoActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarColheitadeira();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoColheitadeira.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

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

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    public void atualizarColheitadeira() throws SQLException {
        if (jTextFieldNomeColheitadeiraBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma colheitadeira");
            return;
        }
        
        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da colheitadeira");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca da colheitadeira");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano da colheitadeira");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi da colheitadeira (17 Digitos)");
            return;
        }

        if (jTextFieldEstadoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado da colheitadeira:\nA para Ativo\nI para Inativo");
            return;
        }

        if (jTextFieldQuantidadeDeSacas.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a quantidade de sacas suporadas da colheitadeira");
            return;
        }

        if (jTextFieldCapacidadeDoTanqueDeCombustivel.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do tanque de combustivél da colheitadeira");
            return;
        }

        if (jTextFieldTipoDeCultura.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a cultura da colheitadeira:\nSoja\nMilho");
            return;
        }

        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        nomeAtualizado = jTextFieldNomeMaquina.getText();
        marcaAtualizado = jTextFieldMarcaMaquina.getText();
        chassiAtualizado = jTextFieldChassiMaquina.getText();
        estadoAtualizado = jTextFieldEstadoMaquina.getText();
        
        try {
            anoAtualizado = Integer.parseInt(jTextFieldAnoMaquina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O ano deve ser numérico");
            return;
        }

        String tipoDeCultura = jTextFieldTipoDeCultura.getText();

        try {
            quantidadeDeSacosAtualizado = Integer.parseInt(jTextFieldQuantidadeDeSacas.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A quantidade de sacos deve ser numérica");
            return;
        }

        try {
            capacidadeDoTanqueDeCombustivelAtualizado = Double.valueOf(jTextFieldCapacidadeDoTanqueDeCombustivel.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, " capacidade do tanque deve ser numérica");
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

        if (quantidadeDeSacosAtualizado <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de sacos Inválida");
            return;
        }

        if (capacidadeDoTanqueDeCombustivelAtualizado<= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade do tanque de combustivel Inválida");
            return;
        }

        if (tipoDeCultura.equalsIgnoreCase("Milho") || tipoDeCultura.equalsIgnoreCase("Soja")) {
            if (estadoAtualizado.equalsIgnoreCase("A") || estadoAtualizado.equalsIgnoreCase("I")) {
                Colheitadeira colheitadeiraAtualizada = new Colheitadeira();
                colheitadeiraAtualizada.setNomeMaquina(nomeAtualizado);
                colheitadeiraAtualizada.setMarcaMaquina(marcaAtualizado);
                colheitadeiraAtualizada.setAnoMaquina(anoAtualizado);
                colheitadeiraAtualizada.setEstadoMaquina(estadoAtualizado);
                colheitadeiraAtualizada.setChassiMaquina(chassiAtualizado);
                colheitadeiraAtualizada.setCultura(tipoDeCultura);
                colheitadeiraAtualizada.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanqueDeCombustivelAtualizado);
                colheitadeiraAtualizada.setQuantidadeDeSacos(quantidadeDeSacosAtualizado);
                colheitadeiraAtualizada.setIdColheitadeira(idMaquina);

                controleMaquina = new ControleMaquina();
                String msgAtualizacao = controleMaquina.atualizarColheitadeira(colheitadeiraAtualizada);
                JOptionPane.showMessageDialog(null, msgAtualizacao);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Estado inválido\nA para Ativo\nI para Inativo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cultura Inválida, apenas Milho ou Soja");
        }

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
            idMaquina = colheitadeiraEncontrado.getIdColheitadeira();
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
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonSairDaTelaDeAtualizacao;
    private javax.swing.JLabel jLabelFundoAtualizacao;
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
