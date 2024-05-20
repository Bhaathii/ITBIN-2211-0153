
package model;

import java.sql.Statement;


public class AddTeam {
    Statement stmt; 
     
public void Form( String name, String captain, String coach, String members, String description, String sponsors  ) { 
        try { 
stmt = Model.DBConnection.getStatementConnection(); 
stmt.executeUpdate("INSERT INTO teams (name, captain, coach, members, description, sponsors) VALUES('"+name+"', '"+captain+"', '"+coach+"', '"+members+"', '"+description+"', '"+sponsors+"')"); 
        } catch (Exception e) { 
            e.printStackTrace(); 
   
}
}
  public  void delete(String id) {
       
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM `teams` WHERE id = '"+id+"' ");
       
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
  
 public  void update(String ID,String name, String captain, String coach,String members, String description, String sponsors) {
       
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE teams SET `name`='"+name+"',captain ='"+captain+"', coach='"+coach+"',members='"+members+"', description='"+description+"',sponsors='"+sponsors+"'  WHERE id = '"+ID+"'  ");
       
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
  

    }


