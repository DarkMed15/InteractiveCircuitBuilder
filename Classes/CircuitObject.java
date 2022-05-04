package InteractiveCircuitBuilder.Classes;

import java.util.ArrayList;
import javafx.scene.image.ImageView;


public class CircuitObject {
    
    private String image;
    private CircuitNode nodeRight;
    private CircuitNode nodeLeft;
    private ImageView sprite;
    public static int countCircuitObjects = 0;

    public CircuitObject(ImageView s){     
        this.nodeLeft = new CircuitNode();
        this.nodeRight = new CircuitNode();
        nodeLeft.setNumber(CircuitNode.total++);
        nodeRight.setNumber(CircuitNode.total++);
        this.sprite = s;
        nodeRight.getConnectedTo().add(nodeLeft.getNumber());
        nodeLeft.getConnectedTo().add(nodeRight.getNumber());
        countCircuitObjects++;
        Storage.getInstance().addObj(this);
    }
    
    public CircuitObject(){
        
    }
    
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getXRight(){
        return nodeRight.getXAxis();
    }
    
    public void setXRight(double x){
        nodeRight.setXAxis(x);
    }
    
    public double getYRight(){
        return nodeRight.getYAxis();
    }
    
    public void setYRight(double y){
        nodeRight.setYAxis(y);
    }
    
    public double getXLeft(){
        return nodeLeft.getXAxis();
    }
    
    public void setXLeft(double x){
        nodeLeft.setXAxis(x);
    }
    
    public double getYLeft(){
        return nodeLeft.getYAxis();
    }
    
    public void setYLeft(double y){
        nodeLeft.setXAxis(y);
    } 
    
    public CircuitNode getNodeLeft(){
        return this.nodeLeft;
    }
    
    public CircuitNode getNodeRight(){
        return this.nodeRight;
    }
    
    
    public ArrayList<Integer> getConnectedToRight(){
        return nodeRight.getConnectedTo();
    }
       
    public ArrayList<Integer> getConnectedToLeft(){
        return nodeLeft.getConnectedTo();
    }
    
    public Integer getNbRight(){
        return nodeRight.getNumber();
    }
    
    public void setNbRight(Integer nb){
        nodeRight.setNumber(nb);
    }
    
    public Integer getNbLeft(){
        return nodeLeft.getNumber();
    }
        
    public void setNbLeft(Integer nb){
        nodeLeft.setNumber(nb);
    }
    
    public ImageView getSprite(){
        return this.sprite;
    }
}