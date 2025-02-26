class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ans[]= s.split(" ");
        StringBuilder res= new StringBuilder();
        int i;
        for(i=ans.length-1;i>=1;i--){
            
        
            if(ans[i].length()>0){
                        
                res.append(ans[i]);
                res.append(" ");
            }
        }
        res.append(ans[0]);
        return res.toString();
        
    }
}