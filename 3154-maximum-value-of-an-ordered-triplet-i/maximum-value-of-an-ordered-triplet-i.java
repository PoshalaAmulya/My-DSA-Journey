class Solution {
    public long maximumTripletValue(int[] nums) {
        int i,pres=0;
        long res=0,diff=0;
        int mod=(int)(1e9+7);
        for(i=0;i<nums.length;i++){
            // System.out.println(nums[i]*diff);
            res=Math.max(res,(long)(nums[i]*diff));
            diff=Math.max(diff,pres-nums[i]);
            pres=Math.max(nums[i],pres);
            
        }
        // res=Math.max(res,diff*nums[i-1]);
        return res;
    }
}