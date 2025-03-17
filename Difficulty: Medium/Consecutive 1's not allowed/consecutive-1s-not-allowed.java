//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            int ans = new Solution().countStrings(n);

            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countStrings(int n) {
        if(n==0) return 0;
        if(n==1) return 2;
        int prev_ones=1,prev_zeros= 1;
        int ones=0,zeros=0;
        n=n-1;
        while(n-->0){
            ones= prev_zeros;
            zeros=prev_zeros+prev_ones;
            prev_ones= ones;
            prev_zeros=zeros;
            
        }
        return ones+zeros;
        // code here
    }
}