class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n==1) return x;
        if(x==0) return 0;
        if(x==1) return 1;
        if(x==-1){
            if(n%2==0) return 1;
            return -1;
        }
        int N= Math.abs(n);
        if(N<0) return 0;
        double ans=1;
        while(N>1){
            if(N%2==0){
                x=(x*x);
                N=(N/2);
            }
            else{
                ans=(ans*x);
                N=N-1;
            }
            // System.out.println(ans);
        }
        ans=ans*x;
        if(n<0) return 1/ans;
        return ans;
        
    }
}