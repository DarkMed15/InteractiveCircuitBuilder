package InteractiveCircuitBuilder.Classes;


public class CircuitObject {
    
    private String image;
    private Vertex vertexRight;
    private Vertex vertexLeft;

    
    public CircuitObject(){     
        this.vertexLeft = new Vertex();
        this.vertexRight = new Vertex();
        vertexLeft.setId(Vertex.total++);
        vertexRight.setId(Vertex.total++);
    }    
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
    public double getXRight(){
        return vertexRight.getXAxis();
    }
    
    public void SetXRight(double x){
        vertexRight.setXAxis(x);
    }
    
    public double getYRight(){
        return vertexRight.getYAxis();
    }
    
    public void SetYRight(double y){
        vertexRight.setYAxis(y);
    }
    
    public double getXLeft(){
        return vertexLeft.getXAxis();
    }
    
    public void SetXLeft(double x){
        vertexLeft.setXAxis(x);
    }
    
    public double getYLeft(){
        return vertexLeft.getYAxis();
    }
    
    public void SetYLeft(double y){
        vertexLeft.setXAxis(y);
    }    
}
