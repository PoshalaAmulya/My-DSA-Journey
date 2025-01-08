class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0,j=0;
        int ans=0;
        int freq;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                freq= j-i;
                if(freq==1){
                    return nums[i];
                }
                i=j;
            }
        }
        return nums[j-1];
        
    }
}