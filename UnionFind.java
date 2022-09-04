class Solution
{
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
    
    public int find(int x,int par[]){
        if(par[x]!=x){
            par[x] = find(par[x],par);
        }
        return par[x];
    }
    
    public Boolean isConnected(int a, int b, int par[], int rank[])
    {
        if(find(a,par)!=find(b,par)){
            return false;
        }
        
        return true;
    }

}
