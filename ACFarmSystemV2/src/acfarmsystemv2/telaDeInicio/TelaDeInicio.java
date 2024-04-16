package acfarmsystemv2.telaDeInicio;

import Estoque.TelaDeInicioEstoque;
import Maquina.TelaDeInicioMaquinas;
import Propriedade.TelaDeInicioPropriedade;
import Subdivisao.TelaDeInicioSubdivisao;
import Veiculo.TelaDeEscolhaTipoDeVeiculo;
import VendaDeProducao.TelaDeInicioVendasProducao;
import cliente.TelaDeInicioCliente;
import fornecedor.TelaDeInicioFornecedor;
import planta.TelaDeInicioPlanta;
import praga.TelaDeInicioPraga;
import producao.TelaDeInicioProducao;
import usuario.TelaDeAcessoUsuario;


public class TelaDeInicio extends javax.swing.JFrame {

    public TelaDeInicio() {
        initComponents();
        apresentarGrafico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessarVeiculos = new javax.swing.JButton();
        jButtonAcessarMaquinas = new javax.swing.JButton();
        jButtonAcessarSubdivisao = new javax.swing.JButton();
        jButtonAcessarControlePlanta = new javax.swing.JButton();
        jButtonAcessarUsuario = new javax.swing.JButton();
        jButtonAcessarFornecedor = new javax.swing.JButton();
        jButtonAcessarCliente = new javax.swing.JButton();
        jButtonAcessarProducao = new javax.swing.JButton();
        jButtonAcessarPraga = new javax.swing.JButton();
        jButtonVoltarAoLogin = new javax.swing.JButton();
        jButtonEquipe = new javax.swing.JButton();
        jButtonAcessarPropriedadeOP2 = new javax.swing.JButton();
        jButtonAcessarVenda1 = new javax.swing.JButton();
        jButtonAcessarEstoqueOP2 = new javax.swing.JButton();
        jDesktopPaneGraficoDeProducao = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAcessarVeiculos.setBorder(null);
        jButtonAcessarVeiculos.setBorderPainted(false);
        jButtonAcessarVeiculos.setContentAreaFilled(false);
        jButtonAcessarVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarVeiculosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 198, 29));

        jButtonAcessarMaquinas.setBorder(null);
        jButtonAcessarMaquinas.setBorderPainted(false);
        jButtonAcessarMaquinas.setContentAreaFilled(false);
        jButtonAcessarMaquinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarMaquinasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarMaquinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 164, 198, 29));

        jButtonAcessarSubdivisao.setToolTipText("");
        jButtonAcessarSubdivisao.setBorder(null);
        jButtonAcessarSubdivisao.setBorderPainted(false);
        jButtonAcessarSubdivisao.setContentAreaFilled(false);
        jButtonAcessarSubdivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarSubdivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarSubdivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 252, 198, 29));

        jButtonAcessarControlePlanta.setBorder(null);
        jButtonAcessarControlePlanta.setBorderPainted(false);
        jButtonAcessarControlePlanta.setContentAreaFilled(false);
        jButtonAcessarControlePlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarControlePlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarControlePlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarControlePlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 343, 198, 29));

        jButtonAcessarUsuario.setBorder(null);
        jButtonAcessarUsuario.setBorderPainted(false);
        jButtonAcessarUsuario.setContentAreaFilled(false);
        jButtonAcessarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 403, 198, 29));

        jButtonAcessarFornecedor.setBorder(null);
        jButtonAcessarFornecedor.setBorderPainted(false);
        jButtonAcessarFornecedor.setContentAreaFilled(false);
        jButtonAcessarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 198, 29));

        jButtonAcessarCliente.setBorder(null);
        jButtonAcessarCliente.setBorderPainted(false);
        jButtonAcessarCliente.setContentAreaFilled(false);
        jButtonAcessarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 465, 198, 29));

        jButtonAcessarProducao.setToolTipText("");
        jButtonAcessarProducao.setBorder(null);
        jButtonAcessarProducao.setBorderPainted(false);
        jButtonAcessarProducao.setContentAreaFilled(false);
        jButtonAcessarProducao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarProducaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 526, 198, 29));

        jButtonAcessarPraga.setBorder(null);
        jButtonAcessarPraga.setBorderPainted(false);
        jButtonAcessarPraga.setContentAreaFilled(false);
        jButtonAcessarPraga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 555, 198, 29));

        jButtonVoltarAoLogin.setBorder(null);
        jButtonVoltarAoLogin.setBorderPainted(false);
        jButtonVoltarAoLogin.setContentAreaFilled(false);
        jButtonVoltarAoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarAoLogin.setDefaultCapable(false);
        jButtonVoltarAoLogin.setFocusPainted(false);
        jButtonVoltarAoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarAoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarAoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 20));

        jButtonEquipe.setBorder(null);
        jButtonEquipe.setBorderPainted(false);
        jButtonEquipe.setContentAreaFilled(false);
        jButtonEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 10, 50, 40));

        jButtonAcessarPropriedadeOP2.setToolTipText("");
        jButtonAcessarPropriedadeOP2.setBorder(null);
        jButtonAcessarPropriedadeOP2.setBorderPainted(false);
        jButtonAcessarPropriedadeOP2.setContentAreaFilled(false);
        jButtonAcessarPropriedadeOP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarPropriedadeOP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarPropriedadeOP2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarPropriedadeOP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 222, 198, 29));

        jButtonAcessarVenda1.setBorder(null);
        jButtonAcessarVenda1.setBorderPainted(false);
        jButtonAcessarVenda1.setContentAreaFilled(false);
        jButtonAcessarVenda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarVenda1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarVenda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 586, 198, 29));

        jButtonAcessarEstoqueOP2.setBorder(null);
        jButtonAcessarEstoqueOP2.setBorderPainted(false);
        jButtonAcessarEstoqueOP2.setContentAreaFilled(false);
        jButtonAcessarEstoqueOP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarEstoqueOP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarEstoqueOP2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarEstoqueOP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 313, 198, 29));
        getContentPane().add(jDesktopPaneGraficoDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 660, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_tela_de_inicio_2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarControlePlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarControlePlantaActionPerformed
        this.dispose();
        new TelaDeInicioPlanta().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarControlePlantaActionPerformed

    private void jButtonVoltarAoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoLoginActionPerformed
        this.dispose();
        new TelaDeLogin().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoLoginActionPerformed

    private void jButtonAcessarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarFornecedorActionPerformed
        this.dispose();
        new TelaDeInicioFornecedor().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarFornecedorActionPerformed

    private void jButtonAcessarVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarVeiculosActionPerformed
        this.dispose();
        new TelaDeEscolhaTipoDeVeiculo().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarVeiculosActionPerformed

    private void jButtonAcessarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarProducaoActionPerformed
        this.dispose();
        new TelaDeInicioProducao().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarProducaoActionPerformed

    private void jButtonAcessarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarMaquinasActionPerformed
        this.dispose();
        new TelaDeInicioMaquinas().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarMaquinasActionPerformed

    private void jButtonAcessarSubdivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarSubdivisaoActionPerformed
        this.dispose();
        new TelaDeInicioSubdivisao().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarSubdivisaoActionPerformed

    private void jButtonEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipeActionPerformed
        this.dispose();
        new TelaDeEsterEgg().setVisible(true);
    }//GEN-LAST:event_jButtonEquipeActionPerformed

    private void jButtonAcessarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarClienteActionPerformed
        this.dispose();
        new TelaDeInicioCliente().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarClienteActionPerformed

    private void jButtonAcessarPragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarPragaActionPerformed
        this.dispose();
        new TelaDeInicioPraga().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarPragaActionPerformed

    private void jButtonAcessarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarUsuarioActionPerformed
        this.dispose();
        new TelaDeAcessoUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarUsuarioActionPerformed

    private void jButtonAcessarPropriedadeOP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarPropriedadeOP2ActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarPropriedadeOP2ActionPerformed

    private void jButtonAcessarVenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarVenda1ActionPerformed
        this.dispose();
        new TelaDeInicioVendasProducao().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarVenda1ActionPerformed

    private void jButtonAcessarEstoqueOP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarEstoqueOP2ActionPerformed
        this.dispose();
        new TelaDeInicioEstoque().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarEstoqueOP2ActionPerformed

    public void apresentarGrafico() {
        JInternalFrameGraficoProducao graficoProducao = new JInternalFrameGraficoProducao();
        jDesktopPaneGraficoDeProducao.add(graficoProducao);
        graficoProducao.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarCliente;
    private javax.swing.JButton jButtonAcessarControlePlanta;
    private javax.swing.JButton jButtonAcessarEstoqueOP2;
    private javax.swing.JButton jButtonAcessarFornecedor;
    private javax.swing.JButton jButtonAcessarMaquinas;
    private javax.swing.JButton jButtonAcessarPraga;
    private javax.swing.JButton jButtonAcessarProducao;
    private javax.swing.JButton jButtonAcessarPropriedadeOP2;
    private javax.swing.JButton jButtonAcessarSubdivisao;
    private javax.swing.JButton jButtonAcessarUsuario;
    private javax.swing.JButton jButtonAcessarVeiculos;
    private javax.swing.JButton jButtonAcessarVenda1;
    private javax.swing.JButton jButtonEquipe;
    private javax.swing.JButton jButtonVoltarAoLogin;
    private javax.swing.JDesktopPane jDesktopPaneGraficoDeProducao;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
