class Solution {
    static int[][] dp = new int[2001][2001];
    
    public boolean isPalindrome(char[] string,int i,int j){
        
        if(i==j || i>j)
            return true;
        
        
        while(i < j)
        {
            if(string[i] != string[j])
                 return false; 
            i++;
            j--;
        }
        return true;
    }
    
    public int palindromePartition(String s,int start,int end,int[][] dp){
        if(start>=end){
            return 0;
        }
        
        
        if(dp[start][end]!=-1){
            return dp[start][end];
        }
        
        if(isPalindrome(s.toCharArray(),start,end)){
            dp[start][end] = 0;
            return 0;
        }
        
        
        int minCuts = Integer.MAX_VALUE;
        int temp;
        for(int k = start ; k < end; k++){
             int left = dp[start][k];
             int right = dp[k+1][end];
             if(dp[start][k]==-1){
                 dp[start][k] = palindromePartition(s,start,k,dp);
                 left = dp[start][k];
             }
            
             if(dp[k+1][end]==-1){
                 dp[k+1][end] = palindromePartition(s,k+1,end,dp);
                 right = dp[k+1][end];
             }
            temp = 1 + left + right;
            minCuts = Math.min(minCuts,temp);
        }
        
        return dp[start][end]=minCuts;
    }
    
    
    
    public int minCut(String s) {
        
        for(int i = 0 ; i <= s.length() ; i++){
            for(int j = 0 ; j <= s.length() ;j++){
                dp[i][j] = -1;
            }
        }
        
        return palindromePartition(s,0,s.length()-1,dp);
    }
}
