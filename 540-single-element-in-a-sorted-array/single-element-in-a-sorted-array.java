class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i,j;
        i=0;
        int n=nums.length-1;
        if(n==0)
        return nums[n];
        j=n;
        if(nums[0]!=nums[1])
        return nums[0];
        if(nums[j]!=nums[j-1])
        return nums[j];
        i=1;j=n-1;
        while(i<=j){
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                return nums[i];
            }
            if(nums[j]!=nums[j-1] && nums[j]!=nums[j+1]){
                return nums[j];
            }
            i++;
            j--;
        }
        return -1;
        
    }
}