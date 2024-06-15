package planta.CRUDSoja;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import planta.ControlePlanta;
import planta.Soja;
import planta.TelaCRUDSoja;
import validacoes.ValidarData;

public class TelaDeMovimentacaoSoja extends javax.swing.JFrame {

    private ControlePlanta controlePlanta = new ControlePlanta();
    private String fornecedorPlanta;
    private String cicloEmDias;
    private String dataDePlantio;
    private String dataDeSurgimentoDeEspigas;
    private String alturaAtualDaPlanta;
    private String idPropriedade;
    private String dataDeSurgimentoDeSementes;
    private String tipoDePlanta;

    public TelaDeMovimentacaoSoja() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldFornecedor = new javax.swing.JTextField();
        jTextFieldCicloAproximadoEmDias = new javax.swing.JTextField();
        jTextFieldDataPlantio = new javax.swing.JTextField();
        jTextFieldAlturaPlanta = new javax.swing.JTextField();
        jTextFieldAlturaPlantaAdicionarMilho = new javax.swing.JTextField();
        jTextFieldDataSurgimentoDeSementes = new javax.swing.JTextField();
        jTextFieldIdSoja = new javax.swing.JTextField();
        jButtonSairDaTelaAdicionarMilho = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonConfirmaAtualizacao = new javax.swing.JButton();
        jButtonCancelarMovimentacao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldFornecedor.setEditable(false);
        jTextFieldFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFornecedor.setBorder(null);
        jTextFieldFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 251, 272, 29));

        jTextFieldCicloAproximadoEmDias.setEditable(false);
        jTextFieldCicloAproximadoEmDias.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCicloAproximadoEmDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCicloAproximadoEmDias.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCicloAproximadoEmDias.setBorder(null);
        jTextFieldCicloAproximadoEmDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCicloAproximadoEmDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCicloAproximadoEmDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 463, 332, 29));

        jTextFieldDataPlantio.setEditable(false);
        jTextFieldDataPlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataPlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataPlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.setBorder(null);
        jTextFieldDataPlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataPlantioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataPlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 355, 272, 29));

        jTextFieldAlturaPlanta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlanta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlanta.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlanta.setBorder(null);
        jTextFieldAlturaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 251, 332, 29));

        jTextFieldAlturaPlantaAdicionarMilho.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlantaAdicionarMilho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlantaAdicionarMilho.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlantaAdicionarMilho.setBorder(null);
        jTextFieldAlturaPlantaAdicionarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaAdicionarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlantaAdicionarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 330, 30));

        jTextFieldDataSurgimentoDeSementes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataSurgimentoDeSementes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataSurgimentoDeSementes.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataSurgimentoDeSementes.setBorder(null);
        jTextFieldDataSurgimentoDeSementes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataSurgimentoDeSementesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataSurgimentoDeSementes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 355, 332, 29));

        jTextFieldIdSoja.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdSoja.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdSoja.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdSoja.setBorder(null);
        jTextFieldIdSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdSojaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdSoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 116, 305, 29));

        jButtonSairDaTelaAdicionarMilho.setBorder(null);
        jButtonSairDaTelaAdicionarMilho.setBorderPainted(false);
        jButtonSairDaTelaAdicionarMilho.setContentAreaFilled(false);
        jButtonSairDaTelaAdicionarMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaAdicionarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaAdicionarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaAdicionarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonBuscar.setBorder(null);
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 106, 282, 45));

        jButtonConfirmaAtualizacao.setBorder(null);
        jButtonConfirmaAtualizacao.setBorderPainted(false);
        jButtonConfirmaAtualizacao.setContentAreaFilled(false);
        jButtonConfirmaAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmaAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmaAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 550, 280, 35));

        jButtonCancelarMovimentacao.setBorder(null);
        jButtonCancelarMovimentacao.setBorderPainted(false);
        jButtonCancelarMovimentacao.setContentAreaFilled(false);
        jButtonCancelarMovimentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarMovimentacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarMovimentacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 599, 280, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_tela_de_movimentacao_soja.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldFornecedorActionPerformed

    private void jTextFieldCicloAproximadoEmDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCicloAproximadoEmDiasActionPerformed

    }//GEN-LAST:event_jTextFieldCicloAproximadoEmDiasActionPerformed

    private void jTextFieldDataPlantioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataPlantioActionPerformed

    }//GEN-LAST:event_jTextFieldDataPlantioActionPerformed

    private void jTextFieldAlturaPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaPlantaActionPerformed

    }//GEN-LAST:event_jTextFieldAlturaPlantaActionPerformed

    private void jTextFieldAlturaPlantaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaPlantaAdicionarMilhoActionPerformed

    }//GEN-LAST:event_jTextFieldAlturaPlantaAdicionarMilhoActionPerformed

    private void jTextFieldDataSurgimentoDeSementesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataSurgimentoDeSementesActionPerformed

    }//GEN-LAST:event_jTextFieldDataSurgimentoDeSementesActionPerformed

    private void jTextFieldIdSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdSojaActionPerformed

    }//GEN-LAST:event_jTextFieldIdSojaActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            consultarPlanta();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeMovimentacaoSoja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeMovimentacaoSoja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Adicione o codigo da planta");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSairDaTelaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed
        this.dispose();
        new TelaCRUDSoja().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed

    private void jButtonCancelarMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarMovimentacaoActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarMovimentacaoActionPerformed

    private void jButtonConfirmaAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaAtualizacaoActionPerformed
        try {
            atualizarPlanta();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeMovimentacaoSoja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Busque uma planta");
            limparCampos();
        }
    }//GEN-LAST:event_jButtonConfirmaAtualizacaoActionPerformed

    public void atualizarPlanta() throws ParseException {
        int idParaBusca = Integer.parseInt(jTextFieldIdSoja.getText());

        try {
            if (jTextFieldAlturaPlanta.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Adicione a altura da planta");
                return;
            }

            if (jTextFieldDataSurgimentoDeSementes.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Adicione a data surgimento de sementes");
                return;
            }

            Double alturaAtual = Double.valueOf(jTextFieldAlturaPlanta.getText());
            String dataDeSurgimentoDeSementesAtualizada = jTextFieldDataSurgimentoDeSementes.getText();

            if (!ValidarData.validaData(dataDeSurgimentoDeSementesAtualizada)) {
                JOptionPane.showMessageDialog(null, "Data de surgimento de sementes inválida (dd/MM/aaa)");
                return;
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dataSAtualizada = dateFormat.parse(dataDeSurgimentoDeSementesAtualizada);

            if (alturaAtual < 0) {
                JOptionPane.showMessageDialog(null, "Altura inválida");
                return;
            }

            if (dataSAtualizada != null) {
                Soja sojaAtualizado = new Soja();
                sojaAtualizado.setIdSoja(idParaBusca);
                sojaAtualizado.setAlturaAtualDaPlanta(alturaAtual);
                sojaAtualizado.setDataDeSurgimentoDeSementes(dataSAtualizada);
                String msgAtualizacao = controlePlanta.atualizarSoja(sojaAtualizado);
                JOptionPane.showMessageDialog(null, msgAtualizacao);
                limparCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "A altura da planta deve ser numerica (ex: 1.10)");
            return;
        }
    }

    public void consultarPlanta() throws SQLException, ParseException {
        int idParaBusca = Integer.parseInt(jTextFieldIdSoja.getText());
        Soja sojaEncontrado = controlePlanta.consultarSoja(idParaBusca);

        if (sojaEncontrado != null) {
            fornecedorPlanta = sojaEncontrado.getNomeFornecedor();
            cicloEmDias = Integer.toString(sojaEncontrado.getCicloEmDias());
            alturaAtualDaPlanta = Double.toString(sojaEncontrado.getAlturaAtualDaPlanta());

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            Date data1 = formatoSQL.parse(sojaEncontrado.getDataDePlantio().toString());
            Date data2 = formatoSQL.parse(sojaEncontrado.getDataDeSurgimentoDeSementes().toString());

            dataDePlantio = formatoBrasileiro.format(data1);
            dataDeSurgimentoDeSementes = formatoBrasileiro.format(data2);

            jTextFieldAlturaPlanta.setText(alturaAtualDaPlanta);
            jTextFieldCicloAproximadoEmDias.setText(cicloEmDias);
            jTextFieldDataPlantio.setText(dataDePlantio);
            jTextFieldFornecedor.setText(fornecedorPlanta);
            jTextFieldDataSurgimentoDeSementes.setText(dataDeSurgimentoDeSementes);
        } else {
            JOptionPane.showMessageDialog(this, "Planta não encontrada");
            limparCampos();
        }
    }

    public void limparCampos() {
        jTextFieldAlturaPlanta.setText("");
        jTextFieldCicloAproximadoEmDias.setText("");
        jTextFieldDataPlantio.setText("");
        jTextFieldFornecedor.setText("");
        jTextFieldDataSurgimentoDeSementes.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelarMovimentacao;
    private javax.swing.JButton jButtonConfirmaAtualizacao;
    private javax.swing.JButton jButtonSairDaTelaAdicionarMilho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAlturaPlanta;
    private javax.swing.JTextField jTextFieldAlturaPlantaAdicionarMilho;
    private javax.swing.JTextField jTextFieldCicloAproximadoEmDias;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldDataSurgimentoDeSementes;
    private javax.swing.JTextField jTextFieldFornecedor;
    private javax.swing.JTextField jTextFieldIdSoja;
    // End of variables declaration//GEN-END:variables

}
