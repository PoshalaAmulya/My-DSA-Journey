class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i,j,f=-1,l=-1,mid;
        int n= nums.length;
        i=0;j=n-1;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                f= mid;
                j=mid-1;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        i=0;j=n-1;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                l= mid;
                i=mid+1;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        int ans[]= new int[2];
        ans[0]=f;
        ans[1]=l;
        return ans;
        
    }
}