/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrrobot.signin_signup_form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bickkysahani
 */
public class signin extends javax.swing.JFrame {

    /**
     * Creates new form signin
     */
    public signin() {
        initComponents();
        this.setLocationRelativeTo(null);  //to centre the window, fixed from stackoverflow

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
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSignin = new javax.swing.JLabel();
        btnSignup = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1193, 640));
        setPreferredSize(new java.awt.Dimension(1193, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 150, 40));

        username.setBackground(new java.awt.Color(39, 35, 65));
        username.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setText("Enter Username");
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(255, 255, 255));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 320, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 330, 20));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 150, 40));

        password.setBackground(new java.awt.Color(39, 35, 65));
        password.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("password");
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 310, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 330, 20));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setText("SIGN UP");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 80, 20));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setText("SIGN IN");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, 20));

        btnSignin.setIcon(new javax.swing.ImageIcon("/home/bickkysahani/NetBeansProjects/signin_signup_form/images/btn.png")); // NOI18N
        btnSignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSigninMouseClicked(evt);
            }
        });
        getContentPane().add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 170, 60));

        btnSignup.setIcon(new javax.swing.ImageIcon("/home/bickkysahani/NetBeansProjects/signin_signup_form/images/btn.png")); // NOI18N
        btnSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
        });
        getContentPane().add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 170, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/bickkysahani/NetBeansProjects/signin_signup_form/images/group1.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1080, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        this.username.setText("");
    }//GEN-LAST:event_usernameFocusGained

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        this.password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
        // TODO add your handling code here:
        dispose();
        signup r = new signup();
        r.setTitle("Register a user");
        r.setLocationRelativeTo(null); //centre the window
        r.setVisible(true);


    }//GEN-LAST:event_btnSignupMouseClicked

    private void btnSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSigninMouseClicked
        // TODO add your handling code here:
        String tusername = username.getText();
        String tpassword = String.valueOf(password.getPassword());  //to fix password issue
        if (tusername.isEmpty() || tpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "username / password should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                //start the login process
                userSignIn(tusername, tpassword);
            } catch (SQLException ex) {
                Logger.getLogger(signin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnSigninMouseClicked

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
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSignin;
    private javax.swing.JLabel btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void userSignIn(String username, String password) throws SQLException {

        Connection dbconn;
        dbconn = dbconnection.ConnectDB();
        String select = "Select * from users WHERE username = ? AND password=?";
        if (dbconn != null) {
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement(select);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
//                 password.setText("");
//                username.setText("");
            if (res.next()) {
                //display dashboard or new page after login
                dispose();
                dashboard d = new dashboard();
                d.setTitle("Dashboard");
                d.displayUser(username);
                d.setLocationRelativeTo(null);
                d.setVisible(true);  
                 System.out.println("logged in successfully");
                //JOptionPane.showMessageDialog(this, "logged in successfully \n welcome " + username, "Success", JOptionPane.ERROR_MESSAGE);
            } else {
//                System.out.println("username: " + username);
//                    System.out.println("password: " + password);
                JOptionPane.showMessageDialog(this, "username / password not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("The connection not available");
        }
    }
}
