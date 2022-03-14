/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InteractiveCircuitBuilder;


public class CircuitObject {
    
    private String image;
    private double xAxis;
    private double yAxis;
    private boolean isConnectedLeft;
    private boolean isConnectedRight;

    public CircuitObject(){
        
    }
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getxAxis() {
        return xAxis;
    }

    public void setxAxis(double xAxis) {
        this.xAxis = xAxis;
    }

    public double getyAxis() {
        return yAxis;
    }

    public void setyAxis(double yAxis) {
        this.yAxis = yAxis;
    }

    public boolean isIsConnectedLeft() {
        return isConnectedLeft;
    }

    public void setIsConnectedLeft(boolean isConnectedLeft) {
        this.isConnectedLeft = isConnectedLeft;
    }

    public boolean isIsConnectedRight() {
        return isConnectedRight;
    }

    public void setIsConnectedRight(boolean isConnectedRight) {
        this.isConnectedRight = isConnectedRight;
    }
    
}
