/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author student.lab1
 */
public class DBSearch {

    Statement stmt;
    ResultSet rs;

    public ResultSet searchLogin(String usName, String password) {
        try {
            stmt = Model.DBConnection.getStatementConnection();
            String name = usName;
//Execute the Query
            rs = stmt.executeQuery("SELECT * FROM user where username='" + name + "' and password ='" + password + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void Form(int id, String fname, String lname, int age, String gender, String prole) {
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO players (`FirstName`,`LastName`,`Gender`,`PlayerRole`,`Age`) VALUES('" + fname + "', '" + lname + "','" + gender + "','" + prole + "','24')");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
     public void Formm(int ID, String name, String captain, String coach, String members, String description, String sponsor) {
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO teams (`name`,`captain`,`coach`,`members`,`description`,`sponsor`) VALUES('" + name + "', '" +captain + "','"+coach + "','" + members + "','"+description+"','"+sponsor+"','24')");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
      public void Formmm(String TournmentName, String TournmentOrganizer, String Location, String PlayTeams, String TicketInformation, String ContractInformation) {
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO tournment (`TournmentName`,`TournmentOrganizer`,`Location`,`PlayTeams`,`TicketInformation`,`ContractInformation`) VALUES('" + TournmentName + "', '" +TournmentOrganizer + "','"+Location + "', '" + PlayTeams + "','"+TicketInformation+"','"+ContractInformation+"')");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
     
     
     
     
     
     

    public ResultSet searchplayers() {
        try {
            stmt = Model.DBConnection.getStatementConnection();

            rs = stmt.executeQuery("SELECT * FROM players");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    
        public ResultSet searchTeams() {
        try {
            stmt = Model.DBConnection.getStatementConnection();

            rs = stmt.executeQuery("SELECT * FROM teams");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
        
        
        
          public ResultSet searchTournment() {
        try {
            stmt = Model.DBConnection.getStatementConnection();

            rs = stmt.executeQuery("SELECT * FROM tournment");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
        
    
}
}