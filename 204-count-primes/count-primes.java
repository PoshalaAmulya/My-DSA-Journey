class Solution {
    public int countPrimes(int n) {
        int[] p= new int[n+1];
        Arrays.fill(p,1);
        if(n==0) return 0;
        p[0]=0;
        p[1]=0;
        for(int i=2;i*i<=n;i++){
            if(p[i]==1){
                for(int j=i+i;j<=n;j=j+i){
                    if(p[j]==1){
                        p[j]=0;
                    }
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(p[i]==1) c++;
        }
        return c;
    }
}