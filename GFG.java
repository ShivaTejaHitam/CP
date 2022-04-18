
import java.util.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String randomSequence = sc.nextLine();
		
		char[] arr = randomSequence.toCharArray();
		
		int K = Integer.parseInt(sc.nextLine());
		
		for(int  i = 0 ; i < arr.length ; i++)
		{
		    if(Integer.parseInt(String.valueOf(arr[i]))%2 ==1)
		    {
		        arr[i] = arr[(i+K)%arr.length];

                System.out.println("The value was :" + ((i+K)%arr.length));
		    }
		}
		
          
		for(int i = 0; i < arr.length ; i++)
		{
		    System.out.print(arr[i]);
		}
	}
}