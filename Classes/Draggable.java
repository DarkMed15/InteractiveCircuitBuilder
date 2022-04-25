/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InteractiveCircuitBuilder.Classes;

import javafx.scene.Cursor;
    import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class Draggable {
   
private static class Position {
    double x;
    double y;
  }

    public void makeDraggable(Node node){
 
        final Position pos = new Position();

    node.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> node.setCursor(Cursor.HAND));
    node.addEventHandler(MouseEvent.MOUSE_EXITED, event -> node.setCursor(Cursor.DEFAULT));

    node.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
      node.setCursor(Cursor.MOVE);

      pos.x = event.getX();
      pos.y = event.getY();
    });
    node.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> node.setCursor(Cursor.DEFAULT));

    node.addEventHandler(MouseEvent.MOUSE_DRAGGED, event -> {
      double distanceX = event.getX() - pos.x;
      double distanceY = event.getY() - pos.y;

      double x = node.getLayoutX() + distanceX;
      double y = node.getLayoutY() + distanceY;

      node.relocate(x, y);
    });
}
}
    
