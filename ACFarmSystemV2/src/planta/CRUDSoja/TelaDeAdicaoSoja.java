package planta.CRUDSoja;

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
import planta.TelaCRUDSoja;
import validacoes.ValidarData;

public class TelaDeAdicaoSoja extends javax.swing.JFrame {

    private String nomeFornecedorBuscado;
    private String nomePropriedadeBuscado;

    private String fornecedorPlanta;
    private int cicloEmDias;
    private String dataDePlantio;
    private String dataDeSurgimentoDeSementes;
    private Double alturaAtualDaPlanta;
    private int idPropriedade;
    private String nomePropriedade;
    private String tipoDePlanta = "Soja";

    private ControlePlanta controlePlanta = new ControlePlanta();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private ControleFornecedor controleFornecedor = new ControleFornecedor();

    private String msg;

    public TelaDeAdicaoSoja() {
        initComponents();
        readJtableFornecedor();
        readJtablePropriedade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldBuscarPropriedade = new javax.swing.JTextField();
        jTextFieldBuscarFornecedor = new javax.swing.JTextField();
        jTextFieldPropriedadeEncontrada = new javax.swing.JTextField();
        jTextFielFornecedorEncontrado = new javax.swing.JTextField();
        jTextFieldCicloAproximadoEmDias = new javax.swing.JTextField();
        jTextFieldDataDePlantio = new javax.swing.JTextField();
        jTextFieldAlturaPlanta = new javax.swing.JTextField();
        jTextFieldDataSurgimentoDeSementes = new javax.swing.JTextField();
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

        jTextFieldBuscarPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscarPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldBuscarPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldBuscarPropriedade.setBorder(null);
        jTextFieldBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 118, 304, 29));

        jTextFieldBuscarFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscarFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldBuscarFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldBuscarFornecedor.setBorder(null);
        jTextFieldBuscarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 351, 305, 29));

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
        getContentPane().add(jTextFieldPropriedadeEncontrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 586, 370, 29));

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
        getContentPane().add(jTextFielFornecedorEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 120, 332, 29));

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
        getContentPane().add(jTextFieldDataDePlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 298, 333, 29));

        jTextFieldAlturaPlanta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlanta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlanta.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlanta.setBorder(null);
        jTextFieldAlturaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 477, 333, 29));

        jTextFieldDataSurgimentoDeSementes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataSurgimentoDeSementes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataSurgimentoDeSementes.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataSurgimentoDeSementes.setBorder(null);
        jTextFieldDataSurgimentoDeSementes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataSurgimentoDeSementesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataSurgimentoDeSementes, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 388, 332, 29));

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
        getContentPane().add(jButtonBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 345, 58, 42));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setBorderPainted(false);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 109, 58, 44));

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
                "Propriedade(s)"
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
                "Fornecedor(s)"
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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 310, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_tela_de_adicao_soja.png"))); // NOI18N
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

    private void jTextFieldDataSurgimentoDeSementesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataSurgimentoDeSementesActionPerformed

    }//GEN-LAST:event_jTextFieldDataSurgimentoDeSementesActionPerformed

    private void jTextFieldBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldBuscarFornecedorActionPerformed

    private void jButtonBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFornecedorActionPerformed
        try {
            buscarFornecedor();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAdicaoSoja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFornecedorActionPerformed

    private void jButtonSairDaTelaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed
        this.dispose();
        new TelaCRUDSoja().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jTextFieldBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldBuscarPropriedadeActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAdicaoSoja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        adicionarPlanta();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    public void buscarPropriedade() throws SQLException {
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(jTextFieldBuscarPropriedade.getText());
        if (propriedadeEncontrada != null) {
            nomePropriedadeBuscado = propriedadeEncontrada.getNomePropriedade();
            JOptionPane.showMessageDialog(this, "Propriedade encontrada");
            jTextFieldPropriedadeEncontrada.setText(nomePropriedadeBuscado);
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada");
            jTextFieldPropriedadeEncontrada.setText("");
            jTextFieldBuscarPropriedade.setText("");
        }
    }

    public void buscarFornecedor() throws SQLException {
        Fornecedor fornecedorEncontrado = controleFornecedor.buscarFornecedor(jTextFieldBuscarFornecedor.getText());
        if (fornecedorEncontrado != null) {
            nomeFornecedorBuscado = fornecedorEncontrado.getNomeFantasia();
            JOptionPane.showMessageDialog(this, "Fornecedor encontrado");
            jTextFielFornecedorEncontrado.setText(nomeFornecedorBuscado);
        } else {
            JOptionPane.showMessageDialog(this, "Fornecedor não encontrado");
            jTextFielFornecedorEncontrado.setText("");
            jTextFieldBuscarFornecedor.setText("");
        }
    }

    public void adicionarPlanta() {
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            if (jTextFieldPropriedadeEncontrada.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Busque uma propriedade");
                return;
            }

            if (jTextFielFornecedorEncontrado.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Busque um fornecedor");
                return;
            }

            if (jTextFieldCicloAproximadoEmDias.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Adicione o ciclo aproximado em dias");
                return;
            }

            if (jTextFieldDataDePlantio.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Adicione a data de plantio");
                return;
            }

            if (jTextFieldDataSurgimentoDeSementes.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Adicione a data de surgimento de sementes");
                return;
            }

            if (jTextFieldAlturaPlanta.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Adicione o altura da planta");
                return;
            }

            tipoDePlanta = "Soja";
            dataDeSurgimentoDeSementes = jTextFieldDataSurgimentoDeSementes.getText();
            dataDePlantio = jTextFieldDataDePlantio.getText();
            nomePropriedade = jTextFieldPropriedadeEncontrada.getText();
            cicloEmDias = Integer.parseInt(jTextFieldCicloAproximadoEmDias.getText());
            alturaAtualDaPlanta = Double.valueOf(jTextFieldAlturaPlanta.getText());
            fornecedorPlanta = jTextFielFornecedorEncontrado.getText();

            if (!ValidarData.validaData(dataDePlantio)) {
                JOptionPane.showMessageDialog(this, "Data de plantio inválida (dd/MM/aaaa)");
                return;
            }

            if (!ValidarData.validaData(dataDeSurgimentoDeSementes)) {
                JOptionPane.showMessageDialog(this, "Data de surgimento de sementes inválida (dd/MM/aaaa)");
                return;
            }

            if (cicloEmDias < 0) {
                JOptionPane.showMessageDialog(this, "Ciclo em dias inválido");
                return;
            }

            if (alturaAtualDaPlanta < 0) {
                JOptionPane.showMessageDialog(this, "Altura atual da planta inválido");
                return;
            }

            try {
                Date dataSurgimentoDeSementes = dateFormat.parse(dataDeSurgimentoDeSementes);
                Date dataPlantio = dateFormat.parse(dataDePlantio);

                if (dataSurgimentoDeSementes == dataPlantio) {
                    JOptionPane.showMessageDialog(null, "Datas de Plantio e surgimento de sementes não devem ser iguais");
                    return;
                }

                controlePlanta.soja.setNomeFornecedor(fornecedorPlanta);
                controlePlanta.soja.setNomePropriedade(nomePropriedade);
                controlePlanta.soja.setTipoDePlanta(tipoDePlanta);
                controlePlanta.soja.setCicloEmDias(cicloEmDias);
                controlePlanta.soja.setAlturaAtualDaPlanta(alturaAtualDaPlanta);
                controlePlanta.soja.setDataDePlantio(dataPlantio);
                controlePlanta.soja.setDataDeSurgimentoDeSementes(dataSurgimentoDeSementes);

                msg = controlePlanta.cadastrarSoja(ControlePlanta.INCLUSAO);
                JOptionPane.showMessageDialog(this, msg);
                limparCampos();

            } catch (ParseException ex) {
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
        jTextFieldBuscarFornecedor.setText("");
        jTextFieldBuscarPropriedade.setText("");
        jTextFieldCicloAproximadoEmDias.setText("");
        jTextFieldDataDePlantio.setText("");
        jTextFieldDataSurgimentoDeSementes.setText("");
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
    private javax.swing.JTextField jTextFieldBuscarFornecedor;
    private javax.swing.JTextField jTextFieldBuscarPropriedade;
    private javax.swing.JTextField jTextFieldCicloAproximadoEmDias;
    private javax.swing.JTextField jTextFieldDataDePlantio;
    private javax.swing.JTextField jTextFieldDataSurgimentoDeSementes;
    private javax.swing.JTextField jTextFieldPropriedadeEncontrada;
    // End of variables declaration//GEN-END:variables
}
