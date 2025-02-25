class Solution {
    public boolean search(int[] nums, int target) {
        int i,j,mid;
        int n= nums.length;
        if(n==1){
            if(nums[0]==target) return true;
        }
        j=n-1;
        i=0;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target) 
            return true;
            else if(nums[i]==nums[mid]&& nums[mid]==nums[j]){
                i++;
                j--;
            }
            //left side sorted
            else if(nums[mid]>=nums[i]){
                if(target>=nums[i] && target<=nums[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target<=nums[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return false;
    }
}