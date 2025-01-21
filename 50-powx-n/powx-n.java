class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        int i;
        int f=0;
        if(x==1){
            return 1;
        }
        else if(x==-1){
            if(n%2==0) return 1;
            return -1;
        }
        if(n<0){
            f=1;
        }
        n=Math.abs(n);
        if(n<0)
        return 0;
        // System.out.println(n);
        while(n>0){
            if(n%2==0){
                n=(n/2);
                x=x*x;
            }
            else{
                n=n-1;
                ans=ans*x;
            }
            // System.out.println(x+" "+ans);
        }
        // ans=ans*x;
        // System.out.println(ans);
        if(f==1){
            ans=(1/ans);
        }
        return ans;
        
    }
}