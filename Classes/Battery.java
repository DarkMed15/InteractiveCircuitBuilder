/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InteractiveCircuitBuilder.Classes;

import javafx.scene.image.ImageView;

/**
 *
 * @author paulk
 */
public class Battery extends CircuitObject{
    
    private double voltage;
    public static int countBattery;
    private final int MAXCOUNTBATTERY = 1;
    
    public Battery(ImageView s){  
        super(s);
        countBattery++;
    }
    
    public Battery(double voltage, ImageView s){
        super(s);
        this.voltage = voltage;
        countBattery++;
    }
    
    
    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
   
    public int getCountBattery() {
        return countBattery;
    }

    public void setCountBattery(int countBattery) {
        this.countBattery = countBattery;
    }
}
