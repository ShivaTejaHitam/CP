

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

class Solution {
    
    static void weirdDFS(int[][] graph,int n,int i,int j,String string,ArrayList<String> answer){
        
        
        if(i < 0 || i >= n || j < 0 || j >=n || graph[i][j]==0)
            return;
            
        if(i==n-1 && j == n-1){
            answer.add(string);
            return;
        }
        
        weirdDFS(graph,n,i+1,j,string + "D",answer);
        weirdDFS(graph,n,i,j+1,string + "R",answer);
        weirdDFS(graph,n,i-1,j,string + "U",answer);
        weirdDFS(graph,n,i,j-1,string + "L",answer);
        
    }
    
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> answer = new ArrayList<>();

        if(m[0][0]==0){
            answer.add("-1");
            return answer;
        }
        
        String string = "";
        weirdDFS(m,n,0,0,string,answer);
        
        return answer;
    }
}


