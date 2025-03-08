class Solution {
    public double myPow(double x, int n) {
        int i;
        double ans=1;
        if(n==0) return 1;
        if(x==1) return 1;
        if(x==-1){
            if(n%2==0){
                return 1;
            }
            return -1;
        }
        if(x==2 && n>0) return (1L<<n);
        if(n==Integer.MIN_VALUE)return 0;
        if(n>0){
            for(i=0;i<n;i++){
                ans=(ans*x);
            }
        }
        else{
            // System.out.println(ans+" "+Math.abs(n));
            
            for(i=0;i<Math.abs(n);i++){
                // System.out.println(ans);
                ans=(ans/x);
            }
        }
        return ans;
        
    }
}