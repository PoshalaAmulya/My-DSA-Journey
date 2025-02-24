//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

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
    
    public int[] getFloorAndCeil(int x, int[] arr) {
        
        int i,j,mid,ans=-1;
        Arrays.sort(arr);
        int rem[]= new int[2];
        i=0;
        j=arr.length-1;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==x){
                ans=mid;
                j=mid-1;
            }
            else if(arr[mid]>x){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        if(findFloor(arr,x)!=-1)
        rem[0]=arr[findFloor(arr,x)];
        else
        rem[0]=-1;
        if(ans!=-1)
        rem[1]=arr[ans];
        else
        rem[1]=-1;
        return rem;
        // code here
    }
}
