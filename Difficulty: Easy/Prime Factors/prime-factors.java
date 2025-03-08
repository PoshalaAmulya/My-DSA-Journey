//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
    int[] p= new int[1000000];
    Solution(){
        
    }
    public int[] AllPrimeFactors(int N)
    {
        //seive
        ArrayList<Integer> al= new ArrayList<>();
        Arrays.fill(p,1);
        p[0]=0;
        p[1]=0;
        
        for(int i=0;i*i<=N;i++){
            if(p[i]==1){
                for(int j=i+i;j<=N;j=j+i){
                    if(p[j]==1){
                        p[j]=0;
                    }
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(N%i==0 && p[i]==1)
            al.add(i);
        }
        int ans[]= new int[al.size()];
        int k=0;
        for(int x: al)
        ans[k++]=x;
        return ans;
        // code here
    }
}