package InteractiveCircuitBuilder.Classes;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;


public class CircuitNode extends Node{
    static int total = 0;
    private Integer number;
    private double XAxis;
    private double YAxis;
    private ArrayList<Integer> connectedTo = new ArrayList<>();
    private boolean connected;
    public boolean isSelected;
    
    public CircuitNode(){}
    
    public CircuitNode(Integer number, double x, double y, ArrayList<Integer> connectedTo, boolean isConnected){
        this.number = number;
        this.XAxis = x;
        this.YAxis = y;
        this.connectedTo = connectedTo;
        this.connected = isConnected;
        this.isSelected = false;
        
        this.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
        this.isSelected = true;
        });
        this.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
        this.isSelected = false;
        });
    }
    

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public double getXAxis() {
        return XAxis;
    }

    public void setXAxis(double xAxis) {
        this.XAxis = xAxis;
    }

    public double getYAxis() {
        return YAxis;
    }

    public void setYAxis(double YAxis) {
        this.YAxis = YAxis;
    }

    public ArrayList<Integer> getConnectedTo() {
        return connectedTo;
    }

    public void setConnectedTo(ArrayList<Integer> connectedTo) {
        this.connectedTo = connectedTo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number){
        this.number = number;
    }
    
}
