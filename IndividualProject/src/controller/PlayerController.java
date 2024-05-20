/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;

public class PlayerController {

    public static void Form(String fname, String lname, String gender, String age, String prole) {

        new model.AddRecord().Form(fname, lname, gender, prole,Integer.parseInt(age));
        
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull",
                JOptionPane.INFORMATION_MESSAGE);
    }
   
    
    
    
    public static void update(String id,String fname, String lname, String gender, String age, String prole) {

        new model.AddRecord().update(id,fname, lname, gender, prole,Integer.parseInt(age));
        
        JOptionPane.showMessageDialog(null, "Details Updated", "Successfull",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    

    public static void AddStudentDetails(String text, String text0, String gender, String age) {
        System.out.println("AddStudentDetails() called **** ");
    }

    
    
    
  public static void delete(String id) {
    new model.AddRecord().delete(id);
    JOptionPane.showMessageDialog(null, "Record Deleted", "Success",
            JOptionPane.INFORMATION_MESSAGE);
}
  

    
}
