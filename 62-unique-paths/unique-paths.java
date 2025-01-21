class Solution {
    public int uniquePaths(int m, int n) {
        int mat[][]= new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                mat[i][0]=1;
                mat[0][j]=1;
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i-1>=0 && j-1>=0){
                    mat[i][j]=mat[i-1][j]+mat[i][j-1];
                }
            }
        }
        return mat[m-1][n-1];
    }
}