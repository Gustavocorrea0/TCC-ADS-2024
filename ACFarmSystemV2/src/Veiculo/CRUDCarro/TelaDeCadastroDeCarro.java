package Veiculo.CRUDCarro;

import Veiculo.ControleVeiculo;
import Veiculo.TelaCRUDCarro;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class TelaDeCadastroDeCarro extends javax.swing.JFrame {

    private final ControleVeiculo controleVeiculo = new ControleVeiculo();
    private String estado;
    private String tipoVeiculo = "Carro";

    private String nome;
    private String marca;
    private String chassi;

    private int anoAtual;
    private int ano;

    private Double capacidadeDoTanque;
    private String cor;
    private String placa;
    private int quilometragem;
    private String msg;

    public TelaDeCadastroDeCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jButtonCancelarCadastro = new javax.swing.JButton();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jTextFieldNomeCarro = new javax.swing.JTextField();
        jTextFieldAnoCarro = new javax.swing.JTextField();
        jTextFieldChassiCarro = new javax.swing.JTextField();
        jTextFieldPlacaCarro = new javax.swing.JTextField();
        jTextFieldCapacidadeDoTanqueCarro = new javax.swing.JTextField();
        jTextFieldCorCarro = new javax.swing.JTextField();
        jTextFieldQuilometragemCarro = new javax.swing.JTextField();
        jButtonVoltarATelaDeInicioVeiculo = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jComboBoxMarcas = new javax.swing.JComboBox<>();
        jLabelFundoCadastroDeVeiculo = new javax.swing.JLabel();

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
        getContentPane().add(jButtonCancelarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 597, 280, 34));

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
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 547, 280, 34));

        jTextFieldNomeCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNomeCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeCarro.setBorder(null);
        jTextFieldNomeCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 133, 271, 29));

        jTextFieldAnoCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnoCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldAnoCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldAnoCarro.setBorder(null);
        jTextFieldAnoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAnoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 319, 271, 29));

        jTextFieldChassiCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldChassiCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldChassiCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldChassiCarro.setBorder(null);
        jTextFieldChassiCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChassiCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldChassiCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 413, 270, 29));

        jTextFieldPlacaCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPlacaCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldPlacaCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPlacaCarro.setBorder(null);
        jTextFieldPlacaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacaCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPlacaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 316, 271, 29));

        jTextFieldCapacidadeDoTanqueCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCapacidadeDoTanqueCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCapacidadeDoTanqueCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCapacidadeDoTanqueCarro.setBorder(null);
        jTextFieldCapacidadeDoTanqueCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacidadeDoTanqueCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCapacidadeDoTanqueCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 232, 270, 29));

        jTextFieldCorCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCorCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldCorCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCorCarro.setBorder(null);
        jTextFieldCorCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCorCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 132, 271, 29));

        jTextFieldQuilometragemCarro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldQuilometragemCarro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldQuilometragemCarro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldQuilometragemCarro.setBorder(null);
        jTextFieldQuilometragemCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuilometragemCarroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldQuilometragemCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 413, 271, 29));

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
        getContentPane().add(jButtonVoltarATelaDeInicioVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, 39, 25));

        jComboBoxEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Ativo", "Inativo" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 520, 280, 30));

        jComboBoxMarcas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Fiat", "Volkswagen", "Chevrolet", "Hyundai", "Toyota", "JEEP", "Renault", "Honda", "Dodge", "Volvo", "Outro" }));
        jComboBoxMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 230, 280, 30));

        jLabelFundoCadastroDeVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasVeiculo/imgCarro/img_tela_de_cadastro_de_carro.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadastroDeVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastro Cancelado");
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarCadastroActionPerformed

    private void jButtonVoltarATelaDeInicioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed
        this.dispose();
        new TelaCRUDCarro().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarATelaDeInicioVeiculoActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed

        cadastrarCarro();
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jTextFieldAnoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoCarroActionPerformed

    }//GEN-LAST:event_jTextFieldAnoCarroActionPerformed

    private void jTextFieldPlacaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacaCarroActionPerformed

    }//GEN-LAST:event_jTextFieldPlacaCarroActionPerformed

    private void jTextFieldCapacidadeDoTanqueCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeDoTanqueCarroActionPerformed

    }//GEN-LAST:event_jTextFieldCapacidadeDoTanqueCarroActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed

    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jTextFieldCorCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorCarroActionPerformed

    }//GEN-LAST:event_jTextFieldCorCarroActionPerformed

    private void jTextFieldQuilometragemCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuilometragemCarroActionPerformed

    }//GEN-LAST:event_jTextFieldQuilometragemCarroActionPerformed

    private void jComboBoxMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcasActionPerformed

    }//GEN-LAST:event_jComboBoxMarcasActionPerformed

    private void jTextFieldNomeCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCarroActionPerformed

    }//GEN-LAST:event_jTextFieldNomeCarroActionPerformed

    private void jTextFieldChassiCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChassiCarroActionPerformed

    }//GEN-LAST:event_jTextFieldChassiCarroActionPerformed

    private void limparCampos() {
        jTextFieldAnoCarro.setText("");
        jTextFieldCapacidadeDoTanqueCarro.setText("");
        jTextFieldChassiCarro.setText("");
        jTextFieldCorCarro.setText("");
        jTextFieldNomeCarro.setText("");
        jTextFieldPlacaCarro.setText("");
        jTextFieldQuilometragemCarro.setText("");
    }

    public void cadastrarCarro() {

        if (jTextFieldNomeCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do carro");
            return;
        }

        if (jTextFieldAnoCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o ano do carro");
            return;
        }

        if (jTextFieldChassiCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira o chassi do carro");
            return;
        }

        if (jTextFieldCorCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a cor do carro");
            return;
        }

        if (jTextFieldCapacidadeDoTanqueCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a capacidade do tanque do carro");
            return;
        }

        if (jTextFieldPlacaCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a placa do carro");
            return;
        }

        if (jTextFieldQuilometragemCarro.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira a quilometragem do carro");
            return;
        }

        Calendar cal = Calendar.getInstance();

        nome = jTextFieldNomeCarro.getText();
        marca = jComboBoxMarcas.getSelectedItem().toString();
        chassi = jTextFieldChassiCarro.getText();
        cor = jTextFieldCorCarro.getText();
        placa = jTextFieldPlacaCarro.getText().toUpperCase();

        
        
        try {
            quilometragem = Integer.parseInt(jTextFieldQuilometragemCarro.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A quilometragem deve ser numérica");
            return;
        }

        try {
            capacidadeDoTanque = Double.valueOf(jTextFieldCapacidadeDoTanqueCarro.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A capacidade do tanque deve ser numérica");
            return;
        }

        try {
            ano = Integer.parseInt(jTextFieldAnoCarro.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O ano deve ser numérico");
            return;
        }

        anoAtual = cal.get(Calendar.YEAR);

        estado = jComboBoxEstado.getSelectedItem().toString();

        if (placa.length() != 7) {
            JOptionPane.showMessageDialog(null, "Placa Inválida, 7 digitos sem traço");
            return;
        }

        if (quilometragem < 1) {
            JOptionPane.showMessageDialog(null, "Quilometragem Inválida");
            return;
        }

        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
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

        if (marca.equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Selecione a marca");
            return;
        }

        tipoVeiculo = "Carro";

        if (estado.equals("Ativo")) {
            estado = "A";
        } else if (estado.equals("Inativo")) {
            estado = "I";
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o estado");
            return;
        }

        try {

            controleVeiculo.carro.setTipoVeiculo(tipoVeiculo);
            controleVeiculo.carro.setNomeVeiculo(nome);
            controleVeiculo.carro.setMarcaVeiculo(marca);
            controleVeiculo.carro.setAnoVeiculo(ano);
            controleVeiculo.carro.setChassiVeiculo(chassi);
            controleVeiculo.carro.setEstadoVeiculo(estado);
            controleVeiculo.carro.setCapacidadeDoTanqueDeCombustivel(capacidadeDoTanque);
            controleVeiculo.carro.setPlacaCarro(placa);
            controleVeiculo.carro.setCorCarro(cor);
            controleVeiculo.carro.setQuilometragemCarro(quilometragem);
            
            if (controleVeiculo.buscarCarroPorNome(nome) != null) {
                JOptionPane.showMessageDialog(this, "Já existe um carro com este nome\n"
                        + "Recomenda-se utilizar o nome + numero (Exemplo: Hilux 12)");
                return;
            }
            
            if (controleVeiculo.buscarCarroPorPlaca(nome) != null) {
                JOptionPane.showMessageDialog(this, "Já existe um carro com esta placa");
                return;
            }
 
            msg = controleVeiculo.cadastrarCarro(ControleVeiculo.INCLUSAO);
            JOptionPane.showMessageDialog(this, msg);

            limparCampos();

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Falha tipo: " + ex.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JButton jButtonCancelarCadastro;
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JButton jButtonVoltarATelaDeInicioVeiculo;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxMarcas;
    private javax.swing.JLabel jLabelFundoCadastroDeVeiculo;
    private javax.swing.JTextField jTextFieldAnoCarro;
    private javax.swing.JTextField jTextFieldCapacidadeDoTanqueCarro;
    private javax.swing.JTextField jTextFieldChassiCarro;
    private javax.swing.JTextField jTextFieldCorCarro;
    private javax.swing.JTextField jTextFieldNomeCarro;
    private javax.swing.JTextField jTextFieldPlacaCarro;
    private javax.swing.JTextField jTextFieldQuilometragemCarro;
    // End of variables declaration//GEN-END:variables
}
