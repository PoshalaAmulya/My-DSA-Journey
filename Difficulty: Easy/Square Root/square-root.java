//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        if(n==1) return 1;
        int i=1;
        int j=n/2,mid=0;
        int ans=0;
        while(i<=j){
            mid=(i+j)/2;
            if((mid*mid)==n){
                ans=mid;
                return ans;
            }
            else if(mid*mid>=n){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return j;
        // Your code here
    }
}
