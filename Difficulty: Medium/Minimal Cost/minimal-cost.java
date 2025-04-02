//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    // public int fun(int[] dp,int i){
    //     if(i==0)
    //     return 0;
    //     if(i==1){
    //         return height[0];
    //     }
        
    // }
    public int minimizeCost(int k, int arr[]) {
        int dp[]= new int[arr.length];
        dp[0]=0;
        dp[1]=Math.abs(arr[1]-arr[0]);
        int i=2;
        for(i=2;i<arr.length;i++){
            int ans=Integer.MAX_VALUE;
            int temp=k;
            int j=i-1;
            for(temp=k;temp>0 && j>=0;temp--,j--){
                ans=Math.min(ans,Math.abs(arr[i]-arr[j])+dp[j]);
            }
            dp[i]=ans;
        }
        return dp[arr.length-1];
        // code here
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends