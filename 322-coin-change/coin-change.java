class Solution {
    public int fun(int[] c, int idx, int amt,int[][] dp){
        //Memoization//
        if(amt==0){
            return dp[idx][0]= 0;
        }
        if(idx==0){
            if((amt%c[idx])==0){
                return dp[0][amt]= amt/c[idx];
            }
            return  dp[0][amt]=Integer.MAX_VALUE;
        }
        if(dp[idx][amt]!=-1){
            return dp[idx][amt];
        }
        int notTake= fun(c,idx-1,amt,dp);
        int take=Integer.MAX_VALUE;
        if(c[idx]<=amt){
            int res= fun(c,idx,amt-c[idx],dp);
            if(res!=Integer.MAX_VALUE)
            take= 1+res;
        }
        return dp[idx][amt]= Math.min(take,notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][]= new int[coins.length][amount+1];
        int i,j;
        //Tabulation
        //BaseCASE:
        for(j=1;j<=amount;j++){
            if((j%coins[0])==0)
            dp[0][j]=(j/coins[0]);
            else{
                dp[0][j]=Integer.MAX_VALUE;
            }
        }
        for(int idx=1;idx<coins.length;idx++){
            for(int amt=0;amt<=amount;amt++){
                int notTake= dp[idx-1][amt];
                int take=Integer.MAX_VALUE;
                if(coins[idx]<=amt){
                    int res= dp[idx][amt-coins[idx]];
                    if(res!=Integer.MAX_VALUE)
                    take= 1+res;
                }
                dp[idx][amt]= Math.min(take,notTake);
            }
        }
        if(dp[coins.length-1][amount]==Integer.MAX_VALUE) 
        return -1;
        return dp[coins.length-1][amount];
    }
}