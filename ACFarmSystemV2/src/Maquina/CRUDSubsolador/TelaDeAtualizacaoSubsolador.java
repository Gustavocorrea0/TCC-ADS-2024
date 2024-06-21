package Maquina.CRUDSubsolador;

import Maquina.ControleMaquina;
import Maquina.Subsolador;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeAtualizacaoSubsolador extends javax.swing.JFrame {

    ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private int anoAtualizado;
    private String nomeAtualizado;
    private String marcaAtualizado;
    private String chassiAtualizado;
    private String estadoAtualizado;

    private Double pesoAtualizado;
    private Double larguraEmMMAtualizado;
    private int numeroDeHastesAtualizado;
    private int potenciaDoTratorAtualizado;
    private int idMaquina;

    private String nomeMaquina;
    private String larguraEmMM;
    private String peso;
    private String numeroDeHastes;
    private String potenciaTrator;

    public TelaDeAtualizacaoSubsolador() {
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
        jTextFieldLarguraEmMM = new javax.swing.JTextField();
        jTextFieldNumeroDeHastes = new javax.swing.JTextField();
        jTextFieldPotenciaDoTrator = new javax.swing.JTextField();
        jTextFieldPesoDoSubsolador = new javax.swing.JTextField();
        jButtonConfirmarAtualizacao = new javax.swing.JButton();
        jButtonBuscarMaquina = new javax.swing.JButton();
        jButtonSairDaTelaDeConsulta = new javax.swing.JButton();
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
        getContentPane().add(jTextFieldNomeMaquinaBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 116, 304, 29));

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
        getContentPane().add(jTextFieldNomeMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 219, 271, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 302, 271, 29));

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
        getContentPane().add(jTextFieldAnoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 387, 271, 29));

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
        getContentPane().add(jTextFieldChassiMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 478, 270, 29));

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
        getContentPane().add(jTextFieldEstadoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 574, 271, 29));

        jTextFieldLarguraEmMM.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLarguraEmMM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldLarguraEmMM.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLarguraEmMM.setBorder(null);
        jTextFieldLarguraEmMM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldLarguraEmMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLarguraEmMMActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLarguraEmMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 221, 271, 29));

        jTextFieldNumeroDeHastes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroDeHastes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNumeroDeHastes.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeHastes.setBorder(null);
        jTextFieldNumeroDeHastes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeHastes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDeHastesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroDeHastes, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 306, 271, 29));

        jTextFieldPotenciaDoTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPotenciaDoTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPotenciaDoTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaDoTrator.setBorder(null);
        jTextFieldPotenciaDoTrator.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaDoTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPotenciaDoTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPotenciaDoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 397, 271, 29));

        jTextFieldPesoDoSubsolador.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPesoDoSubsolador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPesoDoSubsolador.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPesoDoSubsolador.setBorder(null);
        jTextFieldPesoDoSubsolador.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPesoDoSubsolador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoDoSubsoladorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesoDoSubsolador, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 478, 271, 29));

        jButtonConfirmarAtualizacao.setBorder(null);
        jButtonConfirmarAtualizacao.setBorderPainted(false);
        jButtonConfirmarAtualizacao.setContentAreaFilled(false);
        jButtonConfirmarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 550, 280, 34));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 107, 282, 44));

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

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 599, 280, 34));

        jLabelFundoAtualizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasSubsolador/img_tela_atualizacao_subsolador.png"))); // NOI18N
        getContentPane().add(jLabelFundoAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            buscarSubsolador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoSubsolador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TelaCRUDSubsolador().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarSubsolador();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoSubsolador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonConfirmarAtualizacaoActionPerformed

    private void jTextFieldNomeMaquinaBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

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

    private void jTextFieldLarguraEmMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLarguraEmMMActionPerformed

    }//GEN-LAST:event_jTextFieldLarguraEmMMActionPerformed

    private void jTextFieldNumeroDeHastesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeHastesActionPerformed

    }//GEN-LAST:event_jTextFieldNumeroDeHastesActionPerformed

    private void jTextFieldPotenciaDoTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPotenciaDoTratorActionPerformed

    }//GEN-LAST:event_jTextFieldPotenciaDoTratorActionPerformed

    private void jTextFieldPesoDoSubsoladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoDoSubsoladorActionPerformed

    }//GEN-LAST:event_jTextFieldPesoDoSubsoladorActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    public void atualizarSubsolador() throws SQLException {
        if (jTextFieldNomeMaquinaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um subsolador");
            return;
        }
        
        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do subsolador");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do subsolador");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do subsolador");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do subsolador (17 Digitos)");
            return;
        }
        
         if (jTextFieldEstadoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a estado:\nA para Ativo\nI para Inativo");
            return;
        }

        if (jTextFieldPesoDoSubsolador.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o peso do subsolador");
            return;
        }

        if (jTextFieldLarguraEmMM.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a larguara em MM do subsolador");
            return;
        }

        if (jTextFieldNumeroDeHastes.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o número de hastes do subsolador");
            return;
        }

        if (jTextFieldPotenciaDoTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a potência necessaria do trator\npara puxar o subsolador");
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
            JOptionPane.showMessageDialog(this, "O ano deve ser um valor numérico (ex: 2024)");
            return;
        }

        try {
            pesoAtualizado = Double.valueOf(jTextFieldPesoDoSubsolador.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O peso deve ser um valor numérico (ex: 100.2)");
            return;
        }

        try {
            larguraEmMMAtualizado = Double.valueOf(jTextFieldLarguraEmMM.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A largura em MM deve ser um valor numérico (ex: 2.2)");
            return;
        }

        try {
            numeroDeHastesAtualizado = Integer.parseInt(jTextFieldNumeroDeHastes.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O número hastes deve ser um valor numérico (ex: 12)");
            return;
        }

        try {
            potenciaDoTratorAtualizado = Integer.parseInt(jTextFieldPotenciaDoTrator.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O potência em CV deve ser um valor numérico (ex: 21)");
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

        if (pesoAtualizado <= 0) {
            JOptionPane.showMessageDialog(null, "Peso Inválido");
            return;
        }

        if (larguraEmMMAtualizado <= 0) {
            JOptionPane.showMessageDialog(null, "Largura Inválida");
            return;
        }

        if (numeroDeHastesAtualizado <= 0) {
            JOptionPane.showMessageDialog(null, "Número de hastes Inválida");
            return;
        }

        if (potenciaDoTratorAtualizado <= 0) {
            JOptionPane.showMessageDialog(null, "Potêcia do trator Inválida");
            return;
        }

        if (estadoAtualizado.equalsIgnoreCase("A") || estadoAtualizado.equalsIgnoreCase("I")) {
            Subsolador subsolador = new Subsolador();
            subsolador.setNomeMaquina(nomeAtualizado);
            subsolador.setMarcaMaquina(marcaAtualizado);
            subsolador.setAnoMaquina(anoAtualizado);
            subsolador.setEstadoMaquina(estadoAtualizado);
            subsolador.setChassiMaquina(chassiAtualizado);
            subsolador.setPeso(pesoAtualizado);
            subsolador.setPotenciaNecessariaTratorEmCv(potenciaDoTratorAtualizado);
            subsolador.setLarguraEmMM(larguraEmMMAtualizado);
            subsolador.setNumeroDeHastes(numeroDeHastesAtualizado);
            subsolador.setIdSubsolador(idMaquina);

            controleMaquina = new ControleMaquina();
            String msgAtualizacao = controleMaquina.atualizarSubsolador(subsolador);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Estado inválido:\nA para Ativo\nI para Inativo");
        }
    }

    public void buscarSubsolador() throws SQLException {
        if (jTextFieldNomeMaquinaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do subsolador");
            return;
        }

        nomeMaquina = jTextFieldNomeMaquinaBuscada.getText();
        Subsolador subsoladorEncontrado = controleMaquina.buscarSubsolador(nomeMaquina);

        if (subsoladorEncontrado != null) {
            ano = Integer.toString(subsoladorEncontrado.getAnoMaquina());
            larguraEmMM = Double.toString(subsoladorEncontrado.getLarguraEmMM());
            peso = Double.toString(subsoladorEncontrado.getPeso());
            numeroDeHastes = Integer.toString(subsoladorEncontrado.getNumeroDeHastes());
            potenciaTrator = Integer.toString(subsoladorEncontrado.getPotenciaNecessariaTratorEmCv());

            jTextFieldNomeMaquina.setText(subsoladorEncontrado.getNomeMaquina());
            jTextFieldMarcaMaquina.setText(subsoladorEncontrado.getMarcaMaquina());
            jTextFieldAnoMaquina.setText(ano);
            jTextFieldChassiMaquina.setText(subsoladorEncontrado.getChassiMaquina());
            jTextFieldEstadoMaquina.setText(subsoladorEncontrado.getEstadoMaquina());
            jTextFieldPotenciaDoTrator.setText(potenciaTrator);
            jTextFieldPesoDoSubsolador.setText(peso);
            jTextFieldNumeroDeHastes.setText(numeroDeHastes);
            jTextFieldLarguraEmMM.setText(larguraEmMM);
            idMaquina = subsoladorEncontrado.getIdSubsolador();
        } else {
            JOptionPane.showMessageDialog(this, "Subsolador não encontrado");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldAnoMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldEstadoMaquina.setText("");
        jTextFieldLarguraEmMM.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldNomeMaquina.setText("");
        jTextFieldNomeMaquinaBuscada.setText("");
        jTextFieldNumeroDeHastes.setText("");
        jTextFieldPesoDoSubsolador.setText("");
        jTextFieldPotenciaDoTrator.setText("");
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
    private javax.swing.JTextField jTextFieldLarguraEmMM;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquinaBuscada;
    private javax.swing.JTextField jTextFieldNumeroDeHastes;
    private javax.swing.JTextField jTextFieldPesoDoSubsolador;
    private javax.swing.JTextField jTextFieldPotenciaDoTrator;
    // End of variables declaration//GEN-END:variables
}
