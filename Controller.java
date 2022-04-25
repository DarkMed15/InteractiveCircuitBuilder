package InteractiveCircuitBuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;


public class Controller{
    
    @FXML public CheckBox showEq;
    
    // Algorithm
        
    // Method for dragging object (imageview)
    
    // Method for selecting object (imageview)
    
    //private ImageView imageView;
       
    // Method for popping text box for resistance (for resistor)
    
    // Method for setting resistance on button pressed
    
    // Method for deleting object (imageview)
    
    // Method for rotating object (imageview)
    
    
    //Methods for popping out textboxes:
    // for error, and descriptions
    Alert alert = new Alert(Alert.AlertType.NONE);
    public void onClick(){
        //alert.setAlertType(Alert.AlertType.ERROR);
        alert.setContentText("The circuit is not connected properly");
        alert.show();
        showEq.setSelected(false);
    }

    
    
}
