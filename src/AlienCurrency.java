/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author evrob0095
 */
public class AlienCurrency extends javax.swing.JFrame {

    /**
     * Creates new form AlienCurrency
     */
    public AlienCurrency() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        blointointLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        subTitleLabel = new javax.swing.JLabel();
        vrobitsLabel = new javax.swing.JLabel();
        vrobitsTotal = new javax.swing.JLabel();
        clickwicksLabel = new javax.swing.JLabel();
        gazoontightLabel = new javax.swing.JLabel();
        frazointsLabel = new javax.swing.JLabel();
        drobzitsLabel = new javax.swing.JLabel();
        drobzitsTotal = new javax.swing.JLabel();
        clickwicksTotal = new javax.swing.JLabel();
        gazoontightTotal = new javax.swing.JLabel();
        frazointsTotal = new javax.swing.JLabel();
        blointointTotal = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blointointLabel.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        blointointLabel.setText("Blointoints:");
        jPanel1.add(blointointLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });
        jPanel1.add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 140, -1));

        titleLabel.setFont(new java.awt.Font("NimbusRomDCY", 0, 18)); // NOI18N
        titleLabel.setText("Bank De Alien");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, -1));

        subTitleLabel.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        subTitleLabel.setText("Enter total amount in vrobits");
        jPanel1.add(subTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        vrobitsLabel.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        vrobitsLabel.setText("Vrobits:");
        jPanel1.add(vrobitsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        vrobitsTotal.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        vrobitsTotal.setText("0");
        jPanel1.add(vrobitsTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        clickwicksLabel.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        clickwicksLabel.setText("Clickwicks:");
        jPanel1.add(clickwicksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        gazoontightLabel.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        gazoontightLabel.setText("Gazoontights:");
        jPanel1.add(gazoontightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        frazointsLabel.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        frazointsLabel.setText("Frazoints:");
        jPanel1.add(frazointsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        drobzitsLabel.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        drobzitsLabel.setText("Drobzits:");
        jPanel1.add(drobzitsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        drobzitsTotal.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        drobzitsTotal.setText("0");
        jPanel1.add(drobzitsTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        clickwicksTotal.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        clickwicksTotal.setText("0");
        jPanel1.add(clickwicksTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        gazoontightTotal.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        gazoontightTotal.setText("0");
        jPanel1.add(gazoontightTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        frazointsTotal.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        frazointsTotal.setText("0");
        jPanel1.add(frazointsTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        blointointTotal.setFont(new java.awt.Font("NimbusRomDCY", 0, 14)); // NOI18N
        blointointTotal.setText("0");
        jPanel1.add(blointointTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        int newInput = 0;
        int total = 0;
        boolean valid = false;
        while (valid == false) {
            try {
                newInput = Integer.parseInt(userInput.getText());
            }
            catch (NumberFormatException e) {
                subTitleLabel.setText("Enter an integer");
            }
            valid = true;
        }
        //Calculate
        total = newInput / 100000;
        drobzitsTotal.setText(String.valueOf(total));
        newInput = newInput % 100000;
        
        total = newInput / 50000;
        clickwicksTotal.setText(String.valueOf(total));
        newInput = newInput % 50000;
        
        total = newInput / 10000;
        gazoontightTotal.setText(String.valueOf(total));
        newInput = newInput % 10000;
        
        total = newInput / 1000;
        frazointsTotal.setText(String.valueOf(total));
        newInput = newInput % 1000;
        
        total = newInput / 500;
        blointointTotal.setText(String.valueOf(total));
        newInput = newInput % 500;
        
        vrobitsTotal.setText(String.valueOf(newInput));

        
        
    }//GEN-LAST:event_calculateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlienCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienCurrency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blointointLabel;
    private javax.swing.JLabel blointointTotal;
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel clickwicksLabel;
    private javax.swing.JLabel clickwicksTotal;
    private javax.swing.JLabel drobzitsLabel;
    private javax.swing.JLabel drobzitsTotal;
    private javax.swing.JLabel frazointsLabel;
    private javax.swing.JLabel frazointsTotal;
    private javax.swing.JLabel gazoontightLabel;
    private javax.swing.JLabel gazoontightTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel subTitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel vrobitsLabel;
    private javax.swing.JLabel vrobitsTotal;
    // End of variables declaration//GEN-END:variables
}
