void KMP(String text,String pattern)
{
  int text_length = text.length();
  int pattern_length = pattern_length();
  
  int lps[] = get_lps(pattern,pattern_length);
  int j = 0;
  int i = 0;
  
  while(i < text_length)
  {
    if(pattern.charAt(j) == text.charAt(i))
    {
       i++;
       j++;
    }
    if(j == pattern_length)
    {
       System.out.println("Pattern found at location " + (i - j));
       j = lps[j - 1];
    }
 
    else if(i < text_length && pattern.charAt(j) != text.charAt(i))
    {
       if(j != 0)
          j = lps[j - 1];
       else 
          i = i + 1;
    }
  }
}

int[] get_lps(String s,int length) {
        
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
