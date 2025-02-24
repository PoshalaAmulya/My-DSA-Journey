//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] nums, int target) {
        int i,j,f=-1,l=-1,mid;
        int n= nums.length;
        i=0;j=n-1;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                f= mid;
                j=mid-1;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        i=0;j=n-1;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                l= mid;
                i=mid+1;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        int ans=0;
        if(f!=-1 && l!=-1){
            ans=(l-f+1);
        }
        else
        ans=0;
        return ans;
        // code here
    }
}
