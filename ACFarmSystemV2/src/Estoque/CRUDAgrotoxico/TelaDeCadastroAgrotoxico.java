package Estoque.CRUDAgrotoxico;

import Estoque.ControleEstoque;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import validacoes.ValidarData;

public class TelaDeCadastroAgrotoxico extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeAgrotoxico;
    private String marcaAgrotoxico;
    private Double quantidadeEmLitros;
    private Double quantidadeMinimaEmLitros;
    private String dataDeValidade;
    private String msg;

    public TelaDeCadastroAgrotoxico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConfirmarCadastro = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jTextFieldDataDeValidade = new javax.swing.JTextField();
        jTextFieldQuantidadeAgrotoxico = new javax.swing.JTextField();
        jTextFieldMarcaAgrotoxico = new javax.swing.JTextField();
        jTextFieldQuantidadeMinima = new javax.swing.JTextField();
        jTextFieldNomeAgrotoxico = new javax.swing.JTextField();
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
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 597, 280, 35));

        jTextFieldDataDeValidade.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDataDeValidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDataDeValidade.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDataDeValidade.setBorder(null);
        jTextFieldDataDeValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataDeValidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataDeValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 151, 271, 29));

        jTextFieldQuantidadeAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeAgrotoxico.setBorder(null);
        jTextFieldQuantidadeAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 486, 272, 29));

        jTextFieldMarcaAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaAgrotoxico.setBorder(null);
        jTextFieldMarcaAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 312, 272, 29));

        jTextFieldQuantidadeMinima.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeMinima.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeMinima.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeMinima.setBorder(null);
        jTextFieldQuantidadeMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeMinimaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 312, 271, 29));

        jTextFieldNomeAgrotoxico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeAgrotoxico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeAgrotoxico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeAgrotoxico.setBorder(null);
        jTextFieldNomeAgrotoxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAgrotoxicoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeAgrotoxico, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 151, 271, 29));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasAgrotoxico/img_tela_cadastro_agrotoxico.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDataDeValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataDeValidadeActionPerformed

    }//GEN-LAST:event_jTextFieldDataDeValidadeActionPerformed

    private void jTextFieldMarcaAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaAgrotoxicoActionPerformed

    private void jTextFieldQuantidadeAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeAgrotoxicoActionPerformed

    private void jButtonVoltarATelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaAnteriorActionPerformed
        this.dispose();
        new TelaDeInicioAgrotoxico().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaAnteriorActionPerformed

    private void jTextFieldQuantidadeMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeMinimaActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeMinimaActionPerformed

    private void jTextFieldNomeAgrotoxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAgrotoxicoActionPerformed

    }//GEN-LAST:event_jTextFieldNomeAgrotoxicoActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(this, "Cadastro Cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        cadastrarAgrotoxico();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    public void cadastrarAgrotoxico() {
        if (jTextFieldNomeAgrotoxico.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira o nome do agrotóxico");
            return;
        }

        if (jTextFieldMarcaAgrotoxico.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a marca do agrotóxico");
            return;
        }

        if (jTextFieldQuantidadeAgrotoxico.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade do agrotóxico ");
            return;
        }

        if (jTextFieldDataDeValidade.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a data de validade (dd/MM/aaaa) do agrotóxico");
            return;
        }

        if (jTextFieldQuantidadeMinima.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Insira a quantidade minima do agrotóxico");
            return;
        }

        try {
            nomeAgrotoxico = jTextFieldNomeAgrotoxico.getText();
            marcaAgrotoxico = jTextFieldMarcaAgrotoxico.getText();
            quantidadeEmLitros = Double.valueOf(jTextFieldQuantidadeAgrotoxico.getText());
            quantidadeMinimaEmLitros = Double.valueOf(jTextFieldQuantidadeMinima.getText());
            dataDeValidade = jTextFieldDataDeValidade.getText();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            if (nomeAgrotoxico.isBlank()) {
                JOptionPane.showMessageDialog(this, "Nome Inválido");
                return;
            }

            if (marcaAgrotoxico.isBlank()) {
                JOptionPane.showMessageDialog(this, "Marca Inválida");
                return;
            }

            if (quantidadeEmLitros < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade Inválida");
                return;
            }

            if (quantidadeMinimaEmLitros < 0) {
                JOptionPane.showMessageDialog(this, "Quantidade minima Inválida");
                return;
            }

            if (!ValidarData.validaData(dataDeValidade)) {
                JOptionPane.showMessageDialog(this, "Data de validade inválida (dd/MM/aaaa)");
                return;
            }

            Date dataDeValidadeValida = dateFormat.parse(dataDeValidade);
            controleEstoque.agrotoxico.setNomeAgrotoxico(nomeAgrotoxico);
            controleEstoque.agrotoxico.setMarcaAgrotoxico(marcaAgrotoxico);
            controleEstoque.agrotoxico.setQuantidadeMinimaEmLitros(quantidadeMinimaEmLitros);
            controleEstoque.agrotoxico.setQuantidadeEmLitros(quantidadeEmLitros);
            controleEstoque.agrotoxico.setDataDeValidade(dataDeValidadeValida);

            msg = controleEstoque.cadastrarAgrotoxico(ControleEstoque.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "As quantidades de agrotóxico devem ser númericas");
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido, o formato é dd/mm/aaaa.");
        }

    }

    public void limparCampos() {
        jTextFieldDataDeValidade.setText("");
        jTextFieldMarcaAgrotoxico.setText("");
        jTextFieldNomeAgrotoxico.setText("");
        jTextFieldQuantidadeAgrotoxico.setText("");
        jTextFieldQuantidadeMinima.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaAnterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDataDeValidade;
    private javax.swing.JTextField jTextFieldMarcaAgrotoxico;
    private javax.swing.JTextField jTextFieldNomeAgrotoxico;
    private javax.swing.JTextField jTextFieldQuantidadeAgrotoxico;
    private javax.swing.JTextField jTextFieldQuantidadeMinima;
    // End of variables declaration//GEN-END:variables
}
