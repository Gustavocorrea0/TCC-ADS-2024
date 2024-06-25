package VendaDeProducao;

import cliente.Cliente;
import cliente.ControleCliente;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import producao.ControleProducao;
import producao.Producao;
import validacoes.ValidarData;

public class TelaDeVendaProducao extends javax.swing.JFrame {

    private ControleCliente controleCliente = new ControleCliente();
    private ControleProducao controleProducao = new ControleProducao();
    private ControleVendaProducao controleVendaProducao = new ControleVendaProducao();

    public TelaDeVendaProducao() {
        initComponents();
        readClientes();
        readProducao();
    }

    private String msg;
    private String nomeProducaoBuscada;
    private String nomeClienteBuscado;
    private String nomeProducaoNovo;
    private String nomeClienteNovo;
    private String CNPJOuCPFNovo;
    private String dataProducaoNovo;
    private String dataVendaNovo;
    private String valorTotalTexto;
    private Double valorTotalVendaNovoCorrigido;
    private int quantidadeDeSacasProducaoNovo;
    private String formaDePagamentoNovo;
    private String metodoDePagamentoNovo;
    private int quantidadeDeParcelasNovo;
    private int idProducao;
    private String statusDeVendaProducao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNumeroSacasProducao = new javax.swing.JTextField();
        jTextFieldDataProducao = new javax.swing.JTextField();
        jTextFieldNomeProducaoBuscada = new javax.swing.JTextField();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jTextFieldNumeroDeParcelas = new javax.swing.JTextField();
        jTextFieldNomeClienteBuscado = new javax.swing.JTextField();
        jTextFieldNomeProducao = new javax.swing.JTextField();
        jTextFieldDataDaVenda = new javax.swing.JTextField();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jTextFieldCPFOuCNPJCliente = new javax.swing.JTextField();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonBuscarCliente = new javax.swing.JButton();
        jButtonBuscarProducao = new javax.swing.JButton();
        jButtonConfirmarVenda = new javax.swing.JButton();
        jButtonCancelarAtualizacao = new javax.swing.JButton();
        jComboBoxMetodoDePagamento = new javax.swing.JComboBox<>();
        jComboBoxFormaDePagamento = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProducao = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNumeroSacasProducao.setEditable(false);
        jTextFieldNumeroSacasProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroSacasProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNumeroSacasProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroSacasProducao.setBorder(null);
        jTextFieldNumeroSacasProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldNumeroSacasProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 260, 324, 30));

        jTextFieldDataProducao.setEditable(false);
        jTextFieldDataProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataProducao.setBorder(null);
        jTextFieldDataProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldDataProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 338, 325, 30));

        jTextFieldNomeProducaoBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProducaoBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeProducaoBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducaoBuscada.setBorder(null);
        jTextFieldNomeProducaoBuscada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldNomeProducaoBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 116, 270, 30));

        jTextFieldNomeCliente.setEditable(false);
        jTextFieldNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCliente.setBorder(null);
        jTextFieldNomeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 511, 325, 30));

        jTextFieldNumeroDeParcelas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroDeParcelas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNumeroDeParcelas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeParcelas.setBorder(null);
        jTextFieldNumeroDeParcelas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNumeroDeParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDeParcelasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroDeParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 415, 207, 30));

        jTextFieldNomeClienteBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeClienteBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeClienteBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeClienteBuscado.setBorder(null);
        jTextFieldNomeClienteBuscado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNomeClienteBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeClienteBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeClienteBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 432, 271, 29));

        jTextFieldNomeProducao.setEditable(false);
        jTextFieldNomeProducao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeProducao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProducao.setBorder(null);
        jTextFieldNomeProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldNomeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 188, 325, 30));

        jTextFieldDataDaVenda.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDaVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDaVenda.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDaVenda.setBorder(null);
        jTextFieldDataDaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldDataDaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDaVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDaVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 415, 207, 30));

        jTextFieldValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextFieldValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotal.setBorder(null);
        jTextFieldValorTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 499, 447, 29));

        jTextFieldCPFOuCNPJCliente.setEditable(false);
        jTextFieldCPFOuCNPJCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCPFOuCNPJCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCPFOuCNPJCliente.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCPFOuCNPJCliente.setBorder(null);
        jTextFieldCPFOuCNPJCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldCPFOuCNPJCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFOuCNPJClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCPFOuCNPJCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 589, 325, 30));

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setBorderPainted(false);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonBuscarCliente.setBorder(null);
        jButtonBuscarCliente.setBorderPainted(false);
        jButtonBuscarCliente.setContentAreaFilled(false);
        jButtonBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 429, 60, 35));

        jButtonBuscarProducao.setBorder(null);
        jButtonBuscarProducao.setBorderPainted(false);
        jButtonBuscarProducao.setContentAreaFilled(false);
        jButtonBuscarProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 113, 60, 36));

        jButtonConfirmarVenda.setBorder(null);
        jButtonConfirmarVenda.setBorderPainted(false);
        jButtonConfirmarVenda.setContentAreaFilled(false);
        jButtonConfirmarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 550, 282, 35));

        jButtonCancelarAtualizacao.setBorder(null);
        jButtonCancelarAtualizacao.setBorderPainted(false);
        jButtonCancelarAtualizacao.setContentAreaFilled(false);
        jButtonCancelarAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 600, 280, 36));

        jComboBoxMetodoDePagamento.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxMetodoDePagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Parcelado", "Á vista", "" }));
        jComboBoxMetodoDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMetodoDePagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMetodoDePagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 210, -1));

        jComboBoxFormaDePagamento.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxFormaDePagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Dinheiro Fisico", "Pix", "Cheque Comun", "Cheque pré-datado", "Outro", "" }));
        jComboBoxFormaDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormaDePagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxFormaDePagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 190, -1));

        jTableProducao.setBackground(new java.awt.Color(15, 42, 61));
        jTableProducao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableProducao.setForeground(new java.awt.Color(255, 255, 255));
        jTableProducao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da Produção", "Vendido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableProducao.setGridColor(new java.awt.Color(255, 255, 255));
        jTableProducao.setRowHeight(30);
        jTableProducao.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTableProducao.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableProducao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 240, 160));

        jTableFornecedor.setBackground(new java.awt.Color(15, 42, 61));
        jTableFornecedor.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTableFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableFornecedor.setGridColor(new java.awt.Color(255, 204, 0));
        jTableFornecedor.setRowHeight(30);
        jTableFornecedor.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jScrollPane1.setViewportView(jTableFornecedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 190, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVendaProducao/img_tela_de_realizar_vendas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        try {
            new TelaDeInicioVendasProducao().setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeVendaProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        try {
            buscarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeVendaProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jButtonConfirmarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarVendaActionPerformed
        realizarVenda();
    }//GEN-LAST:event_jButtonConfirmarVendaActionPerformed

    private void jButtonBuscarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProducaoActionPerformed
        try {
            buscarProducao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeVendaProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeVendaProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarProducaoActionPerformed

    private void jComboBoxMetodoDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMetodoDePagamentoActionPerformed

    }//GEN-LAST:event_jComboBoxMetodoDePagamentoActionPerformed

    private void jTextFieldValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalActionPerformed

    }//GEN-LAST:event_jTextFieldValorTotalActionPerformed

    private void jTextFieldCPFOuCNPJClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFOuCNPJClienteActionPerformed

    }//GEN-LAST:event_jTextFieldCPFOuCNPJClienteActionPerformed

    private void jTextFieldNomeClienteBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeClienteBuscadoActionPerformed

    private void jTextFieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeClienteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeClienteActionPerformed

    private void jTextFieldDataDaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDaVendaActionPerformed

    }//GEN-LAST:event_jTextFieldDataDaVendaActionPerformed

    private void jTextFieldNumeroDeParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDeParcelasActionPerformed

    }//GEN-LAST:event_jTextFieldNumeroDeParcelasActionPerformed

    private void jComboBoxFormaDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormaDePagamentoActionPerformed

    }//GEN-LAST:event_jComboBoxFormaDePagamentoActionPerformed

    private void jTextFieldDataProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataProducaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataProducaoActionPerformed

    private void jButtonCancelarAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAtualizacaoActionPerformed
        JOptionPane.showMessageDialog(this, "Venda Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarAtualizacaoActionPerformed

    public void buscarCliente() throws SQLException {
        nomeClienteBuscado = jTextFieldNomeClienteBuscado.getText();

        Cliente clienteEncontrado = controleCliente.buscarCliente(nomeClienteBuscado);

        if (clienteEncontrado != null) {
            jTextFieldCPFOuCNPJCliente.setText(clienteEncontrado.getCnpjOuCpfCliente());
            jTextFieldNomeCliente.setText(clienteEncontrado.getNomeCliente());
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado");
            jTextFieldNomeClienteBuscado.setText("");
            jTextFieldCPFOuCNPJCliente.setText("");
            jTextFieldNomeCliente.setText("");
        }
    }

    public void buscarProducao() throws SQLException, ParseException {
        nomeProducaoBuscada = jTextFieldNomeProducaoBuscada.getText();
        Producao producaoEncontrada = controleProducao.buscarProducao(nomeProducaoBuscada);

        if (producaoEncontrada != null) {

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            Date dataFimColheita = formatoSQL.parse(producaoEncontrada.getDataFimColheita().toString());

            jTextFieldNomeProducao.setText(producaoEncontrada.getNomeProducao());
            jTextFieldDataProducao.setText(formatoBrasileiro.format(dataFimColheita));
            jTextFieldNumeroSacasProducao.setText(Integer.toString(producaoEncontrada.getQuantidadeProduzidaEmSacos()));
            idProducao = producaoEncontrada.getIdProducao();
            statusDeVendaProducao = producaoEncontrada.getStatusDeVenda();

        } else {
            JOptionPane.showMessageDialog(this, "Produção não encontrada");
            jTextFieldNomeProducaoBuscada.setText("");
            jTextFieldNomeProducao.setText("");
            jTextFieldDataProducao.setText("");
            jTextFieldNumeroSacasProducao.setText("");
        }

    }

    public void realizarVenda() {
        if (jTextFieldNomeProducao.getText().isBlank() || jTextFieldDataProducao.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma Produção");
            return;
        }

        if (jTextFieldNomeCliente.getText().isBlank() || jTextFieldCPFOuCNPJCliente.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um Cliente");
            return;
        }

        if (jTextFieldNumeroDeParcelas.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade de vezes");
            return;
        }
        
        if (jTextFieldDataDaVenda.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a data da venda");
            return;
        }
        
         if (jTextFieldValorTotal.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira um formato valido para o valor total");
            return;
        }
        metodoDePagamentoNovo = jComboBoxMetodoDePagamento.getSelectedItem().toString();
        formaDePagamentoNovo = jComboBoxFormaDePagamento.getSelectedItem().toString();

        nomeProducaoNovo = jTextFieldNomeProducao.getText();
        nomeClienteNovo = jTextFieldNomeCliente.getText();
        CNPJOuCPFNovo = jTextFieldCPFOuCNPJCliente.getText();

        dataProducaoNovo = jTextFieldDataProducao.getText();
        dataVendaNovo = jTextFieldDataDaVenda.getText();
        valorTotalTexto = jTextFieldValorTotal.getText();

        try {
            valorTotalVendaNovoCorrigido = Double.valueOf(valorTotalTexto.replace(".", "").replace(",", "."));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Insira um formato valido para o valor");
            return;
        }

        try {
            quantidadeDeSacasProducaoNovo = Integer.parseInt(jTextFieldNumeroSacasProducao.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A quantidade de sacas deve ser numérica");
            return;
        }

        try {
            quantidadeDeParcelasNovo = Integer.parseInt(jTextFieldNumeroDeParcelas.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A quantidade de parcelas deve ser numérica");
            return;
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            
            if (ValidarData.validaData(dataVendaNovo) == false) {
                JOptionPane.showMessageDialog(this, "Data de venda produção inválida");
                return;
            }

            if (nomeProducaoNovo.isBlank()) {
                JOptionPane.showMessageDialog(this, "Busque uma producao");
                return;
            }

            if (nomeClienteNovo.isBlank()) {
                JOptionPane.showMessageDialog(this, "Busque um cliente");
                return;
            }

            if (statusDeVendaProducao.equalsIgnoreCase("sim")) {
                JOptionPane.showMessageDialog(this, "Esta produção já foi vendida");
                return;
            }

            if (metodoDePagamentoNovo.equals("Selecione") || formaDePagamentoNovo.equals("Selecione")) {
                JOptionPane.showMessageDialog(this, "Adicione o método de pagamento / Forma de pagamento");
                return;
            }

            if (CNPJOuCPFNovo.isBlank()) {
                JOptionPane.showMessageDialog(this, "CNPJ ou CPF, inválido");
                return;
            }

            if (dataProducaoNovo.isBlank()) {
                JOptionPane.showMessageDialog(this, "Data de produção inválida");
                return;
            }

            if (valorTotalVendaNovoCorrigido < 0) {
                JOptionPane.showMessageDialog(this, "Valor da venda inválido");
                return;
            }

            if (quantidadeDeSacasProducaoNovo < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade de sacas inválida");
                return;
            }

            if (quantidadeDeParcelasNovo < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade de parcelas inválida, mínimo 1");
                return;
            }

            Date dataProducao = dateFormat.parse(dataProducaoNovo);
            Date dataVenda = dateFormat.parse(dataVendaNovo);

            controleVendaProducao.vendaProducao.setCNPJOuCPF(CNPJOuCPFNovo);
            controleVendaProducao.vendaProducao.setDataProducao(dataProducao);
            controleVendaProducao.vendaProducao.setDataVenda(dataVenda);
            controleVendaProducao.vendaProducao.setFormaDePagamento(formaDePagamentoNovo);
            controleVendaProducao.vendaProducao.setMetodoDePagamento(metodoDePagamentoNovo);
            controleVendaProducao.vendaProducao.setNomeCliente(nomeClienteNovo);
            controleVendaProducao.vendaProducao.setNomeProducao(nomeProducaoNovo);
            controleVendaProducao.vendaProducao.setQuantidadeDeParcelas(quantidadeDeParcelasNovo);
            controleVendaProducao.vendaProducao.setQuantidadeDeSacasProducao(quantidadeDeSacasProducaoNovo);
            controleVendaProducao.vendaProducao.setValorTotalVenda(valorTotalVendaNovoCorrigido);

            atualizarStatusDeVendaProducao();

            msg = controleVendaProducao.adicionarVenda(ControleVendaProducao.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            new TelaDeVendaProducao().setVisible(true);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Os valores devem ser númericos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Falha tipo: " + ex.getMessage());
        }
    }

    public void atualizarStatusDeVendaProducao() {
        Producao producaoAtualizada = new Producao();

        statusDeVendaProducao = "sim";

        producaoAtualizada.setIdProducao(idProducao);
        producaoAtualizada.setStatusDeVenda(statusDeVendaProducao);

        controleProducao = new ControleProducao();
        String msgAtualizacao = controleProducao.atualizacaoDeStatusDeVenda(producaoAtualizada);
    }

    private void readClientes() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedor.getModel();
        ControleCliente controleCliente = new ControleCliente();

        for (Cliente t : controleCliente.readCliente()) {
            modelo.addRow(new Object[]{t.getNomeCliente()});
        }

    }

    private void readProducao() {
        DefaultTableModel modelo1 = (DefaultTableModel) jTableProducao.getModel();
        ControleProducao controleProducao = new ControleProducao();

        for (Producao p : controleProducao.buscarTodasAsProducoes()) {
            modelo1.addRow(new Object[]{p.getNomeProducao(), p.getStatusDeVenda()});
        }

    }

    private void limparCampos() {
        jTextFieldCPFOuCNPJCliente.setText("");
        jTextFieldDataDaVenda.setText("");
        jTextFieldDataProducao.setText("");
        jTextFieldNomeCliente.setText("");
        jTextFieldNomeClienteBuscado.setText("");
        jTextFieldNomeProducao.setText("");
        jTextFieldNomeProducaoBuscada.setText("");
        jTextFieldNumeroDeParcelas.setText("");
        jTextFieldNumeroSacasProducao.setText("");
        jTextFieldValorTotal.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonBuscarProducao;
    private javax.swing.JButton jButtonCancelarAtualizacao;
    private javax.swing.JButton jButtonConfirmarVenda;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JComboBox<String> jComboBoxFormaDePagamento;
    private javax.swing.JComboBox<String> jComboBoxMetodoDePagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFornecedor;
    private javax.swing.JTable jTableProducao;
    private javax.swing.JTextField jTextFieldCPFOuCNPJCliente;
    private javax.swing.JTextField jTextFieldDataDaVenda;
    private javax.swing.JTextField jTextFieldDataProducao;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNomeClienteBuscado;
    private javax.swing.JTextField jTextFieldNomeProducao;
    private javax.swing.JTextField jTextFieldNomeProducaoBuscada;
    private javax.swing.JTextField jTextFieldNumeroDeParcelas;
    private javax.swing.JTextField jTextFieldNumeroSacasProducao;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
