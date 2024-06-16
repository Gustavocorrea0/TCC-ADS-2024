package producao;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

/**
 *
 * @author Gustavo
 */
public class TelaDeRemocaoProducao extends javax.swing.JFrame {

    private ControleProducao controleProducao = new ControleProducao();
    private String nomeProducao;
    private String dataDePlantio;
    private String dataInicioColheita;
    private String dataFimColheita;
    private String valorTotalDespesas;
    private String valorTotalDeLucro;
    private String quantidadeProduzidaEmSacos;
    private String cultura;
    private String nomeProducaoBuscada;

    public TelaDeRemocaoProducao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jTextFieldNomeProducaoBuscada = new javax.swing.JTextField();
        jTextFieldNomeProducao = new javax.swing.JTextField();
        jTextFieldDataInicioColheita = new javax.swing.JTextField();
        jTextFieldDataFimColheita = new javax.swing.JTextField();
        jTextFieldQuantidadeProduzidaEmSacos = new javax.swing.JTextField();
        jTextFieldValorTotalDeLucro = new javax.swing.JTextField();
        jTextFieldValorTotalDeDespesas = new javax.swing.JTextField();
        jTextFieldDataPlantio = new javax.swing.JTextField();
        jTextFieldCultura = new javax.swing.JTextField();
        jTextFieldEstadoDeVenda = new javax.swing.JTextField();
        jLabelTelaProducao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarATelaDeProducao.setBorder(null);
        jButtonVoltarATelaDeProducao.setBorderPainted(false);
        jButtonVoltarATelaDeProducao.setContentAreaFilled(false);
        jButtonVoltarATelaDeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 23, 40, 25));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setBorderPainted(false);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 107, 282, 45));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 547, 280, 38));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 596, 280, 37));

        jTextFieldNomeProducaoBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProducaoBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeProducaoBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducaoBuscada.setBorder(null);
        jTextFieldNomeProducaoBuscada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNomeProducaoBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeProducaoBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeProducaoBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 120, 304, 29));

        jTextFieldNomeProducao.setEditable(false);
        jTextFieldNomeProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducao.setBorder(null);
        jTextFieldNomeProducao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 226, 272, 29));

        jTextFieldDataInicioColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataInicioColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataInicioColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataInicioColheita.setBorder(null);
        jTextFieldDataInicioColheita.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataInicioColheita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataInicioColheitaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataInicioColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 391, 272, 29));

        jTextFieldDataFimColheita.setEditable(false);
        jTextFieldDataFimColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataFimColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataFimColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataFimColheita.setBorder(null);
        jTextFieldDataFimColheita.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataFimColheita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataFimColheitaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataFimColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 487, 272, 29));

        jTextFieldQuantidadeProduzidaEmSacos.setEditable(false);
        jTextFieldQuantidadeProduzidaEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeProduzidaEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeProduzidaEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeProduzidaEmSacos.setBorder(null);
        jTextFieldQuantidadeProduzidaEmSacos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeProduzidaEmSacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeProduzidaEmSacosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeProduzidaEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 226, 312, 29));

        jTextFieldValorTotalDeLucro.setEditable(false);
        jTextFieldValorTotalDeLucro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotalDeLucro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotalDeLucro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeLucro.setBorder(null);
        jTextFieldValorTotalDeLucro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalDeLucroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorTotalDeLucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 487, 312, 29));

        jTextFieldValorTotalDeDespesas.setEditable(false);
        jTextFieldValorTotalDeDespesas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotalDeDespesas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldValorTotalDeDespesas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeDespesas.setBorder(null);
        jTextFieldValorTotalDeDespesas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotalDeDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalDeDespesasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorTotalDeDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 391, 312, 29));

        jTextFieldDataPlantio.setEditable(false);
        jTextFieldDataPlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataPlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataPlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.setBorder(null);
        jTextFieldDataPlantio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataPlantioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataPlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 304, 272, 29));

        jTextFieldCultura.setEditable(false);
        jTextFieldCultura.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCultura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCultura.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCultura.setBorder(null);
        jTextFieldCultura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 304, 312, 29));

        jTextFieldEstadoDeVenda.setEditable(false);
        jTextFieldEstadoDeVenda.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstadoDeVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstadoDeVenda.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoDeVenda.setBorder(null);
        jTextFieldEstadoDeVenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstadoDeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoDeVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstadoDeVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 226, 131, 29));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_remover_producao.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            consultarProducao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRemocaoProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jTextFieldNomeProducaoBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeProducaoBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldNomeProducaoBuscadaActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jTextFieldNomeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeProducaoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeProducaoActionPerformed

    private void jTextFieldDataInicioColheitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataInicioColheitaActionPerformed

    }//GEN-LAST:event_jTextFieldDataInicioColheitaActionPerformed

    private void jTextFieldDataFimColheitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataFimColheitaActionPerformed

    }//GEN-LAST:event_jTextFieldDataFimColheitaActionPerformed

    private void jTextFieldQuantidadeProduzidaEmSacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeProduzidaEmSacosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeProduzidaEmSacosActionPerformed

    private void jTextFieldValorTotalDeDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalDeDespesasActionPerformed

    }//GEN-LAST:event_jTextFieldValorTotalDeDespesasActionPerformed

    private void jTextFieldCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCulturaActionPerformed

    }//GEN-LAST:event_jTextFieldCulturaActionPerformed

    private void jTextFieldValorTotalDeLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalDeLucroActionPerformed

    }//GEN-LAST:event_jTextFieldValorTotalDeLucroActionPerformed

    private void jTextFieldDataPlantioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataPlantioActionPerformed

    }//GEN-LAST:event_jTextFieldDataPlantioActionPerformed

    private void jTextFieldEstadoDeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoDeVendaActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoDeVendaActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerProducao();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoção cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void consultarProducao() throws SQLException, ParseException {

        if (jTextFieldNomeProducaoBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome da produção");
            return;
        }

        nomeProducaoBuscada = jTextFieldNomeProducaoBuscada.getText();
        Producao producaoEncontrada = controleProducao.buscarProducao(nomeProducaoBuscada);

        if (producaoEncontrada != null) {
            nomeProducao = producaoEncontrada.getNomeProducao();
            valorTotalDeLucro = converterValorParaReal(producaoEncontrada.getValorTotalDeLucro());
            valorTotalDespesas = converterValorParaReal(producaoEncontrada.getValorTotalDespesas());
            quantidadeProduzidaEmSacos = Integer.toString(producaoEncontrada.getQuantidadeProduzidaEmSacos());
            cultura = producaoEncontrada.getCultura();

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            Date data1 = formatoSQL.parse(producaoEncontrada.getDataDePlantio().toString());
            Date data2 = formatoSQL.parse(producaoEncontrada.getDataInicioColheita().toString());
            Date data3 = formatoSQL.parse(producaoEncontrada.getDataFimColheita().toString());

            dataDePlantio = formatoBrasileiro.format(data1);
            dataInicioColheita = formatoBrasileiro.format(data2);
            dataFimColheita = formatoBrasileiro.format(data3);

            jTextFieldCultura.setText(cultura);
            jTextFieldNomeProducao.setText(nomeProducao);
            jTextFieldDataFimColheita.setText(dataFimColheita);
            jTextFieldDataInicioColheita.setText(dataInicioColheita);
            jTextFieldDataPlantio.setText(dataDePlantio);
            jTextFieldValorTotalDeDespesas.setText(valorTotalDespesas);
            jTextFieldQuantidadeProduzidaEmSacos.setText(quantidadeProduzidaEmSacos);
            jTextFieldValorTotalDeLucro.setText(valorTotalDeLucro);
            jTextFieldEstadoDeVenda.setText(producaoEncontrada.getStatusDeVenda());

            jTextFieldCultura.setEnabled(false);
            jTextFieldNomeProducao.setEnabled(false);
            jTextFieldDataFimColheita.setEnabled(false);
            jTextFieldDataInicioColheita.setEnabled(false);
            jTextFieldDataPlantio.setEnabled(false);
            jTextFieldValorTotalDeDespesas.setEnabled(false);
            jTextFieldQuantidadeProduzidaEmSacos.setEnabled(false);
            jTextFieldValorTotalDeLucro.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Produção não encontrada");
            limparCampos();
        }

    }

    public String converterValorParaReal(Double valorReal) {

        if (valorReal >= 9999.99 && valorReal < 100000.00) {
            return String.format("%,.2f", valorReal).replace(".", "#").replace(",", ",").replace("#", ".");
        }

        if (valorReal >= 99999.99 && valorReal < 100000.00) {
            return String.format("%,.2f", valorReal).replace(".", "#").replace(",", ".");
        }

        if (valorReal >= 100000.00 && valorReal < 999999.99) {
            return String.format("%,.2f", valorReal).replace(",", "#").replace(",", ".").replace("#", ",");
        }

        if (valorReal >= 1000000.00) {
            return String.format("%,.2f", valorReal).replace(",", "#").replace(",", ".").replace("#", ",");
        }

        return "Erro";

    }

    public void removerProducao() {
        if (jTextFieldNomeProducaoBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma produção");
            return;
        }
        nomeProducaoBuscada = jTextFieldNomeProducaoBuscada.getText();
        String msg = controleProducao.removerProducao(nomeProducaoBuscada);
        JOptionPane.showMessageDialog(this, msg);
        limparCampos();
    }

    public void limparCampos() {
        jTextFieldCultura.setText("");
        jTextFieldDataFimColheita.setText("");
        jTextFieldDataInicioColheita.setText("");
        jTextFieldDataPlantio.setText("");
        jTextFieldNomeProducao.setText("");
        jTextFieldNomeProducao.setText("");
        jTextFieldValorTotalDeDespesas.setText("");
        jTextFieldQuantidadeProduzidaEmSacos.setText("");
        jTextFieldValorTotalDeLucro.setText("");
        jTextFieldEstadoDeVenda.setText("");
        jTextFieldNomeProducaoBuscada.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JLabel jLabelTelaProducao;
    private javax.swing.JTextField jTextFieldCultura;
    private javax.swing.JTextField jTextFieldDataFimColheita;
    private javax.swing.JTextField jTextFieldDataInicioColheita;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldEstadoDeVenda;
    private javax.swing.JTextField jTextFieldNomeProducao;
    private javax.swing.JTextField jTextFieldNomeProducaoBuscada;
    private javax.swing.JTextField jTextFieldQuantidadeProduzidaEmSacos;
    private javax.swing.JTextField jTextFieldValorTotalDeDespesas;
    private javax.swing.JTextField jTextFieldValorTotalDeLucro;
    // End of variables declaration//GEN-END:variables
}
