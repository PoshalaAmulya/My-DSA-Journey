//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    Solution ob= new Solution();
		    System.out.println(ob.countKdivPairs(arr, n, k));
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long countKdivPairs(int arr[], int n, int k)
    {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int i;
        long ans=0;
        for(i=0;i<arr.length;i++){
            int rem= (arr[i]%k);
            // System.out.println(rem);
            int req= k-rem;
            if(hm.containsKey(req)){
                ans+=hm.get(req);
            }
            else if(rem==0){
                if(hm.containsKey(0))
                ans+=hm.get(0);
            }
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return ans;
        //code here
    }
}