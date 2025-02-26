class Solution {
    public String largestOddNumber(String num) {
        int i;
        for(i=num.length()-1;i>=0;i--){
            int n= num.charAt(i)-'0';
            if(n%2==0){
                continue;
            }
            else{
                break;
            }
        }
        if(i>=0)
        return num.substring(0,i+1);   
        return "";
    }
}