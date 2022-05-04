package InteractiveCircuitBuilder.main;

import InteractiveCircuitBuilder.Classes.CircuitObject;
import InteractiveCircuitBuilder.Classes.Graph;


public class algorithmTest {

    
    public static void main(String[] args) {
        Graph theGraph = new Graph(8);
        
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 7);
        theGraph.addEdge(7, 4);
        theGraph.addEdge(1, 2);
        
        boolean a = theGraph.isReachable(0, 2);
        
        System.out.println(a);
        
    }
    
}
