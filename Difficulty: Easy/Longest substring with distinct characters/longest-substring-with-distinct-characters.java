//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        ////mnopqrnsty
        int ans=0;
        HashMap<Character,Integer> hm= new HashMap<>();
        int i=0,j=0;
        for(j=0;j<s.length();j++){
            char ch =s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.get(ch)>1){
                ans=Math.max(ans,hm.size());
                while(hm.get(ch)>1){
                    char c= s.charAt(i);
                    hm.put(c,hm.get(c)-1);
                    if(hm.get(c)==0){
                        hm.remove(c);
                    }
                    i++;
                    
                }
            }
        }
        ans= Math.max(ans,hm.size());
        return ans;
    }
}