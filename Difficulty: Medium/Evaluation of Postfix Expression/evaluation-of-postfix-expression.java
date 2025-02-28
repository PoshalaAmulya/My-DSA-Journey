//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends


class Solution {
    public int evaluate(String[] arr) {
        Stack<Integer> st=new Stack<>();
        int i;
        for(i=0;i<arr.length;i++){
            String str= arr[i];
            if(str.equals("+")){
                int ele1= st.pop();
                int ele2= st.pop();
                st.push(ele1+ele2);
            }
            else if(str.equals("-")){
                int ele1= st.pop();
                int ele2= st.pop();
                st.push(ele2-ele1);
            }
            else if(str.equals("*")){
                int ele1= st.pop();
                int ele2= st.pop();
                st.push(ele1*ele2);
            }
            else if(str.equals("/")){
                int ele1= st.pop();
                int ele2= st.pop();
                st.push(ele2/ele1);
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }
        return st.pop();
        // code here
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int t = Integer.parseInt(line);
        while (t-- > 0) {
            line = reader.readLine();
            String[] arr = line.split(" ");
            Solution solution = new Solution();
            System.out.println(solution.evaluate(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends