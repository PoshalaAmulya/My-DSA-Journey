class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0,j;
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        hm.put(0,1);
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-goal)){
                ans+=hm.get(sum-goal);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            // System.out.println(sum+" "+ans+" "+(goal-sum));
        }
    
        return ans;
    }
}