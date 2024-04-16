package acfarmsystemv2.telaDeInicio;

public class TelaDeEsterEgg extends javax.swing.JFrame {

    public TelaDeEsterEgg() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltarAoLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonVoltarAoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_tela_desenvolvedores.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoLoginActionPerformed
        this.dispose();
        new TelaDeInicio().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarAoLoginActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltarAoLogin;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
