package fornecedor;

import Maquina.*;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class TelaDeRelatorioFornecedor extends javax.swing.JFrame {

    ControleFornecedor controleFornecedor = new ControleFornecedor();

    public TelaDeRelatorioFornecedor() {
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
        getContentPane().add(jButtonGerarRelatorioDetalhadoDeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 447, 248, 44));

        jButtonGerarRelatorioGeralDeFornecedor.setBorder(null);
        jButtonGerarRelatorioGeralDeFornecedor.setBorderPainted(false);
        jButtonGerarRelatorioGeralDeFornecedor.setContentAreaFilled(false);
        jButtonGerarRelatorioGeralDeFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioGeralDeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioGeralDeFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioGeralDeFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 447, 247, 44));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasFornecedor/img_tela_de_escolha_de_relatorio_fornecedor.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed
        this.dispose();
        new TelaDePDFDetalhadoFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonGerarRelatorioDetalhadoDeFornecedorActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        this.dispose();
        new TelaDeInicioFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonGerarRelatorioGeralDeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioGeralDeFornecedorActionPerformed
        try {
            controleFornecedor.gerarRelatorioGeralDeFornecedores();
            this.dispose();
            new TelaDeRelatorioFornecedor().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRelatorioFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRelatorioFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaDeRelatorioFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGerarRelatorioGeralDeFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarRelatorioDetalhadoDeFornecedor;
    private javax.swing.JButton jButtonGerarRelatorioGeralDeFornecedor;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JLabel jLabelTelaProducao;
    // End of variables declaration//GEN-END:variables
}
