package RoomType;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class CustomerLogin extends javax.swing.JFrame implements ActionListener   {

   
    public CustomerLogin() {
         super(" Customer Login ");
        initComponents();
            Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height- getHeight()/2 );
    }
  
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserN = new javax.swing.JTextField();
        LogPass = new javax.swing.JPasswordField();
        BackButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        LogInButton2 = new javax.swing.JButton();

        LogInButton1.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        LogInButton1.setForeground(new java.awt.Color(36, 84, 100));
        LogInButton1.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/FinalJava_1/images/log-in-menu.png")); // NOI18N
        LogInButton1.setText("Log In");
        LogInButton1.setBorder(null);
        LogInButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(223, 236, 238));

        jLabel1.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 108, 124));
        jLabel1.setText("If You Have An Acount ");

        jLabel2.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 108, 124));
        jLabel2.setText("Please Enter Your Information To Log In");

        jLabel3.setFont(new java.awt.Font("Montserrat", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 171, 185));
        jLabel3.setText("USERNAME    :");

        jLabel4.setFont(new java.awt.Font("Montserrat", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(91, 171, 185));
        jLabel4.setText("PASSWORD  :");

        UserN.setForeground(new java.awt.Color(128, 128, 128));
        UserN.setPreferredSize(new java.awt.Dimension(131, 26));
        UserN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNActionPerformed(evt);
            }
        });

        LogPass.setForeground(new java.awt.Color(128, 128, 128));

        BackButton.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        BackButton.setForeground(new java.awt.Color(75, 98, 102));
        BackButton.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/FinalJava_1/images/backk.png")); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BackButton.setBorderPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/FinalJava_1/DarkEmptyLogo.png")); // NOI18N

        LogInButton.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(36, 84, 100));
        LogInButton.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/FinalJava_1/images/log-in-menu.png")); // NOI18N
        LogInButton.setText("Log In");
        LogInButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LogInButton.setBorderPainted(false);
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        LogInButton2.setFont(new java.awt.Font("Montserrat", 3, 13)); // NOI18N
        LogInButton2.setForeground(new java.awt.Color(55, 108, 124));
        LogInButton2.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/NetBeansProjects/FinalJava_1/images/log-in-menu.png")); // NOI18N
        LogInButton2.setText("Log in as Admin");
        LogInButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LogInButton2.setBorderPainted(false);
        LogInButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogInButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UserN, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LogPass, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UserN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LogPass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogInButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNActionPerformed
       
       
    }//GEN-LAST:event_UserNActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        
        PreparedStatement ps;
        ResultSet rs;
        
        String User_name = UserN.getText();
        String pass = String.valueOf(LogPass.getPassword());
        
        String query = "SELECT *  FROM `HotelDataBase`.`user` WHERE `User_Name` =? AND `Password` =? ";
  


        try {
            ps = MySQLConnection.getConnection().prepareStatement(query);
            ps.setString(1,User_name);
            ps.setString(2,pass);
            rs = ps.executeQuery();
            if (rs.next()){
               this.dispose();
               CustomerInterface ad = new CustomerInterface();
               ad.setVisible(true);
               ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid User name or Password.","Invalid Information", JOptionPane.ERROR_MESSAGE);
            }
   
        } catch (SQLException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
        this.dispose();
        WelcomePage Welcome= new WelcomePage();

        Welcome.setVisible(true);
        Welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }//GEN-LAST:event_BackButtonActionPerformed

    private void LogInButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButton1ActionPerformed
       
    }//GEN-LAST:event_LogInButton1ActionPerformed

    private void LogInButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButton2ActionPerformed
        
        this.dispose();
        AdminLogin a= new AdminLogin();
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_LogInButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton LogInButton;
    private javax.swing.JButton LogInButton1;
    private javax.swing.JButton LogInButton2;
    private javax.swing.JPasswordField LogPass;
    private javax.swing.JTextField UserN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
