
package RoomType;

import java.awt.Dimension;
import java.awt.Toolkit;


public class SuiteType extends javax.swing.JFrame {

    public SuiteType() {
        super(" Suite Rooms ");
        initComponents();
            Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height- getHeight()/2 );
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Sroom1 = new javax.swing.JButton();
        Sroom2 = new javax.swing.JButton();
        SuiteTextLabelCityView = new javax.swing.JLabel();
        SuiteTextLabel1 = new javax.swing.JLabel();
        SuiteTextLabelOcaenView = new javax.swing.JLabel();
        SuiteTextLabel3 = new javax.swing.JLabel();
        Suite = new javax.swing.JLabel();
        Suiteclick = new javax.swing.JLabel();
        SuiteTextLabel4 = new javax.swing.JLabel();
        SuiteTextLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(223, 236, 238));

        Sroom1.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/OOPproject/images/CitySuite5.png")); // NOI18N
        Sroom1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Sroom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sroom1ActionPerformed(evt);
            }
        });

        Sroom2.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/OOPproject/images/SuiteCity2.png")); // NOI18N
        Sroom2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Sroom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sroom2ActionPerformed(evt);
            }
        });

        SuiteTextLabelCityView.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        SuiteTextLabelCityView.setForeground(new java.awt.Color(55, 108, 124));
        SuiteTextLabelCityView.setText("City View");

        SuiteTextLabel1.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        SuiteTextLabel1.setForeground(new java.awt.Color(55, 108, 124));
        SuiteTextLabel1.setText("extra large double");

        SuiteTextLabelOcaenView.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        SuiteTextLabelOcaenView.setForeground(new java.awt.Color(55, 108, 124));
        SuiteTextLabelOcaenView.setText("Ocean View");

        SuiteTextLabel3.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        SuiteTextLabel3.setForeground(new java.awt.Color(55, 108, 124));
        SuiteTextLabel3.setText("extra large double");

        Suite.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        Suite.setForeground(new java.awt.Color(55, 108, 124));
        Suite.setText("Suites  ");

        Suiteclick.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        Suiteclick.setForeground(new java.awt.Color(104, 138, 143));
        Suiteclick.setText("please click on the picture ");

        SuiteTextLabel4.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        SuiteTextLabel4.setForeground(new java.awt.Color(55, 108, 124));
        SuiteTextLabel4.setText("extra large double");

        SuiteTextLabel5.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        SuiteTextLabel5.setForeground(new java.awt.Color(55, 108, 124));
        SuiteTextLabel5.setText("extra large double");

        jPanel3.setBackground(new java.awt.Color(73, 132, 141));

        jLabel1.setBackground(new java.awt.Color(223, 236, 238));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 236, 238));
        jLabel1.setText("BACK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Suite, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sroom1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sroom2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SuiteTextLabelCityView)
                            .addComponent(SuiteTextLabelOcaenView)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SuiteTextLabel4)
                                    .addComponent(SuiteTextLabel1)))
                            .addComponent(SuiteTextLabel3)
                            .addComponent(SuiteTextLabel5))
                        .addGap(0, 34, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Suiteclick)
                .addGap(114, 114, 114))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Suite, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Suiteclick)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sroom1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(SuiteTextLabelCityView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SuiteTextLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SuiteTextLabel4)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sroom2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SuiteTextLabelOcaenView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SuiteTextLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SuiteTextLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void Sroom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sroom1ActionPerformed
        
        this.dispose();
        RDesSuite A = new RDesSuite();
        A.setVisible(true);
    }//GEN-LAST:event_Sroom1ActionPerformed

    private void Sroom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sroom2ActionPerformed
       
        this.dispose();
        RDesSuite A = new RDesSuite();
        A.setVisible(true);
    }//GEN-LAST:event_Sroom2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
        this.dispose();
        RoomFrame A = new RoomFrame();
        A.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    
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
            java.util.logging.Logger.getLogger(SuiteType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuiteType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuiteType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuiteType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuiteType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sroom1;
    private javax.swing.JButton Sroom2;
    private javax.swing.JLabel Suite;
    private javax.swing.JLabel SuiteTextLabel1;
    private javax.swing.JLabel SuiteTextLabel3;
    private javax.swing.JLabel SuiteTextLabel4;
    private javax.swing.JLabel SuiteTextLabel5;
    private javax.swing.JLabel SuiteTextLabelCityView;
    private javax.swing.JLabel SuiteTextLabelOcaenView;
    private javax.swing.JLabel Suiteclick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
