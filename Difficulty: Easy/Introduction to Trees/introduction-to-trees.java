//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution obj = new Solution();
            int ans = obj.countNodes(n);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int countNodes(int i) {
        i=i-1;
        int ans=(1<<i);
        // System.out.println(i+" "+(int)Math.pow(2,i));
        return ans;
        // code here
    }
}