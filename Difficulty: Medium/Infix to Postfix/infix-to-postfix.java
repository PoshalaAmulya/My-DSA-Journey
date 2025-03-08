//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        hm.put('(',0);
        hm.put('+',1);
        hm.put('-',1);
        hm.put('*',2);
        hm.put('/',2);
        hm.put('^',3);
        int i;
        String ans="";
        Stack<Character> st= new Stack<>();
        for(i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(Character.isLetter(ch)|| Character.isDigit(ch)){
                ans+=ch;
            }
            else{
                if(st.size()==0){
                    st.push(ch);
                }
                else if(ch==')'){
                    while(st.size()>0 && st.peek()!='('){
                        ans+=st.pop();
                    }
                    st.pop();
                }
                else if(ch=='('){
                    st.push(ch);
                }
                else if(st.size()>0 && hm.get(ch)<=hm.get(st.peek())){
                    while(st.size()>0 && hm.get(ch)<=hm.get(st.peek())){
                        ans+=st.pop();
                    }
                    st.push(ch);
                }
                else{
                    st.push(ch);
                }
            }
        }
        while(st.size()>0){
            ans+=st.pop();
        }
        return ans;
        // Your code here
    }
}