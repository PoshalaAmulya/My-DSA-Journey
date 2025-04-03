//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(mat);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        int i,j;
        Queue<int[]> q= new LinkedList<>();
        int m=mat.length;
        int n=mat[0].length;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]==2){
                    int arr[]=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    q.add(arr);
                }
            }
        }
        int posx[]={-1,0,1,0};
        int posy[]={0,1,0,-1};
        int ans=0;
        int f=0;
        while(q.size()>0){
            int s=q.size();
            f=0;
            while(s-->0){
                int[] arr= q.remove();
                i=arr[0];
                j=arr[1];
                for(int p=0;p<4;p++){
                    if(i+posx[p]>=0 && i+posx[p]<m && j+posy[p]>=0 && j+posy[p]<n){
                        int x=i+posx[p];
                        int y=j+posy[p];
                        if(mat[x][y]==1){
                            if(f==0) ans++;
                            f=1;
                            mat[x][y]=2;
                            int a[]=new int[2];
                            a[0]=x;
                            a[1]=y;
                            q.add(a);
                        }
                    }
                }
            }
            
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                // System.out.print(mat[i][j]+" ");
                if(mat[i][j]==1){
                    return -1;
                }
            }
            // System.out.println();
        }
        return ans;
    }
}