/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InteractiveCircuitBuilder;


public class CircuitObject {
    
    private String image;
    private Node nodeRight;
    private Node nodeLeft;

    public CircuitObject(){     
        this.nodeLeft = new Node();
        this.nodeRight = new Node();
        nodeLeft.setId(Node.total++);
        nodeRight.setId(Node.total++);
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
    
    public double getYRight(){
        return nodeRight.getYAxis();
    }
    
    public double getXLeft(){
        return nodeLeft.getXAxis();
    }
    
    public double getYLeft(){
        return nodeLeft.getYAxis();
    }
        
    
}

