package praga;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class TelaDeRelatorioPraga extends javax.swing.JFrame {

    ControlePraga controlePraga = new ControlePraga();

    public TelaDeRelatorioPraga() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonGerarRelatorioDetalhadoDeFornecedor = new javax.swing.JButton();
        jButtonGerarRelatorioGeralDeFornecedor = new javax.swing.JButton();
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
        getContentPane().add(jButtonVoltarATelaDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 23, 40, 24));

        jButtonGerarRelatorioDetalhadoDeFornecedor.setBorder(null);
        jButtonGerarRelatorioDetalhadoDeFornecedor.setBorderPainted(false);
        jButtonGerarRelatorioDetalhadoDeFornecedor.setContentAreaFilled(false);
        jButtonGerarRelatorioDetalhadoDeFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioDetalhadoDeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioDetalhadoDeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 445, 248, 46));

        jButtonGerarRelatorioGeralDeFornecedor.setBorder(null);
        jButtonGerarRelatorioGeralDeFornecedor.setBorderPainted(false);
        jButtonGerarRelatorioGeralDeFornecedor.setContentAreaFilled(false);
        jButtonGerarRelatorioGeralDeFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioGeralDeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioGeralDeFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioGeralDeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 445, 247, 46));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPraga/img_tela_escolha_de_relatorio_de_praga.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed
        this.dispose();
        new TelaDePDFDetalhadoPraga().setVisible(true);
    }//GEN-LAST:event_jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        this.dispose();
        new TelaDeInicioPraga().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonGerarRelatorioGeralDeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioGeralDeFornecedorActionPerformed
        try {
            controlePraga.gerarRelatorioGeralDePragas();
            this.dispose();
            new TelaDeRelatorioPraga().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRelatorioPraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRelatorioPraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaDeRelatorioPraga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGerarRelatorioGeralDeFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarRelatorioDetalhadoDeFornecedor;
    private javax.swing.JButton jButtonGerarRelatorioGeralDeFornecedor;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JLabel jLabelTelaProducao;
    // End of variables declaration//GEN-END:variables
}
