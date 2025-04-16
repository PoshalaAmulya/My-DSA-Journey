class Solution {
    public boolean fun(int[] nums,int target,int idx,int[][] dp){
        if(target==0){
            return false;
        }
        if(idx==0){
            if(nums[0]==target){
                return true;
            }
            return false;
        }
        if(dp[idx][target]!=0){
            if(dp[idx][target]==1){
                return true;
            }
            return false;
        }
        boolean take=false;
        if(target>=nums[idx]){
            take=fun(nums,target-nums[idx],idx-1,dp);
        }
        boolean notTake=fun(nums,target,idx-1,dp);
        if((take||notTake)==true){
            dp[idx][target]=1;
        }
        else{
            dp[idx][target]=2;
        }
        return take||notTake;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        int i,j,n=nums.length;
        for(i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int dp[][]= new int[nums.length][(sum/2)+1];
        fun(nums,sum/2,nums.length-1,dp);
        if(dp[nums.length-1][(sum/2)]!=1) return false;
        return true;
        
        
    }
}