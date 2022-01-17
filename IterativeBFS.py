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
