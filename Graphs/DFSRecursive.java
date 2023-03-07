
static void DFS(Map<Integer,ArrayList<Integer>> graph,int source){
  visited[source] = true;
  
  for(Integer node : graph.get(source)){
    if(visited[node]==false){
      DFS(graph,node);
    }
  }
  
}
