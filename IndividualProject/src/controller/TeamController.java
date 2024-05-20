package controller;

import javax.swing.JOptionPane;

public class TeamController {

    public static void Form(String name, String captain, String coach,String members, String description, String sponsors) { 
        try {
            new model.AddTeam().Form(name, captain, coach, members, description, sponsors); 
            
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE); 
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert record: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
        }
    }

     
  public static void delete(String id) {
    new model.AddTeam().delete(id);
    JOptionPane.showMessageDialog(null, "Record Deleted", "Success",
            JOptionPane.INFORMATION_MESSAGE);
}
  
  
   public static void update(String ID,String name, String captain, String coach, String members, String description, String sponsors) {

        new model.AddTeam().update(ID, name, captain, coach, members, description, sponsors);
        
        JOptionPane.showMessageDialog(null, "Details Updated", "Successfull",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
}