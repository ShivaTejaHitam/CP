def DFS(graph,startnode):
    visited={startnode:1}
    stack=[startnode]

    while(len(stack)!=0):
        vertex=stack.pop()
        print(vertex)
        for node in graph[vertex]:
            if visited.has_key(node)==False:
                visited[node]=True
                stack.append(node)
                
graph={'a':['b','c'],'b':['a','d'],'c':['a','d'],'d':['e'],'e':['a']}

DFS(graph,'a')
