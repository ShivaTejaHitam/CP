import java.util.Scanner;

class ArrayBalancing{

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

        for(int t = 0 ; t < tc ; t++){
            int n = Integer.parseInt(scanner.nextLine());
            int[] a = convert(scanner.nextLine());
            int[] b = convert(scanner.nextLine());
            int sum = 0;
            for(int i = 1 ; i < n ; i++){
                int aa = Math.abs(a[i]-a[i-1]);
                int bb = Math.abs(b[i]-b[i-1]);
                int ab = Math.abs(a[i] - b[i-1]);
                int ba = Math.abs(b[i] - a[i-1]);

                if(aa+bb>ab+ba){
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                }

            }

            for(int i = 1 ; i < n ; i++){
                sum = sum + Math.abs(a[i]-a[i-1]) + Math.abs(b[i]-b[i-1]);
            }

            System.out.println(sum);
        }
    }
}
