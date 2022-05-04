package InteractiveCircuitBuilder.Classes;

import java.util.ArrayList;

/**
 *
 * @author paulk
 */
public class Storage {
    
     private static final Storage instance = new Storage();     
     static ArrayList<CircuitObject> images = new ArrayList<CircuitObject>();
     
     
     private Storage(){ 
     }
     
     public static Storage getInstance(){
        return instance;
     }
     
     public void addObj(CircuitObject c){
         images.add(c);
     }
     
     public void print(){
         System.out.print(images);
     }
     
     public ArrayList<CircuitObject> getArray(){
         return images;
     }
     
}
