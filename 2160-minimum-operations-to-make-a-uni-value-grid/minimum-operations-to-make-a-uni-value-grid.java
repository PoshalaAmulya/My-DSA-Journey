class Solution {
    public int minOperations(int[][] grid, int x) {
        if(grid.length==1 && grid[0].length==1) 
        return 0;
        int i=0;
        int j;
        int c=0;
        int m=grid.length;
        int n=grid[0].length;
        int arr[]= new int[m*n];
        int l=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[l++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int ele= arr[(m*n)/2];
        for(i=0;i<m*n;i++){
            if(Math.abs(arr[i]-ele)%x!=0){
                return -1;
            }
            else{
                c+=(Math.abs(arr[i]-ele)/x);
            }
        }

        return c;
    }
}