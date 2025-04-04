//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int res = obj.maximumPoints(arr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int allPoints(int[][] arr,int n,int t,int[][]dp){
        //n==day, t=task on that day;
        //n==0 i.e the first day , we can just eliminate the prev
        //task performed and return the max of remaining task;
        int max=0;
        if(n<0) return 0;
        if(n==0){
            for(int j=0;j<3;j++){
                if(j!=t){
                    max=Math.max(max,arr[0][j]);
                }
            }
            return max;
        }
        if(dp[n][t]!=-1){
            return dp[n][t];
        }
        for(int j=0;j<3;j++){
            if(j!=t){
                if(n>=arr.length){
                    n=n-1;
                }
                max=Math.max(max,arr[n][j]+allPoints(arr,n-1,j,dp));
            }
        }
        return dp[n][t]=max;
    }
    public int maximumPoints(int arr[][]) {
        int n=arr.length;
        int dp[][]= new int[n+1][4];
        int i,j;
        for(i=0;i<=n;i++){
            for(j=0;j<=3;j++){
                dp[i][j]=-1;
            }
        }
        
        return allPoints(arr,n,3,dp);
        // code here
    }
}