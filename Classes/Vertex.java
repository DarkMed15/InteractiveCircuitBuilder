package InteractiveCircuitBuilder.Classes;

import java.util.ArrayList;


public class Vertex {
    static int total = 0;
    private Integer id;
    private double XAxis;
    private double YAxis;
    private ArrayList<Integer> connectedTo = new ArrayList<>();
    private int nbConnected = connectedTo.size();
    private boolean connected;
    
    public Vertex(){
    }
    
    public Vertex(Integer id, double x, double y, ArrayList<Integer> connectedTo, boolean isConnected){
        this.id = id;
        this.XAxis = x;
        this.YAxis = y;
        this.connectedTo = connectedTo;
        this.connected = isConnected;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    
    
    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Vertex.total = total;
    }

    public int getNbConnected() {
        return nbConnected;
    }

    public void setNbConnected(int nbConnected) {
        this.nbConnected = nbConnected;
    }
}
