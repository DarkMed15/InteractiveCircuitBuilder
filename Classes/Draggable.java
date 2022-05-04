/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InteractiveCircuitBuilder.Classes;

import javafx.scene.Cursor;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Draggable {
   
    private static class Position {
        double x;
        double y;
    }
   
    public void makeDraggable(ImageView node){
        final Position pos = new Position();

        node.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> node.setCursor(Cursor.HAND));
        node.addEventHandler(MouseEvent.MOUSE_EXITED, event -> node.setCursor(Cursor.DEFAULT));
        node.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            node.setCursor(Cursor.MOVE);
            pos.x = event.getSceneX();
            pos.y = event.getSceneY();
        });

        node.addEventHandler(MouseEvent.MOUSE_DRAGGED, event -> {
            double xChange = event.getSceneX() - pos.x;
            double yChange = event.getSceneY() - pos.y;
            node.setTranslateX(node.getTranslateX() + xChange);
            node.setTranslateY(node.getTranslateY() + yChange);

            pos.x = event.getSceneX();
            pos.y = event.getSceneY();
        });
        
        /*node.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {  
                
            for(CircuitObject c : Storage.getInstance().getArray()){

                double Obj1RightX = node.getTranslateX() + node.getFitWidth() + node.getLayoutX();
                double Obj1LeftX = node.getTranslateX() + node.getLayoutX();
                double Obj1Y = node.getFitHeight()/2 + node.getLayoutY() + node.getTranslateY();

                double cRightX = c.getSprite().getTranslateX() + c.getSprite().getImage().getWidth() + c.getSprite().getLayoutX();
                double cLeftX = c.getSprite().getTranslateX() + c.getSprite().getLayoutX();
                double cY = c.getSprite().getTranslateY() + c.getSprite().getLayoutY() + c.getSprite().getFitHeight()/2;
                    
                if(node == c.getSprite())
                    continue;                
                
                if(Math.abs(Obj1RightX - cLeftX) < 30 && Math.abs(Obj1Y - cY) < 30)
                    break;
                
                if(Math.abs(Obj1LeftX - cRightX) < 30 && Math.abs(Obj1Y - cY) < 30)
                    break;
                
                if(Math.abs(Obj1RightX - cRightX) < 30 && Math.abs(Obj1Y - cY) < 30){}
                
                if(Math.abs(Obj1LeftX - cLeftX) < 30 && Math.abs(Obj1Y - cY) < 30){}
            }

        });*/
    }
}
    
