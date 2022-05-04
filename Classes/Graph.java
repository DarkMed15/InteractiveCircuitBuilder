package InteractiveCircuitBuilder.Classes;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Graph {
    List<List<Integer>> graph;
    ArrayList<Integer> numbers = new ArrayList<>();
    boolean visited[];
    int nodes;

    public Graph(int nodes) {
        graph = new ArrayList<>();
        visited = new boolean[nodes];
        this.nodes = nodes;

        for (int i = 0; i < nodes; i++) {
            graph.add(i, new ArrayList<>());
            
        }
    }    
    
    public List<List<Integer>> getGraph() {
        return graph;
    }

    public void setGraph(List<List<Integer>> graph) {
        this.graph = graph;
    }    
    
    public boolean[] getVisited() {
        return visited;
    }
    
    public void addEdge(int a, int b) {
        if (!graph.get(a).contains(b)){
            graph.get(a).add(b);
        }
        if (!graph.get(b).contains(a)){
            graph.get(b).add(a);
        }
        if (!numbers.contains(b)) {
            numbers.add(b);
        }
        if (!numbers.contains(a)){
            numbers.add(a);
        }
    }
    
    

    public boolean isGraphConnected() {
        int startIndex = 0;
        dfs(startIndex);
        
        for (Integer nb: numbers){
            if (!visited[nb]){
                return false;
            }                
        }
        return true;
    }
    
    public void dfs(int start) {
      Stack<Integer> stack = new Stack<>();

      stack.push(start);
      visited[start] = true;

      while(!stack.isEmpty()) {

        Integer node = stack.pop();

        List<Integer> neighboursList = graph.get(node);

        for(Integer neighbour: neighboursList) {
          if(!visited[neighbour]) {
            stack.push(neighbour);
            visited[neighbour] = true;
          }
        }
      }
    }
    
     

    public boolean isReachable(int start, int end) {
        if (start == end){
            return true;
        }
        
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visited[start] = true;

        while(!stack.isEmpty()) {

            start = stack.pop();

            for(int i = 0; i<graph.get(start).size(); i++) {
                if (graph.get(start).get(i) == end)
                    return true;
                if(!visited[graph.get(start).get(i)]) {
                    stack.push(graph.get(start).get(i));
                    visited[graph.get(start).get(i)] = true;
                }
            }
        }
        return false;
    }
    
    
}
        
        
/*
public class GraphProblems {

  public static void main(String[] args) {
    int nodes = 7;
    
    Graph a = new Graph(nodes);
    
    a.addEdge(0, 1);
    a.addEdge(0, 2);
    a.addEdge(1, 3);
    a.addEdge(2, 4);
    a.addEdge(3, 5);
    a.addEdge(4, 5);
    //a.addEdge(4, 6);

    System.out.println(a.ifGraphConnected());
  }

}*/