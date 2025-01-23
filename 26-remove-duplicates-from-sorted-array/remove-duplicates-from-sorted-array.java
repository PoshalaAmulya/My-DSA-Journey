class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j;
        j=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                i++;
            }
            else{
                nums[j]= nums[i];
                j++;
                i++;
            }
        }
        nums[j]=nums[i];
        return j+1;

    }
}