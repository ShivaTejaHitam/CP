import java.util.*;


class interview
{
    static int minSteps(int[] arr,int position,int steps,int length){

         if(position >= length -1)
        {
            return steps;
        }
        if(arr[position]==0 || length == 1)
        {
            return 0;
        }                 
        int local_min = Integer.MAX_VALUE;
        if(position < length -1 )
        {
            for(int i = 1 ; i <= position + arr[position]  ; i++){
                local_min =  Math.min(minSteps(arr,position+i,steps+1,length),local_min);
            }
            
        }
        
        return local_min;
    }
     
    public static void main(String args[])
    {
       int[] arr = {2,3,1,7,4,2,1,2,3,2};
       int start = arr[0];
       int length = arr.length;

       System.out.println(minSteps(arr,0,0,length));
        
        
    }
}


