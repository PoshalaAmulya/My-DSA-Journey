//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            // calling method findMaxSum() of class solve
            System.out.println(new Solution().findMaxSum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int fun(int arr[],int i,int[] dp){
        if(i<0) return 0;
        if(dp[i]!=0){
            return dp[i];
        }
        int f1=arr[i]+fun(arr,i-2,dp);
        int f2=fun(arr,i-1,dp);
        return dp[i]= Math.max(f1,f2);
    }
    public int findMaxSum(int arr[]) {
        int dp[]= new int[arr.length];
        return fun(arr,arr.length-1,dp);
        
        // code here
        
    }
}