/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrrobot.signin_signup_form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bickkysahani
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
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
        jLabel2 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnChangePw = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(39, 35, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 190, 100));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 1020, 20));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 230, 100));

        nameLabel.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 380, 120));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setText("LOGOUT");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, -1, 20));

        btnLogout.setIcon(new javax.swing.ImageIcon("/home/bickkysahani/NetBeansProjects/signin_signup_form/images/btn.png")); // NOI18N
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 170, 60));

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setText("CHANGE PW");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, 20));

        btnChangePw.setIcon(new javax.swing.ImageIcon("/home/bickkysahani/NetBeansProjects/signin_signup_form/images/btn.png")); // NOI18N
        btnChangePw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangePwMouseClicked(evt);
            }
        });
        jPanel1.add(btnChangePw, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 180, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1110, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(btnLogout, "Are you sure?");
        // JOptionPane.setRootFrame(null);
        if (a == JOptionPane.YES_OPTION) {
            dispose();
            signin obj = new signin();
            obj.setTitle("Sign In");
            obj.setVisible(true);
        }

    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnChangePwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePwMouseClicked
        String username = nameLabel.getText();
        // TODO add your handling code here: 
           System.out.println("nameLabel: " + username);
         changepw r = new changepw(username);
        r.setTitle("Change password");
        r.setLocationRelativeTo(null); //centre the window
        r.setVisible(true);
     

//        String name = nameLabel.getText();
//      
//        try {
//            String pass = null;
//            System.out.println("update password name " + pass);
//            System.out.println("update password");
//
//            Connection dbconn;
//            dbconn = dbconnection.ConnectDB();
//            String update = "Update users set password=? where username=?";
//            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement(update);
//            st.setString(1, pass);
//            st.setString(2, name);
//
//            st.executeUpdate();
//            JOptionPane.showMessageDialog(btnChangePw, "Password has been successfully changed");
//
//        } catch (SQLException sqlException) {
//            sqlException.printStackTrace();
//        }

    }//GEN-LAST:event_btnChangePwMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnChangePw;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables

    public void displayUser(String username) {
    nameLabel.setText(username);
    }

 
}
