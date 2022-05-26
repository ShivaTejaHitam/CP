class ScrambledString {
    
    static boolean solve(String s1,String s2,Map<String,Boolean> map){
        
        
        
        if(s1.equals(s2)){
            return true;
        }
        // if both are of length 1 and not equal, the function could have already returned 
        if(s1.length() <= 1){
            return false;
        }
        
        String key = s1+" "+s2;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int length = s1.length(); 
        for(int i = 1 ; i < length ; i++){
            
            boolean condition1 = solve(s1.substring(0,i),s2.substring(length-i,length),map) && solve(s1.substring(i,length),s2.substring(0,length-i),map);
            boolean condition2 = solve(s1.substring(0,i),s2.substring(0,i),map) && 
                solve(s1.substring(i,length),s2.substring(i,length),map);
                
            if( condition1 || condition2) {
               map.put(key,true);
               return true;
            }
            
        }
        map.put(key,false);
        return false;
    }
    
    public boolean isScramble(String s1, String s2) {
        
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.length()==0 && s2.length() == 0){
            return true;
        }
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        
        return solve(s1,s2,map);
        
    }
}
