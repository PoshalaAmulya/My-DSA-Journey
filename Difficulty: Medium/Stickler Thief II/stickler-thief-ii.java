//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int n = s.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int[] arr = IntArray.input(br);

            Solution obj = new Solution();
            int res = obj.maxValue(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    int fun(int [] arr,int i,int[] dp,int n){
        if(i>=n) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int f1= arr[i]+fun(arr,i+2,dp,n);
        int f2= fun(arr,i+1,dp,n);
        return dp[i]=Math.max(f1,f2);
    }
    int maxValue(int[] arr) {
        // code her
        int n=arr.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);
        int ans1=fun(arr,0,dp,n-1);
        Arrays.fill(dp,-1);
        int ans2=fun(arr,1,dp,n);
        return Math.max(ans1,ans2);
        
    }
}
