import java.util.*;

class shortestpath
{   
    static int[] convert(String s){
        String[] str=s.split(" ");
        int[] arr=new int[str.length];
        
        for(int i=0;i<arr.length;i++)
            arr[i]=Integer.parseInt(str[i]);
            
        return arr;
    }
    
    static int next_node(int[] dist,boolean[] visited,int n)
    {
        int shortest_dist_node=Integer.MAX_VALUE;
        int index_of_sdn=-1;
        
        for(int i=0;i<n;i++)
        {
            if(dist[i]<=shortest_dist_node && visited[i]==false)
            {
                shortest_dist_node=dist[i];
                index_of_sdn=i;
            }
        }
        return index_of_sdn;
    }
    
    static void Dijkstra(int[][] graph,int start,int n,int[] prev,int[] dist)
    {
        
        boolean visited[]=new boolean[n];
        
        for(int i=0;i<n;i++)
        {
            dist[i]=Integer.MAX_VALUE;
            visited[i]=false;
        }
        
        dist[start]=0;
        prev[start] = 0;

        for(int i=0;i<n-1;i++)
        {
            int u=next_node(dist,visited,n);
            visited[u]=true;
            
            for(int v=0;v<n;v++)
            {
                if(visited[v]==false && graph[u][v]!=0 && dist[u]+graph[u][v]<dist[v])
                {
                    dist[v]=dist[u]+graph[u][v];
                    prev[v]=u;
                }
            }
                                                                   
        } 
    }

    static void printSolution(int[] prev,int dist[],int start){
        for(int i = 0 ; i < dist.length ; i++){
            System.out.println("The Distance of node " + i + " from Starting Node is " + dist[i]);
            System.out.print("The path is : " + i + "->");
            int j = i;
            while(j !=start){
                System.out.print(prev[j])+"->");
                j = prev[j];
            }
            System.out.println(start);
        }
    }

    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] nm=convert(sc.nextLine());
        int n=nm[0];
        int m=nm[1];
        int[][] graph=new int[n][n];
        int start=Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<m;i++)
        {
            int path[]=convert(sc.nextLine());
            graph[path[0]-1][path[1]-1]=path[2];
            // made a mistake here
            graph[path[1]-1][path[0]-1]=path[2];
        }
        
        int dist[] = new int[n];
        int prev[] = new int[n];
        Dijkstra(graph,0,n,prev,dist);
        printSolution(int[] prev,int[] dist);
        
    }
}
