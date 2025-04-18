//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int q = sc.nextInt();
      int ind[]=new int[q]; 
      for(int i=0;i<q;i++) ind[i]=sc.nextInt();
      Solution obj = new Solution();
      int ans[] = obj.count_NGEs(n,a,q,ind);
      for(int e : ans)
      System.out.print(e+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
      Stack<Integer> st= new Stack<>();
      Stack<Integer> min_stack= new Stack<>();
      int i;
      int res[]= new int[N];
      int ans[]= new int[queries];
    //   st.push(arr[N-1]);
      min_stack.push(arr[N-1]);
      res[N-1]=0;
      int c=0;
      for(i=N-2;i>=0;i--){
        while(min_stack.size()>0 && min_stack.peek()<=arr[i]){
            st.push(min_stack.pop());
        }
        res[i]=min_stack.size();
        min_stack.push(arr[i]);
        while(st.size()>0){
            min_stack.push(st.pop());
        }
      }
      int y=0;
      for(int x: indices){
          ans[y++]=res[x];
      }
      return ans;
    // code here

     
  }
}
     