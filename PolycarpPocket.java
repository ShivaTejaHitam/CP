import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PolycarpPocket{

    static int[] convert(String s){
        String[] str=s.split(" ");
        int[] num=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            num[i]=Integer.parseInt(str[i]);
        }     
        return num;
    }


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       
            int n = Integer.parseInt(scanner.nextLine());
            HashMap<Integer,Integer> hashmap = new HashMap<>();
            int[] a = convert(scanner.nextLine());

            for(Integer i : a){
                if(hashmap.containsKey(i)){
                    hashmap.put(i,hashmap.get(i)+1);
                }
                else{
                    hashmap.put(i,1);
                }
            }

            int pockets = Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> entry : hashmap.entrySet()){

                pockets = Math.max(entry.getValue(),pockets);

            }

        System.out.println(pockets);
        
        
    }
}
