class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] grid= new int[m][n];
        int i,j;
        if(obstacleGrid[m-1][n-1]==1 || obstacleGrid[0][0]==1) return 0;
        for(i=0;i<m;i++){
            if(obstacleGrid[i][0]!=1)
            grid[i][0]=1;
            else{
                break;
            }
        }
        for(j=0;j<n;j++){
            if(obstacleGrid[0][j]!=1){
                grid[0][j]=1;
            }
            else{
                break;
            }
        }
        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                if(i-1>=0 && j-1>=0){
                    if(obstacleGrid[i-1][j]==1){
                        grid[i-1][j]=0;
                    }
                    if(obstacleGrid[i][j-1]==1){
                        grid[i][j-1]=0;
                    }
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
            }
        }
        return grid[m-1][n-1];
    }
}