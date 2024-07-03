package Veiculo.CRUDTrator;

import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDTrator;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class TelaDeCadastroDeTrator extends javax.swing.JFrame {

    private ControleVeiculo controleVeiculo = new ControleVeiculo();

    private String estado;
    private String tipoVeiculo;

    private String nome;
    private String marca;
    private String chassi;

    private Double capacidadeDoTanque;

    private int anoAtual;
    private int ano;
    private int numeroDeMarchas;
    private int quantidadeDeRodas;
    private int potenciaEmCv;

    public TelaDeCadastroDeTrator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jTextFieldPotenciaTrator = new javax.swing.JTextField();
        jTextFieldNomeTrator = new javax.swing.JTextField();
        jTextFieldMarcaTrator = new javax.swing.JTextField();
        jTextFieldAnoTrator = new javax.swing.JTextField();
        jTextFieldChassiTrator = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueTrator = new javax.swing.JTextField();
        jTextFieldNumeroDeMarchasTrator = new javax.swing.JTextField();
        jTextFieldQuantidadeDeRodasTrator = new javax.swing.JTextField();
        jButtonVoltarATelaDeInicioVeiculo = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelarCadastro.setBorder(null);
        jButtonCancelarCadastro.setBorderPainted(false);
        jButtonCancelarCadastro.setContentAreaFilled(false);
        jButtonCancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelarCadastro.setDefaultCapable(false);
        jButtonCancelarCadastro.setFocusPainted(false);
        jButtonCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 599, 280, 34));

        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setBorderPainted(false);
        jButtonConfirmarCadastro.setContentAreaFilled(false);
        jButtonConfirmarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmarCadastro.setDefaultCapable(false);
        jButtonConfirmarCadastro.setFocusPainted(false);
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 550, 280, 33));

        jTextFieldPotenciaTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPotenciaTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPotenciaTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPotenciaTrator.setBorder(null);
        getContentPane().add(jTextFieldPotenciaTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 394, 271, 29));

        jTextFieldNomeTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeTrator.setBorder(null);
        jTextFieldNomeTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 135, 271, 29));

        jTextFieldMarcaTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarcaTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMarcaTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldMarcaTrator.setBorder(null);
        getContentPane().add(jTextFieldMarcaTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 218, 271, 29));

        jTextFieldAnoTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoTrator.setBorder(null);
        jTextFieldAnoTrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoTratorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 304, 271, 28));

        jTextFieldChassiTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiTrator.setBorder(null);
        getContentPane().add(jTextFieldChassiTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 395, 270, 29));

        jTextFieldCapacidadeDoTanqueTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueTrator.setBorder(null);
        getContentPane().add(jTextFieldCapacidadeDoTanqueTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 132, 270, 29));

        jTextFieldNumeroDeMarchasTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroDeMarchasTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNumeroDeMarchasTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNumeroDeMarchasTrator.setBorder(null);
        getContentPane().add(jTextFieldNumeroDeMarchasTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 218, 270, 29));

        jTextFieldQuantidadeDeRodasTrator.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuantidadeDeRodasTrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuantidadeDeRodasTrator.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidadeDeRodasTrator.setBorder(null);
        getContentPane().add(jTextFieldQuantidadeDeRodasTrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 303, 270, 29));

        jButtonVoltarATelaDeInicioVeiculo.setBorder(null);
        jButtonVoltarATelaDeInicioVeiculo.setBorderPainted(false);
        jButtonVoltarATelaDeInicioVeiculo.setContentAreaFilled(false);
        jButtonVoltarATelaDeInicioVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltarATelaDeInicioVeiculo.setDefaultCapable(false);
        jButtonVoltarATelaDeInicioVeiculo.setFocusPainted(false);
        jButtonVoltarATelaDeInicioVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarATelaDeInicioVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarATelaDeInicioVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 39, 25));

        jComboBoxEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ativo", "Inativo" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 260, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgTrator/img_tela_de_cadastro_de_trator.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro Cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonVoltarATelaDeInicioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed
        this.dispose();
        new TelaCRUDTrator().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        cadastrarTrator();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jTextFieldAnoTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoTratorActionPerformed

    }//GEN-LAST:event_jTextFieldAnoTratorActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jTextFieldNomeTratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeTratorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeTratorActionPerformed

    public void cadastrarTrator() {

        if (jTextFieldNomeTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do trator");
            return;
        }

        if (jTextFieldMarcaTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a marca do trator");
            return;
        }

        if (jTextFieldAnoTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do trator");
            return;
        }

        if (jTextFieldChassiTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do trator");
            return;
        }

        if (jTextFieldCapacidadeDoTanqueTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do tanque do trator");
            return;
        }

        if (jTextFieldNumeroDeMarchasTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o  número de marchas do trator");
            return;
        }

        if (jTextFieldQuantidadeDeRodasTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a quantidade de rodas do trator");
            return;
        }

        if (jTextFieldPotenciaTrator.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a potêcia do trator");
            return;
        }

        Calendar cal = Calendar.getInstance();

        nome = jTextFieldNomeTrator.getText();
        marca = jTextFieldMarcaTrator.getText();
        chassi = jTextFieldChassiTrator.getText();

        anoAtual = cal.get(Calendar.YEAR);

        try {
            ano = Integer.parseInt(jTextFieldAnoTrator.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O ano do trator deve ser numérico");
            return;
        }

        try {
            numeroDeMarchas = Integer.parseInt(jTextFieldNumeroDeMarchasTrator.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A quantidade de marchas do trator deve ser numérico");
            return;
        }

        try {
            quantidadeDeRodas = Integer.parseInt(jTextFieldQuantidadeDeRodasTrator.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A quantidade de rodas do trator deve ser numérico");
            return;
        }

        try {
            potenciaEmCv = Integer.parseInt(jTextFieldPotenciaTrator.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A potêcia do trator deve ser numérica");
            return;
        }

        try {
            capacidadeDoTanque = Double.valueOf(jTextFieldCapacidadeDoTanqueTrator.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A capacidade do tanque do trator deve ser numérica");
            return;
        }

        estado = jComboBoxEstado.getSelectedItem().toString();

        if (numeroDeMarchas <= 0) {
            JOptionPane.showMessageDialog(null, "Numero de marchas Inválida");
            return;
        }

        if (quantidadeDeRodas < 4) {
            JOptionPane.showMessageDialog(null, "Numero de rodas Inválida");
            return;
        }

        if (potenciaEmCv <= 0) {
            JOptionPane.showMessageDialog(null, "Potência Inválida");
            return;
        }

        if (ano > (anoAtual + 1) || ano < 1970) {
            JOptionPane.showMessageDialog(null, "Ano Inválido");
            return;
        }

        if (chassi.length() != 17) {
            JOptionPane.showMessageDialog(null, "Chassi Inválido");
            return;
        }

        if (capacidadeDoTanque <= 0) {
            JOptionPane.showMessageDialog(null, "Capacidade do tanque Inválida");
            return;
        }

        tipoVeiculo = "Trator";

        try {

            if (estado.equals("Ativo")) {
                estado = "A";
            } else if (estado.equals("Inativo")) {
                estado = "I";
            } else {
                JOptionPane.showMessageDialog(this, "Estado Inválido");
                return;
            }

            if (controleVeiculo.buscarTratorPorNome(nome) != null) {
                JOptionPane.showMessageDialog(this, "Já existe um trator com este nome\n"
                        + "Recomenda-se utilizar o nome + numero (ex: Trato 12)");
                return;
            }

            controleVeiculo.trator.setTipoVeiculo(tipoVeiculo);
            controleVeiculo.trator.setNomeVeiculo(nome);
            controleVeiculo.trator.setMarcaVeiculo(marca);
            controleVeiculo.trator.setAnoVeiculo(ano);
            controleVeiculo.trator.setChassiVeiculo(chassi);
            controleVeiculo.trator.setEstadoVeiculo(estado);
            controleVeiculo.trator.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanque);
            controleVeiculo.trator.setQuantidadeDeMarchas(numeroDeMarchas);
            controleVeiculo.trator.setQuantidadeDeRodas(quantidadeDeRodas);
            controleVeiculo.trator.setPotenciaEmCV(potenciaEmCv);

            String msg = controleVeiculo.cadastrarTrator(ControleVeiculo.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);
            limparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha tipo: " + ex);
        }

    }

    public void limparCampos() {
        jTextFieldAnoTrator.setText("");
        jTextFieldCapacidadeDoTanqueTrator.setText("");
        jTextFieldChassiTrator.setText("");
        jTextFieldMarcaTrator.setText("");
        jTextFieldNomeTrator.setText("");
        jTextFieldNumeroDeMarchasTrator.setText("");
        jTextFieldPotenciaTrator.setText("");
        jTextFieldQuantidadeDeRodasTrator.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaDeInicioVeiculo;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldAnoTrator;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueTrator;
    private javax.swing.JTextField jTextFieldChassiTrator;
    private javax.swing.JTextField jTextFieldMarcaTrator;
    private javax.swing.JTextField jTextFieldNomeTrator;
    private javax.swing.JTextField jTextFieldNumeroDeMarchasTrator;
    private javax.swing.JTextField jTextFieldPotenciaTrator;
    private javax.swing.JTextField jTextFieldQuantidadeDeRodasTrator;
    // End of variables declaration//GEN-END:variables
}
