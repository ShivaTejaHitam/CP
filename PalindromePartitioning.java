class Solution {
    
    public boolean isPalindrome(String string,int i,int j){
        while(i < j)
        {
            if(string.charAt(i) != string.charAt(j))
                 return false; 
            i++;
            j--;
        }
        return true;
    }
    
    public int palindromePartition(String s,int start,int end){
        if(start>=end || isPalindrome(s,start,end)){
            return 0;
        }
        
        int minCuts = Integer.MAX_VALUE;
        int temp;
        for(int k = start ; k < end; k++){
             temp = 1 + palindromePartition(s,start,k)+palindromePartition(s,k+1,end);
            minCuts = Math.min(minCuts,temp);
        }
        
        return minCuts;
    }
    
    
    
    public int minCut(String s) {
        return palindromePartition(s,0,s.length()-1);
        
    }
}
