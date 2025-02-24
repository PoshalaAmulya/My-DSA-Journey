class Solution {
    public int b(int[] nums,int t,int s,int e){
        int i,j,mid;
        i=s;j=e;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==t){
                return mid;
            }
            else if(nums[mid]<t){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot=nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                pivot=i;
            }
        }
        int a1=-1,a2=-1;
        a1=b(nums,target,0,pivot);
        a2=b(nums,target,pivot+1,nums.length-1);
        if(a1!=-1) return a1;
        else if(a2!=-1) return a2;
        return -1;

        
    }
}