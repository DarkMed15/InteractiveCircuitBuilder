/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InteractiveCircuitBuilder;

/**
 *
 * @author paulk
 */
public class Wire extends CircuitObject{
    
    
    private double length;
    private double current;
    public static int countWire;
    private final int MAXCOUNTWIRE = 30;
    
    public Wire(){        
        countWire++;
    }
    
    public Wire(double length, double current){
        countWire++;
        this.length = length;
        this.current = current;
    }
    
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }    
    
    
    public int getCountWire() {
        return countWire;
    }

    public void setCountWire(int countWire) {
        this.countWire = countWire;
    }
}
