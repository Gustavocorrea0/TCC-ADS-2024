package producao;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeRelatorioProducao extends javax.swing.JFrame {

    ControleProducao controleProducao = new ControleProducao();

    public TelaDeRelatorioProducao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonGerarRelatorioProducao = new javax.swing.JButton();
        jButtonGerarRelatorioFinanceiro = new javax.swing.JButton();
        jButtonTelaDeRelatorioDetalhado = new javax.swing.JButton();
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

        jButtonGerarRelatorioProducao.setBorder(null);
        jButtonGerarRelatorioProducao.setBorderPainted(false);
        jButtonGerarRelatorioProducao.setContentAreaFilled(false);
        jButtonGerarRelatorioProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 403, 142, 46));

        jButtonGerarRelatorioFinanceiro.setBorder(null);
        jButtonGerarRelatorioFinanceiro.setBorderPainted(false);
        jButtonGerarRelatorioFinanceiro.setContentAreaFilled(false);
        jButtonGerarRelatorioFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 404, 140, 44));

        jButtonTelaDeRelatorioDetalhado.setBorder(null);
        jButtonTelaDeRelatorioDetalhado.setBorderPainted(false);
        jButtonTelaDeRelatorioDetalhado.setContentAreaFilled(false);
        jButtonTelaDeRelatorioDetalhado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTelaDeRelatorioDetalhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelaDeRelatorioDetalhadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTelaDeRelatorioDetalhado, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 403, 140, 45));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_relatorio_producao.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarRelatorioProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioProducaoActionPerformed
        try {
            controleProducao.gerarRelatorioDeDadosDeProducoesEmPDF();
            JOptionPane.showMessageDialog(this, "Gerando Relatorio de produção");
            this.dispose();
            new TelaDeRelatorioProducao().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGerarRelatorioProducaoActionPerformed

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed

        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonGerarRelatorioFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioFinanceiroActionPerformed

        try {
            controleProducao.gerarRelatorioDeDadosFinanceirosEmPDF();
            JOptionPane.showMessageDialog(this, "Gerando Relatorio de custos");
            this.dispose();
            new TelaDeRelatorioProducao().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGerarRelatorioFinanceiroActionPerformed

    private void jButtonTelaDeRelatorioDetalhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelaDeRelatorioDetalhadoActionPerformed
        this.dispose();
        new TelaDeRelatorioDetalhadoDeProducao().setVisible(true);
    }//GEN-LAST:event_jButtonTelaDeRelatorioDetalhadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarRelatorioFinanceiro;
    private javax.swing.JButton jButtonGerarRelatorioProducao;
    private javax.swing.JButton jButtonTelaDeRelatorioDetalhado;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JLabel jLabelTelaProducao;
    // End of variables declaration//GEN-END:variables
}
