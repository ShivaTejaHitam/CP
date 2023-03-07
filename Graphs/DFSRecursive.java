
static void DFS(Map<Integer,ArrayList<Integer>> graph,int source){
  visited[source] = true;
  
  for(Integer vertex : graph.get(source)){
    if(visited[vertex]==false){
      DFS(graph,vertex);
    }
  }
  
}
