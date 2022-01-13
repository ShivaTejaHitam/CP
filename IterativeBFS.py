def BFS(graph,startnode):
    visited=[startnode]
    queue=[startnode]

    while(len(queue)!=0):
        vertex=queue.pop(0)
        print(vertex,end='->')
        for node in graph[vertex]:
            if(node not in visited):
                visited.append(node)
                queue.append(node)



graph={'a':['b','c'],'b':['a','d'],'c':['a','d'],'d':['e'],'e':['a']}

BFS(graph,'a')
