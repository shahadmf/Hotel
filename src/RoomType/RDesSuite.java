
package RoomType;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class RDesSuite extends javax.swing.JFrame {

   
    public RDesSuite() {
         super(" Suite Room Description ");
        initComponents();
            Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height- getHeight()/2 );
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdpanelbg = new javax.swing.JPanel();
        darkpanel = new javax.swing.JPanel();
        darklogo = new javax.swing.JLabel();
        roomdescription = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        destext = new javax.swing.JTextPane();
        pricenum = new javax.swing.JLabel();
        bookresbutton = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdpanelbg.setBackground(new java.awt.Color(223, 236, 238));

        darkpanel.setBackground(new java.awt.Color(40, 64, 70));

        darklogo.setBackground(new java.awt.Color(255, 255, 255));
        darklogo.setForeground(new java.awt.Color(40, 64, 70));
        darklogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        darklogo.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/Desktop/THEHOTEL/LogoDARK.png")); // NOI18N
        darklogo.setAlignmentY(0.0F);
        darklogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        roomdescription.setFont(new java.awt.Font("Montserrat", 3, 18)); // NOI18N
        roomdescription.setForeground(new java.awt.Color(223, 236, 238));
        roomdescription.setText("Room Description");

        javax.swing.GroupLayout darkpanelLayout = new javax.swing.GroupLayout(darkpanel);
        darkpanel.setLayout(darkpanelLayout);
        darkpanelLayout.setHorizontalGroup(
            darkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, darkpanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(roomdescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(darklogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        darkpanelLayout.setVerticalGroup(
            darkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(darklogo, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(darkpanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(roomdescription)
                .addContainerGap())
        );

        price.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        price.setForeground(new java.awt.Color(55, 108, 124));
        price.setText("Price");

        desc.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        desc.setForeground(new java.awt.Color(55, 108, 124));
        desc.setText("Description");

        jScrollPane1.setBackground(new java.awt.Color(223, 236, 238));

        destext.setEditable(false);
        destext.setBackground(new java.awt.Color(223, 236, 238));
        destext.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        destext.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        destext.setForeground(new java.awt.Color(128, 128, 128));
        destext.setText("Luxury Suite rooms at H hotel feature a modern design and modern bathrooms with a shower cabin, and all offer free Wi-Fi, satellite TV with satellite channels and a work desk. Some rooms have an outdoor hot tub or private pool along side with roof top and beach view.");
        destext.setCaretColor(new java.awt.Color(153, 153, 153));
        destext.setEnabled(false);
        jScrollPane1.setViewportView(destext);

        pricenum.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        pricenum.setForeground(new java.awt.Color(55, 108, 124));
        pricenum.setText("3000 £ ");

        bookresbutton.setBackground(new java.awt.Color(255, 255, 255));
        bookresbutton.setForeground(new java.awt.Color(128, 128, 128));
        bookresbutton.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/Desktop/THEHOTEL/images/abicon.png")); // NOI18N
        bookresbutton.setText("book now");
        bookresbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookresbuttonActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setForeground(new java.awt.Color(128, 128, 128));
        cancel.setIcon(new javax.swing.ImageIcon("/Users/itsalghala/Desktop/THEHOTEL/images/dbicon.png")); // NOI18N
        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 108, 124));
        jLabel2.setText("check in");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setToolTipText("Day");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setToolTipText("Date");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", " " }));
        jComboBox3.setSelectedIndex(-1);
        jComboBox3.setToolTipText("Year");

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 108, 124));
        jLabel4.setText("check out");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "" }));
        jComboBox4.setSelectedIndex(-1);
        jComboBox4.setToolTipText("Day");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        jComboBox5.setSelectedIndex(-1);
        jComboBox5.setToolTipText("Date");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", " " }));
        jComboBox6.setSelectedIndex(-1);
        jComboBox6.setToolTipText("Year");
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat", 3, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 108, 124));
        jLabel5.setText("we will send you an email to confirm your reservation");

        javax.swing.GroupLayout rdpanelbgLayout = new javax.swing.GroupLayout(rdpanelbg);
        rdpanelbg.setLayout(rdpanelbgLayout);
        rdpanelbgLayout.setHorizontalGroup(
            rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rdpanelbgLayout.createSequentialGroup()
                .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rdpanelbgLayout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rdpanelbgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rdpanelbgLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(rdpanelbgLayout.createSequentialGroup()
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookresbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rdpanelbgLayout.createSequentialGroup()
                                .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rdpanelbgLayout.createSequentialGroup()
                                        .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(rdpanelbgLayout.createSequentialGroup()
                                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pricenum)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(23, 23, 23))
            .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rdpanelbgLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(darkpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        rdpanelbgLayout.setVerticalGroup(
            rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rdpanelbgLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rdpanelbgLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3))
                    .addGroup(rdpanelbgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price)
                            .addComponent(pricenum))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(bookresbutton))
                .addContainerGap())
            .addGroup(rdpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rdpanelbgLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(darkpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(413, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rdpanelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(rdpanelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookresbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookresbuttonActionPerformed
        
        this.dispose();
        Bill b=new Bill();
        b.setVisible(true);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//GEN-LAST:event_bookresbuttonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       
        this.dispose();
        CustomerInterface A = new CustomerInterface();
        A.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
       
    }//GEN-LAST:event_jComboBox6ActionPerformed

    
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
            java.util.logging.Logger.getLogger(RDesSuite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RDesSuite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RDesSuite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RDesSuite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RDesSuite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookresbutton;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel darklogo;
    private javax.swing.JPanel darkpanel;
    private javax.swing.JLabel desc;
    private javax.swing.JTextPane destext;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel pricenum;
    private javax.swing.JPanel rdpanelbg;
    private javax.swing.JLabel roomdescription;
    // End of variables declaration//GEN-END:variables
}
