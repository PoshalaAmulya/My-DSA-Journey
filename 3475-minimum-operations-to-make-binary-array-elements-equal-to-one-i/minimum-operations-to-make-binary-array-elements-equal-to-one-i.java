class Solution {
    public int minOperations(int[] nums) {
        int i=0,c=0;
        for(i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                c++;
                int j=i;
                while(j-i<3 && j<nums.length){
                    nums[j]=(nums[j]^1);
                    j++;
                }
            }
        }
        // System.out.println(i);
        
        if(nums[nums.length-1]==1 && nums[nums.length-2]==1)
        return c;
        return -1;
    }
}