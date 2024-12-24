public void BFS(Map<Integer,List<Integer>> graph, int source) {
    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    queue.offer(source);

    while(!queue.isEmpty()){
      int currentElement = queue.poll();
      System.out.println(currentElement);
      for(int i : graph.get(currentElement)){
          if(visited.contains(i) == false){
             queue.offer(i);
          }
      }
    }
}
