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
import planta.ControlePlanta;
import planta.TelaCRUDMilho;
import planta.TelaVizualizacaoPropriedadeEFornecedorMilho;
import planta.TelaVizualizacaoPropriedadeEFornecedorSoja;

public class TelaDeAdicaoMilho extends javax.swing.JFrame {
    
    private String nomeFornecedorBuscado;
    private String nomePropriedadeBuscado;
    
    private String fornecedorPlanta;
    private int cicloEmDias;
    private String dataDePlantio;
    private String dataDeSurgimentoDeEspigas;
    private Double alturaAtualDaPlanta;
    private int idPropriedade;
    private String nomePropriedade;
    private String tipoDePlanta = "Milho";
    
    private ControlePlanta controlePlanta = new ControlePlanta();
    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private ControleFornecedor controleFornecedor = new ControleFornecedor();
    
    private String msg;
    
    public TelaDeAdicaoMilho() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFielFornecedorEncontrado = new javax.swing.JTextField();
        jTextFieldCicloAproximadoEmDias = new javax.swing.JTextField();
        jTextFieldPropriedadeEncontrada = new javax.swing.JTextField();
        jTextFieldDataDePlantio = new javax.swing.JTextField();
        jTextFieldAlturaPlanta = new javax.swing.JTextField();
        jTextFieldDataSurgimentoDeEspigas = new javax.swing.JTextField();
        jTextFieldNomeFornecedor = new javax.swing.JTextField();
        jTextFieldBuscarPropriedade = new javax.swing.JTextField();
        jButtonSairDaTelaAdicionarMilho = new javax.swing.JButton();
        jButtonBuscarFornecedor = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jTextFielFornecedorEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 251, 270, 30));

        jTextFieldCicloAproximadoEmDias.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCicloAproximadoEmDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCicloAproximadoEmDias.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCicloAproximadoEmDias.setBorder(null);
        jTextFieldCicloAproximadoEmDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCicloAproximadoEmDiasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCicloAproximadoEmDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 462, 270, 29));

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
        getContentPane().add(jTextFieldPropriedadeEncontrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 354, 270, 30));

        jTextFieldDataDePlantio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDePlantio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDePlantio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDePlantio.setBorder(null);
        jTextFieldDataDePlantio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDePlantioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDePlantio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 251, 270, 30));

        jTextFieldAlturaPlanta.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaPlanta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAlturaPlanta.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaPlanta.setBorder(null);
        jTextFieldAlturaPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAlturaPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 462, 330, 30));

        jTextFieldDataSurgimentoDeEspigas.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataSurgimentoDeEspigas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataSurgimentoDeEspigas.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataSurgimentoDeEspigas.setBorder(null);
        jTextFieldDataSurgimentoDeEspigas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataSurgimentoDeEspigasActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataSurgimentoDeEspigas, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 355, 330, 30));

        jTextFieldNomeFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFornecedor.setBorder(null);
        jTextFieldNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 118, 305, 29));

        jTextFieldBuscarPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscarPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldBuscarPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldBuscarPropriedade.setBorder(null);
        jTextFieldBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 118, 305, 29));

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
        getContentPane().add(jButtonBuscarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 112, 60, 37));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setBorderPainted(false);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 113, 60, 37));

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setBorderPainted(false);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 550, 280, 35));

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

    private void jTextFieldNomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFornecedorActionPerformed

    }//GEN-LAST:event_jTextFieldNomeFornecedorActionPerformed

    private void jButtonBuscarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFornecedorActionPerformed
        try {
            buscarFornecedor();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAdicaoMilho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFornecedorActionPerformed

    private void jButtonSairDaTelaAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed
        this.dispose();
        new TelaVizualizacaoPropriedadeEFornecedorMilho().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaAdicionarMilhoActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        adicionarPlanta();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jTextFieldBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldBuscarPropriedadeActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAdicaoMilho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed
    
    public void buscarPropriedade() throws SQLException {
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(jTextFieldBuscarPropriedade.getText());
        
        if (propriedadeEncontrada != null) {
            nomePropriedade = propriedadeEncontrada.getNomePropriedade();
            JOptionPane.showMessageDialog(this, "Propriedade encontrada.");
            jTextFielFornecedorEncontrado.setText(nomePropriedade);
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
            jTextFielFornecedorEncontrado.setText("");
        }
        
    }
    
    public void buscarFornecedor() throws SQLException {
        nomeFornecedorBuscado = jTextFieldNomeFornecedor.getText();
        Fornecedor fornecedorEncontrado = controleFornecedor.buscarFornecedor(nomeFornecedorBuscado);
        
        if (fornecedorEncontrado != null) {
            fornecedorPlanta = fornecedorEncontrado.getNomeFantasia();
            JOptionPane.showMessageDialog(this, "Fornecedor encontrado");
            jTextFieldPropriedadeEncontrada.setText(fornecedorPlanta);
        } else {
            JOptionPane.showMessageDialog(this, "Fornecedor não encontrado");
            jTextFieldPropriedadeEncontrada.setText("");
        }
        
    }
    
    public void adicionarPlanta() {
        tipoDePlanta = "Milho";
        fornecedorPlanta = jTextFielFornecedorEncontrado.getText();
        cicloEmDias = Integer.parseInt(jTextFieldCicloAproximadoEmDias.getText());
        alturaAtualDaPlanta = Double.valueOf(jTextFieldAlturaPlanta.getText());
        dataDeSurgimentoDeEspigas = jTextFieldDataSurgimentoDeEspigas.getText();
        dataDePlantio = jTextFieldDataDePlantio.getText();
        nomePropriedade = jTextFielFornecedorEncontrado.getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        if (fornecedorPlanta.equals("")) {
            JOptionPane.showMessageDialog(this, "Fornecedor inválido");
            return;
        }
        
        if (nomePropriedade.equals("")) {
            JOptionPane.showMessageDialog(this, "Propriedade inválida");
            return;
        }
        
        if (nomeFornecedorBuscado.equals("")) {
            JOptionPane.showMessageDialog(this, "Fornecedor inválido");
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
            
        } catch (ParseException px) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarFornecedor;
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonSairDaTelaAdicionarMilho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFielFornecedorEncontrado;
    private javax.swing.JTextField jTextFieldAlturaPlanta;
    private javax.swing.JTextField jTextFieldBuscarPropriedade;
    private javax.swing.JTextField jTextFieldCicloAproximadoEmDias;
    private javax.swing.JTextField jTextFieldDataDePlantio;
    private javax.swing.JTextField jTextFieldDataSurgimentoDeEspigas;
    private javax.swing.JTextField jTextFieldNomeFornecedor;
    private javax.swing.JTextField jTextFieldPropriedadeEncontrada;
    // End of variables declaration//GEN-END:variables

}
