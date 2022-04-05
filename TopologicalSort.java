class Solution
{
    static void topoDFS(int start,ArrayList<ArrayList<Integer>> adj,boolean[] visited,Stack<Integer> stack){
        visited[start] = true;
        
        for(Integer node : adj.get(start)){
            if(visited[node] == false)
                topoDFS(node,adj,visited,stack);
        }
        
        stack.push(start);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        
        for(int v = 0 ; v < V ; v++){
            visited[v] = false;
        }
        
        for(int i = 0 ; i < V ; i++){
            if(visited[i] == false){
                topoDFS(i,adj,visited,stack);
            }
        }
        
        int[] order = new int[V];
        
        if(!stack.isEmpty()){
            for(int i = 0 ; i < V ; i++){
                order[i] = stack.pop();
            }
        }
        
        return order;
    }
}
