class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j;
        int t=0;
        int c=0;
        for(j=0;j<nums.length;j++){
            if(nums[j]==0){
                t++;
            }
            while(t>k){
                c=Math.max(c,j-i);
                if(nums[i]==0){
                    t--;
                }
                i++;
            }
        }
        c=Math.max(c,j-i);
        return c;
    }
}