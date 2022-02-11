static int helper(int i,int j,int[] arr,int[][] dp)
    {
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        
        int x = arr[i] + Math.min(helper(i+1,j-1,arr,dp),helper(i+2,j,arr,dp));
        int y = arr[j] + Math.min(helper(i,j-2,arr,dp),helper(i+1,j-1,arr,dp));
        
        return dp[i][j] = Math.max(x,y);
    }
