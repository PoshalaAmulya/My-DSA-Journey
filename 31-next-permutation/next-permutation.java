class Solution {
    public void nextPermutation(int[] nums) {
        int i=0;
        int ind=0;
        for(i=nums.length-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                ind=i;
                break;
            }
        }
        // System.out.println(ind);
        if(ind==0){
            Arrays.sort(nums);
            return;
        }
        for(i=nums.length-1;i>=ind;i--){
            if(nums[i]>nums[ind-1]){
                int temp=nums[i];
                nums[i]=nums[ind-1];
                nums[ind-1]=temp;
                break;
            }
        }
        int x=ind;
        int y=nums.length-1;
        while(x<y){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
            x++;y--;
        }
        return;
        
    }
}