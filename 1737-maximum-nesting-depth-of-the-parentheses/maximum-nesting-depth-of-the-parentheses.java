class Solution {
    public int maxDepth(String s) {
        int max=0;
        int o=0;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                o++;
            }
            else if(s.charAt(i)==')'){
                o--;
            }
            max=Math.max(o,max);
        }
        return max;
        
    }
}