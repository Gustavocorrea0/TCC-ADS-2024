package Estoque.CRUDAgrotoxico;

import Estoque.Agrotoxico;
import Estoque.ControleEstoque;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeVerificacaoAgrotoxico extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeAgrotoxicoEncontrado;
    private String marcaAgrotoxicoEncontrado;
    private String quantidadeEmLitrosEncontrado;
    private String quantidadeMinimaEmLitrosEncontrado;
    private String dataDeValidadeEncontrado;
    private String msg;
    private String nomeInsumo;

    public TelaDeVerificacaoAgrotoxico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldIdAgrotoxico = new javax.swing.JTextField();
        jTextFieldDataDeValidade = new javax.swing.JTextField();
        jTextFieldQuantidadeAgrotoxico = new javax.swing.JTextField();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jTextFieldMarcaAgrotoxico = new javax.swing.JTextField();
        jTextFieldNomeAgrotoxico = new javax.swing.JTextField();
        jButtonBuscarAgrotoxico = new javax.swing.JButton();
        jButtonVoltarAoInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldIdAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldIdAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldIdAgrotoxico.setBorder(null);
        jTextFieldIdAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 117, 271, 29));

        jTextFieldDataDeValidade.setEditable(false);
        jTextFieldDataDeValidade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDeValidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDeValidade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeValidade.setBorder(null);
        jTextFieldDataDeValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDeValidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDeValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 236, 272, 29));

        jTextFieldQuantidadeAgrotoxico.setEditable(false);
        jTextFieldQuantidadeAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeAgrotoxico.setBorder(null);
        jTextFieldQuantidadeAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 571, 271, 30));

        jTextFieldQuantidadeMinima.setEditable(false);
        jTextFieldQuantidadeMinima.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeMinima.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeMinima.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeMinima.setBorder(null);
        jTextFieldQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeMinimaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 397, 272, 29));

        jTextFieldMarcaAgrotoxico.setEditable(false);
        jTextFieldMarcaAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaAgrotoxico.setBorder(null);
        jTextFieldMarcaAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 397, 272, 30));

        jTextFieldNomeAgrotoxico.setEditable(false);
        jTextFieldNomeAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeAgrotoxico.setBorder(null);
        jTextFieldNomeAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 236, 272, 29));

        jButtonBuscarAgrotoxico.setBorder(null);
        jButtonBuscarAgrotoxico.setBorderPainted(false);
        jButtonBuscarAgrotoxico.setContentAreaFilled(false);
        jButtonBuscarAgrotoxico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 110, 280, 43));

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setBorderPainted(false);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 40, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasAgrotoxico/img_tela_verificacao_agrotoxico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldIdAgrotoxicoActionPerformed

    private void jTextFieldDataDeValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeValidadeActionPerformed

    }//GEN-LAST:event_jTextFieldDataDeValidadeActionPerformed

    private void jTextFieldMarcaAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaAgrotoxicoActionPerformed

    private void jTextFieldQuantidadeAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeAgrotoxicoActionPerformed

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jButtonBuscarAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAgrotoxicoActionPerformed
        try {
            consultarAgrotoxico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeVerificacaoAgrotoxico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeVerificacaoAgrotoxico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarAgrotoxicoActionPerformed

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldNomeAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeAgrotoxicoActionPerformed

    public void consultarAgrotoxico() throws SQLException, ParseException {
        if (jTextFieldIdAgrotoxico.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do Agrotóxico");
            return;
        }

        nomeInsumo = jTextFieldIdAgrotoxico.getText();
        Agrotoxico agrotoxicoEncontrado = controleEstoque.buscarAgrotoxico(nomeInsumo);

        if (agrotoxicoEncontrado != null) {

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            Date data1 = formatoSQL.parse(agrotoxicoEncontrado.getDataDeValidade().toString());

            nomeAgrotoxicoEncontrado = agrotoxicoEncontrado.getNomeAgrotoxico();
            marcaAgrotoxicoEncontrado = agrotoxicoEncontrado.getMarcaAgrotoxico();
            quantidadeEmLitrosEncontrado = Double.toString(agrotoxicoEncontrado.getQuantidadeEmLitros());
            quantidadeMinimaEmLitrosEncontrado = Double.toString(agrotoxicoEncontrado.getQuantidadeMinimaEmLitros());
            dataDeValidadeEncontrado = formatoBrasileiro.format(data1);

            jTextFieldDataDeValidade.setText(dataDeValidadeEncontrado);
            jTextFieldMarcaAgrotoxico.setText(marcaAgrotoxicoEncontrado);
            jTextFieldNomeAgrotoxico.setText(nomeAgrotoxicoEncontrado);
            jTextFieldQuantidadeAgrotoxico.setText(quantidadeEmLitrosEncontrado);
            jTextFieldQuantidadeMinima.setText(quantidadeMinimaEmLitrosEncontrado);

        } else {
            JOptionPane.showMessageDialog(this, "Agrotoxico não encontrado");
            jTextFieldDataDeValidade.setText("");
            jTextFieldIdAgrotoxico.setText("");
            jTextFieldMarcaAgrotoxico.setText("");
            jTextFieldNomeAgrotoxico.setText("");
            jTextFieldQuantidadeAgrotoxico.setText("");
            jTextFieldQuantidadeMinima.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarAgrotoxico;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDataDeValidade;
    private javax.swing.JTextField jTextFieldIdAgrotoxico;
    private javax.swing.JTextField jTextFieldMarcaAgrotoxico;
    private javax.swing.JTextField jTextFieldNomeAgrotoxico;
    private javax.swing.JTextField jTextFieldQuantidadeAgrotoxico;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
