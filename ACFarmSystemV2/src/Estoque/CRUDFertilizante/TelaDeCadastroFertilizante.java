package Estoque.CRUDFertilizante;

import Estoque.ControleEstoque;
import javax.swing.JOptionPane;

public class TelaDeCadastroFertilizante extends javax.swing.JFrame {

    private ControleEstoque controleEstoque = new ControleEstoque();
    private String nomeFertilizante;
    private String marcaFertilizante;
    private String tipoFertilizante;
    private Double quantidadeEmSacos;
    private Double quantidadeEmLitros;
    private String msg;

    public TelaDeCadastroFertilizante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jTextFieldQuantidadeEmLitros = new javax.swing.JTextField();
        jTextFieldMarcaFertilizante = new javax.swing.JTextField();
        jTextFieldQuantidadeEmSacos = new javax.swing.JTextField();
        jTextFieldNomeFertilizante = new javax.swing.JTextField();
        jButtonVoltarATelaAnterior = new javax.swing.JButton();
        jComboBoxTipoFertilizante = new javax.swing.JComboBox<>();
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
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 548, 282, 35));

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setBorderPainted(false);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 598, 280, 36));

        jTextFieldQuantidadeEmLitros.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmLitros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmLitros.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmLitros.setBorder(null);
        jTextFieldQuantidadeEmLitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmLitrosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmLitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 313, 272, 29));

        jTextFieldMarcaFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaFertilizante.setBorder(null);
        jTextFieldMarcaFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarcaFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 313, 272, 29));

        jTextFieldQuantidadeEmSacos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeEmSacos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeEmSacos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeEmSacos.setBorder(null);
        jTextFieldQuantidadeEmSacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEmSacosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuantidadeEmSacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 152, 272, 29));

        jTextFieldNomeFertilizante.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeFertilizante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeFertilizante.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFertilizante.setBorder(null);
        jTextFieldNomeFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 152, 272, 29));

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

        jComboBoxTipoFertilizante.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxTipoFertilizante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solido", "Liquido", " " }));
        jComboBoxTipoFertilizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoFertilizanteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipoFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasDeEstoque/telasFertilizante/img_tela_cadastro_fertilizante.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuantidadeEmLitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmLitrosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmLitrosActionPerformed

    private void jTextFieldMarcaFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldMarcaFertilizanteActionPerformed

    private void jButtonVoltarATelaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaAnteriorActionPerformed
        this.dispose();
        new TelaDeInicioFertilizante().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaAnteriorActionPerformed

    private void jTextFieldQuantidadeEmSacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEmSacosActionPerformed

    }//GEN-LAST:event_jTextFieldQuantidadeEmSacosActionPerformed

    private void jTextFieldNomeFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFertilizanteActionPerformed

    }//GEN-LAST:event_jTextFieldNomeFertilizanteActionPerformed

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(this, "Cadastro cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        cadastrarFertilizante();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jComboBoxTipoFertilizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoFertilizanteActionPerformed

    }//GEN-LAST:event_jComboBoxTipoFertilizanteActionPerformed

    public void cadastrarFertilizante() {

        if (jTextFieldNomeFertilizante.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do fertilizante");
            return;
        }

        if (jTextFieldMarcaFertilizante.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do fertilizante");
            return;
        }

        if (jTextFieldQuantidadeEmSacos.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a quantidade de sacos de fertilizante\nCaso sejam litros insira zero em sacos");
            return;
        }

        if (jTextFieldQuantidadeEmLitros.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a quantidade de litros de fertilizante\nCaso sejam sacos insira zero em litros");
            return;
        }

        try {
            tipoFertilizante = jComboBoxTipoFertilizante.getSelectedItem().toString();
            nomeFertilizante = jTextFieldNomeFertilizante.getText();
            marcaFertilizante = jTextFieldMarcaFertilizante.getText();
            quantidadeEmSacos = Double.valueOf(jTextFieldQuantidadeEmSacos.getText());
            quantidadeEmLitros = Double.valueOf(jTextFieldQuantidadeEmLitros.getText());

            if (nomeFertilizante.isBlank()) {
                JOptionPane.showMessageDialog(null, "Nome inválido");
                return;
            }

            if (marcaFertilizante.isBlank()) {
                JOptionPane.showMessageDialog(null, "Marca inválida");
                return;
            }

            if (quantidadeEmSacos < 0) {
                JOptionPane.showMessageDialog(null, "Quantidade em sacos inválida\nCaso sejam litros insira zero em sacos");
                return;
            }

            if (quantidadeEmLitros < 0) {
                JOptionPane.showMessageDialog(null, "Quantidade em litros inválida\nCaso sejam sacos insira zero em litros");
                return;
            }

            if (tipoFertilizante.equals("Selecione")) {
                JOptionPane.showMessageDialog(null, "Escolha um tipo de fertilizante");
                return;
            }

            controleEstoque.fertilizante.setNomeFertilizante(nomeFertilizante);
            controleEstoque.fertilizante.setMarcaFertilizante(marcaFertilizante);
            controleEstoque.fertilizante.setQuantidadeEmLitros(quantidadeEmLitros);
            controleEstoque.fertilizante.setQuantidadeEmSacos(quantidadeEmSacos);
            controleEstoque.fertilizante.setTipoFertilizante(tipoFertilizante);

            msg = controleEstoque.cadastrarFertilizante(ControleEstoque.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "As quantidades devem ser numerícas");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, msg);
        }

    }

    private void limparCampos() {
        jTextFieldMarcaFertilizante.setText("");
        jTextFieldNomeFertilizante.setText("");
        jTextFieldQuantidadeEmLitros.setText("");
        jTextFieldQuantidadeEmSacos.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaAnterior;
    private javax.swing.JComboBox<String> jComboBoxTipoFertilizante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldMarcaFertilizante;
    private javax.swing.JTextField jTextFieldNomeFertilizante;
    private javax.swing.JTextField jTextFieldQuantidadeEmLitros;
    private javax.swing.JTextField jTextFieldQuantidadeEmSacos;
    // End of variables declaration//GEN-END:variables
}
