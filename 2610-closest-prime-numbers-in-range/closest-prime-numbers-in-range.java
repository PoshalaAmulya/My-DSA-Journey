class Solution {
    int prime[]= new int[(int)(1e6)+1];
    public void seive(){
        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;
        int n= (int)(1e6);
        for(int i=2;i*i<=n;i++){
            for(int j=i+i;j<=n;j=j+i){
                if( j<prime.length && prime[j]==1){
                    prime[j]=0;
                }
            }
        }
        return ;
    }
    public int[] closestPrimes(int left, int right) {
        int[] ans= new int[2];
        int k=0;
        seive();
        int ele1=-1,ele2=-1;
        int next=-1;
        ans[0]=-1;
        ans[1]=-1;
        for(int i=left;i<=right;i++){
            if(prime[i]==1){
                if(ans[0]==-1){
                    ans[0]=i;
                }
                else if(ans[1]==-1){
                    ans[1]=i;
                }
                else if(ans[1]-ans[0]>i-ans[1]){
                    ans[0]=ans[1];
                    ans[1]=i;
                }
                else{
                    if(next==-1 || ans[1]-ans[0]<=i-next )
                    next=i;
                    else
                    {
                        ans[0]=next;
                        ans[1]=i;
                    }
                }
                // System.out.println(ans[0]+" "+ans[1]+" "+next+" "+i);
                    
            }
        }
        if(ans[0]==-1 || ans[1]==-1){
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;

        
    }
}