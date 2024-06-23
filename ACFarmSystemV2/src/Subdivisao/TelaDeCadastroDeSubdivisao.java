package Subdivisao;

import Propriedade.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaDeCadastroDeSubdivisao extends javax.swing.JFrame {

    public TelaDeCadastroDeSubdivisao() {
        initComponents();
        readTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoTipoDeCultura = new javax.swing.ButtonGroup();
        jTextFieldNomeSubdivisao = new javax.swing.JTextField();
        jTextFieldAreaSubdivisao = new javax.swing.JTextField();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jButtonCancelarCadastroDePropriedade = new javax.swing.JButton();
        jButtonConfirmarCadastroDePropriedade = new javax.swing.JButton();
        jButtonVoltarAoTelaDeUsuario = new javax.swing.JButton();
        jButtonBuscarPropriedade = new javax.swing.JButton();
        jComboBoxCultura = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePropriedade = new javax.swing.JTable();
        jLabelCadatroPropriedade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeSubdivisao.setBorder(null);
        jTextFieldNomeSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 128, 278, 29));

        jTextFieldAreaSubdivisao.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAreaSubdivisao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAreaSubdivisao.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAreaSubdivisao.setBorder(null);
        jTextFieldAreaSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAreaSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAreaSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 233, 278, 29));

        jTextFieldNomePropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePropriedade.setBorder(null);
        jTextFieldNomePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 128, 305, 29));

        jButtonCancelarCadastroDePropriedade.setBorder(null);
        jButtonCancelarCadastroDePropriedade.setContentAreaFilled(false);
        jButtonCancelarCadastroDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastroDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastroDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 593, 280, 36));

        jButtonConfirmarCadastroDePropriedade.setBorder(null);
        jButtonConfirmarCadastroDePropriedade.setContentAreaFilled(false);
        jButtonConfirmarCadastroDePropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastroDePropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroDePropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastroDePropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 543, 280, 36));

        jButtonVoltarAoTelaDeUsuario.setBorder(null);
        jButtonVoltarAoTelaDeUsuario.setBorderPainted(false);
        jButtonVoltarAoTelaDeUsuario.setContentAreaFilled(false);
        jButtonVoltarAoTelaDeUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoTelaDeUsuario.setDefaultCapable(false);
        jButtonVoltarAoTelaDeUsuario.setFocusPainted(false);
        jButtonVoltarAoTelaDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoTelaDeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoTelaDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 35, 24));

        jButtonBuscarPropriedade.setBorder(null);
        jButtonBuscarPropriedade.setContentAreaFilled(false);
        jButtonBuscarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 120, 59, 45));

        jComboBoxCultura.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxCultura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Milho", "Soja" }));
        jComboBoxCultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCulturaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 340, 290, 30));

        jTablePropriedade.setBackground(new java.awt.Color(15, 42, 61));
        jTablePropriedade.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTablePropriedade.setForeground(new java.awt.Color(255, 255, 255));
        jTablePropriedade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Propriedade", "Area(Alqueire)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 400, 260));

        jLabelCadatroPropriedade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasSubdivisao/img_tela_de_cadastro_subdivisao.png"))); // NOI18N
        jLabelCadatroPropriedade.setText("jLabel1");
        getContentPane().add(jLabelCadatroPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ControlePropriedade controlePropriedade = new ControlePropriedade();
    private ControleSubdivisao controleSubdivisao = new ControleSubdivisao();
    private String limparCampo;
    private String cultura;
    private Double areaCovertida;
    private String nomeSubdivisao;
    private int idPropriedade;
    private String nomePropriedade;
    private DefaultTableModel modeloPropriedade;

    private void jButtonCancelarCadastroDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroDePropriedadeActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroDePropriedadeActionPerformed

    private void jTextFieldNomeSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeSubdivisaoActionPerformed

    private void jTextFieldAreaSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAreaSubdivisaoActionPerformed

    }//GEN-LAST:event_jTextFieldAreaSubdivisaoActionPerformed

    private void jTextFieldNomePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldNomePropriedadeActionPerformed

    private void jButtonConfirmarCadastroDePropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroDePropriedadeActionPerformed
        cadastrarSubdivisao();
    }//GEN-LAST:event_jButtonConfirmarCadastroDePropriedadeActionPerformed

    private void jButtonVoltarAoTelaDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed
        this.dispose();
        new TelaDeInicioSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoTelaDeUsuarioActionPerformed

    private void jButtonBuscarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPropriedadeActionPerformed
        try {
            buscarPropriedade();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroDeSubdivisao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarPropriedadeActionPerformed

    private void jComboBoxCulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCulturaActionPerformed

    }//GEN-LAST:event_jComboBoxCulturaActionPerformed

    public void buscarPropriedade() throws SQLException {
        String nomeBuscaPropriedade = jTextFieldNomePropriedade.getText();
        Propriedade propriedadeEncontrada = controlePropriedade.buscarPropriedadePorNome(nomeBuscaPropriedade);

        if (propriedadeEncontrada != null) {
            JOptionPane.showMessageDialog(this, "Propriedade encontrada.");
            idPropriedade = propriedadeEncontrada.getIdPropriedade();
            nomePropriedade = propriedadeEncontrada.getNomePropriedade();
        } else {
            JOptionPane.showMessageDialog(this, "Propriedade não encontrada.");
        }
    }

    public void cadastrarSubdivisao() {
        if (jTextFieldNomePropriedade.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da subdivisão");
            return;
        }

        if (jTextFieldNomeSubdivisao.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome da subdivisão");
            return;
        }

        if (jTextFieldAreaSubdivisao.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a area da subdivisão");
            return;
        }

        try {
            areaCovertida = Double.valueOf(jTextFieldAreaSubdivisao.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A area da subdivisão é um valor numérico");
            return;
        }

        cultura = jComboBoxCultura.getSelectedItem().toString();
        nomeSubdivisao = jTextFieldNomeSubdivisao.getText();

        if (cultura.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Adicione a cultura");
            return;
        }

        if (areaCovertida <= 0) {
            JOptionPane.showMessageDialog(null, "Area Inválida");
            return;
        }

        controleSubdivisao.subdivisao.setNomeSubdivisao(nomeSubdivisao);
        controleSubdivisao.subdivisao.setAreaSubdivisao(areaCovertida);
        controleSubdivisao.subdivisao.setCulturaSubdivisao(cultura);
        controleSubdivisao.subdivisao.setIdPropriedade(idPropriedade);
        controleSubdivisao.subdivisao.setNomePropriedade(nomePropriedade);
        String msg = controleSubdivisao.cadastrarSubdivisao(ControleSubdivisao.INCLUSAO);

        JOptionPane.showMessageDialog(this, msg);
        limparCampos();
    }

    private void limparCampos() {
        jTextFieldAreaSubdivisao.setText("");
        jTextFieldNomeSubdivisao.setText("");
        jTextFieldNomePropriedade.setText("");
    }

    public void readTable() {
        modeloPropriedade = (DefaultTableModel) jTablePropriedade.getModel();
        ControlePropriedade controlePropriedade1 = new ControlePropriedade();

        for (Propriedade u : controlePropriedade1.readPropriedade()) {
            modeloPropriedade.addRow(new Object[]{u.getNomePropriedade(), u.getAreaPropriedade()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botaoTipoDeCultura;
    private javax.swing.JButton jButtonBuscarPropriedade;
    private javax.swing.JButton jButtonCancelarCadastroDePropriedade;
    private javax.swing.JButton jButtonConfirmarCadastroDePropriedade;
    private javax.swing.JButton jButtonVoltarAoTelaDeUsuario;
    private javax.swing.JComboBox<String> jComboBoxCultura;
    private javax.swing.JLabel jLabelCadatroPropriedade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePropriedade;
    private javax.swing.JTextField jTextFieldAreaSubdivisao;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldNomeSubdivisao;
    // End of variables declaration//GEN-END:variables
}
