/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import view.Home;
import Model.DBConnection;
import Model.DBSearch;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.loging;

/**
 *
 * @author student.lab1
 */
public class LoginController {

    public static void login(String usName, String pass) {
        try {
            String username = null; // initial value of the username
            String password = null; // initial value of the password
            
            
            
            ResultSet rs = new DBSearch().searchLogin(usName, pass);
//Process the Query
            if (rs.next()) {
                System.out.println("Login Successfull");
                loging.getFrames()[0].dispose();
                new Home().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please Check Credentials", "Warning", JOptionPane.WARNING_MESSAGE);
            }

//            DBConnection.closeCon();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void AddStudentDetails(String text, String text0, String gender, String age) {

    }
}
