class Solution {
    public int longestNiceSubarray(int[] nums) {
        if(nums.length==0) return 1;
        long num=0l;
        int i=0,j=1;
        int ans=1;
        num=(num|nums[0]);
        while(j<nums.length){
            if((nums[j]&num)==0){
                num=(num|nums[j]); // adding the number set bits
                j++;
            }
            else{
                ans=Math.max(j-i,ans);
                while(i<j && ((num&nums[j])!=0)){
                    num=(num^nums[i]); // removing the number set bits
                    i++;
                }
            }
        }
        ans=Math.max(ans,j-i);
        return ans;
    }
}