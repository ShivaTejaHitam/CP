import java.util.*;


public class subordinates
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

/* 5
   1 1 2 3 
   0 1 2 3 */



    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
	    int n = Integer.parseInt(sc.nextLine());
	
        for(int i = 0 ; i < n ; i++)
        {
            int[] managers = convert(sc.nextLine());

            HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();

            for(int j = 0 ; j< managers.length ; j++)
            {
                if(hm.containsKey(managers[j]))
                {
                    hm.get(managers[j]).add();
                }
                else
                {
                    hm.put(i,i+2)
                }
            }

        }
    }
}

