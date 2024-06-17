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

public class TelaDeRemocaoAgrotoxico extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeAgrotoxicoEncontrado;
    private String marcaAgrotoxicoEncontrado;
    private String quantidadeEmLitrosEncontrado;
    private String quantidadeMinimaEmLitrosEncontrado;
    private String dataDeValidadeEncontrado;
    private String msg;
    private String nomeInsumo;

    public TelaDeRemocaoAgrotoxico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNomeAgrotoxicoBuscado = new javax.swing.JTextField();
        jTextFieldDataDeValidade = new javax.swing.JTextField();
        jTextFieldMarcaAgrotoxico = new javax.swing.JTextField();
        jTextFieldQuantidadeAgrotoxico = new javax.swing.JTextField();
        jButtonBuscarAgrotoxico = new javax.swing.JButton();
        jButtonVoltarATelaAnterior = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jTextFieldNomeAgrotoxico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNomeAgrotoxicoBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeAgrotoxicoBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeAgrotoxicoBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeAgrotoxicoBuscado.setBorder(null);
        jTextFieldNomeAgrotoxicoBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAgrotoxicoBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeAgrotoxicoBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 116, 271, 29));

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
        getContentPane().add(jTextFieldMarcaAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 397, 272, 29));

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
        getContentPane().add(jTextFieldQuantidadeAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 571, 272, 29));

        jButtonBuscarAgrotoxico.setBorder(null);
        jButtonBuscarAgrotoxico.setBorderPainted(false);
        jButtonBuscarAgrotoxico.setContentAreaFilled(false);
        jButtonBuscarAgrotoxico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 108, 282, 44));

        jButtonVoltarATelaAnterior.setBorder(null);
        jButtonVoltarATelaAnterior.setBorderPainted(false);
        jButtonVoltarATelaAnterior.setContentAreaFilled(false);
        jButtonVoltarATelaAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 33));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 597, 280, 36));

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
        getContentPane().add(jTextFieldNomeAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 236, 270, 29));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasAgrotoxico/img_tela_remocao_agrotoxico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeAgrotoxicoBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAgrotoxicoBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeAgrotoxicoBuscadoActionPerformed

    private void jTextFieldDataDeValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeValidadeActionPerformed

    }//GEN-LAST:event_jTextFieldDataDeValidadeActionPerformed

    private void jTextFieldMarcaAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaAgrotoxicoActionPerformed

    private void jTextFieldQuantidadeAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeAgrotoxicoActionPerformed

    private void jButtonVoltarATelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaAnteriorActionPerformed
        this.dispose();
        new TelaDeInicioAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaAnteriorActionPerformed

    private void jButtonBuscarAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAgrotoxicoActionPerformed
        try {
            consultarAgrotoxico();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoAgrotoxico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRemocaoAgrotoxico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarAgrotoxicoActionPerformed

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldNomeAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeAgrotoxicoActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        removerAgrotoxico();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoçao Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    public void removerAgrotoxico() {
        if (jTextFieldNomeAgrotoxicoBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um agrotóxico");
            return;
        }
        nomeInsumo = jTextFieldNomeAgrotoxicoBuscado.getText();
        msg = controleEstoque.removerAgrotoxico(nomeInsumo);
        JOptionPane.showMessageDialog(this, msg);
        limparCampos();
    }

    public void consultarAgrotoxico() throws SQLException, ParseException {
        if (jTextFieldNomeAgrotoxicoBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do agrotóxico");
            return;
        }
        
        nomeInsumo = jTextFieldNomeAgrotoxicoBuscado.getText();
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
            limparCampos();
        }
    }

    public void limparCampos() {
        jTextFieldDataDeValidade.setText("");
        jTextFieldNomeAgrotoxicoBuscado.setText("");
        jTextFieldMarcaAgrotoxico.setText("");
        jTextFieldNomeAgrotoxico.setText("");
        jTextFieldQuantidadeAgrotoxico.setText("");
        jTextFieldQuantidadeMinima.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarAgrotoxico;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonVoltarATelaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDataDeValidade;
    private javax.swing.JTextField jTextFieldMarcaAgrotoxico;
    private javax.swing.JTextField jTextFieldNomeAgrotoxico;
    private javax.swing.JTextField jTextFieldNomeAgrotoxicoBuscado;
    private javax.swing.JTextField jTextFieldQuantidadeAgrotoxico;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
