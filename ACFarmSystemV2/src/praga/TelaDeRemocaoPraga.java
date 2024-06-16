package praga;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeRemocaoPraga extends javax.swing.JFrame {

    public TelaDeRemocaoPraga() {
        initComponents();
    }

    private String nomeBuscado;
    private ControlePraga controlePraga = new ControlePraga();
    Date dataSQL;
    String dataBR;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoInicio = new javax.swing.JButton();
        jButtonBuscarPraga = new javax.swing.JButton();
        jTextFieldDataDeSurgimento = new javax.swing.JTextField();
        jTextFieldPropriedade = new javax.swing.JTextField();
        jTextFieldPragaBuscada = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldNomePraga = new javax.swing.JTextField();
        jTextFieldNivelDeAtaque = new javax.swing.JTextField();
        jButtonCancelarRemocao = new javax.swing.JButton();
        jButtonConfirmarRemocao = new javax.swing.JButton();
        jLabelIMGTelaInicialFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVoltarAoInicio.setBorder(null);
        jButtonVoltarAoInicio.setContentAreaFilled(false);
        jButtonVoltarAoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 25));

        jButtonBuscarPraga.setBorder(null);
        jButtonBuscarPraga.setContentAreaFilled(false);
        jButtonBuscarPraga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 107, 281, 44));

        jTextFieldDataDeSurgimento.setEditable(false);
        jTextFieldDataDeSurgimento.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDeSurgimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDeSurgimento.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeSurgimento.setBorder(null);
        jTextFieldDataDeSurgimento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeSurgimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDeSurgimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDeSurgimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 396, 322, 29));

        jTextFieldPropriedade.setEditable(false);
        jTextFieldPropriedade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPropriedade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPropriedade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPropriedade.setBorder(null);
        jTextFieldPropriedade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 568, 321, 29));

        jTextFieldPragaBuscada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPragaBuscada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPragaBuscada.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPragaBuscada.setBorder(null);
        jTextFieldPragaBuscada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPragaBuscada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPragaBuscadaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPragaBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 114, 270, 30));

        jTextFieldEstado.setEditable(false);
        jTextFieldEstado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldEstado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstado.setBorder(null);
        jTextFieldEstado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 396, 322, 29));

        jTextFieldNomePraga.setEditable(false);
        jTextFieldNomePraga.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomePraga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomePraga.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomePraga.setBorder(null);
        jTextFieldNomePraga.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomePraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePragaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomePraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 225, 322, 29));

        jTextFieldNivelDeAtaque.setEditable(false);
        jTextFieldNivelDeAtaque.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNivelDeAtaque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNivelDeAtaque.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNivelDeAtaque.setBorder(null);
        jTextFieldNivelDeAtaque.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNivelDeAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNivelDeAtaqueActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNivelDeAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 224, 323, 29));

        jButtonCancelarRemocao.setBorder(null);
        jButtonCancelarRemocao.setBorderPainted(false);
        jButtonCancelarRemocao.setContentAreaFilled(false);
        jButtonCancelarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 594, 280, 36));

        jButtonConfirmarRemocao.setBorder(null);
        jButtonConfirmarRemocao.setBorderPainted(false);
        jButtonConfirmarRemocao.setContentAreaFilled(false);
        jButtonConfirmarRemocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarRemocaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarRemocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 544, 280, 36));

        jLabelIMGTelaInicialFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPraga/img_tela_remocao_praga.png"))); // NOI18N
        getContentPane().add(jLabelIMGTelaInicialFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 643));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoInicioActionPerformed
        this.dispose();
        new TelaDeInicioPraga().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoInicioActionPerformed

    private void jTextFieldDataDeSurgimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeSurgimentoActionPerformed

    }//GEN-LAST:event_jTextFieldDataDeSurgimentoActionPerformed

    private void jTextFieldPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPropriedadeActionPerformed

    }//GEN-LAST:event_jTextFieldPropriedadeActionPerformed

    private void jTextFieldPragaBuscadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPragaBuscadaActionPerformed

    }//GEN-LAST:event_jTextFieldPragaBuscadaActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed

    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldNomePragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePragaActionPerformed

    }//GEN-LAST:event_jTextFieldNomePragaActionPerformed

    private void jTextFieldNivelDeAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNivelDeAtaqueActionPerformed

    }//GEN-LAST:event_jTextFieldNivelDeAtaqueActionPerformed

    private void jButtonBuscarPragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPragaActionPerformed
        try {
            buscarPraga();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRemocaoPraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRemocaoPraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Busque uma praga");
        }
    }//GEN-LAST:event_jButtonBuscarPragaActionPerformed

    private void jButtonCancelarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarRemocaoActionPerformed
        JOptionPane.showMessageDialog(this, "Remoção Cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarRemocaoActionPerformed

    private void jButtonConfirmarRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarRemocaoActionPerformed
        if (jTextFieldPragaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma praga");
            return;
        }
        removerPraga();
    }//GEN-LAST:event_jButtonConfirmarRemocaoActionPerformed

    public void buscarPraga() throws SQLException, ParseException {
        if (jTextFieldPragaBuscada.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque uma praga");
            return;
        }

        nomeBuscado = jTextFieldPragaBuscada.getText();
        Praga pragaEncontrada = controlePraga.buscarPraga(nomeBuscado);

        if (pragaEncontrada != null) {

            SimpleDateFormat formatoSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

            dataSQL = formatoSQL.parse(pragaEncontrada.getDataSurgimentoPraga().toString());
            dataBR = formatoBrasileiro.format(dataSQL);

            jTextFieldNivelDeAtaque.setText(pragaEncontrada.getNivelDeAtaquePraga());
            jTextFieldDataDeSurgimento.setText(dataBR);
            jTextFieldEstado.setText(pragaEncontrada.getEstadoDeControlePraga());
            jTextFieldPropriedade.setText(pragaEncontrada.getPropriedadePraga());
            jTextFieldNomePraga.setText(pragaEncontrada.getNomePraga());

        } else {
            JOptionPane.showMessageDialog(this, "Praga não encontrada");
            limparCampos();
        }
    }

    public void removerPraga() {
        String msg = controlePraga.removerPraga(nomeBuscado);
        JOptionPane.showMessageDialog(this, msg);
        limparCampos();
    }

    public void limparCampos() {
        jTextFieldDataDeSurgimento.setText("");
        jTextFieldEstado.setText("");
        jTextFieldPragaBuscada.setText("");
        jTextFieldNivelDeAtaque.setText("");
        jTextFieldNomePraga.setText("");
        jTextFieldPropriedade.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPraga;
    private javax.swing.JButton jButtonCancelarRemocao;
    private javax.swing.JButton jButtonConfirmarRemocao;
    private javax.swing.JButton jButtonVoltarAoInicio;
    private javax.swing.JLabel jLabelIMGTelaInicialFornecedor;
    private javax.swing.JTextField jTextFieldDataDeSurgimento;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNivelDeAtaque;
    private javax.swing.JTextField jTextFieldNomePraga;
    private javax.swing.JTextField jTextFieldPragaBuscada;
    private javax.swing.JTextField jTextFieldPropriedade;
    // End of variables declaration//GEN-END:variables
}
