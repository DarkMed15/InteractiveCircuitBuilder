package InteractiveCircuitBuilder.main;


import InteractiveCircuitBuilder.Classes.Battery;
import InteractiveCircuitBuilder.Classes.CircuitNode;
import InteractiveCircuitBuilder.Classes.CircuitObject;
import InteractiveCircuitBuilder.Classes.Draggable;
import InteractiveCircuitBuilder.Classes.Graph;
import InteractiveCircuitBuilder.Classes.Resistor;
import InteractiveCircuitBuilder.Classes.Storage;
import InteractiveCircuitBuilder.Classes.Switch;
import InteractiveCircuitBuilder.Classes.Wire;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class FXMLController implements Initializable{
    
    @FXML private TextField batValue;
    @FXML private TextField resistance1;
    @FXML private TextField resistance2;
    @FXML private MenuButton switchState;
    @FXML private MenuItem Open;
    @FXML private MenuItem Closed;
    @FXML private Button SetBat1;
    @FXML private Button SetRes1;
    @FXML private Button SetRes2;
    @FXML public CheckBox showEq;
    
    @FXML public ImageView battery1;
    @FXML public ImageView resistor1;
    @FXML public ImageView resistor2;
    @FXML public ImageView resistor3;
    @FXML public ImageView wire1;
    @FXML public ImageView wire2;
    @FXML public ImageView wire3;
    @FXML public ImageView wire4;
    @FXML public ImageView wire5;
    @FXML public ImageView wire6;
    @FXML public ImageView wire7;
    @FXML public ImageView wire8;
    @FXML public ImageView wire9;
    @FXML public ImageView wire10;
    @FXML public ImageView switch1;    
    ImageView[] imageList = {battery1, resistor1, resistor2,wire1, wire2, wire3, wire4, wire5, wire6, wire7, wire8, wire9, wire10, switch1};
    
    Battery battery = new Battery(battery1);
    Resistor res1 = new Resistor(resistor1);
    Resistor res2 = new Resistor(resistor2);
    Wire w1 = new Wire(wire1);
    Wire w2 = new Wire(wire2);
    Wire w3 = new Wire(wire3);
    Wire w4 = new Wire(wire4);
    Wire w5 = new Wire(wire5);
    Wire w6 = new Wire(wire6);
    Wire w7 = new Wire(wire7);
    Wire w8 = new Wire(wire8);
    Wire w9 = new Wire(wire9);
    Wire w10 = new Wire(wire10);
    Switch swit = new Switch(switch1);
    
    CircuitObject[] objectList = {battery, res1, res2, w1, w2, w3, w4, w5, w6, w7, w8, w9, w10, swit}; 
 
    
    Draggable draggable = new Draggable();
    public void makeRotate(ImageView node){


        node.setOnMouseClicked(event -> {
            if(event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2) {
                node.setRotate(node.getRotate() + 90);
            }
        });
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ImageView[] imageList = {battery1, resistor1, resistor2, wire1, wire2, wire3, wire4, wire5, wire6, wire7, wire8, wire9, wire10, switch1};
    
        for(int i=0; i<imageList.length; i++){
            draggable.makeDraggable(imageList[i]);
            makeRotate(imageList[i]);
        }        
        
        SetBat1.setVisible(false);
        SetRes1.setVisible(false);
        SetRes2.setVisible(false);
        batValue.setVisible(false);
        resistance1.setVisible(false);
        resistance2.setVisible(false);
        switchState.setVisible(false);
        
        resistor1.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            if(event.getButton().equals(MouseButton.SECONDARY) && event.getClickCount() == 1) {
                resistance1.setVisible(true);
                resistance1.setEditable(true);
                SetRes1.setVisible(true);
            }else{
                resistance1.setVisible(false);
                resistance1.setEditable(false);
                SetRes1.setVisible(false);
            }
        });
        
        resistor2.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            if(event.getButton().equals(MouseButton.SECONDARY) && event.getClickCount() == 1) {
                resistance2.setVisible(true);
                resistance2.setEditable(true);
                SetRes2.setVisible(true);
            }else{
                resistance2.setVisible(false);
                resistance2.setEditable(false);
                SetRes2.setVisible(false);
            }
        });
        
        battery1.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            if(event.getButton().equals(MouseButton.SECONDARY) && event.getClickCount() == 1) {
                batValue.setVisible(true);
                batValue.setEditable(true);
                SetBat1.setVisible(true);
            }else{
                batValue.setVisible(false);
                batValue.setEditable(false);
                SetBat1.setVisible(false);
            }
        });
        
        switch1.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            if(event.getButton().equals(MouseButton.SECONDARY) && event.getClickCount() == 1) {
                switchState.setVisible(true);
            }else{
                switchState.setVisible(false);
            }
        });
    }
    
    
    Image myImage = new Image("https://cdn.pixabay.com/photo/2013/07/12/13/19/switch-146821_1280.png");
    Image myImage2 = new Image("https://intl.siyavula.com/read/science/grade-8/energy-transfer-in-electrical-systems/images/gr8ec02-gd-0010.png");       
    public void displayImage() {
        switch1.setImage(myImage);
    }
    public void displayImage2() {
        switch1.setImage(myImage2);
    }
    Alert alert = new Alert(Alert.AlertType.NONE);
    public void setBatValue() {
        try{
            double voltage = Double.parseDouble(batValue.getText());
            battery.setVoltage(voltage);
            if (voltage <= 0) {
                throw new IllegalArgumentException(); 
}
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as voltage value !");
            alert.showAndWait();
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number higher than 0 as voltage value !");
            alert.showAndWait();
        }
    }
    
    public void setRes1Value() {
        try{
            double resist1 = Double.parseDouble(resistance1.getText());
            res1.setResistance(resist1);
            if (resist1 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();             
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    public void setRes2Value() {
        try{
            double resist2 = Double.parseDouble(resistance1.getText());
            res2.setResistance(resist2);
            if (resist2 < 0) {
                throw new IllegalArgumentException(); 
            }   
        } catch (NumberFormatException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a number as resistance value !");
            alert.showAndWait();             
        } catch (IllegalArgumentException ex){
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setHeaderText("ERROR");
            alert.setContentText("Please enter a positive number as resistance value !");
            alert.showAndWait();
        }
    }
    
    
    public void info(){
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        GridPane layout = new GridPane();
        Label infoDrag = new Label(" Press the mouse's left button on the \n Circuit Element and move in order to drag.\n ");
        Label infoRotate = new Label(" Double click the mouse's left button\n on the Circuit Element to rotate it.\n ");
        Label infoChange = new Label(" Press the mouse's right button on the \n Circuit Element to be able to change its properties.\n ");
        infoDrag.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        infoRotate.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        infoChange.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        layout.add(infoDrag, 0,0);
        layout.add(infoRotate, 0,1);
        layout.add(infoChange, 0,2);
        Scene scene = new Scene(layout, 520, 300);  
        stage.setTitle("Info");
        stage.setScene(scene);
        stage.show();
    }
    
    /*public void penis(){
        for (int i = 0; i<objectList.length; i++){
            double xCoordRight = imageList[i].getFitHeight()+imageList[i].getLayoutX();
            double xCoordLeft = imageList[i].getLayoutX();
            objectList[i].getNodeRight().setXAxis(xCoordRight);
            objectList[i].getNodeLeft().setXAxis(xCoordLeft);
        }
    }*/
    
    public void Connect(){ //the index of the images corresponds to the index of the objects from these images
        // if the node of one imageview and the node of another imageview are at ~20pixels of each other
        // and the imageview that is being dragged is dropped,
        // the coordinates of the node of the imageview that is being dragged becomes the coordinates of the nearby node
        
        /* when an image is connected to another image:
        
        */
    }
    
    public void Calculate(Resistor eqResistor, Battery bat){
        
    }
            
                
    @FXML
    public void showEquation(){ 
        
        // create list of nodes in the graph
        LinkedList <CircuitNode> nodeInPane = new LinkedList();
        for (int i = 0; i<imageList.length; i++){            
            double leftCoord = imageList[i].getLayoutX();
            double rightCoord = imageList[i].getLayoutX()+imageList[i].getFitWidth();
            if (leftCoord > 100 && rightCoord > 100){
                nodeInPane.add(objectList[i].getNodeLeft());
                nodeInPane.add(objectList[i].getNodeRight());
            }
        } 
        
        
        // if 'show equations' button is selected
        if (showEq.isSelected()){
            
            
            // if battery is not in the pane: cancel
            if (!nodeInPane.contains(battery.getNodeLeft())){
                alert.setAlertType(Alert.AlertType.ERROR);
                alert.setContentText("There is no battery in the circuit");
            }
            
            // if there is no resistor in the pane: cancel
            if (!nodeInPane.contains(res1.getNodeLeft()) &&
                !nodeInPane.contains(res2.getNodeLeft())){
               alert.setAlertType(Alert.AlertType.ERROR);
               alert.setContentText("The circuit has no resistance");
            }
            
            // if the battery has a null voltage value: cancel
            
            // if a resistor in the pane has a null resistance value: cancel
            
            
            // check if the circuit is closed
            else {
                
                // create node array representation of circuit
                Graph circuitGraph = new Graph(2*CircuitObject.countCircuitObjects+1);
                for (CircuitNode node: nodeInPane){
                    for (Integer number: node.getConnectedTo()){
                        circuitGraph.addEdge(node.getNumber(), number);
                    }
                }
                
                
                // remove nodes that are not connected to the electric circuit from 'nodeInPane'
                if (circuitGraph.isGraphConnected() == false){
                    for (int i=0; i<circuitGraph.getVisited().length;i++){
                        if (circuitGraph.getVisited()[i] == false){
                            nodeInPane.remove(i);
                        }
                    }
                }
                
                
                // check if a node in 'nodeInPane' is pendant
                boolean openEnd = false;
                for (CircuitNode node: nodeInPane){
                    if (node.getConnectedTo().size() == 1)
                        openEnd = true;
                }
                
                // if a node in 'nodeInPane' is pendant: cancel 
                if (openEnd){
                    alert.setAlertType(Alert.AlertType.ERROR);
                    alert.setContentText("The circuit is not closed");             
                }                
                else{
                    Resistor eqRes = new Resistor();
                    
                    //check which resistors are in the circuit
                    ArrayList<Resistor> resistors = new ArrayList<>();
                    for (CircuitNode node: nodeInPane){
                        switch(node.getNumber()){
                            case 2:
                                resistors.add(res1);
                                break;
                            case 4: 
                                resistors.add(res2);
                                break;
                        } 
                    }
                    
                    // if there is only one resistor
                    if (resistors.size() == 1){
                        eqRes.setResistance(resistors.get(0).getResistance());
                        // display: ""
                    }
                        
                    else if (resistors.size() == 2){
                        int r1Left = resistors.get(0).getNodeLeft().getNumber();
                        int r1Right = resistors.get(0).getNodeRight().getNumber();
                        int r2Left = resistors.get(1).getNodeLeft().getNumber();
                        int r2Right = resistors.get(1).getNodeRight().getNumber();
                        
                        Graph circuit = new Graph(2*CircuitObject.countCircuitObjects+1);
                        for (CircuitNode node: nodeInPane){
                            for (Integer number: node.getConnectedTo()){
                                if (node.getNumber().equals(0))
                                    break;
                                else if (number.equals(0))
                                    break;
                                else if (node.getNumber().equals(1))
                                    break;
                                else if (number.equals(1))
                                    break;
                                else if (node.getNumber().equals(r1Left)){
                                    if (number.equals(r1Right))
                                        break;
                                    else if (number.equals(r2Left))
                                        break;
                                    else if (number.equals(r2Right))
                                        break;
                                }
                                else if (node.getNumber().equals(r1Right)){
                                    if (number.equals(r1Left))
                                        break;
                                    else if (number.equals(r2Left))
                                        break;
                                    else if (number.equals(r2Right))
                                        break;
                                }
                                else if (node.getNumber().equals(r2Left)){
                                    if (number.equals(r2Right))
                                        break;
                                    else if (number.equals(r1Left))
                                        break;
                                    else if (number.equals(r1Right))
                                        break;
                                }
                                else if (node.getNumber().equals(r2Right)){
                                    if (number.equals(r2Left))
                                        break;
                                    else if (number.equals(r1Left))
                                        break;
                                    else if (number.equals(r1Right))
                                        break;
                                }
                                else
                                    circuitGraph.addEdge(node.getNumber(), number);
                            }
                        }
                        if (circuitGraph.isReachable(r1Left, r2Right)){
                            // parallel
                            if (circuitGraph.isReachable(r1Right, r2Left)){
                                eqRes.setResistance(1/resistors.get(0).getResistance()+1/resistors.get(1).getResistance());
                            }
                            //series
                            else{
                                eqRes.setResistance(resistors.get(0).getResistance()+resistors.get(1).getResistance());
                            }
                        }
                        else if (circuitGraph.isReachable(r1Right, r2Left)){
                            // parallel
                            if (circuitGraph.isReachable(r1Left, r2Right)){
                                eqRes.setResistance(1/resistors.get(0).getResistance()+1/resistors.get(1).getResistance());
                            }
                            //series
                            else{
                                eqRes.setResistance(resistors.get(0).getResistance()+resistors.get(1).getResistance());
                            }   
                        }
                    }
                }
            }
                
                
                
        }
    //if (showEq.isSelected()){
        //  showEq.setSelected(false);
    //}    
    }
        
        
        
        
        
    
    
  
    
}



