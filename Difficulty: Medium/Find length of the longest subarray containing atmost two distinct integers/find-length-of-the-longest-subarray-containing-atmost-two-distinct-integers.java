//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            // Convert ArrayList to array
            Integer[] arr = new Integer[array.size()];
            array.toArray(arr);

            Solution ob = new Solution();

            // Call totalFruits method and print result
            Integer ans = ob.totalElements(arr);
            System.out.println(ans);

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int totalElements(Integer[] arr) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int i,j;
        i=0;j=0;
        int ans=0;
        while(j<arr.length){
            hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
            while(hm.size()>2 && i<j){
                ans=Math.max(ans,j-i);
                int v=hm.get(arr[i]);
                v--;
                if(v==0){
                    hm.remove(arr[i]);
                }
                else
                hm.put(arr[i],v);
                i++;
            }
            j++;
        }
        ans=Math.max(ans,j-i);
        return ans;
        // code here
    }
}