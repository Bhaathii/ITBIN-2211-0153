
package controller;

import javax.swing.JOptionPane;

public class TournmentController {
    
   public static void Formmm(String TournmentName, String TournmentOrganizer, String Location, String PlayTeams, String TicketInformation, String ContractInformation) { 
       try{
       
            new model.AddTournmentModel().Form(TournmentName, TournmentOrganizer, Location, PlayTeams, TicketInformation, ContractInformation); 
    
    JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE); 
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert record: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
        }
   }
       

    public static void delete(String id) {
    new model.AddTournmentModel().delete(id);
    JOptionPane.showMessageDialog(null, "Record Deleted", "Success",
            JOptionPane.INFORMATION_MESSAGE);
}

      
          
     public static void update (String id,String TournmentName, String TournmentOrganizer, 
             String Location, String PlayTeams, String TicketInformation,String ContractInformation) {

     new model.AddTournmentModel().update(id, TournmentName, TournmentOrganizer,Location,
             PlayTeams,TicketInformation,ContractInformation);
        
        JOptionPane.showMessageDialog(null, "Details Updated", "Successfull",
                JOptionPane.INFORMATION_MESSAGE);
    }


    
}
