//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        int i,j;
        int c=0;
        i=0;
        j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                int ele1=arr[i];
                int ele2=arr[j];
                int c1=0;
                int c2=0;
                while(i<=j && ele1==arr[i]){
                    i++;
                    c1++;
                }
                while(i<=j && ele2==arr[j]){
                    j--;
                    c2++;
                }
                if(ele1==ele2){
                    c+=((c1)*(c1-1))/2;
                }
                else{
                    c+=(c1*c2);
                    //System.out.println(c+" "+c1+" "+c2);
                }
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
            
        }
        return c;
        // Complete the function
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends