package InteractiveCircuitBuilder.Classes;

import javafx.scene.image.ImageView;


public class CircuitObject {
    
    private String image;
    private CircuitNode me;
    private CircuitNode nodeRight;
    private CircuitNode nodeLeft;
    private ImageView sprite;

    public CircuitObject(ImageView s){     
        this.nodeLeft = new CircuitNode();
        this.nodeRight = new CircuitNode();
        nodeLeft.setId(CircuitNode.total++);
        nodeRight.setId(CircuitNode.total++);
        this.me = new CircuitNode();
        this.sprite = s;
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
        vertexRight.setXAxis(x);
    }
    
    public double getYRight(){
        return nodeRight.getYAxis();
    }
    
    public void setYRight(double y){
        vertexRight.setYAxis(y);
    }
    
    public double getXLeft(){
        return nodeLeft.getXAxis();
    }
    
    public void setXLeft(double x){
        vertexLeft.setXAxis(x);
    }
    
    public double getYLeft(){
        return nodeLeft.getYAxis();
    }
    
    public void setYLeft(double y){
        vertexLeft.setXAxis(y);
    } 
    
    public CircuitNode getNode(){
        return this.me;
    }
    
    public ArrayList<Integer> getConnectedToRight(){
        return nodeRight.getConnectedTo();
    }
       
    public ArrayList<Integer> getConnectedToLeft(){
        return nodeLeft.getConnectedTo();
    }
        
    
}
