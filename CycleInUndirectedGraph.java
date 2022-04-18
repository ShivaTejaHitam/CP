import java.util.*;

class Graph{

    private int VERTICES;
    private LinkedList<Integer> adj[];

    Graph(int vertices){
        VERTICES = vertices;
        adj = new LinkedList[vertices];
        for(int i = 0 ; i < vertices ; i++){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int startNode,int destNode){
        adj[startNode].add(destNode);
        adj[destNode].add(startNode);
    }

    boolean cycleDFS(int start,boolean[] visited,int parent){
        visited[start] = true;
        System.out.println(start);

        for(Integer node : adj[start])
        {
            if (visited[node]==false)
                return cycleDFS(node,visited,start);
            else if(visited[node] == true && node!=parent)
                return true;
        }
        return false;
    }

    boolean isCyclic(){

        boolean visited[] = new boolean[VERTICES];
        for(int i = 0 ; i < VERTICES ; i++){
            visited[i] = false;
        }

        for(int i = 0 ; i < VERTICES ; i++){
            if(visited[i] == false){
                if(cycleDFS(i,visited,-1))
                    return true;
            }
        }

        return false;
    }

    public static void main(String args[]){
        Graph graph = new Graph(5);

        graph.addEdge(1,0);
        graph.addEdge(0,2);
       // graph.addEdge(1,2);
        graph.addEdge(0,3);                
        graph.addEdge(3,4);

        if(graph.isCyclic())
            System.out.println("The Graph is Cyclic");
        else
            System.out.println("Graph is Acyclic");

        Graph g2 = new Graph(3);
        g2.addEdge(0,1);
        g2.addEdge(1,2);

        if(g2.isCyclic())
            System.out.println("The Graph is Cyclic");
        else
            System.out.println("Graph is Acyclic");

    }

}