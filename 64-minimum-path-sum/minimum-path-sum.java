class Solution {
    int minPath(int[][]grid,int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1){
            return dp[i][j]=grid[i][j];
        }
        if(i>=m) 
        return Integer.MAX_VALUE;
        if(j>=n) 
        return Integer.MAX_VALUE;
        if(dp[i][j]!=0) return dp[i][j];
        int right=minPath(grid,i,j+1,m,n,dp);
        int down=minPath(grid,i+1,j,m,n,dp);
        if(right==Integer.MAX_VALUE && down==Integer.MAX_VALUE){
            right=0;
        }
        return dp[i][j]= grid[i][j]+Math.min(right,down);  
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]= new int[m][n];
        minPath(grid,0,0,m,n,dp);
        return dp[0][0];
    }
}