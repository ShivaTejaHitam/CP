void KMP(String text,String pattern)
{
  int text_length = text.length();
  int pattern_length = pattern_length();
  
  
  
}






int[] lps(String s,int length) {
        
        int[] lps = new int[length];
        int prev = 0;
        int i = 1; 
        lps[0] = 0;
        
        while(i < length)
        {
            if(s.charAt(i) == s.charAt(prev))
            {
                prev++;
                lps[i] = prev;
                i++;
            }
            else
            {
                if(prev != 0)
                {
                    prev = lps [prev - 1];
                }
                
                else
                {
                    lps[i] = prev;
                    i++;
                }
                
            }
            
        }
   // return prev; for returning length of LPS
   return lps; 
}
