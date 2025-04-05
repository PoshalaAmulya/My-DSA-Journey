class Solution {
    int minPath(List<List<Integer>> li,int i,int j,int rows,int[][] dp){
        if(i==rows-1 && j<li.get(i).size())
        return dp[i][j]=li.get(i).get(j);
        if(i>=rows) return Integer.MAX_VALUE;
        if(j>=li.get(i).size()) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int down= minPath(li,i+1,j,rows,dp);
        int downRight=minPath(li,i+1,j+1,rows,dp);
        return dp[i][j]=li.get(i).get(j)+Math.min(down,downRight);

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows=triangle.size();
        int dp[][]=new int[rows][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                dp[i][j]=-1;
            }
        }
        minPath(triangle,0,0,rows,dp);
        return dp[0][0];
    }
}