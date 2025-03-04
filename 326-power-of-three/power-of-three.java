class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n>0){
            System.out.println(n%3);
            if(n%3!=0 && n!=1) return false;
            n=(n/3);
        }
        return true;
        
    }
}