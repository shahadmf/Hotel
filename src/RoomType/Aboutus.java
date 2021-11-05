
package RoomType;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Aboutus extends javax.swing.JFrame {

   
    public Aboutus() {
         super(" About Us ");
        initComponents();
            Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height- getHeight()/2 );
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ucanfindus = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aboutus = new javax.swing.JLabel();
        locations = new javax.swing.JLabel();
        thebeachiscalling = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phonenum = new javax.swing.JLabel();
        hotelemail = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("About Us");

        jPanel1.setBackground(new java.awt.Color(223, 236, 238));

        ucanfindus.setBackground(new java.awt.Color(40, 64, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("You can Find Us");

        javax.swing.GroupLayout ucanfindusLayout = new javax.swing.GroupLayout(ucanfindus);
        ucanfindus.setLayout(ucanfindusLayout);
        ucanfindusLayout.setHorizontalGroup(
            ucanfindusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ucanfindusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        ucanfindusLayout.setVerticalGroup(
            ucanfindusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ucanfindusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aboutus.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        aboutus.setForeground(new java.awt.Color(75, 98, 102));
        aboutus.setText("ABOUT US");

        locations.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        locations.setForeground(new java.awt.Color(75, 98, 102));
        locations.setText("⬤ Mauritius  ⬤Santorini");

        thebeachiscalling.setFont(new java.awt.Font("Surfer Bay", 0, 36)); // NOI18N
        thebeachiscalling.setForeground(new java.awt.Color(73, 132, 141));
        thebeachiscalling.setText("The beach  is calling");

        phonenum.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        phonenum.setForeground(new java.awt.Color(75, 98, 102));
        phonenum.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/OOPproject/images/phne.png")); // NOI18N
        phonenum.setText("0500000005");

        hotelemail.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        hotelemail.setForeground(new java.awt.Color(75, 98, 102));
        hotelemail.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/OOPproject/images/emails.png")); // NOI18N
        hotelemail.setText("H@hotels.eu");

        backbutton.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/OOPproject/images/backk.png")); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(aboutus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ucanfindus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(locations))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(thebeachiscalling))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hotelemail)
                            .addComponent(phonenum)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(backbutton)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(aboutus)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ucanfindus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(locations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(thebeachiscalling)
                .addGap(26, 26, 26)
                .addComponent(phonenum)
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hotelemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(backbutton)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        
       this.dispose();
       WelcomePage a= new WelcomePage();
       a.setVisible(true);
       a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Aboutus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aboutus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aboutus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aboutus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aboutus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutus;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel hotelemail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locations;
    private javax.swing.JLabel phonenum;
    private javax.swing.JLabel thebeachiscalling;
    private javax.swing.JPanel ucanfindus;
    // End of variables declaration//GEN-END:variables
}
