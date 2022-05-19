class NumberOfIslands {
    
    
    public void traverse(char[][] graph,int i,int j,int rows,int columns){
        
       if(i >= 0 && i < rows && j >= 0 && j < columns && graph[i][j]=='1'){
           
               graph[i][j]='2';
               traverse(graph,i+1,j,rows,columns);
               traverse(graph,i-1,j,rows,columns);
               traverse(graph,i,j+1,rows,columns);
               traverse(graph,i,j-1,rows,columns);
           
       }        
    }
    
    
    public int numIslands(char[][] grid) {
        
        int rows = grid.length;
        int columns = grid[0].length;
        int numberOfIslands = 0;
        
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                if(grid[i][j] == '1'){
                    traverse(grid,i,j,rows,columns);
                    numberOfIslands++;
                }
            }
        }
        
        return numberOfIslands;
    }
}
