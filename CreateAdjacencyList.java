static HashMap<Integer,ArrayList<Integer>> createAdjList(int[][] edges){
        
        HashMap<Integer,ArrayList<Integer>> adjList = new HashMap<>();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < edges.length ; i++){
                    arr = adjList.containsKey(edges[i][0]) ? adjList.get(edges[i][0]) : new ArrayList<>();
                    arr.add(edges[i][1]);
                    adjList.put(edges[i][0],arr);
          
                    arr = adjList.containsKey(edges[i][1]) ? adjList.get(edges[i][1]) : new ArrayList<>();
                    arr.add(edges[i][0]);
                    adjList.put(edges[i][1],arr);
        }
        
        return adjList;
}
