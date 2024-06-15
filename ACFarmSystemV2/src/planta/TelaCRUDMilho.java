package planta;

import javax.swing.table.DefaultTableModel;
import planta.CRUDMilho.TelaDeAdicaoMilho;
import planta.CRUDMilho.TelaDeConsultaMilho;
import planta.CRUDMilho.TelaDeMovimentacaoMilho;
import planta.CRUDMilho.TelaDeRemocaoMilho;

public class TelaCRUDMilho extends javax.swing.JFrame {

    public TelaCRUDMilho() {
        initComponents();
        readJtableMilho();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSairDaTelaInicioPlanta = new javax.swing.JButton();
        jButtonAdicionarMilho = new javax.swing.JButton();
        jButtonMovimentacaoMilho = new javax.swing.JButton();
        jButtonRemoverMilho = new javax.swing.JButton();
        jButtonVerificarMilho = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMilho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSairDaTelaInicioPlanta.setBorder(null);
        jButtonSairDaTelaInicioPlanta.setBorderPainted(false);
        jButtonSairDaTelaInicioPlanta.setContentAreaFilled(false);
        jButtonSairDaTelaInicioPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDaTelaInicioPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDaTelaInicioPlantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDaTelaInicioPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jButtonAdicionarMilho.setBorder(null);
        jButtonAdicionarMilho.setBorderPainted(false);
        jButtonAdicionarMilho.setContentAreaFilled(false);
        jButtonAdicionarMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdicionarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdicionarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, 80, 65));

        jButtonMovimentacaoMilho.setBorder(null);
        jButtonMovimentacaoMilho.setBorderPainted(false);
        jButtonMovimentacaoMilho.setContentAreaFilled(false);
        jButtonMovimentacaoMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMovimentacaoMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMovimentacaoMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMovimentacaoMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 250, 110, 63));

        jButtonRemoverMilho.setBorder(null);
        jButtonRemoverMilho.setBorderPainted(false);
        jButtonRemoverMilho.setContentAreaFilled(false);
        jButtonRemoverMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoverMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoverMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 70, 70));

        jButtonVerificarMilho.setBorder(null);
        jButtonVerificarMilho.setBorderPainted(false);
        jButtonVerificarMilho.setContentAreaFilled(false);
        jButtonVerificarMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerificarMilho.setVerifyInputWhenFocusTarget(false);
        jButtonVerificarMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerificarMilho, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 494, 70, 70));

        jTableMilho.setBackground(new java.awt.Color(15, 42, 61));
        jTableMilho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableMilho.setForeground(new java.awt.Color(255, 255, 255));
        jTableMilho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Milho", "Fornecedor", "Altura da Planta", "Propriedade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableMilho.setGridColor(new java.awt.Color(255, 255, 255));
        jTableMilho.setRowHeight(30);
        jTableMilho.setSelectionForeground(new java.awt.Color(15, 42, 61));
        jTableMilho.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableMilho);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 680, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasPlanta/img_escolha_CRUD_milho.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairDaTelaInicioPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDaTelaInicioPlantaActionPerformed
        this.dispose();
        new TelaDeInicioPlanta().setVisible(true);
    }//GEN-LAST:event_jButtonSairDaTelaInicioPlantaActionPerformed

    private void jButtonAdicionarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarMilhoActionPerformed
        this.dispose();
        new TelaDeAdicaoMilho().setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarMilhoActionPerformed

    private void jButtonVerificarMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarMilhoActionPerformed
        this.dispose();
        new TelaDeConsultaMilho().setVisible(true);
    }//GEN-LAST:event_jButtonVerificarMilhoActionPerformed

    private void jButtonMovimentacaoMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMovimentacaoMilhoActionPerformed
        this.dispose();
        new TelaDeMovimentacaoMilho().setVisible(true);
    }//GEN-LAST:event_jButtonMovimentacaoMilhoActionPerformed

    private void jButtonRemoverMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverMilhoActionPerformed
        this.dispose();
        new TelaDeRemocaoMilho().setVisible(true);
    }//GEN-LAST:event_jButtonRemoverMilhoActionPerformed

    private void readJtableMilho() {
        DefaultTableModel modelo = (DefaultTableModel) jTableMilho.getModel();
        ControlePlanta controlePlanta = new ControlePlanta();

        for (Milho m : controlePlanta.readMilho()) {
            modelo.addRow(new Object[]{m.getIdMilho(), m.getNomeFornecedor(), m.getAlturaAtualDaPlanta(), m.getNomePropriedade()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarMilho;
    private javax.swing.JButton jButtonMovimentacaoMilho;
    private javax.swing.JButton jButtonRemoverMilho;
    private javax.swing.JButton jButtonSairDaTelaInicioPlanta;
    private javax.swing.JButton jButtonVerificarMilho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMilho;
    // End of variables declaration//GEN-END:variables
}
