class Solution {
    
    public long coloredCells(int n) {
        
        long i;
        if(n==1) return 1;
        long prev=1,ans=0;
    
        for(i=2;i<=n;i++){
            long k= 4*i-4;
            ans=prev+k;
            // System.out.println(prev+" "+ans);
            prev=ans;
        }
        return ans;
        
        
    }
}