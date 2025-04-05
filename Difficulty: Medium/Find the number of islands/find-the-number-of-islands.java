//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.countIslands(grid);
            System.out.println(ans);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    int x[]={-1,-1,0,1,1,1,0,-1};
    int y[]={0,1,1,1,0,-1,-1,-1};
    void dfs(char[][]grid,int[][]visited,int i,int j,int m,int n){
        if(i<0 || i>=m ||j<0 ||j>=n)
        return;
        if(grid[i][j]=='W')
        return;
        if(visited[i][j]==1){
            return;
        }
        visited[i][j]=1;
        grid[i][j]='W';
        for(int p=0;p<8;p++){
            dfs(grid,visited,i+x[p],j+y[p],m,n);
        }
        return;
    }
    public int countIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int visited[][]= new int[m][n];
        int ans=0,i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]=='L' && visited[i][j]==0){
                    dfs(grid,visited,i,j,m,n);
                    ans++;
                }
                
            }
        }
        return ans;
        // Code here
        
    }
}