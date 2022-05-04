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
public class Switch extends CircuitObject{
    
    private boolean isOn;
    public static int countSwitch;
    private final int MAXCOUNTSWITCH = 5;
    
    public Switch(ImageView s){
        super(s);
        countSwitch++;
    }
    
    public void setIsOn (boolean isOn){
        this.isOn = isOn;
        countSwitch++;
    }
    
    public boolean getIsOn(){
        return isOn;
    }

    public int getCountSwitch() {
        return countSwitch;
    }

    public void setCountSwitch(int countSwitch) {
        this.countSwitch = countSwitch;
    }
    
}
