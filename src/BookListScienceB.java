
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author success
 */
public class BookListScienceB extends javax.swing.JFrame {

    /**
     * Creates new form BookListScienceB
     */
    public BookListScienceB() {
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

        jLabel1 = new javax.swing.JLabel();
        engb = new javax.swing.JCheckBox();
        Smathb = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        biob = new javax.swing.JCheckBox();
        phyb = new javax.swing.JCheckBox();
        beng = new javax.swing.JTextField();
        Sbmath = new javax.swing.JTextField();
        bbio = new javax.swing.JTextField();
        bphy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Book List Of Science");

        engb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        engb.setText("English");
        engb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                engbMouseClicked(evt);
            }
        });

        Smathb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Smathb.setText("Math");
        Smathb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SmathbMouseClicked(evt);
            }
        });

        jButton2.setText("Enter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        biob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        biob.setText("Biology");
        biob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                biobMouseClicked(evt);
            }
        });

        phyb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phyb.setText("Physics");
        phyb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phybMouseClicked(evt);
            }
        });

        beng.setEditable(false);
        beng.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        beng.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Sbmath.setEditable(false);
        Sbmath.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Sbmath.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bbio.setEditable(false);
        bbio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bbio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bphy.setEditable(false);
        bphy.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bphy.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phyb)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(bphy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(engb)
                            .addComponent(Smathb)
                            .addComponent(biob))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bbio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sbmath, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beng, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(224, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beng, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Smathb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sbmath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phyb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bphy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String a = beng.getText();
        String b = Sbmath.getText();
        String c = bbio.getText();
        String d = bphy.getText();
        
        if ((a.isEmpty()) && (b.isEmpty()) && (c.isEmpty()) && (d.isEmpty())){
            JOptionPane.showMessageDialog(null, "Please select a one", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
           new BorrowDateS().setVisible(true);
        dispose(); 
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void engbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_engbMouseClicked
        // TODO add your handling code here:
        if (engb.isSelected()){
            beng.setText("ENGLISH");
        }
        else
            beng.setText(null);
    }//GEN-LAST:event_engbMouseClicked

    private void SmathbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SmathbMouseClicked
        // TODO add your handling code here:
        if (Smathb.isSelected()){
            Sbmath.setText("MATH");
        }
        else
            Sbmath.setText(null);
    }//GEN-LAST:event_SmathbMouseClicked

    private void biobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biobMouseClicked
        // TODO add your handling code here:
        if (biob.isSelected()){
            bbio.setText("BIOOLOGY");
        }
        else
            bbio.setText(null);
    }//GEN-LAST:event_biobMouseClicked

    private void phybMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phybMouseClicked
        // TODO add your handling code here:
        if (phyb.isSelected()){
            bphy.setText("PHYSICS");
        }
        else
            bphy.setText(null);
    }//GEN-LAST:event_phybMouseClicked

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
            java.util.logging.Logger.getLogger(BookListScienceB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookListScienceB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookListScienceB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookListScienceB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookListScienceB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Sbmath;
    private javax.swing.JCheckBox Smathb;
    public static javax.swing.JTextField bbio;
    public static javax.swing.JTextField beng;
    private javax.swing.JCheckBox biob;
    public static javax.swing.JTextField bphy;
    private javax.swing.JCheckBox engb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox phyb;
    // End of variables declaration//GEN-END:variables
}
