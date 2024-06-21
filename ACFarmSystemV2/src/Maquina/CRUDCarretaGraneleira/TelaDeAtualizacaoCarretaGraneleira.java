package Maquina.CRUDCarretaGraneleira;

import Maquina.CarretaGraneleira;
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
public class TelaDeAtualizacaoCarretaGraneleira extends javax.swing.JFrame {

    private ControleMaquina controleMaquina = new ControleMaquina();
    private String ano;
    private int anoAtualizado;
    private String nomeAtualizado;
    private String marcaAtualizado;
    private String chassiAtualizado;
    private String estadoAtualizado;
    private String nomeMaquina;
    private int idMaquina;

    private int capacidadeDeSacas;
    private Double capacidadeDePeso;

    public TelaDeAtualizacaoCarretaGraneleira() {
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
        jTextFieldCapacidadeDePeso = new javax.swing.JTextField();
        jTextFieldCapacidadeDeSacas = new javax.swing.JTextField();
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
        getContentPane().add(jTextFieldNomeMaquinaBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 117, 304, 29));

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
        getContentPane().add(jTextFieldMarcaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 309, 270, 29));

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

        jTextFieldCapacidadeDePeso.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDePeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDePeso.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDePeso.setBorder(null);
        jTextFieldCapacidadeDePeso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDePeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDePesoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDePeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 233, 271, 29));

        jTextFieldCapacidadeDeSacas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDeSacas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDeSacas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSacas.setBorder(null);
        jTextFieldCapacidadeDeSacas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDeSacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDeSacasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDeSacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 319, 270, 29));

        jButtonBuscarMaquina.setBorder(null);
        jButtonBuscarMaquina.setBorderPainted(false);
        jButtonBuscarMaquina.setContentAreaFilled(false);
        jButtonBuscarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMaquinaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 108, 280, 43));

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
        getContentPane().add(jButtonConfirmarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 549, 280, 37));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 599, 280, 35));

        jLabelFundoAtualizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasMaquinas/telasCarretaGraneleira/img_tela_atualizacao_carreta_graneleira.png"))); // NOI18N
        getContentPane().add(jLabelFundoAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeMaquinaBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeMaquinaBuscadaActionPerformed

    private void jButtonBuscarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMaquinaActionPerformed
        try {
            consultarCarretaGraneleira();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoCarretaGraneleira.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarMaquinaActionPerformed

    private void jButtonSairDaTelaDeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaDeConsultaActionPerformed
        this.dispose();
        new TelaCRUDCarretaGraneleira().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaDeConsultaActionPerformed

    private void jButtonConfirmarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAtualizacaoActionPerformed
        try {
            atualizarCarretaGraneleira();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoCarretaGraneleira.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jTextFieldCapacidadeDePesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDePesoActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDePesoActionPerformed

    private void jTextFieldCapacidadeDeSacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDeSacasActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDeSacasActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    public void atualizarCarretaGraneleira() throws SQLException {
        if (jTextFieldNomeMaquinaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma graneleira");
            return;
        }

        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        if (jTextFieldNomeMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da graneleira");
            return;
        }

        if (jTextFieldMarcaMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca da graneleira");
            return;
        }

        if (jTextFieldChassiMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi da graneleira");
            return;
        }

        if (jTextFieldEstadoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o estado da graneleira:\nA para Ativo\nI para Inativo");
            return;
        }

        if (jTextFieldAnoMaquina.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano da graneleira");
            return;
        }

        if (jTextFieldCapacidadeDeSacas.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidades de sacas da graneleira");
            return;
        }

        if (jTextFieldCapacidadeDePeso.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade de peso da graneleira");
            return;
        }

        nomeAtualizado = jTextFieldNomeMaquina.getText();
        marcaAtualizado = jTextFieldMarcaMaquina.getText();
        chassiAtualizado = jTextFieldChassiMaquina.getText();
        estadoAtualizado = jTextFieldEstadoMaquina.getText();

        try {
            anoAtualizado = Integer.parseInt(jTextFieldAnoMaquina.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O ano deve ser numérico (ex: 2024)");
            return;
        }

        try {
            capacidadeDeSacas = Integer.parseInt(jTextFieldCapacidadeDeSacas.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O capacidade de sacas deve ser numérica");
            return;
        }

        try {
            capacidadeDePeso = Double.valueOf(jTextFieldCapacidadeDePeso.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O capacidade de peso deve ser numérica");
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

        if (capacidadeDeSacas <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade de sacas Inválida");
            return;
        }

        if (capacidadeDePeso <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade de peso Inválida");
            return;
        }

        if (estadoAtualizado.equalsIgnoreCase("A") || estadoAtualizado.equalsIgnoreCase("I")) {
            CarretaGraneleira carretaGraneleiraAtualizada = new CarretaGraneleira();
            carretaGraneleiraAtualizada.setNomeMaquina(nomeAtualizado);
            carretaGraneleiraAtualizada.setMarcaMaquina(marcaAtualizado);
            carretaGraneleiraAtualizada.setAnoMaquina(anoAtualizado);
            carretaGraneleiraAtualizada.setEstadoMaquina(estadoAtualizado);
            carretaGraneleiraAtualizada.setChassiMaquina(chassiAtualizado);
            carretaGraneleiraAtualizada.setCapacidadeDePeso(capacidadeDePeso);
            carretaGraneleiraAtualizada.setCapacidadeDeSacas(capacidadeDeSacas);
            carretaGraneleiraAtualizada.setIdCarretaGraneleira(idMaquina);

            controleMaquina = new ControleMaquina();
            String msgAtualizacao = controleMaquina.atualizarCarretaGraneleira(carretaGraneleiraAtualizada);
            JOptionPane.showMessageDialog(null, msgAtualizacao);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Estado inválido\nA para Ativo\nI para Inativo");
        }

    }

    public void consultarCarretaGraneleira() throws SQLException {
        if (jTextFieldNomeMaquinaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da graneleira");
            return;
        }

        nomeMaquina = jTextFieldNomeMaquinaBuscada.getText();
        CarretaGraneleira carretaEncontrada = controleMaquina.buscarCarretaGraneleira(nomeMaquina);

        if (carretaEncontrada != null) {
            ano = Integer.toString(carretaEncontrada.getAnoMaquina());
            String capacidadeDeSacas1 = Integer.toString(carretaEncontrada.getCapacidadeDeSacas());
            String capacidadeDePeso1 = Double.toString(carretaEncontrada.getCapacidadeDePeso());

            jTextFieldNomeMaquina.setText(carretaEncontrada.getNomeMaquina());
            jTextFieldMarcaMaquina.setText(carretaEncontrada.getMarcaMaquina());
            jTextFieldAnoMaquina.setText(ano);
            jTextFieldChassiMaquina.setText(carretaEncontrada.getChassiMaquina());
            jTextFieldEstadoMaquina.setText(carretaEncontrada.getEstadoMaquina());
            jTextFieldCapacidadeDePeso.setText(capacidadeDePeso1);
            jTextFieldCapacidadeDeSacas.setText(capacidadeDeSacas1);
            idMaquina = carretaEncontrada.getIdCarretaGraneleira();
        } else {
            JOptionPane.showMessageDialog(this, "Carreta Graneleira não encontrada");
            limparCampos();
        }
    }

    private void limparCampos() {
        jTextFieldNomeMaquina.setText("");
        jTextFieldMarcaMaquina.setText("");
        jTextFieldAnoMaquina.setText("");
        jTextFieldChassiMaquina.setText("");
        jTextFieldEstadoMaquina.setText("");
        jTextFieldCapacidadeDePeso.setText("");
        jTextFieldCapacidadeDeSacas.setText("");
        jTextFieldNomeMaquinaBuscada.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMaquina;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarAtualizacao;
    private javax.swing.JButton jButtonSairDaTelaDeConsulta;
    private javax.swing.JLabel jLabelFundoAtualizacao;
    private javax.swing.JTextField jTextFieldAnoMaquina;
    private javax.swing.JTextField jTextFieldCapacidadeDePeso;
    private javax.swing.JTextField jTextFieldCapacidadeDeSacas;
    private javax.swing.JTextField jTextFieldChassiMaquina;
    private javax.swing.JTextField jTextFieldEstadoMaquina;
    private javax.swing.JTextField jTextFieldMarcaMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquina;
    private javax.swing.JTextField jTextFieldNomeMaquinaBuscada;
    // End of variables declaration//GEN-END:variables
}
