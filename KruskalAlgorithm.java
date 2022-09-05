class SortByDistance implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> a,ArrayList<Integer> b)    {
        return a.get(2) - b.get(2);
   }
}

public class Solution {
    static int find(int[] parent,int node){
        if(parent[node]==node) return node;
        return find(parent,parent[node]);
    }
    
    static void union(int a,int b,int[] parent){
        
        int x = find(parent,a);
        int y = find(parent,b);
        
        if(x==y) return;
        
        parent[b] = a;
    }
    
	public static int minimumSpanningTree(ArrayList<ArrayList<Integer>> edges, int n) {
		//Your code goes here
        int minCost = 0;
        Collections.sort(edges,new SortByDistance());
        int[] parent = new int[n];
        for(int i = 0 ; i < n ; i++){
            parent[i] = i;
        }
        
        for(int i = 0 ; i < n ; i++){
            int x = find(parent,edges.get(i).get(0));
            int y = find(parent,edges.get(i).get(1));
            
            if(x!=y) {
                minCost = minCost + edges.get(i).get(2);
                union(x,y,parent);
            }
            
        }
       
        return minCost;
	}
}
