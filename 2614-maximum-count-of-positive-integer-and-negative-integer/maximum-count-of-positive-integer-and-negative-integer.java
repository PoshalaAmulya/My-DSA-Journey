class Solution {
    public int maximumCount(int[] nums) {
        int i,j;
        i=0;j=nums.length-1;
        int ans=0;
        
        while(i<=j){
            int mid= (i+j)/2;
            if(nums[mid]>=0){
                ans=mid;
                j=mid-1;
            }
            else{

                i=mid+1;
            }
        }
        int z=0;
        for(i=ans;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else break;
        }
        int pos=nums.length-ans;
        int neg=nums.length-pos;
        return Math.max(pos-z,neg);
        
    }
}