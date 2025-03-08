class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        int i;
        int n=nums.length;
        n= (1<<n);
        for(i=0;i<n;i++){
            List<Integer> li= new ArrayList<>();
            int c=0;
            int num=i;
            while(num>0){
                int bit=(num&1);
                if(bit!=0){
                    // System.out.println(nums[c]);
                    li.add(nums[c]);
                }
                num=(num>>1);
                c++;
            }
            ans.add(li);
        }
        return ans;
    }
}