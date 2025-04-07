//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, edges);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    int leader[];
    boolean merge(int x,int y){
        int l1= find(x);
        int l2= find(y);
        if(l1==l2) return true;//cycle
        leader[l1]=l2;
        return false;
    }
    int find(int x){
        if(leader[x]==x){
            return leader[x];
        }
        return leader[x]=find(leader[x]);
    }
    public boolean isCycle(int V, int[][] edges) {
        int i;
        leader= new int[V];
        for(i=0;i<V;i++){
            leader[i]=i;
        }
        for(i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            if(merge(u,v)==true) return true;
            // return false;
        }
        return false;
        
        // Code here
        
    }
}