package RoomType;



import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileNameExtensionFilter;




public class AddRoom extends javax.swing.JFrame {

    String TypeRoom;
    
    
    public AddRoom() {
         super(" Add Room ");
   JRadioButton DeluxeRoomButton = new JRadioButton("Deluxe");
    DeluxeRoomButton.setActionCommand("Deluxe");
    JRadioButton FamilyRoomButton = new JRadioButton("Family");
    FamilyRoomButton.setActionCommand("Family");
    JRadioButton SuiteButton = new JRadioButton("Suite");
    SuiteButton.setActionCommand("Suite");

    ButtonGroup RoomTypeGroup= new ButtonGroup();
    RoomTypeGroup.add(DeluxeRoomButton);
    RoomTypeGroup.add(FamilyRoomButton);
    RoomTypeGroup.add(SuiteButton);
    
       

        initComponents();
            Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height- getHeight()/2 );
    }

        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RoomTypeGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        addroom = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        DeluxeRoomButton = new javax.swing.JRadioButton();
        FamilyRoomButton = new javax.swing.JRadioButton();
        SuiteButton = new javax.swing.JRadioButton();
        AddPhotoButton = new javax.swing.JButton();
        PriceRoom = new javax.swing.JTextField();
        IDRoom = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddRoom");

        jPanel1.setBackground(new java.awt.Color(223, 236, 238));

        addroom.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        addroom.setForeground(new java.awt.Color(73, 132, 141));
        addroom.setText("   Add A Room");

        menu.setFont(new java.awt.Font("Montserrat", 2, 16)); // NOI18N
        menu.setForeground(new java.awt.Color(73, 132, 141));
        menu.setText("Menu:");

        RoomTypeGroup.add(DeluxeRoomButton);
        DeluxeRoomButton.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        DeluxeRoomButton.setForeground(new java.awt.Color(36, 84, 100));
        DeluxeRoomButton.setText("Deluxe Room");
        DeluxeRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeluxeRoomButtonActionPerformed(evt);
            }
        });

        RoomTypeGroup.add(FamilyRoomButton);
        FamilyRoomButton.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        FamilyRoomButton.setForeground(new java.awt.Color(36, 84, 100));
        FamilyRoomButton.setText("Family Room");
        FamilyRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyRoomButtonActionPerformed(evt);
            }
        });

        RoomTypeGroup.add(SuiteButton);
        SuiteButton.setFont(new java.awt.Font("Montserrat", 2, 14)); // NOI18N
        SuiteButton.setForeground(new java.awt.Color(36, 84, 100));
        SuiteButton.setText("Suite ");
        SuiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuiteButtonActionPerformed(evt);
            }
        });

        AddPhotoButton.setBackground(new java.awt.Color(204, 204, 204));
        AddPhotoButton.setForeground(new java.awt.Color(153, 153, 153));
        AddPhotoButton.setText("CLICK HERE TO ADD A PHOTO");
        AddPhotoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPhotoButtonActionPerformed(evt);
            }
        });

        PriceRoom.setForeground(new java.awt.Color(153, 153, 153));
        PriceRoom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PriceRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceRoomActionPerformed(evt);
            }
        });

        IDRoom.setForeground(new java.awt.Color(153, 153, 153));
        IDRoom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IDRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDRoomActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Montserrat", 2, 13)); // NOI18N
        AddButton.setForeground(new java.awt.Color(73, 132, 141));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(73, 132, 141));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(223, 236, 238));
        jLabel3.setText("BACK");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Montserrat", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ENTER THE PRICE HERE : ");

        jLabel2.setFont(new java.awt.Font("Montserrat", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("   ENTER THE ROOM ID HERE :  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(menu)
                        .addGap(28, 28, 28)
                        .addComponent(DeluxeRoomButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FamilyRoomButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SuiteButton)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addroom, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(AddButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(IDRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PriceRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel2))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(addroom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SuiteButton)
                    .addComponent(FamilyRoomButton)
                    .addComponent(DeluxeRoomButton)
                    .addComponent(menu))
                .addGap(10, 10, 10)
                .addComponent(AddPhotoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PriceRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(IDRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddButton)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeluxeRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeluxeRoomButtonActionPerformed
        
    }//GEN-LAST:event_DeluxeRoomButtonActionPerformed

    private void SuiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuiteButtonActionPerformed
       
    }//GEN-LAST:event_SuiteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
       
        String room_id = String.valueOf(IDRoom.getText());
        String room_price = String.valueOf(PriceRoom.getText());
        
        if(DeluxeRoomButton.isSelected()){TypeRoom="Deluxe";}
        else if(FamilyRoomButton.isSelected()){TypeRoom="Family";}
        else if(SuiteButton.isSelected()){TypeRoom="Suite";}
               
        if(room_id.equals("")){ JOptionPane.showMessageDialog(null,"Room ID Is Missing.","ERRORR",JOptionPane.ERROR_MESSAGE);  }
        else  if(room_price.equals("")){ JOptionPane.showMessageDialog(null,"Room Price Is Miising","ERRORR",JOptionPane.ERROR_MESSAGE); }
        else  {  
        
        PreparedStatement ps;
        
        String query = " INSERT INTO `HotelDataBase`.`room` (`Room_ID`,`Room_Type`,`Room_Price`) VALUES (?,?,?)"  ;

        try {
            
            ps = MySQLConnection.getConnection().prepareStatement(query);
            ps.setString(1, room_id);
            ps.setString(2, TypeRoom);
            ps.setString(3, room_price);
            
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"New Room Addedd ");
            }
            
         
            
         } catch (SQLException ex) {
             
            Logger.getLogger(signupp.class.getName()).log(Level.SEVERE, null, ex);
        }}
                   
    }//GEN-LAST:event_AddButtonActionPerformed

    private void PriceRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceRoomActionPerformed
         

        
    }//GEN-LAST:event_PriceRoomActionPerformed

    private void AddPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPhotoButtonActionPerformed
       
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        
        //file extension
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Images","jpg","png");
        filec.addChoosableFileFilter(fileFilter);
        int fileState = filec.showSaveDialog(null);
        
        if(fileState == JFileChooser.APPROVE_OPTION){
            File selectedFile = filec.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            photo.setIcon(new ImageIcon(path));
        }
        else if (fileState == JFileChooser.CANCEL_OPTION){
            System.out.println("No image selected");
        }
       
    }//GEN-LAST:event_AddPhotoButtonActionPerformed

    private void FamilyRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyRoomButtonActionPerformed
        
    }//GEN-LAST:event_FamilyRoomButtonActionPerformed

    private void IDRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDRoomActionPerformed
     
    }//GEN-LAST:event_IDRoomActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
       this.dispose();
       Admin__Interface a= new Admin__Interface();
       a.setVisible(true);
       a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }//GEN-LAST:event_jLabel3MouseClicked

   
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
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoom().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddPhotoButton;
    private javax.swing.JRadioButton DeluxeRoomButton;
    private javax.swing.JRadioButton FamilyRoomButton;
    private javax.swing.JTextField IDRoom;
    private javax.swing.JTextField PriceRoom;
    private javax.swing.ButtonGroup RoomTypeGroup;
    private javax.swing.JRadioButton SuiteButton;
    private javax.swing.JLabel addroom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables

    private  class RadioHandler implements ItemListener  {

      
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(DeluxeRoomButton.isSelected()){
                
            }
            else 
                  if(FamilyRoomButton.isSelected()){
                  }
                  else 
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
