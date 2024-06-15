package planta.CRUDMilho;

import Propriedade.ControlePropriedade;
import Propriedade.Propriedade;
import fornecedor.ControleFornecedor;
import fornecedor.Fornecedor;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import planta.ControlePlanta;
import planta.TelaCRUDMilho;
import validacoes.ValidarData;

public class TelaDeAdicaoMilho extends javax.swing.JFrame {

    private String nomeFornecedorBuscado;
    private String nomePropriedadeBuscado;

    private String fornecedorPlanta;
    private int cicloEmDias;
    private String dataDePlantio;
    private String dataDeSurgimentoDeEspigas;
    private Double alturaAtualDaPlanta;
    private String nomePropriedade;
    private String tipoDePlanta = "Milho";

    private ControlePlanta controlePlanta = new ControlePlanta();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private ControleFornecedor controleFornecedor = new ControleFornecedor();

    private String msg;

    public TelaDeAdicaoMilho() {
        initComponents();
        readJtableFornecedor();
        readJtablePropriedade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPropriedadeEncontrada = new javax.swing.JTextField();
        jTextFielFornecedorEncontrado = new javax.swing.JTextField();
        jTextFieldCicloAproximadoEmDias = new javax.swing.JTextField();
        jTextFieldDataDePlantio = new javax.swing.JTextField();
        jTextFieldDataSurgimentoDeEspigas = new javax.swing.JTextField();
        jTextFieldAlturaPlanta = new javax.swing.JTextField();
        jTextFieldFornecedorBuscado = new javax.swing.JTextField();
        jTextFieldPropriedadeBuscada = new javax.swing.JTextField();
        jButtonSairDaTelaAdicionarMilho = new javax.swing.JButton();
        jButtonBuscarFornecedor = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePropriedade = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldPropriedadeEncontrada.setEditable(false);
        jTextFieldPropriedadeEncontrada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPropriedadeEncontrada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPropriedadeEncontrada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPropriedadeEncontrada.setBorder(null);
        jTextFieldPropriedadeEncontrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPropriedadeEncontradaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPropriedadeEncontrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 587, 372, 29));

        jTextFielFornecedorEncontrado.setEditable(false);
        jTextFielFornecedorEncontrado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFielFornecedorEncontrado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFielFornecedorEncontrado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFielFornecedorEncontrado.setBorder(null);
        jTextFielFornecedorEncontrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielFornecedorEncontradoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFielFornecedorEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 121, 333, 29));

        jTextFieldCicloAproximadoEmDias.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCicloAproximadoEmDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCicloAproximadoEmDias.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCicloAproximadoEmDias.setBorder(null);
        jTextFieldCicloAproximadoEmDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCicloAproximadoEmDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCicloAproximadoEmDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 210, 333, 29));

        jTextFieldDataDePlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDePlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDePlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDePlantio.setBorder(null);
        jTextFieldDataDePlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDePlantioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDePlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 299, 333, 29));

        jTextFieldDataSurgimentoDeEspigas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataSurgimentoDeEspigas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataSurgimentoDeEspigas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataSurgimentoDeEspigas.setBorder(null);
        jTextFieldDataSurgimentoDeEspigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataSurgimentoDeEspigasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataSurgimentoDeEspigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 389, 333, 29));

        jTextFieldAlturaPlanta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlanta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlanta.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlanta.setBorder(null);
        jTextFieldAlturaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 478, 333, 29));

        jTextFieldFornecedorBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFornecedorBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldFornecedorBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldFornecedorBuscado.setBorder(null);
        jTextFieldFornecedorBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFornecedorBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFornecedorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 352, 306, 29));

        jTextFieldPropriedadeBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPropriedadeBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPropriedadeBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPropriedadeBuscada.setBorder(null);
        jTextFieldPropriedadeBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPropriedadeBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPropriedadeBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 118, 306, 29));

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

        jButtonBuscarFornecedor.setBorder(null);
        jButtonBuscarFornecedor.setBorderPainted(false);
        jButtonBuscarFornecedor.setContentAreaFilled(false);
        jButtonBuscarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 345, 58, 44));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setBorderPainted(false);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 110, 58, 45));

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setBorderPainted(false);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 599, 280, 35));

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setBorderPainted(false);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 550, 280, 35));

        jTablePropriedade.setBackground(new java.awt.Color(15, 42, 61));
        jTablePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTablePropriedade.setForeground(new java.awt.Color(255, 255, 255));
        jTablePropriedade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Propriedade"
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
        jTablePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablePropriedade.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePropriedade.setRowHeight(30);
        jTablePropriedade.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTablePropriedade.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablePropriedade);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 310, 130));

        jTableFornecedor.setBackground(new java.awt.Color(15, 42, 61));
        jTableFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fornecedor"
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
        jTableFornecedor.setGridColor(new java.awt.Color(255, 255, 255));
        jTableFornecedor.setRowHeight(30);
        jTableFornecedor.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTableFornecedor.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableFornecedor);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 320, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_tela_de_adicao_milho.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFielFornecedorEncontradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielFornecedorEncontradoActionPerformed

    }//GEN-LAST:event_jTextFielFornecedorEncontradoActionPerformed

    private void jTextFieldCicloAproximadoEmDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCicloAproximadoEmDiasActionPerformed

    }//GEN-LAST:event_jTextFieldCicloAproximadoEmDiasActionPerformed

    private void jTextFieldPropriedadeEncontradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPropriedadeEncontradaActionPerformed

    }//GEN-LAST:event_jTextFieldPropriedadeEncontradaActionPerformed

    private void jTextFieldDataDePlantioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDePlantioActionPerformed

    }//GEN-LAST:event_jTextFieldDataDePlantioActionPerformed

    private void jTextFieldAlturaPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaPlantaActionPerformed

    }//GEN-LAST:event_jTextFieldAlturaPlantaActionPerformed

    private void jTextFieldDataSurgimentoDeEspigasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataSurgimentoDeEspigasActionPerformed

    }//GEN-LAST:event_jTextFieldDataSurgimentoDeEspigasActionPerformed

    private void jTextFieldFornecedorBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFornecedorBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldFornecedorBuscadoActionPerformed

    private void jButtonBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFornecedorActionPerformed
        try {
            buscarFornecedor();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAdicaoMilho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFornecedorActionPerformed

    private void jButtonSairDaTelaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed
        this.dispose();
        new TelaCRUDMilho().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jTextFieldPropriedadeBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPropriedadeBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldPropriedadeBuscadaActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAdicaoMilho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        adicionarPlanta();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    public void buscarPropriedade() throws SQLException {
        nomePropriedadeBuscado = jTextFieldPropriedadeBuscada.getText();
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(nomePropriedadeBuscado);

        if (propriedadeEncontrada != null) {
            nomePropriedade = propriedadeEncontrada.getNomePropriedade();
            JOptionPane.showMessageDialog(this, "Propriedade encontrada.");
            jTextFieldPropriedadeEncontrada.setText(nomePropriedade);
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
            jTextFieldPropriedadeBuscada.setText("");
            jTextFieldPropriedadeEncontrada.setText("");
            return;
        }
    }

    public void buscarFornecedor() throws SQLException {
        nomeFornecedorBuscado = jTextFieldFornecedorBuscado.getText();
        Fornecedor fornecedorEncontrado = controleFornecedor.buscarFornecedor(nomeFornecedorBuscado);

        if (fornecedorEncontrado != null) {
            fornecedorPlanta = fornecedorEncontrado.getNomeFantasia();
            JOptionPane.showMessageDialog(this, "Fornecedor encontrado");
            jTextFielFornecedorEncontrado.setText(fornecedorPlanta);
        } else {
            JOptionPane.showMessageDialog(this, "Fornecedor não encontrado");
            jTextFielFornecedorEncontrado.setText("");
            jTextFieldFornecedorBuscado.setText("");
            return;
        }

    }

    public void adicionarPlanta() {

        try {
            tipoDePlanta = "Milho";
            fornecedorPlanta = jTextFielFornecedorEncontrado.getText();
            dataDeSurgimentoDeEspigas = jTextFieldDataSurgimentoDeEspigas.getText();
            dataDePlantio = jTextFieldDataDePlantio.getText();
            nomePropriedade = jTextFieldPropriedadeEncontrada.getText();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            if (nomePropriedade.isBlank()) {
                JOptionPane.showMessageDialog(this, "Propriedade inválida");
                return;
            }

            if (fornecedorPlanta.isBlank()) {
                JOptionPane.showMessageDialog(this, "Fornecedor inválido");
                return;
            }

            if (nomeFornecedorBuscado.isBlank()) {
                JOptionPane.showMessageDialog(this, "Fornecedor inválido");
                return;
            }

            if (jTextFieldCicloAproximadoEmDias.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Ciclo em dias inválido");
                return;
            }

            if (!ValidarData.validaData(dataDePlantio)) {
                JOptionPane.showMessageDialog(this, "Data de plantio inválida (dd/MM/aaaa)");
                return;
            }

            if (!ValidarData.validaData(dataDeSurgimentoDeEspigas)) {
                JOptionPane.showMessageDialog(this, "Data de surgimento de espigas inválida (dd/MM/aaaa)");
                return;
            }

            if (jTextFieldAlturaPlanta.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Altura atual da planta inválida");
                return;
            }

            cicloEmDias = Integer.parseInt(jTextFieldCicloAproximadoEmDias.getText());
            alturaAtualDaPlanta = Double.valueOf(jTextFieldAlturaPlanta.getText());

            if (cicloEmDias < 0) {
                JOptionPane.showMessageDialog(this, "Ciclo em dias inválido");
                return;
            }

            if (alturaAtualDaPlanta < 0) {
                JOptionPane.showMessageDialog(this, "Altura atual da planta inválido");
                return;
            }

            try {
                Date dataSurgimentoDeEspigas = dateFormat.parse(dataDeSurgimentoDeEspigas);
                Date dataPlantio = dateFormat.parse(dataDePlantio);

                if (dataSurgimentoDeEspigas == dataPlantio) {
                    JOptionPane.showMessageDialog(null, "Datas de Plantio e surgimento de sementes não devem ser iguais");
                    return;
                }

                controlePlanta.milho.setNomePropriedade(nomePropriedade);
                controlePlanta.milho.setNomeFornecedor(nomeFornecedorBuscado);
                controlePlanta.milho.setTipoDePlanta(tipoDePlanta);
                controlePlanta.milho.setCicloEmDias(cicloEmDias);
                controlePlanta.milho.setAlturaAtualDaPlanta(alturaAtualDaPlanta);
                controlePlanta.milho.setDataDePlantio(dataPlantio);
                controlePlanta.milho.setDataDeSurgimentoDeEspigas(dataSurgimentoDeEspigas);

                msg = controlePlanta.cadastrarMilho(ControlePlanta.INCLUSAO);
                JOptionPane.showMessageDialog(this, msg);
                limparCampos();
            } catch (ParseException px) {
                JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Digite apenas numero para:\nCiclo aproximado em dias(ex:10);\nAltura planta(ex:1.20)");
            return;
        }
    }

    private void limparCampos() {
        jTextFielFornecedorEncontrado.setText("");
        jTextFieldAlturaPlanta.setText("");
        jTextFieldPropriedadeBuscada.setText("");
        jTextFieldCicloAproximadoEmDias.setText("");
        jTextFieldDataDePlantio.setText("");
        jTextFieldDataSurgimentoDeEspigas.setText("");
        jTextFieldFornecedorBuscado.setText("");
        jTextFieldPropriedadeEncontrada.setText("");
    }

    private void readJtableFornecedor() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedor.getModel();

        for (Fornecedor s : controleFornecedor.readFornecedor()) {
            modelo.addRow(new Object[]{s.getNomeFantasia()});
        }
    }

    private void readJtablePropriedade() {
        DefaultTableModel modelo = (DefaultTableModel) jTablePropriedade.getModel();

        for (Propriedade s : controlePropriedade.readPropriedade()) {
            modelo.addRow(new Object[]{s.getNomePropriedade()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarFornecedor;
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonSairDaTelaAdicionarMilho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableFornecedor;
    private javax.swing.JTable jTablePropriedade;
    private javax.swing.JTextField jTextFielFornecedorEncontrado;
    private javax.swing.JTextField jTextFieldAlturaPlanta;
    private javax.swing.JTextField jTextFieldCicloAproximadoEmDias;
    private javax.swing.JTextField jTextFieldDataDePlantio;
    private javax.swing.JTextField jTextFieldDataSurgimentoDeEspigas;
    private javax.swing.JTextField jTextFieldFornecedorBuscado;
    private javax.swing.JTextField jTextFieldPropriedadeBuscada;
    private javax.swing.JTextField jTextFieldPropriedadeEncontrada;
    // End of variables declaration//GEN-END:variables

}
