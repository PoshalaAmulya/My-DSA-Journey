//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        
        BigInteger ele1= new BigInteger(s1);
        BigInteger ele2= new BigInteger(s2);
        BigInteger ans= ele1.multiply(ele2);
        return ans.toString();
        //code here.
    }
}