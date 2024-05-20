
package model;

import java.sql.Statement;

/**
 *
 * @author ASUS
 */

public class AddTournmentModel {
    
       Statement stmt; 
     
public void Form(String TournmentName, String TournmentOrganizer, String Location, String PlayTeams, String TicketInformation, String ContractInformation) { 
        try { 
stmt = Model.DBConnection.getStatementConnection(); 
stmt.executeUpdate 
("INSERT INTO tournment (TournmentName, TournmentOrganizer,Location, PlayTeams, TicketInformation, ContractInformation) VALUES('"+TournmentName+"', '"+TournmentOrganizer+"', '"+Location+"', '"+PlayTeams+"' , '"+TicketInformation+"', '"+ContractInformation+"')"); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } }
        
        
public  void delete(String id) {
       
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM `tournment` WHERE id = '"+id+"' ");
       
        } catch (Exception e) {
            e.printStackTrace();
        }
}
        
        
        
        
        
 public  void update (String id, String TournmentName, String TournmentOrganizer, String Location,String PlayTeams, String TicketInformation, String ContractInformation) {
       
        try {
            stmt = Model.DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE tournment SET `TournmentName`='"+TournmentName+"',TournmentOrganizer ='"+TournmentOrganizer+"', Location='"+Location+"',PlayTeams='"+PlayTeams+"', TicketInformation='"+TicketInformation+"',ContractInformation='"+ContractInformation+"'  WHERE id = '"+id+"'  ");
       
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
        
        
        
        
        
        
        
        
    
}
