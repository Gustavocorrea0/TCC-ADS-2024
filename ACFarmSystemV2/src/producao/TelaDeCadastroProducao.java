package producao;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validacoes.ValidarData;

public class TelaDeCadastroProducao extends javax.swing.JFrame {

    private DefaultTableModel modeloPropriedade;

    private ControleProducao controleProducao = new ControleProducao();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private String tipoDeCultura;
    private String dataPlantio;
    private String dataInicioColheita;
    private String dataFimColheita;
    private String nomeProducao;
    private int quantidadeProduzidaEmSacos;
    private String nomePropriedade;
    private String msg;
    private String estadoDeVenda;

    private Date dataPlantioValida;
    private Date dataInicioColheitaValida;
    private Date dataFimColheitaValida;

    private Double valorTotalDeDespesas;
    private Double valorTotalDeLucro;

    private String valorTotalDeLucroTexto;
    private String valorTotalDeDespesasTexto;

    public TelaDeCadastroProducao() {
        initComponents();
        readTable();
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
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jTextFieldNomeProducao = new javax.swing.JTextField();
        jTextFieldDataPlantio = new javax.swing.JTextField();
        jTextFieldDataInicioColheita = new javax.swing.JTextField();
        jTextFieldDataFimColheita = new javax.swing.JTextField();
        jTextFieldValorTotalDeDespesas = new javax.swing.JTextField();
        jTextFieldValorTotalDeLucro = new javax.swing.JTextField();
        jTextFieldQuantidadeProduzidaEmSacos = new javax.swing.JTextField();
        jComboBoxEstadoDeVenda = new javax.swing.JComboBox<>();
        jComboBoxCultura = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePropriedade = new javax.swing.JTable();
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
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 115, 60, 37));

        jButtonConfirmarAdicao.setBorder(null);
        jButtonConfirmarAdicao.setBorderPainted(false);
        jButtonConfirmarAdicao.setContentAreaFilled(false);
        jButtonConfirmarAdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarAdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 546, 280, 37));

        jTextFieldNomePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.setBorder(null);
        jTextFieldNomePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNomePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 118, 310, 29));

        jTextFieldNomeProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducao.setBorder(null);
        jTextFieldNomeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldNomeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 386, 390, 29));

        jTextFieldDataPlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataPlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataPlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataPlantio.setBorder(null);
        jTextFieldDataPlantio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataPlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 479, 271, 29));

        jTextFieldDataInicioColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataInicioColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataInicioColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataInicioColheita.setBorder(null);
        jTextFieldDataInicioColheita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataInicioColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 572, 271, 29));

        jTextFieldDataFimColheita.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataFimColheita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataFimColheita.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataFimColheita.setBorder(null);
        jTextFieldDataFimColheita.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldDataFimColheita, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 115, 312, 29));

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
        getContentPane().add(jTextFieldValorTotalDeDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 193, 312, 29));

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
        getContentPane().add(jTextFieldValorTotalDeLucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 270, 312, 30));

        jTextFieldQuantidadeProduzidaEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeProduzidaEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeProduzidaEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeProduzidaEmSacos.setBorder(null);
        jTextFieldQuantidadeProduzidaEmSacos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldQuantidadeProduzidaEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 351, 312, 29));

        jComboBoxEstadoDeVenda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstadoDeVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "sim", "nao" }));
        jComboBoxEstadoDeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoDeVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstadoDeVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 430, 134, -1));

        jComboBoxCultura.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxCultura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "soja", "milho" }));
        jComboBoxCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 130, -1));

        jTablePropriedade.setBackground(new java.awt.Color(15, 42, 61));
        jTablePropriedade.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTablePropriedade.setForeground(new java.awt.Color(255, 255, 255));
        jTablePropriedade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Propriedade", "Area(Alqueire)", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablePropriedade.setGridColor(new java.awt.Color(255, 204, 0));
        jTablePropriedade.setRowHeight(30);
        jTablePropriedade.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTablePropriedade);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 410, 140));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_adicao_producao.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    private void jButtonConfirmarAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarAdicaoActionPerformed
        try {
            cadastrarProducao();
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeCadastroProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Busque uma propriedade");
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
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonCancelarAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAdicaoActionPerformed
        JOptionPane.showMessageDialog(this, "Adição cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAdicaoActionPerformed

    private void jTextFieldValorTotalDeDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalDeDespesasActionPerformed

    }//GEN-LAST:event_jTextFieldValorTotalDeDespesasActionPerformed

    private void jComboBoxEstadoDeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoDeVendaActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoDeVendaActionPerformed

    private void jComboBoxCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCulturaActionPerformed

    }//GEN-LAST:event_jComboBoxCulturaActionPerformed

    private void jTextFieldValorTotalDeLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalDeLucroActionPerformed

    }//GEN-LAST:event_jTextFieldValorTotalDeLucroActionPerformed

    public void buscarPropriedade() throws SQLException {
        nomePropriedade = jTextFieldNomePropriedade.getText();
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(nomePropriedade);

        if (propriedadeEncontrada != null) {
            nomePropriedade = propriedadeEncontrada.getNomePropriedade();
            JOptionPane.showMessageDialog(this, "Propriedade encontrada.");
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
        }
    }

    public void cadastrarProducao() throws ParseException {
        if (jTextFieldNomePropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma propriedade");
            return;
        }

        if (jTextFieldNomeProducao.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Nome Inválido");
            return;
        }

        if (jTextFieldDataPlantio.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Data de plantio Inválida");
            return;
        }

        if (jTextFieldDataInicioColheita.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Data de inicio colheita Inválida");
            return;
        }

        if (jTextFieldDataFimColheita.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Data de fim colheita Inválida");
            return;
        }

        if (jTextFieldValorTotalDeDespesas.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Valor total de despesas Inválido");
            return;
        }

        if (jTextFieldValorTotalDeLucro.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Valor total de lucro Inválido");
            return;
        }

        if (jTextFieldQuantidadeProduzidaEmSacos.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Produção em sacos Inválida");
            return;
        }

        try {
            dataPlantio = jTextFieldDataPlantio.getText();
            dataInicioColheita = jTextFieldDataInicioColheita.getText();
            dataFimColheita = jTextFieldDataFimColheita.getText();
            nomeProducao = jTextFieldNomeProducao.getText();
            quantidadeProduzidaEmSacos = Integer.parseInt(jTextFieldQuantidadeProduzidaEmSacos.getText());
            estadoDeVenda = jComboBoxEstadoDeVenda.getSelectedItem().toString();
            tipoDeCultura = jComboBoxCultura.getSelectedItem().toString();

            valorTotalDeDespesasTexto = jTextFieldValorTotalDeDespesas.getText();
            valorTotalDeLucroTexto = jTextFieldValorTotalDeLucro.getText();

            valorTotalDeDespesas = Double.valueOf(valorTotalDeDespesasTexto.replace(".", "").replace(",", "."));
            valorTotalDeLucro = Double.valueOf(valorTotalDeLucroTexto.replace(".", "").replace(",", "."));

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            if (!ValidarData.validaData(dataPlantio)) {
                JOptionPane.showMessageDialog(this, "Data de plantio Inválida (insira: dd/MM/aaaa)");
                return;
            }

            if (!ValidarData.validaData(dataInicioColheita)) {
                JOptionPane.showMessageDialog(this, "Data de inicio de colheita Inválida (insira: dd/MM/aaaa)");
                return;
            }

            if (!ValidarData.validaData(dataFimColheita)) {
                JOptionPane.showMessageDialog(this, "Data de fim de colheita Inválida (insira: dd/MM/aaaa)");
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

            if (valorTotalDeLucro < 0) {
                JOptionPane.showMessageDialog(this, "Valor de lucro inválido");
                return;
            }

            if (estadoDeVenda.equals("Selecione")) {
                JOptionPane.showMessageDialog(this, "Vendido Inválido");
                return;
            }

            if (tipoDeCultura.equals("Selecione")) {
                JOptionPane.showMessageDialog(this, "Tipo de cultura Inválido");
                return;
            }

            dataPlantioValida = dateFormat.parse(dataPlantio);
            dataInicioColheitaValida = dateFormat.parse(dataInicioColheita);
            dataFimColheitaValida = dateFormat.parse(dataFimColheita);

            if (dataPlantioValida == dataInicioColheitaValida) {
                JOptionPane.showMessageDialog(null, "Datas de Plantio e colheita não devem ser iguais");
                return;
            }

            if (controleProducao.buscarProducao(nomeProducao) != null) {
                JOptionPane.showMessageDialog(null, "Já existe uma produção com este nome");
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
            limparCampos();
            
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Os valores devem ser númericos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Formato de moeda inválido");
        }
    }

    public void readTable() {
        modeloPropriedade = (DefaultTableModel) jTablePropriedade.getModel();
        controlePropriedade = new ControlePropriedade();

        for (Propriedade u : controlePropriedade.readPropriedade()) {
            modeloPropriedade.addRow(new Object[]{u.getNomePropriedade(), u.getAreaPropriedade(), u.getCidade()});
        }
    }

    public void limparCampos() {
        jTextFieldDataFimColheita.setText("");
        jTextFieldDataInicioColheita.setText("");
        jTextFieldDataPlantio.setText("");
        jTextFieldNomePropriedade.setText("");
        jTextFieldNomeProducao.setText("");
        jTextFieldQuantidadeProduzidaEmSacos.setText("");
        jTextFieldValorTotalDeDespesas.setText("");
        jTextFieldValorTotalDeLucro.setText("");
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePropriedade;
    private javax.swing.JTextField jTextFieldDataFimColheita;
    private javax.swing.JTextField jTextFieldDataInicioColheita;
    private javax.swing.JTextField jTextFieldDataPlantio;
    private javax.swing.JTextField jTextFieldNomeProducao;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldQuantidadeProduzidaEmSacos;
    private javax.swing.JTextField jTextFieldValorTotalDeDespesas;
    private javax.swing.JTextField jTextFieldValorTotalDeLucro;
    // End of variables declaration//GEN-END:variables
}
