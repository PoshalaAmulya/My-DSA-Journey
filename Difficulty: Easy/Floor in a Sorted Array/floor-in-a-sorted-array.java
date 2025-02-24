//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends
class Solution {

    static int findFloor(int[] arr, int k) {
        int ans=-1,mid=0;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==k){
                ans=mid;
                return ans;
            }
            else if(arr[mid]<k){
                ans=mid;
                i=mid+1;
            }
            else if(arr[mid]>k){
                j=mid-1;
            }
        }
        return ans;
        // write code here
    }
}


//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

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

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.findFloor(arr, k);

            System.out.print(ans);

            System.out.println(); // New line after printing the results
        }
    }
}

// } Driver Code Ends