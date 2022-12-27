static boolean hasCycle(int start,HashMap<Integer,ArrayList<Integer>> graph,boolean[] visited,boolean[] onPath){

        visited[start] = true;
        onPath[start] = true;
        
        if(graph.get(start)!=null){
        for(int node : graph.get(start)){
            if(visited[node] == false ){
                boolean res = hasCycle(node,graph,visited,onPath);
                if(res==true) return res;
            }
            else if(onPath[node] == true){
                return true;
            }  
        }
        }
        onPath[start] = false;
        return false;
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses <=1 ) return true;
        if(prerequisites.length == 1) return true;

        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>();
        graph = toAdjList(prerequisites);
        boolean[] visited = new boolean[numCourses];
        boolean[] onPath = new boolean[numCourses];

        for(int i = 0 ; i < numCourses ;i++){
            if(hasCycle(i,graph,visited,onPath)==true) return false;
        }

        return true;
    }
