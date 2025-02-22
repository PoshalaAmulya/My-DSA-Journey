//{ Driver Code Starts
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String token : tokens) {
                nums.add(Integer.parseInt(token));
            }
            int[] arr = new int[nums.size()];
            int idx = 0;
            for (int i : nums) arr[idx++] = i;
            Solution solution = new Solution();
            System.out.println(solution.pairWithMaxSum(arr));

            System.out.println("~");
        }

        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        int sum=0,i;
        for(i=0;i<arr.length;i++){
            if(i==0){
                sum=Math.max(sum,arr[i]+arr[i+1]);
            }
            else if(i>0 && i<arr.length-1)
            sum=Math.max(Math.max(arr[i]+arr[i-1],arr[i]+arr[i+1]),sum);
            else{
                sum=Math.max(sum,arr[i-1]+arr[i]);
            }
        }
        
        return sum;
        // Your code goes here
    }
}