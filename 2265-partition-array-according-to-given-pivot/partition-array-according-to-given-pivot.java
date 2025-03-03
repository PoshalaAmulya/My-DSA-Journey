class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans= new int[nums.length];
        int k=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[k++]=nums[i];
            }
        }
        
        for(i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ans[k++]=pivot;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans[k++]=nums[i];
            }
        }
        return ans;


        
    }
}