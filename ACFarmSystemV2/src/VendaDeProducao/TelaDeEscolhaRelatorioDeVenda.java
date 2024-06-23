package VendaDeProducao;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaDeEscolhaRelatorioDeVenda extends javax.swing.JFrame {

    ControleVendaProducao controleVendaProducao = new ControleVendaProducao();

    public TelaDeEscolhaRelatorioDeVenda() {
        initComponents();
        apresentarGraficoVendas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonGerarRelatorioDetalhadoDeFornecedor = new javax.swing.JButton();
        jButtonGerarRelatorioGeralDeFornecedor = new javax.swing.JButton();
        jDesktopPaneGraficoDeValores = new javax.swing.JDesktopPane();
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
        getContentPane().add(jButtonGerarRelatorioDetalhadoDeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 553, 153, 35));

        jButtonGerarRelatorioGeralDeFornecedor.setBorder(null);
        jButtonGerarRelatorioGeralDeFornecedor.setBorderPainted(false);
        jButtonGerarRelatorioGeralDeFornecedor.setContentAreaFilled(false);
        jButtonGerarRelatorioGeralDeFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioGeralDeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioGeralDeFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioGeralDeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 270, 153, 34));
        getContentPane().add(jDesktopPaneGraficoDeValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 630, 530));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVendaProducao/img_tela_de_escolha_de_relatorio.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed
        this.dispose();
        new TelaDePDFDetalhadoDeVendaProducao().setVisible(true);
    }//GEN-LAST:event_jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        this.dispose();
        try {
            new TelaDeInicioVendasProducao().setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeEscolhaRelatorioDeVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonGerarRelatorioGeralDeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioGeralDeFornecedorActionPerformed
        try {
            controleVendaProducao.gerarRelatorioGeralDeVendas();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeEscolhaRelatorioDeVenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeEscolhaRelatorioDeVenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaDeEscolhaRelatorioDeVenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(TelaDeEscolhaRelatorioDeVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGerarRelatorioGeralDeFornecedorActionPerformed

    public void apresentarGraficoVendas() {
        JInternalFrameGraficoFinaceiro graficoFinanceiro = new JInternalFrameGraficoFinaceiro();
        jDesktopPaneGraficoDeValores.add(graficoFinanceiro);
        graficoFinanceiro.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarRelatorioDetalhadoDeFornecedor;
    private javax.swing.JButton jButtonGerarRelatorioGeralDeFornecedor;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JDesktopPane jDesktopPaneGraficoDeValores;
    private javax.swing.JLabel jLabelTelaProducao;
    // End of variables declaration//GEN-END:variables
}
