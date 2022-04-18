import java.util.Scanner;

class Init{

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


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int tc = Integer.parseInt(scanner.nextLine());

        for(int t = 0 ;t<tc;t++){
            
            
        }
        
    }
}
