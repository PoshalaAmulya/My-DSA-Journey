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
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public static void fun(String str,int i,int n,List<String> ans){
        if(str.length()==n){
            ans.add(str);
        }
        else if (str.charAt(i-1)=='0'){
            fun(str+"0",i+1,n,ans);
            fun(str+"1",i+1,n,ans);
        }
        else{
            fun(str+"0",i+1,n,ans);
        }
    }
  public static List<String> generateBinaryStrings(int n) {
    // code here
    List<String> ans= new ArrayList<>();
    int i;
    String str="";
    fun(str+"0",1,n,ans);
    fun(str+"1",1,n,ans);
    return ans;
    

  }
}
     
     