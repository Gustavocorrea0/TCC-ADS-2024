package Maquina.CRUDMaquinaDePlantio;

import Maquina.ControleMaquina;
import Maquina.MaquinaDePlantio;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaDeAtualizacaoMaquinaDePlantio extends javax.swing.JFrame {

    ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private int anoAtualizado;
    private int idMaquina;
    private String nomeAtualizado;
    private String marcaAtualizado;
    private String chassiAtualizado;
    private String estadoAtualizado;
    private String nomeMaquina;
    private int capacidadeDeSementes;
    private int quantidadeDeLinhas;

    public TelaDeAtualizacaoMaquinaDePlantio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomePlantadeiraBuscada = new javax.swing.JTextField();
        jTextFieldNomeMaquina = new javax.swing.JTextField();
        jTextFieldMarcaMaquina = new javax.swing.JTextField();
        jTextFieldAnoMaquina = new javax.swing.JTextField();
        jTextFieldChassiMaquina = new javax.swing.JTextField();
        jTextFieldEstadoMaquina = new javax.swing.JTextField();
        jTextFieldCapacidadeDeSementes = new javax.swing.JTextField();
        jTextFieldQuantidadeDeLinhas = new javax.swing.JTextField();
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jLabelFundoAtualizacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomePlantadeiraBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePlantadeiraBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePlantadeiraBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePlantadeiraBuscada.setBorder(null);
        getContentPane().add(jTextFieldNomePlantadeiraBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 117, 304, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 226, 271, 29));

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
        jTextFieldEstadoMaquina.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoMaquina.setBorder(null);
        jTextFieldEstadoMaquina.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 581, 271, 29));

        jTextFieldCapacidadeDeSementes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeSementes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeSementes.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSementes.setBorder(null);
        jTextFieldCapacidadeDeSementes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSementes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeSementesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeSementes, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 222, 271, 29));

        jTextFieldQuantidadeDeLinhas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeDeLinhas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeDeLinhas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeLinhas.setBorder(null);
        jTextFieldQuantidadeDeLinhas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeDeLinhasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeDeLinhas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 309, 272, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 107, 280, 43));

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
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 550, 280, 34));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 598, 280, 37));

        jLabelFundoAtualizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasMaquinaDePlantio/img_tela_atualizacao_maquina_de_plantio.png"))); // NOI18N
        getContentPane().add(jLabelFundoAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            buscarMaquinaDePlantio();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoMaquinaDePlantio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDMaquinaDePlantio().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarMaquinaDePlantio();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoMaquinaDePlantio.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jTextFieldCapacidadeDeSementesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeSementesActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeSementesActionPerformed

    private void jTextFieldQuantidadeDeLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeDeLinhasActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeDeLinhasActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void atualizarMaquinaDePlantio() throws SQLException {
        if (jTextFieldNomePlantadeiraBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma máquina de plantio");
            return;
        }
        
        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da máquina de plantio");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca da máquina de plantio");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano da máquina de plantio");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi da máquina de plantio (17 Digitos)");
            return;
        }

        if (jTextFieldEstadoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado da máquina de plantio:\nA para Ativo\nI para Inativo");
            return;
        }

        if (jTextFieldCapacidadeDeSementes.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade de sementes da máquina de plantio");
            return;
        }

        if (jTextFieldQuantidadeDeLinhas.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a quantidade de linhas da máquina de plantio");
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
            JOptionPane.showMessageDialog(this, "Ano é um valor numérico (Ex: 2024)");
            return;
        }

         try {
            capacidadeDeSementes = Integer.parseInt(jTextFieldCapacidadeDeSementes.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A capacidade de sementes é um valor numérico");
            return;
        }

        try {
            quantidadeDeLinhas = Integer.parseInt(jTextFieldQuantidadeDeLinhas.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A quantidade de linhas é um valor numérico");
            return;
        }

        if (chassiAtualizado.length() != 17) {
            JOptionPane.showMessageDialog(this, "Chassi Inválido (17 Digitos)");
            return;
        }

        if (anoAtualizado > (anoAtual + 1) || anoAtualizado < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (capacidadeDeSementes <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade de sementes Inválida");
            return;
        }

        if (quantidadeDeLinhas <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de linhas Inválida");
            return;
        }

        if (estadoAtualizado.equalsIgnoreCase("A") || estadoAtualizado.equalsIgnoreCase("I")) {
            MaquinaDePlantio maquinaDePlantioAtualizada = new MaquinaDePlantio();
            maquinaDePlantioAtualizada.setNomeMaquina(nomeAtualizado);
            maquinaDePlantioAtualizada.setMarcaMaquina(marcaAtualizado);
            maquinaDePlantioAtualizada.setAnoMaquina(anoAtualizado);
            maquinaDePlantioAtualizada.setEstadoMaquina(estadoAtualizado);
            maquinaDePlantioAtualizada.setChassiMaquina(chassiAtualizado);
            maquinaDePlantioAtualizada.setCapacidadeDeSementes(capacidadeDeSementes);
            maquinaDePlantioAtualizada.setQuantidadeDeLinhas(quantidadeDeLinhas);
            maquinaDePlantioAtualizada.setIdMaquinaDePlantio(idMaquina);

            controleMaquina = new ControleMaquina();
            String msgAtualizacao = controleMaquina.atualizarMaquinaDePlantio(maquinaDePlantioAtualizada);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Estado inválido\nA para Ativo\nI para Inativo");
        }
    }

    public void buscarMaquinaDePlantio() throws SQLException {
        if (jTextFieldNomePlantadeiraBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da maquina de plantio");
            return;
        }
        nomeMaquina = jTextFieldNomePlantadeiraBuscada.getText();
        MaquinaDePlantio maquinaDePlantioEncontrada = controleMaquina.buscarMaquinaDePlantio(nomeMaquina);

        if (maquinaDePlantioEncontrada != null) {

            ano = Integer.toString(maquinaDePlantioEncontrada.getAnoMaquina());
            String quantidadeDeLihas = Integer.toString(maquinaDePlantioEncontrada.getQuantidadeDeLinhas());
            String capacidadeDeSementes1 = Integer.toString(maquinaDePlantioEncontrada.getCapacidadeDeSementes());

            jTextFieldNomeMaquina.setText(maquinaDePlantioEncontrada.getNomeMaquina());
            jTextFieldMarcaMaquina.setText(maquinaDePlantioEncontrada.getMarcaMaquina());
            jTextFieldAnoMaquina.setText(ano);
            jTextFieldChassiMaquina.setText(maquinaDePlantioEncontrada.getChassiMaquina());
            jTextFieldEstadoMaquina.setText(maquinaDePlantioEncontrada.getEstadoMaquina());
            jTextFieldQuantidadeDeLinhas.setText(quantidadeDeLihas);
            jTextFieldCapacidadeDeSementes.setText(capacidadeDeSementes1);
            idMaquina = maquinaDePlantioEncontrada.getIdMaquinaDePlantio();
        } else {
            JOptionPane.showMessageDialog(this, "Maquina de plantio não encontrada");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldNomeMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldAnoMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldEstadoMaquina.setText("");
        jTextFieldQuantidadeDeLinhas.setText("");
        jTextFieldCapacidadeDeSementes.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMaquina;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoAtualizacao;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDeSementes;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldEstadoMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNomePlantadeiraBuscada;
    private javax.swing.JTextField jTextFieldQuantidadeDeLinhas;
    // End of variables declaration//GEN-END:variables
}
