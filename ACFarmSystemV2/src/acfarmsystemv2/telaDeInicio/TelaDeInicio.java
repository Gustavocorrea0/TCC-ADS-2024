package acfarmsystemv2.telaDeInicio;

import Estoque.TelaDeInicioEstoque;
import Maquina.TelaDeInicioMaquinas;
import Propriedade.TelaDeInicioPropriedade;
import Subdivisao.TelaDeInicioSubdivisao;
import Veiculo.TelaDeEscolhaTipoDeVeiculo;
import VendaDeProducao.TelaDeInicioVendasProducao;
import cliente.TelaDeInicioCliente;
import fornecedor.TelaDeInicioFornecedor;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        jButtonAcessarControlePlanta = new javax.swing.JButton();
        jButtonAcessarUsuario = new javax.swing.JButton();
        jButtonAcessarFornecedor = new javax.swing.JButton();
        jButtonAcessarCliente = new javax.swing.JButton();
        jButtonAcessarProducao = new javax.swing.JButton();
        jButtonAcessarPraga = new javax.swing.JButton();
        jButtonVoltarAoLogin = new javax.swing.JButton();
        jButtonEquipe = new javax.swing.JButton();
        jButtonAcessarPropriedade = new javax.swing.JButton();
        jButtonAcessarVenda = new javax.swing.JButton();
        jButtonAcessarEstoque = new javax.swing.JButton();
        jButtonAcessarSubdivisao = new javax.swing.JButton();
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
        getContentPane().add(jButtonAcessarVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 60));

        jButtonAcessarMaquinas.setBorder(null);
        jButtonAcessarMaquinas.setBorderPainted(false);
        jButtonAcessarMaquinas.setContentAreaFilled(false);
        jButtonAcessarMaquinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarMaquinasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarMaquinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 60));

        jButtonAcessarControlePlanta.setBorder(null);
        jButtonAcessarControlePlanta.setBorderPainted(false);
        jButtonAcessarControlePlanta.setContentAreaFilled(false);
        jButtonAcessarControlePlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarControlePlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarControlePlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarControlePlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 80, 60));

        jButtonAcessarUsuario.setBorder(null);
        jButtonAcessarUsuario.setBorderPainted(false);
        jButtonAcessarUsuario.setContentAreaFilled(false);
        jButtonAcessarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 102, 123, 90));

        jButtonAcessarFornecedor.setBorder(null);
        jButtonAcessarFornecedor.setBorderPainted(false);
        jButtonAcessarFornecedor.setContentAreaFilled(false);
        jButtonAcessarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 218, 122, 88));

        jButtonAcessarCliente.setBorder(null);
        jButtonAcessarCliente.setBorderPainted(false);
        jButtonAcessarCliente.setContentAreaFilled(false);
        jButtonAcessarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 102, 122, 89));

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
        getContentPane().add(jButtonAcessarProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 101, 122, 90));

        jButtonAcessarPraga.setBorder(null);
        jButtonAcessarPraga.setBorderPainted(false);
        jButtonAcessarPraga.setContentAreaFilled(false);
        jButtonAcessarPraga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarPraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarPragaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarPraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 101, 123, 89));

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

        jButtonAcessarPropriedade.setToolTipText("");
        jButtonAcessarPropriedade.setBorder(null);
        jButtonAcessarPropriedade.setBorderPainted(false);
        jButtonAcessarPropriedade.setContentAreaFilled(false);
        jButtonAcessarPropriedade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarPropriedadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarPropriedade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 60));

        jButtonAcessarVenda.setBorder(null);
        jButtonAcessarVenda.setBorderPainted(false);
        jButtonAcessarVenda.setContentAreaFilled(false);
        jButtonAcessarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 218, 290, 87));

        jButtonAcessarEstoque.setBorder(null);
        jButtonAcessarEstoque.setBorderPainted(false);
        jButtonAcessarEstoque.setContentAreaFilled(false);
        jButtonAcessarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAcessarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 435, 80, 60));

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
        getContentPane().add(jButtonAcessarSubdivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 350, 80, 60));
        getContentPane().add(jDesktopPaneGraficoDeProducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 720, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_tela_de_inicio_4.png"))); // NOI18N
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

    private void jButtonAcessarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarPropriedadeActionPerformed
        this.dispose();
        new TelaDeInicioPropriedade().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarPropriedadeActionPerformed

    private void jButtonAcessarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarVendaActionPerformed
        this.dispose();
        try {
            new TelaDeInicioVendasProducao().setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(TelaDeInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAcessarVendaActionPerformed

    private void jButtonAcessarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarEstoqueActionPerformed
        this.dispose();
        new TelaDeInicioEstoque().setVisible(true);
    }//GEN-LAST:event_jButtonAcessarEstoqueActionPerformed

    private void apresentarGrafico() {
        JInternalFrameGraficoProducao graficoProducao = new JInternalFrameGraficoProducao();
        jDesktopPaneGraficoDeProducao.add(graficoProducao);
        graficoProducao.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessarCliente;
    private javax.swing.JButton jButtonAcessarControlePlanta;
    private javax.swing.JButton jButtonAcessarEstoque;
    private javax.swing.JButton jButtonAcessarFornecedor;
    private javax.swing.JButton jButtonAcessarMaquinas;
    private javax.swing.JButton jButtonAcessarPraga;
    private javax.swing.JButton jButtonAcessarProducao;
    private javax.swing.JButton jButtonAcessarPropriedade;
    private javax.swing.JButton jButtonAcessarSubdivisao;
    private javax.swing.JButton jButtonAcessarUsuario;
    private javax.swing.JButton jButtonAcessarVeiculos;
    private javax.swing.JButton jButtonAcessarVenda;
    private javax.swing.JButton jButtonEquipe;
    private javax.swing.JButton jButtonVoltarAoLogin;
    private javax.swing.JDesktopPane jDesktopPaneGraficoDeProducao;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
