//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        
        ArrayList<Integer> ans= new ArrayList<>();
        Arrays.sort(arr);
        int a[]=new int[2];
        int i,j;
        int flag=0;
        i=0;j=arr.length-1;
        // PriorityQueue<Integer> pq= new PriorityQueue<>();
        while(i<j){
            int sum=arr[i]+arr[j];
            // System.out.println(sum+" "+a[0]+" "+a[1]);
            int diff= Math.abs(target-sum);
            if(flag==0){
                a[0]=arr[i];
                a[1]=arr[j];
                flag=1;
            }
            else{
                int prevDiff= Math.abs(target-a[0]-a[1]);
                if(diff<prevDiff){
                    a[0]=arr[i];
                    a[1]=arr[j];
                }
                else if(diff==prevDiff){
                    if(Math.abs(a[0]-a[1])<Math.abs(arr[i]-arr[j])){
                        a[0]=arr[i];
                        a[1]=arr[j];
                    }
                }
            }
            if(sum<target){
                i++;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        if(flag==0){
            return ans;
        }
        ans.add(a[0]);
        ans.add(a[1]);
        return ans;
        
        
        // code here
    }
}