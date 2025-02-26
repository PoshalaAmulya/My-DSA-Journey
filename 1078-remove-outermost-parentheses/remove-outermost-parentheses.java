class Solution {
    public String removeOuterParentheses(String s) {
        int i,o=0,c=0;
        // String ans="";
        StringBuilder ans= new StringBuilder();
        for(i=0;i<s.length();i++){
            if(o==0){
                o++;
                continue;
            }
            if(s.charAt(i)=='('){
                o++;
            }
            else{
                c++;
            }
            if(c==o){
                o=0;
                c=0;
                continue;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}