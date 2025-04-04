class Solution {
    public int fun(int[]nums,int i,int[] dp){
        if(i>=nums.length) 
        return 0;
        if(i==nums.length-1)
        return nums[i];
        if(dp[i]!=-1){
            return dp[i];
        }
        int take= nums[i]+fun(nums,i+2,dp);
        int not_take=fun(nums,i+1,dp);
        return dp[i]= Math.max(take,not_take);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return fun(nums,0,dp);
        // int ans=0;
        
        // for(int i=0;i<dp.length;i++){
        //     ans=Math.max(dp[i],ans);
        // }
        // return ans;
    }
}