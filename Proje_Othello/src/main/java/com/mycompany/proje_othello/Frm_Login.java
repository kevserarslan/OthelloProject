/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proje_othello;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevser
 */
public class Frm_Login extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Login
     */
    public Frm_Login() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_login_User1Email = new javax.swing.JTextField();
        Txt_Login_User1Password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_Login_User1 = new javax.swing.JButton();
        btn_Register_loginUser1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Login_User2Email = new javax.swing.JTextField();
        txt_Login_User2Password = new javax.swing.JTextField();
        btn_login_User2 = new javax.swing.JButton();
        btn_Register_loginUser2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Email=");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, -1));
        jPanel1.add(Txt_login_User1Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, -1));
        jPanel1.add(Txt_Login_User1Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("USER1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_Login_User1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Login_User1.setText("Login");
        btn_Login_User1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Login_User1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Login_User1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btn_Register_loginUser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Register_loginUser1.setText("Register");
        btn_Register_loginUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Register_loginUser1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register_loginUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, 230));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("USER2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email=");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Password=");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel2.add(txt_Login_User2Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 170, -1));
        jPanel2.add(txt_Login_User2Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, -1));

        btn_login_User2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login_User2.setText("Login");
        btn_login_User2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login_User2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login_User2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btn_Register_loginUser2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Register_loginUser2.setText("Register");
        btn_Register_loginUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Register_loginUser2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Register_loginUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 250, 230));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 580, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Register_loginUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Register_loginUser1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        Frm_Register frm_Register = new Frm_Register(this);
        frm_Register.setVisible(true);
    }//GEN-LAST:event_btn_Register_loginUser1ActionPerformed

    private void btn_Register_loginUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Register_loginUser2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Frm_Register frm_Register = new Frm_Register(this);
        frm_Register.setVisible(true);
    }//GEN-LAST:event_btn_Register_loginUser2ActionPerformed

    private void btn_Login_User1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Login_User1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, " Waiting for User2");
    }//GEN-LAST:event_btn_Login_User1ActionPerformed

    private void btn_login_User2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login_User2ActionPerformed
        // TODO add your handling code here:
         String email =Txt_login_User1Email.getText();
         String password=Txt_Login_User1Password.getText();
         String email2=txt_Login_User2Email.getText();
         String password2=txt_Login_User2Password.getText();
             boolean isLogin =Data.Login(email, password)&& Data.Login(email2, password2);
          if(isLogin){
              Frm_Bord frm_Bord= new Frm_Bord();
              frm_Bord.setVisible(true);
          }
          else{
              JOptionPane.showMessageDialog(rootPane, "User cannot login...");
          }
    }//GEN-LAST:event_btn_login_User2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_Login_User1Password;
    private javax.swing.JTextField Txt_login_User1Email;
    private javax.swing.JButton btn_Login_User1;
    private javax.swing.JButton btn_Register_loginUser1;
    private javax.swing.JButton btn_Register_loginUser2;
    private javax.swing.JButton btn_login_User2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_Login_User2Email;
    private javax.swing.JTextField txt_Login_User2Password;
    // End of variables declaration//GEN-END:variables
}
