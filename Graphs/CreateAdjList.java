//for directed graph
static Map<Integer,List<Integer>> createAdjList(int[][] edges){
        Map<Integer,List<Integer>> adjList = new HashMap<>();
        int m = edges.length;

        for(int i = 0 ; i < m ; i++){
            if(adjList.containsKey(edges[i][0])){
                adjList.get(edges[i][0]).add(edges[i][1]);
            }
            else{
                List<Integer> arrayList = new ArrayList<>();
                arrayList.add(edges[i][1]);
                adjList.put(edges[i][0],arrayList);
            }
        }
        
        return adjList;
    }

// for undirected graph
static Map<Integer,List<Integer>> createAdjList(int[][] edges){
        Map<Integer,List<Integer>> adjList = new HashMap<>();
        int m = edges.length;

        for(int i = 0 ; i < m ; i++){
            if(adjList.containsKey(edges[i][0])){
                adjList.get(edges[i][0]).add(edges[i][1]);
            }
            else{
                List<Integer> arrayList = new ArrayList<>();
                arrayList.add(edges[i][1]);
                adjList.put(edges[i][0],arrayList);
            }
            
            if(adjList.containsKey(edges[i][1])){
                adjList.get(edges[i][1]).add(edges[i][0]);
            }
            else{
                List<Integer> arrayList = new ArrayList<>();
                arrayList.add(edges[i][0]);
                adjList.put(edges[i][1],arrayList);
            }
        }
        
        return adjList;
    }
