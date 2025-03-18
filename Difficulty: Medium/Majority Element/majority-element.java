//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        Arrays.sort(arr);
        int n= arr.length;
        n=(n/2);
        int freq=0;
        int ele= arr[n];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                freq++;
            }
        }
        // System.out.println(ele+" "+n+" "+freq);
        if(freq>n) return ele;
        return -1;
        // your code here
    }
}