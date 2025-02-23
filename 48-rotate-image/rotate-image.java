class Solution {
    public void rotate(int[][] matrix) {
        int i,j;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                if(i>j){
                    int temp= matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length/2;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
        return;
        
    }
}