/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;

public class AddRecord {

    Statement stmt;

     public  void Form(String fname, String lname,String gender, String prole,int age) {
       
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO players (`FirstName`,`LastName`,`Gender`,`PlayerRole`,`Age`) VALUES('"+ fname + "', '" + lname + "','" + gender + "','"+ prole + "','"+age+"' )");
       
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
   
     public  void update(String id, String fname, String lname,String gender, String prole,int age) {
       
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE players SET `FirstName`='"+fname+"',LastName ='"+lname+"', Gender='"+gender+"',PlayerRole='"+prole+"', Age='"+age+"' WHERE id = '"+id+"' ");
       
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
     public  void delete(String id) {
       
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM `players` WHERE id = '"+id+"' ");
       
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

 
    
    
}
