class Solution {
    long mod=(long)(1e9+7);
    public long pow(long ans,int a,long n){
        if(n==0){
            return ans;
        }
        if(n%2==0){
           a=(int)(((a%mod)*(a%mod))%mod);
           n=n/2;
        }
        else{
            ans=((ans%mod)*(a%mod))%mod;
            n=n-1;
        }
        return pow(ans,a,n);
        
    }
    public int countGoodNumbers(long n) {
        long even=pow(1,5,(n+1)/2);
        long odd=pow(1,4,(n/2));
        // System.out.println(even+" "+odd);
        int ans= (int)(((even%mod)*(odd%mod))%mod);
        return ans; 
    }
}