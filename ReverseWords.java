class Solution 
{
    String reverseWords(String S)
    {
        if(S.length()==1)
            return S;
            
        String result = "";
        String temp = "";
        for(int i = S.length()-1 ; i >=0 ;i--){
            if(S.charAt(i)=='.'){
                result = result + temp + ".";
                temp = "";
            }
            else{
                temp = String.valueOf(S.charAt(i)) + temp;
            }
        }
        
        result = result + temp;
        return result;
    }
}
