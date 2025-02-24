class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=-1;
        int i=0,j=nums.length-1,mid=0;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                pos=mid;
                i=mid+1;
            }
            else{
                pos=mid;
                j=mid-1;
            }
        }
        if(target<nums[mid])
        return mid;
        return mid+1;
        
    }
}