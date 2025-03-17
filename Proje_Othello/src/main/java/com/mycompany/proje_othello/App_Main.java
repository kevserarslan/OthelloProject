/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proje_othello;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Kevser
 */
public class App_Main {
public static JFrame LoginFrame;
    public static void main(String[] args) {
       
        // try {
           // Data.ReadFromFileToPersonList();
       // } catch (IOException ex) {
            //Logger.getLogger(App_Main.class.getName()).log(Level.SEVERE, null, ex);
       // }
        Frm_Login newFrm = new Frm_Login();
        LoginFrame = newFrm;
        newFrm.setVisible(true);
    }
    }

