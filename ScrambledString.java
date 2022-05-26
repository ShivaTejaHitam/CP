class ScrambledString {
    
    static boolean solve(String s1,String s2){
      
        if(s1.equals(s2)){
            return true;
        }
        // if both are of length 1 and not equal, the function could have already returned 
        if(s1.length() <= 1){
            return false;
        }
        
        int length = s1.length(); 
        for(int i = 1 ; i < length ; i++){
            
            boolean condition1 = solve(s1.substring(0,i),s2.substring(length-i,length)) && solve(s1.substring(i,length),s2.substring(0,length-i));
            boolean condition2 = solve(s1.substring(0,i),s2.substring(0,i)) && 
                solve(s1.substring(i,length),s2.substring(i,length));
                
            if( condition1 || condition2) {
               return true;
            }
        }
        
        return false;
    }
    
    public boolean isScramble(String s1, String s2) {
        
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.length()==0 && s2.length() == 0){
            return true;
        }
        
        return solve(s1,s2);
        
    }
}
