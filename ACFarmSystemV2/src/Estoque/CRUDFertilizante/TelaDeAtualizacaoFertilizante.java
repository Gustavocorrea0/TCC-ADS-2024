package Estoque.CRUDFertilizante;

import Estoque.CRUDCombustivel.*;
import Estoque.ControleEstoque;
import Estoque.Fertilizante;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDeAtualizacaoFertilizante extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeFertilizanteEncontrado;
    private String marcaFertilizanteEncontrado;
    private String tipoEncontrado;
    private String quantidadeEmSacosEncontrado;
    private String quantidadeEmLitrosEncontrado;
    private String msg;

    private String nomeFertilizanteAtualizacao;
    private String marcaFertilizanteAtualizacao;
    private String tipoAtualizacao;
    private Double quantidadeEmSacosAtualizacao;
    private Double quantidadeEmLitrosAtualizacao;

    private String nomeInsumo;
    private int idMaquina;

    public TelaDeAtualizacaoFertilizante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldQuantidadeEmSacos = new javax.swing.JTextField();
        jTextFieldMarcaFertilizante = new javax.swing.JTextField();
        jTextFieldTipoFertilizante = new javax.swing.JTextField();
        jTextFieldNomeFertilizanteBuscado = new javax.swing.JTextField();
        jTextFieldQuantidadeEmLitros = new javax.swing.JTextField();
        jTextFieldNomeFertilizante = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSairDaTelaEstoqueAtualizarCombustivel = new javax.swing.JButton();
        jButtonBuscarFertilizante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldQuantidadeEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmSacos.setBorder(null);
        jTextFieldQuantidadeEmSacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmSacosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 247, 271, 29));

        jTextFieldMarcaFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaFertilizante.setBorder(null);
        jTextFieldMarcaFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 408, 271, 29));

        jTextFieldTipoFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTipoFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldTipoFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTipoFertilizante.setBorder(null);
        jTextFieldTipoFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipoFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 572, 271, 29));

        jTextFieldNomeFertilizanteBuscado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFertilizanteBuscado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeFertilizanteBuscado.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFertilizanteBuscado.setBorder(null);
        jTextFieldNomeFertilizanteBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFertilizanteBuscadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeFertilizanteBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 117, 272, 29));

        jTextFieldQuantidadeEmLitros.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmLitros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmLitros.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmLitros.setBorder(null);
        jTextFieldQuantidadeEmLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmLitrosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmLitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 408, 271, 29));

        jTextFieldNomeFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFertilizante.setBorder(null);
        jTextFieldNomeFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 247, 271, 29));

        jButtonConfirmar.setBorder(null);
        jButtonConfirmar.setBorderPainted(false);
        jButtonConfirmar.setContentAreaFilled(false);
        jButtonConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 35));

        jButtonCancelar.setBorder(null);
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 597, 280, 35));

        jButtonSairDaTelaEstoqueAtualizarCombustivel.setBorder(null);
        jButtonSairDaTelaEstoqueAtualizarCombustivel.setBorderPainted(false);
        jButtonSairDaTelaEstoqueAtualizarCombustivel.setContentAreaFilled(false);
        jButtonSairDaTelaEstoqueAtualizarCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaEstoqueAtualizarCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaEstoqueAtualizarCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonBuscarFertilizante.setBorder(null);
        jButtonBuscarFertilizante.setBorderPainted(false);
        jButtonBuscarFertilizante.setContentAreaFilled(false);
        jButtonBuscarFertilizante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 108, 282, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasFertilizante/img_tela_atualizacao_fertilizante.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantidadeEmSacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmSacosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmSacosActionPerformed

    private void jTextFieldMarcaFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaFertilizanteActionPerformed

    private void jTextFieldTipoFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldTipoFertilizanteActionPerformed

    private void jTextFieldNomeFertilizanteBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFertilizanteBuscadoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeFertilizanteBuscadoActionPerformed

    private void jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed
        this.dispose();
        new TelaDeInicioFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaEstoqueAtualizarCombustivelActionPerformed

    private void jTextFieldQuantidadeEmLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmLitrosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmLitrosActionPerformed

    private void jTextFieldNomeFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeFertilizanteActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        atualizarFertilizante();
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        JOptionPane.showMessageDialog(this, "Atualização cancelada");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFertilizanteActionPerformed
        try {
            buscarFertilizante();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeAtualizacaoFertilizante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonBuscarFertilizanteActionPerformed

    public void buscarFertilizante() throws SQLException {
        if (jTextFieldNomeFertilizanteBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do fertilizante");
            limparCampos();
            return;
        }

        nomeInsumo = jTextFieldNomeFertilizanteBuscado.getText();
        Fertilizante fertilizanteEncontrado = controleEstoque.buscarFertilizante(nomeInsumo);

        if (fertilizanteEncontrado != null) {
            nomeFertilizanteEncontrado = fertilizanteEncontrado.getNomeFertilizante();
            marcaFertilizanteEncontrado = fertilizanteEncontrado.getMarcaFertilizante();
            tipoEncontrado = fertilizanteEncontrado.getTipoFertilizante();
            quantidadeEmSacosEncontrado = Double.toString(fertilizanteEncontrado.getQuantidadeEmSacos());
            quantidadeEmLitrosEncontrado = Double.toString(fertilizanteEncontrado.getQuantidadeEmLitros());
            idMaquina = fertilizanteEncontrado.getIdFertilizante();

            jTextFieldMarcaFertilizante.setText(marcaFertilizanteEncontrado);
            jTextFieldNomeFertilizante.setText(nomeFertilizanteEncontrado);
            jTextFieldQuantidadeEmLitros.setText(quantidadeEmLitrosEncontrado);
            jTextFieldQuantidadeEmSacos.setText(quantidadeEmSacosEncontrado);
            jTextFieldTipoFertilizante.setText(tipoEncontrado);

        } else {
            JOptionPane.showMessageDialog(this, "Fertilizante não encontrado");
            limparCampos();
        }
    }

    public void atualizarFertilizante() {
        if (jTextFieldNomeFertilizanteBuscado.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Busque um fertilizante");
            limparCampos();
            return;
        }

        if (jTextFieldNomeFertilizante.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do fertilizante");
            return;
        }

        if (jTextFieldMarcaFertilizante.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a marca do fertilizante");
            return;
        }

        if (jTextFieldTipoFertilizante.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o tipo do fertilizante:\nSolido\nLiquido");
            return;
        }

        if (jTextFieldQuantidadeEmSacos.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade em sacos\nCaso sejam litros insira zero em sacos");
            return;
        }

        if (jTextFieldQuantidadeEmLitros.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade em sacos\nCaso sejam sacos insira zero em litros");
            return;
        }

        try {

            Fertilizante fertilizanteAtualizado = new Fertilizante();

            nomeFertilizanteAtualizacao = jTextFieldNomeFertilizante.getText();
            marcaFertilizanteAtualizacao = jTextFieldMarcaFertilizante.getText();
            tipoAtualizacao = jTextFieldTipoFertilizante.getText();
            quantidadeEmSacosAtualizacao = Double.valueOf(jTextFieldQuantidadeEmSacos.getText());
            quantidadeEmLitrosAtualizacao = Double.valueOf(jTextFieldQuantidadeEmLitros.getText());

            if (nomeFertilizanteAtualizacao.isBlank()) {
                JOptionPane.showMessageDialog(null, "Nome inválido");
                return;
            }

            if (marcaFertilizanteAtualizacao.isBlank()) {
                JOptionPane.showMessageDialog(null, "Marca inválido");
                return;
            }

            if (quantidadeEmSacosAtualizacao < 0) {
                JOptionPane.showMessageDialog(null, "Quantidade em sacos inválida\nCaso sejam litros insira zero em sacos");
                return;
            }

            if (quantidadeEmLitrosAtualizacao < 0) {
                JOptionPane.showMessageDialog(null, "Quantidade em litros inválida\nCaso sejam sacos insira zero em litros");
                return;
            }

            if (tipoAtualizacao.equalsIgnoreCase("liquido")) {
                quantidadeEmSacosAtualizacao = 0.0;
                fertilizanteAtualizado.setIdFertilizante(idMaquina);
                fertilizanteAtualizado.setNomeFertilizante(nomeFertilizanteAtualizacao);
                fertilizanteAtualizado.setMarcaFertilizante(marcaFertilizanteAtualizacao);
                fertilizanteAtualizado.setTipoFertilizante(tipoAtualizacao);
                fertilizanteAtualizado.setQuantidadeEmLitros(quantidadeEmLitrosAtualizacao);
                fertilizanteAtualizado.setQuantidadeEmSacos(quantidadeEmSacosAtualizacao);

                controleEstoque = new ControleEstoque();
                String msgAtualizacao = controleEstoque.atualizarFertilizante(fertilizanteAtualizado);
                JOptionPane.showMessageDialog(null, msgAtualizacao);
                limparCampos();
            } else if (tipoAtualizacao.equalsIgnoreCase("solido")) {
                quantidadeEmLitrosAtualizacao = 0.0;
                fertilizanteAtualizado.setIdFertilizante(idMaquina);
                fertilizanteAtualizado.setNomeFertilizante(nomeFertilizanteEncontrado);
                fertilizanteAtualizado.setMarcaFertilizante(marcaFertilizanteEncontrado);
                fertilizanteAtualizado.setTipoFertilizante(tipoAtualizacao);
                fertilizanteAtualizado.setQuantidadeEmLitros(quantidadeEmLitrosAtualizacao);
                fertilizanteAtualizado.setQuantidadeEmSacos(quantidadeEmSacosAtualizacao);

                controleEstoque = new ControleEstoque();
                String msgAtualizacao = controleEstoque.atualizarFertilizante(fertilizanteAtualizado);
                JOptionPane.showMessageDialog(null, msgAtualizacao);
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Tipo Inválido, apenas: solido ou liquido");
                return;
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "As quantidades devem ser numerícas");
        }

    }

    private void limparCampos() {
        jTextFieldNomeFertilizanteBuscado.setText("");
        jTextFieldMarcaFertilizante.setText("");
        jTextFieldNomeFertilizante.setText("");
        jTextFieldQuantidadeEmLitros.setText("");
        jTextFieldQuantidadeEmSacos.setText("");
        jTextFieldTipoFertilizante.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarFertilizante;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonSairDaTelaEstoqueAtualizarCombustivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldMarcaFertilizante;
    private javax.swing.JTextField jTextFieldNomeFertilizante;
    private javax.swing.JTextField jTextFieldNomeFertilizanteBuscado;
    private javax.swing.JTextField jTextFieldQuantidadeEmLitros;
    private javax.swing.JTextField jTextFieldQuantidadeEmSacos;
    private javax.swing.JTextField jTextFieldTipoFertilizante;
    // End of variables declaration//GEN-END:variables
}
