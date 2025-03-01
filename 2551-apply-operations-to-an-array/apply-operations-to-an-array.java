class Solution {
    public int[] applyOperations(int[] nums) {
        int i,j;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
            }
        }
        i=0;j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        return nums;
        
    }
}