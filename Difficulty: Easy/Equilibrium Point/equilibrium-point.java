//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(
                    token)); // Use Integer.parseInt to parse int values
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling equilibriumPoint() function
            System.out.println(obj.findEquilibrium(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int pre[]= new int[arr.length];
        int suff[]= new int[arr.length];
        int i;
        pre[0]=arr[0];
        suff[arr.length-1]=arr[arr.length-1];
        for(i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        for(i=arr.length-2;i>=0;i--){
            suff[i]=suff[i+1]+arr[i];
        }
        for(i=1;i<arr.length-1;i++){
            if(pre[i]==suff[i]){
                return i;
            }
        }
        return -1;
        // code here
    }
}
