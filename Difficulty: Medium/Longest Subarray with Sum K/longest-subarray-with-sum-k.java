//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int k = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution();
            int ans = ob.longestSubarray(nums, k); // Call the function and store result
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int ans=0;
        //HashSet<Integer> hs= new HashSet<>();
        HashMap<Integer,Integer> hm= new HashMap<>();
        hm.put(0,-1);
        int i;
        // hs.add(0);
        int t_sum=0;
        for(i=0;i<arr.length;i++){
            t_sum+=arr[i];
            // if(t_sum==k){
            //     ans=Math.max(ans,i+1);
            // }
            if(hm.containsKey(t_sum-k)){
                ans=Math.max(ans,i-hm.get(t_sum-k));
            }
            if(!hm.containsKey(t_sum))
            hm.put(t_sum,i);
        }
        return ans;
        // code here
    }
}
