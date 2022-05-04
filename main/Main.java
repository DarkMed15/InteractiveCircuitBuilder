package InteractiveCircuitBuilder.main;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;






public class Main extends Application{

    
    public static void main(String[] args) {
        launch(args);
    }
    String path = "C:/Users/paulk/OneDrive/Documents/NetBeansProjects/";
    @Override
    public void start(Stage stage) throws Exception {
        URL url = new URL("file:///"+path+"InteractiveCircuitBuilder/Resources/CircuitBuilder/CircuitBuilder.fxml");
        Parent root = FXMLLoader.load(url);
        
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("InteractiveCircuitBuilder");
        stage.show();
    }

    
    
}
