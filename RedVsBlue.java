import java.util.Scanner;

class RedVsBlue{

    

    static void binarySearch(char[] matches, int start,int end,int count){

        if(start <= end && count>0){
            int mid = (start+end)/2;
            matches[mid] = 'B';
            count--;
            binarySearch(matches,0,mid -1,count);
            binarySearch(matches,mid+1,end,count);
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int tc = Integer.parseInt(scanner.nextLine());

        for(int t = 0 ;t<tc;t++){

            int n = scanner.nextInt();
            int r = scanner.nextInt();
            int b = scanner.nextInt();

            char[] matches = new char[n];

            
            binarySearch(matches,0,n-1,b);
                
            

            for(int i = 0 ; i < n ; i++){
                if(matches[i] != 'B'){
                    matches[i] = 'R';
                }
                System.out.print(matches[i]);
            }

            System.out.println();
        }
        
    }
}

