import java.util.*;


public class Ex
{
    
    static int[] convert(String s)
    {
        String[] str=s.split(" ");
        int[] num=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            num[i]=Integer.parseInt(str[i]);
        }     
        return num;
    }


    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
	int tc=Integer.parseInt(sc.nextLine());
	
        for(int t=0;t<tc;t++)
        {
	    

        }
    }
}

