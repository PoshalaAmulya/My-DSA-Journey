//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); 
        while(t-->0)
        {
            int n = Integer.parseInt(read.readLine()); 
            int a[] = new int[n];
            
            String line = read.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            
            Compute obj = new Compute();
            System.out.println( obj.findEqualPoint(a, n) );
            
        
System.out.println("~");
}
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute 
{
    static int findEqualPoint(int arr[], int n) 
	{
	    ArrayList<Integer> al= new ArrayList<>();
	    int i;
	    int prev=-1;
	    for(i=0;i<n;i++){
	        if(arr[i]!=prev){
	            al.add(arr[i]);
	        }
	        prev=arr[i];
	    }
	    if(al.size()%2==0) return -1;
	    int ele= al.get(al.size()/2);
	    for(i=0;i<n;i++){
	        if(ele==arr[i]) return i;
	    }
	    return -1;
	    // Your code goes here
	}
} 
