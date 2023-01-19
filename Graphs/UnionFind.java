
class Solution
{
    // with Path compression
    public void union_(int a, int b, int par[], int rank[])
    {
        int aRoot = find(a,par);
        int bRoot = find(b,par);
        
        if(aRoot == bRoot) return;
        
        if(rank[aRoot]<rank[bRoot]){
            par[aRoot] = bRoot;
        }
        else if(rank[bRoot]<rank[aRoot]){
            par[bRoot] = aRoot;
        }
        else{
            par[bRoot] = aRoot;
            rank[aRoot] = rank[aRoot] + 1;
        }
    }
    
    //with path compression
    public int find(int x,int par[]){
        if(par[x]!=x){
            par[x] = find(par[x],par);
        }
        return par[x];
    }
    
    //without path compression
    public void union(int a,int b,int[] par){
        int x = find(a,par);
        int y = find(b,par);
        if(x==y) return;
        par[x] = y;
    }
    
    //without path compression
    public int find(int x,int[] par){
        if(par[x]==x){
            return x;
        }
        return find(par[x],par);
    }
    
    public Boolean isConnected(int a, int b, int par[], int rank[])
    {
        if(find(a,par)!=find(b,par)){
            return false;
        }
        return true;
    }
}
