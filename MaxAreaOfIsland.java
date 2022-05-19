class MaxAreaOfIsland {
    
    public int traverse(int[][] grid,int i,int j,int rows,int columns,int area){
        if(i>=0 && i<rows && j>=0 && j<columns && grid[i][j]==1){
            grid[i][j] = 0;
            area = 1+ traverse(grid,i+1,j,rows,columns,area)+ traverse(grid,i-1,j,rows,columns,area)
              +traverse(grid,i,j+1,rows,columns,area)+traverse(grid,i,j-1,rows,columns,area);
        }
        return area;
    }
    
    
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int area = 0;
        
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                if(grid[i][j] == 1){
                    area = Math.max(area,traverse(grid,i,j,rows,columns,0));
                }
            }
        }
        return area;
    }
}
