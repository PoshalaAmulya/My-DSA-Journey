//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            int x = V;
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());

            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
                adj.get(edges[i][0]).add(edges[i][1]);
            }

            ArrayList<Integer> res = new Solution().topoSort(V, edges);

            if (check(adj, x, res) == true)
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }

    static boolean check(ArrayList<ArrayList<Integer>> adj, int V,
                         ArrayList<Integer> res) {

        if (V != res.size()) return false;

        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res.get(i)] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        int[] ind= new int[V];
        int i,j;
        HashMap<Integer,List<Integer>> adgL= new HashMap<>();
        for(i=0;i<V;i++){
            adgL.put(i,new ArrayList<>());
        }
        for(i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adgL.get(u).add(v);
            // if(adgL.containsKey(u)){
            //     List<Integer> li= adgL.get(u);
            //     li.add(v);
            //     adgL.put(u,li);
            // }
            // else{
            //     List<Integer> li= new ArrayList<>();
            //     li.add(v);
            //     adgL.put(u,li);
            // }
            ind[v]++;
        }
        Queue<Integer> q= new LinkedList<>();
        for(i=0;i<V;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        while(q.size()>0){
            int node= q.remove();
            ans.add(node);
            List<Integer> al= adgL.get(node);
            for(int x: al){
                ind[x]--;
                if(ind[x]==0){
                    q.add(x);
                }
            }
        }
        return ans;
        
        
    }
}