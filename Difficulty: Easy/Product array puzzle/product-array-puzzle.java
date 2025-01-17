//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int[] ans = new int[n];
            ans = ob.productExceptSelf(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int pre[]= new int[arr.length];
        int suf[]= new int[arr.length];
        int i;
        pre[0]=arr[0];
        for(i=1;i<arr.length;i++){
            pre[i]=pre[i-1]*arr[i];
        }
        suf[arr.length-1]=arr[arr.length-1];
        for(i=arr.length-2;i>=0;i--){
            suf[i]=suf[i+1]*arr[i];
        }
        int ans[]= new int[arr.length];
        ans[0]=suf[1];
        ans[arr.length-1]=pre[arr.length-2];
        for(i=1;i<ans.length-1;i++){
            ans[i]=pre[i-1]*suf[i+1];
        }
        return ans;
        // code here
    }
}
