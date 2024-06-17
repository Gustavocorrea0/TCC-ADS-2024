package Estoque.CRUDCombustivel;

import Estoque.ControleEstoque;
import javax.swing.JOptionPane;

public class TelaDeCadastroCombustivel extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeCombustivel;
    private Double quantidadeCombustivel;
    private Double quantidadeMinima;
    private String msg;

    public TelaDeCadastroCombustivel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConfirmarCadastro = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jTextFieldNomeCombustivel = new javax.swing.JTextField();
        jTextFieldQuantidadeCombustivel = new javax.swing.JTextField();
        jTextFieldQuantidadeMinimaCombustivel = new javax.swing.JTextField();
        jButtonVoltarATelaAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setBorderPainted(false);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 33));

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setBorderPainted(false);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 599, 280, 30));

        jTextFieldNomeCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCombustivel.setBorder(null);
        jTextFieldNomeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 174, 272, 30));

        jTextFieldQuantidadeCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeCombustivel.setBorder(null);
        jTextFieldQuantidadeCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 500, 270, 29));

        jTextFieldQuantidadeMinimaCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeMinimaCombustivel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeMinimaCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeMinimaCombustivel.setBorder(null);
        jTextFieldQuantidadeMinimaCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeMinimaCombustivelActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeMinimaCombustivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 334, 272, 30));

        jButtonVoltarATelaAnterior.setBorder(null);
        jButtonVoltarATelaAnterior.setBorderPainted(false);
        jButtonVoltarATelaAnterior.setContentAreaFilled(false);
        jButtonVoltarATelaAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 40, 22));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasCombustivel/img_cadastro_de_combustivel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCombustivelActionPerformed

    private void jTextFieldQuantidadeMinimaCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaCombustivelActionPerformed

    private void jTextFieldQuantidadeCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeCombustivelActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeCombustivelActionPerformed

    private void jButtonVoltarATelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaAnteriorActionPerformed
        this.dispose();
        new TelaDeInicioCombustivel().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaAnteriorActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(this, "Cadastro cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        cadastrarCombustivel();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    public void cadastrarCombustivel() {
        if (jTextFieldNomeCombustivel.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do combustível");
            return;
        }

        if (jTextFieldQuantidadeMinimaCombustivel.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade miníma de combustível");
            return;
        }

        if (jTextFieldQuantidadeCombustivel.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade de combustível");
            return;
        }

        try {

            nomeCombustivel = jTextFieldNomeCombustivel.getText();
            quantidadeMinima = Double.valueOf(jTextFieldQuantidadeMinimaCombustivel.getText());
            quantidadeCombustivel = Double.valueOf(jTextFieldQuantidadeCombustivel.getText());

            if (nomeCombustivel.isBlank()) {
                JOptionPane.showMessageDialog(this, "Nome Inválido");
                return;
            }

            if (quantidadeCombustivel < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade Inválida");
                return;
            }

            if (quantidadeMinima < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade minima Inválida");
                return;
            }

            controleEstoque.combustivel.setNomeCombustivel(nomeCombustivel);
            controleEstoque.combustivel.setQuantidadeEmLitros(quantidadeCombustivel);
            controleEstoque.combustivel.setQuantidadeMinimaEmLitros(quantidadeMinima);

            msg = controleEstoque.cadastrarCombustivel(ControleEstoque.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "As quantidades de combustíveis devem ser númericas");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha ao cadastrar combustível");
        }

    }

    public void limparCampos() {
        jTextFieldNomeCombustivel.setText("");
        jTextFieldQuantidadeCombustivel.setText("");
        jTextFieldQuantidadeMinimaCombustivel.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldNomeCombustivel;
    private javax.swing.JTextField jTextFieldQuantidadeCombustivel;
    private javax.swing.JTextField jTextFieldQuantidadeMinimaCombustivel;
    // End of variables declaration//GEN-END:variables
}
