
package RoomType;



import javax.swing.*;
import java.awt.*;

public class RoomFrame extends JFrame {

   
    
    ImageIcon logo = new ImageIcon("view.png");
    public RoomFrame() {
         super(" Room Types ");
        initComponents();
            Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height- getHeight()/2 );

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HotelRoomFramePanel = new javax.swing.JPanel();
        DeluxRoom = new javax.swing.JButton();
        FamilyRoom = new javax.swing.JButton();
        pleasechooseroomtype = new javax.swing.JLabel();
        Suite = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Menu");
        setBackground(new java.awt.Color(223, 236, 238));

        HotelRoomFramePanel.setBackground(new java.awt.Color(223, 236, 238));

        DeluxRoom.setBackground(new java.awt.Color(204, 204, 204));
        DeluxRoom.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        DeluxRoom.setForeground(new java.awt.Color(128, 128, 128));
        DeluxRoom.setText("Deluxe Room");
        DeluxRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeluxRoomActionPerformed(evt);
            }
        });

        FamilyRoom.setBackground(new java.awt.Color(204, 204, 204));
        FamilyRoom.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        FamilyRoom.setForeground(new java.awt.Color(128, 128, 128));
        FamilyRoom.setText("Family Room");
        FamilyRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyRoomActionPerformed(evt);
            }
        });

        pleasechooseroomtype.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        pleasechooseroomtype.setForeground(new java.awt.Color(104, 138, 143));
        pleasechooseroomtype.setText("Please choose the room type:");

        Suite.setBackground(new java.awt.Color(204, 204, 204));
        Suite.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        Suite.setForeground(new java.awt.Color(128, 128, 128));
        Suite.setText("Suite");
        Suite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuiteActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(128, 128, 128));
        jButton3.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/OOPproject/images/backk.png")); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/OOPproject/view.png")); // NOI18N

        javax.swing.GroupLayout HotelRoomFramePanelLayout = new javax.swing.GroupLayout(HotelRoomFramePanel);
        HotelRoomFramePanel.setLayout(HotelRoomFramePanelLayout);
        HotelRoomFramePanelLayout.setHorizontalGroup(
            HotelRoomFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HotelRoomFramePanelLayout.createSequentialGroup()
                .addGroup(HotelRoomFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HotelRoomFramePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(HotelRoomFramePanelLayout.createSequentialGroup()
                        .addGroup(HotelRoomFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HotelRoomFramePanelLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(pleasechooseroomtype))
                            .addGroup(HotelRoomFramePanelLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(HotelRoomFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DeluxRoom)
                                    .addGroup(HotelRoomFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Suite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FamilyRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(HotelRoomFramePanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        HotelRoomFramePanelLayout.setVerticalGroup(
            HotelRoomFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HotelRoomFramePanelLayout.createSequentialGroup()
                .addGroup(HotelRoomFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HotelRoomFramePanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3))
                    .addGroup(HotelRoomFramePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pleasechooseroomtype)
                .addGap(27, 27, 27)
                .addComponent(DeluxRoom)
                .addGap(18, 18, 18)
                .addComponent(FamilyRoom)
                .addGap(18, 18, 18)
                .addComponent(Suite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HotelRoomFramePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HotelRoomFramePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeluxRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeluxRoomActionPerformed
       
        this.dispose();
        DeluxeType D = new DeluxeType();
        D.setVisible(true);
        
    }//GEN-LAST:event_DeluxRoomActionPerformed

    private void FamilyRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyRoomActionPerformed
        
        this.dispose();
        FamilyType F = new FamilyType();
        F.setVisible(true);
    }//GEN-LAST:event_FamilyRoomActionPerformed

    private void SuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuiteActionPerformed
       
        this.dispose();
        SuiteType S = new SuiteType();
        S.setVisible(true);
    }//GEN-LAST:event_SuiteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        this.dispose();
        CustomerInterface A = new CustomerInterface();
        A.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(RoomFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeluxRoom;
    private javax.swing.JButton FamilyRoom;
    private javax.swing.JPanel HotelRoomFramePanel;
    private javax.swing.JButton Suite;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel pleasechooseroomtype;
    // End of variables declaration//GEN-END:variables
}
