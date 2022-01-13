def DFS(graph,startnode):
    visited=[startnode]
    stack=[startnode]

    while(len(stack)!=0):
        vertex=stack.pop()
        print(vertex)
        for node in graph[vertex]:
            if node not in visited:
                visited.append(node)
                stack.append(node)

graph={'a':['b','c'],'b':['a','d'],'c':['a','d'],'d':['e'],'e':['a']}

DFS(graph,'a')
