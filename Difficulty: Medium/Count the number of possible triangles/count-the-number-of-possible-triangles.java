//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countTriangles(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int i,j,k;
        // int sum=0;
        int c=0;
        for(i=0;i<arr.length-2;i++){
            for(j=i+1;j<arr.length-1;j++){
                for(k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]>arr[k]){
                        c++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        
        return c;
        // code here
    }
}