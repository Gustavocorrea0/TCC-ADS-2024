package producao;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeDadosDeProducao extends javax.swing.JFrame {

    ControleProducao controleProducao = new ControleProducao();

    public TelaDeDadosDeProducao() {
        initComponents();
        apresentarGrafico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarATelaDeProducao = new javax.swing.JButton();
        jButtonGerarRelatorioFinanceiro = new javax.swing.JButton();
        jDesktopPaneGraficoDeProducao = new javax.swing.JDesktopPane();
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

        jButtonGerarRelatorioFinanceiro.setBorder(null);
        jButtonGerarRelatorioFinanceiro.setBorderPainted(false);
        jButtonGerarRelatorioFinanceiro.setContentAreaFilled(false);
        jButtonGerarRelatorioFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGerarRelatorioFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGerarRelatorioFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 190, 44));
        getContentPane().add(jDesktopPaneGraficoDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 630, 540));

        jLabelTelaProducao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasProducao/img_tela_de_relatorio_producao_com_graficopng.png"))); // NOI18N
        jLabelTelaProducao.setText("jLabel1");
        getContentPane().add(jLabelTelaProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarATelaDeProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeProducaoActionPerformed
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeProducaoActionPerformed

    private void jButtonGerarRelatorioFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioFinanceiroActionPerformed
        try {
            JOptionPane.showMessageDialog(this, "Gerando Relatorio de produção");
            controleProducao.gerarRelatorioDeDadosDeProducoesEmPDF();
            this.dispose();
            new TelaDeDadosDeProducao().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaDeRelatorioProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGerarRelatorioFinanceiroActionPerformed

    public void apresentarGrafico() {
        JInternalFrameGraficoProducao graficoProducao = new JInternalFrameGraficoProducao();
        jDesktopPaneGraficoDeProducao.add(graficoProducao);
        graficoProducao.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarRelatorioFinanceiro;
    private javax.swing.JButton jButtonVoltarATelaDeProducao;
    private javax.swing.JDesktopPane jDesktopPaneGraficoDeProducao;
    private javax.swing.JLabel jLabelTelaProducao;
    // End of variables declaration//GEN-END:variables
}
