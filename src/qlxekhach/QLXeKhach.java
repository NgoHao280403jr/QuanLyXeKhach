/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlxekhach;

import Database.ConnectOracle;
import View.Login;
import java.sql.Connection;

/**
 *
 * @author ADMIN
 */
public class QLXeKhach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = ConnectOracle.getConnecOracle();
        System.out.println(con);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
}
