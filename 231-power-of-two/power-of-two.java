class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        if(n==0) return false;
        while(n>0){
            int bit=(n&1);
            if(bit!=0) c++;
            n=(n>>1);
            if(c>1) return false;
        }
        if(c==1)
        return true;
        return false;
    }
}