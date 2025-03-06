class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        HashSet<Integer> hs= new HashSet<>();
        int i,j;
        int n=grid[0].length;
        n=(n*n);
        int total=(n*(n+1))/2;
        int sum=0;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[i].length;j++){
                if(hs.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                }
                else{
                    hs.add(grid[i][j]);
                    sum+=grid[i][j];
                }
                
            }
        }
        ans[1]=total-sum;
        return ans;
    }
}