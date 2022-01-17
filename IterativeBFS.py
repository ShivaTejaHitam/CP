def BFS(graph,startnode):
    visited={startnode:1}
    queue=[startnode]

    while(len(queue)!=0):
        vertex=queue.pop(0)
        print(vertex,end='->')
        for node in graph[vertex]:
            if(visited.has_key(node)==False):
                visited[node]=1
                queue.append(node)



graph={'a':['b','c'],'b':['a','d'],'c':['a','d'],'d':['e'],'e':['a']}

BFS(graph,'a')


static void BFS(HashMap<Integer,ArrayList<Integer>> graph,int startNode)
    {
        HashMap<Integer,Integer> visited=new HashMap<>();
        ArrayList<Integer> queue=new ArrayList<>();
        
        visited.put(startNode,1);
        queue.add(startNode);
        
        while(queue.size!=0)
        {
            int vertex=queue.remove(0);
            System.out.print(vertex+" ");
            for(Integer node: graph.get(vertex))
            {
                if(visited.containsKey(node)==false)
                {
                    visited.put(node,1);
                    queue.add(node);
                }
            }
        }
        
    }
