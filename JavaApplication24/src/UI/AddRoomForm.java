/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dao.RoomManagement;
import entity.Room;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import unti.ImgHelper;


/**
 *
 * @author admin
 */
public class AddRoomForm extends javax.swing.JFrame {

    private String room_num;
    private String type_room;
    private String floor;
    private String status;
    private String price_room;
    private String img;
    private byte [] roomImage;
    private  RoomJFrame roomJFrame;

    /**
     * Creates new form AddRoomForm
     */
    public AddRoomForm() {
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbfloor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        room_number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        browseImg = new javax.swing.JButton();
        yes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbtype = new javax.swing.JComboBox<>();
        cbstatus = new javax.swing.JComboBox<>();
        imgroom = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);

        jPanel1.setBackground(new java.awt.Color(188, 210, 238));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enter Room  information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 56));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 398, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 567, 280, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Room Number :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 133, 120, 30));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 280, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Price    :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 92, 30));

        cbfloor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbfloor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floor 1", "Floor 2", "Floor 3", "Floor 4" }));
        cbfloor.setToolTipText("");
        cbfloor.setPreferredSize(new java.awt.Dimension(44, 44));
        cbfloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfloorActionPerformed(evt);
            }
        });
        jPanel1.add(cbfloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Room Type :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 191, 110, 26));

        room_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_numberActionPerformed(evt);
            }
        });
        jPanel1.add(room_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 270, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Img   :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 92, 30));

        browseImg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        browseImg.setText("Browse");
        browseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseImgActionPerformed(evt);
            }
        });
        jPanel1.add(browseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 114, 37));

        yes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_verified_account_32px_2.png"))); // NOI18N
        yes.setText("Confirmed");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        jPanel1.add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 129, 51));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_exit_26px.png"))); // NOI18N
        jButton2.setText("Exit");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 120, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Floor :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 92, 30));

        cbtype.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        cbtype.setToolTipText("");
        cbtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtypeActionPerformed(evt);
            }
        });
        jPanel1.add(cbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 90, 36));

        cbstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn phòng", "Hết phòng" }));
        jPanel1.add(cbstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 90, 30));

        imgroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hotel-icon.png"))); // NOI18N
        jPanel1.add(imgroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 140, 150));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Status   :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 294, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void cbfloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfloorActionPerformed

    }//GEN-LAST:event_cbfloorActionPerformed

    private void room_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_room_numberActionPerformed

    private void cbtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtypeActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        
        room_num = room_number.getText();
        type_room = cbtype.getSelectedItem().toString();
        floor = cbfloor.getSelectedItem().toString();
        status = cbstatus.getSelectedItem().toString();
        price_room = price.getText();
        
        roomImage = null;
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/Hotel-icon.png"));
        imgroom.setIcon(icon);
        
        
        if(room_num.equals("")|| price_room.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ");
        }else{
            Room r = new Room(room_num,type_room, floor, status, price_room, roomImage);
            try {
                RoomManagement.add(r);
            } catch (IOException ex) {
                Logger.getLogger(AddRoomForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
        
        
        


    }//GEN-LAST:event_yesActionPerformed

    private void browseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseImgActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.setFileFilter(new FileFilter() {
           @Override
           public boolean accept(File f) {
               if(f.isDirectory()){
                   return true;
               }else{
                   return f.getName().toLowerCase().endsWith(".jpg");
               }
               
               
           
           }
       

           @Override
           public String getDescription() {
              return "Image File (*.jpg)";
           }
       });
       
       if(chooser.showOpenDialog(jPanel1)==JFileChooser.CANCEL_OPTION){
           return;
       }
       File file = chooser.getSelectedFile();
        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image image = ImgHelper.resize(icon.getImage(),140, 160);
            ImageIcon imageIcon = new ImageIcon(image);
            imgroom.setIcon(imageIcon);
            roomImage = ImgHelper.toByteArray(image, "jpg");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jPanel1,"loi");
            
        }
    }//GEN-LAST:event_browseImgActionPerformed

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
            java.util.logging.Logger.getLogger(AddRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoomForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseImg;
    private javax.swing.JComboBox<String> cbfloor;
    private javax.swing.JComboBox<String> cbstatus;
    private javax.swing.JComboBox<String> cbtype;
    private javax.swing.JLabel imgroom;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField price;
    private javax.swing.JTextField room_number;
    private javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}