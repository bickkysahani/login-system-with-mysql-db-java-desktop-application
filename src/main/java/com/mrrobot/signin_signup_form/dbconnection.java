/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrrobot.signin_signup_form;
import java.sql.*;  //import java sql
/**
 *
 * @author bickkysahani
 */
public class dbconnection {
//     Connection con = null;  //null connection object
    public static Connection ConnectDB(){     //static method that returns a db connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //optional
            Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demoform","bickky","bickky1");
//            JOptionPane.showMessageDialog(null, "Connected to Database");
            return conn;
        }
        catch (Exception e) {
            System.out.println("There were errors while connecting to db");
            return null;
        }
        
    }
}
