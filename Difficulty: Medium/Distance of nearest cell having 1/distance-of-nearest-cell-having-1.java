//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        Queue<int[]> q= new LinkedList<>();
        int i,j;
        int m=grid.length;
        int n=grid[0].length;
        int[][] ans= new int[m][n];
        int[][] visited= new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]==1){
                    int arr[]=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    q.add(arr);
                    visited[i][j]=1;
                }
            }
        }
        int posx[]={-1,0,1,0};
        int posy[]={0,1,0,-1};
        
        while(q.size()>0){
            int arr[]=q.remove();
            int x=arr[0];
            int y=arr[1];
            for(int p=0;p<4;p++){
                if(x+posx[p]>=0 && x+posx[p]<m && y+posy[p]>=0 && y+posy[p]<n){
                    int new_x=x+posx[p]; int new_y=y+posy[p];
                    if(ans[new_x][new_y]==0 && visited[new_x][new_y]==0){
                        ans[new_x][new_y]=ans[x][y]+1;
                        int a[]=new int[2];
                        a[0]=new_x;
                        a[1]=new_y;
                        q.add(a);
                        visited[new_x][new_y]=1;
                    }
                    
                }
            }
            
        }
        
        return ans;
        // Code here
    }
}