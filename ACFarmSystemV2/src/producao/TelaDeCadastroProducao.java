package producao;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeCadastroProducao extends javax.swing.JFrame {

    private ControleProducao controleProducao = new ControleProducao();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private String tipoDeCultura;
    private String dataPlantio;
    private String dataInicioColheita;
    private String dataFimColheita;
    private String nomeProducao;
    private int quantidadeProduzidaEmSacos;
    private Double valorTotalDeDespesas;
    private Double valorTotalDeLucro;
    private String nomePropriedade;
    private String msg;
    private String estadoDeVenda;

    private Date dataPlantioValida;
    private Date dataInicioColheitaValida;
    private Date dataFimColheitaValida;

    private String valorTotalDeLucroTexto;
    private String valorTotalDeDespesasTexto;

    public TelaDeCadastroProducao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCultura = new javax.swing.ButtonGroup();
        botaoEstadoDeVenda = new javax.swing.ButtonGroup();
        jButtonCancelarAdicao = new javax.swing.JButton();
        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonConfirmarAdicao = new javax.swing.JButton();
        jTextFieldIdPropriedade = new javax.swing.JTextField();
        jTextFieldDataInicioColheita = new javax.swing.JTextField();
        jTextFieldDataFimColheita = new javax.swing.JTextField();
        jTextFieldValorTotalDeDespesas = new javax.swing.JTextField();
        jTextFieldValorTotalDeLucro = new javax.swing.JTextField();
        jTextFieldQuantidadeProduzidaEmSacos = new javax.swing.JTextField();
        jTextFieldNomeProducao = new javax.swing.JTextField();
        jTextFieldDataPlantio = new javax.swing.JTextField();
        jComboBoxEstadoDeVenda = new javax.swing.JComboBox<>();
        jComboBoxCultura = new javax.swing.JComboBox<>();
        jLabelTelaProducao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarAdicao.setBorder(null);
        jButtonCancelarAdicao.setBorderPainted(false);
        jButtonCancelarAdicao.setContentAreaFilled(false);
        jButtonCancelarAdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 596, 280, 37));

        jButtonVoltarATelaDeProducao.setBorder(null);
        jButtonVoltarATelaDeProducao.setBorderPainted(false);
        jButtonVoltarATelaDeProducao.setContentAreaFilled(false);
        jButtonVoltarATelaDeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 23, 40, 22));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setBorderPainted(false);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 106, 260, 45));

        jButtonConfirmarAdicao.setBorder(null);
        jButtonConfirmarAdicao.setBorderPainted(false);
        jButtonConfirmarAdicao.setContentAreaFilled(false);
        jButtonConfirmarAdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 595, 280, 38));

        jTextFieldIdPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdPropriedade.setBorder(null);
        jTextFieldIdPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldIdPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 115, 304, 27));

        jTextFieldDataInicioColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataInicioColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataInicioColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataInicioColheita.setBorder(null);
        jTextFieldDataInicioColheita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataInicioColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 408, 272, 29));

        jTextFieldDataFimColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataFimColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataFimColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataFimColheita.setBorder(null);
        jTextFieldDataFimColheita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataFimColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 507, 272, 29));

        jTextFieldValorTotalDeDespesas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotalDeDespesas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotalDeDespesas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeDespesas.setBorder(null);
        jTextFieldValorTotalDeDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldValorTotalDeDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalDeDespesasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorTotalDeDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 220, 271, 27));

        jTextFieldValorTotalDeLucro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotalDeLucro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotalDeLucro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeLucro.setBorder(null);
        jTextFieldValorTotalDeLucro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldValorTotalDeLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalDeLucroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorTotalDeLucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 314, 272, 27));

        jTextFieldQuantidadeProduzidaEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeProduzidaEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeProduzidaEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeProduzidaEmSacos.setBorder(null);
        jTextFieldQuantidadeProduzidaEmSacos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldQuantidadeProduzidaEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 406, 270, 29));

        jTextFieldNomeProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducao.setBorder(null);
        jTextFieldNomeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldNomeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 222, 272, 29));

        jTextFieldDataPlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataPlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataPlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.setBorder(null);
        jTextFieldDataPlantio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataPlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 315, 272, 29));

        jComboBoxEstadoDeVenda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstadoDeVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Nao" }));
        jComboBoxEstadoDeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoDeVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstadoDeVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 190, -1));

        jComboBoxCultura.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxCultura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Soja", "Milho" }));
        jComboBoxCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 190, -1));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_adicao_producao.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldIdPropriedadeActionPerformed

    private void jButtonConfirmarAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAdicaoActionPerformed
        try {
            cadastrarProducao();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeCadastroProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConfirmarAdicaoActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        this.dispose();
        new TelaDeEscolhaDePropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonCancelarAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAdicaoActionPerformed
        JOptionPane.showMessageDialog(this, "Adição cancelada");
        jTextFieldDataFimColheita.setText("");
        jTextFieldDataInicioColheita.setText("");
        jTextFieldDataPlantio.setText("");
        jTextFieldIdPropriedade.setText("");
        jTextFieldNomeProducao.setText("");
        jTextFieldQuantidadeProduzidaEmSacos.setText("");
        jTextFieldValorTotalDeDespesas.setText("");
        jTextFieldValorTotalDeLucro.setText("");
    }//GEN-LAST:event_jButtonCancelarAdicaoActionPerformed

    private void jTextFieldValorTotalDeDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalDeDespesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorTotalDeDespesasActionPerformed

    private void jComboBoxEstadoDeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoDeVendaActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoDeVendaActionPerformed

    private void jComboBoxCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCulturaActionPerformed

    }//GEN-LAST:event_jComboBoxCulturaActionPerformed

    private void jTextFieldValorTotalDeLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalDeLucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorTotalDeLucroActionPerformed

    public void buscarPropriedade() throws SQLException {
        nomePropriedade = jTextFieldIdPropriedade.getText();
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(nomePropriedade);

        if (propriedadeEncontrada != null) {
            nomePropriedade = propriedadeEncontrada.getNomePropriedade();
            JOptionPane.showMessageDialog(this, "Propriedade encontrada.");
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
        }
    }

    public void cadastrarProducao() throws ParseException {
        dataPlantio = jTextFieldDataPlantio.getText();
        dataInicioColheita = jTextFieldDataInicioColheita.getText();
        dataFimColheita = jTextFieldDataFimColheita.getText();
        nomeProducao = jTextFieldNomeProducao.getText();
        quantidadeProduzidaEmSacos = Integer.parseInt(jTextFieldQuantidadeProduzidaEmSacos.getText());
        estadoDeVenda = jComboBoxEstadoDeVenda.getSelectedItem().toString();
        tipoDeCultura = jComboBoxCultura.getSelectedItem().toString();
        valorTotalDeDespesas = Double.valueOf(jTextFieldValorTotalDeDespesas.getText());
        valorTotalDeLucro = Double.valueOf(jTextFieldValorTotalDeLucro.getText());
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (estadoDeVenda.equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Estado Inválido");
            return;
        }
        
        if (tipoDeCultura.equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Tipo de cultura Inválido");
            return;
        }
        
        if (nomeProducao.equals("")) {
            JOptionPane.showMessageDialog(this, "Nome Inválido");
            return;
        }

        if (quantidadeProduzidaEmSacos <= 0) {
            JOptionPane.showMessageDialog(this, "Quantidade produzida inválida");
            return;
        }

        if (valorTotalDeDespesas <= 0) {
            JOptionPane.showMessageDialog(this, "Valor de despesa inválida");
            return;
        }

        if (valorTotalDeLucro <= 0) {
            JOptionPane.showMessageDialog(this, "Valor de lucro inválido");
            return;
        }

        try {
            dataPlantioValida = dateFormat.parse(dataPlantio);
            dataInicioColheitaValida = dateFormat.parse(dataInicioColheita);
            dataFimColheitaValida = dateFormat.parse(dataFimColheita);

            if (dataPlantioValida == dataInicioColheitaValida) {
                JOptionPane.showMessageDialog(null, "Datas de Plantio e colheita não devem ser iguais");
                return;
            }

            if (estadoDeVenda.equals("Selecione")) {
                JOptionPane.showMessageDialog(null, "Selecione o estado de Venda");
                return;
            }

            if (tipoDeCultura.equals("Selecione")) {
                JOptionPane.showMessageDialog(null, "Selecione a cultura");
                return;
            }

            controleProducao.producao.setNomeProducao(nomeProducao);
            controleProducao.producao.setPropriedade(nomePropriedade);
            controleProducao.producao.setDataDePlantio(dataPlantioValida);
            controleProducao.producao.setDataInicioColheita(dataInicioColheitaValida);
            controleProducao.producao.setDataFimColheita(dataFimColheitaValida);
            controleProducao.producao.setQuantidadeProduzidaEmSacos(quantidadeProduzidaEmSacos);
            controleProducao.producao.setValorTotalDeLucro(valorTotalDeLucro);
            controleProducao.producao.setValorTotalDespesas(valorTotalDeDespesas);
            controleProducao.producao.setCultura(tipoDeCultura);
            controleProducao.producao.setStatusDeVenda(estadoDeVenda);

            msg = controleProducao.cadastrarProducao(ControlePropriedade.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

            jTextFieldDataFimColheita.setText("");
            jTextFieldDataInicioColheita.setText("");
            jTextFieldDataPlantio.setText("");
            jTextFieldIdPropriedade.setText("");
            jTextFieldNomeProducao.setText("");
            jTextFieldQuantidadeProduzidaEmSacos.setText("");
            jTextFieldValorTotalDeDespesas.setText("");
            jTextFieldValorTotalDeLucro.setText("");

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Formato de moeda inválido");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoCultura;
    private javax.swing.ButtonGroup botaoEstadoDeVenda;
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarAdicao;
    private javax.swing.JButton jButtonConfirmarAdicao;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JComboBox<String> jComboBoxCultura;
    private javax.swing.JComboBox<String> jComboBoxEstadoDeVenda;
    private javax.swing.JLabel jLabelTelaProducao;
    private javax.swing.JTextField jTextFieldDataFimColheita;
    private javax.swing.JTextField jTextFieldDataInicioColheita;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldIdPropriedade;
    private javax.swing.JTextField jTextFieldNomeProducao;
    private javax.swing.JTextField jTextFieldQuantidadeProduzidaEmSacos;
    private javax.swing.JTextField jTextFieldValorTotalDeDespesas;
    private javax.swing.JTextField jTextFieldValorTotalDeLucro;
    // End of variables declaration//GEN-END:variables
}
