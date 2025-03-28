//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            // Read the start times
            String[] startInput = reader.readLine().trim().split("\\s+");
            int[] start = new int[startInput.length];
            for (int i = 0; i < startInput.length; i++) {
                start[i] = Integer.parseInt(startInput[i]);
            }

            // Read the end times
            String[] endInput = reader.readLine().trim().split("\\s+");
            int[] finish = new int[endInput.length];
            for (int i = 0; i < endInput.length; i++) {
                finish[i] = Integer.parseInt(endInput[i]);
            }

            // Create solution object and call activitySelection
            Solution obj = new Solution();
            System.out.println(obj.activitySelection(start, finish));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class pair{
    int st,ed;
    pair(int st,int ed){
        this.st=st;
        this.ed=ed;
    }
}
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        PriorityQueue<pair> pq= new PriorityQueue<>((a,b)->{
            if(a.st<b.st)
            return -1;
            else if(a.st==b.st){
                if(a.ed<b.ed){
                    return -1;
                }
            }
            return 1;
        });
        for(int i=0;i<start.length;i++){
            pq.add(new pair(start[i],finish[i]));
        }
        int end=0,c=0,max=0;
        end= pq.remove().ed;
        while(pq.size()>0){
            pair p=pq.remove();
            int e= p.ed;
            int s=p.st;
            if(s<=end){ //overlap
                max=Math.max(max,c);
                end=Math.min(e,end);
            }
            else{ //not overlap
                // System.out.println(s+" "+e+" "+end);
                c++;
                end=Math.max(e,end);
            }
        }
        return c+1;
        // code here.
    }
}
