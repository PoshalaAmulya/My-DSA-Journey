//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int d = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            ArrayList<Integer> result = ob.subarraySum(nums, d);
            // Print all elements in the result list
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println(); // Print a new line after the result
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int i,j;
        ArrayList<Integer> al= new ArrayList<>();
        int sum=0;
        if(arr.length==1){
            if(arr[0]==target){
                al.add(0);
                return al;
            } 
            al.add(-1);
            return al;
        }
        i=0;j=0;
        while(j<arr.length){
            sum=sum+arr[j];
            while(i<j && sum>target){
                sum=sum-arr[i];
                i++;
            }
            if(sum==target){
                al.add(i+1);
                al.add(j+1);
                return al;
            }
            j++;
        }
        al.add(-1);
        return al;
        // code here
    }
}
