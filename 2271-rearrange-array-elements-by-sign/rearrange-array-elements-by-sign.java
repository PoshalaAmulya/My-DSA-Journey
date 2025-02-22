class Solution {
    public int[] rearrangeArray(int[] nums) {
        int odd=1;
        int even =0;
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[even]=nums[i];
                even+=2;
            }
            else{
                ans[odd]=nums[i];
                odd+=2;
            }

        }
        return ans;
    }
}