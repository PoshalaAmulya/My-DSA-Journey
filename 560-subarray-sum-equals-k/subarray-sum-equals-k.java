class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashSet<Integer> hs= new HashSet<>();
        // int i;
        // hs.add(0);
        // int sum=0;
        // int c=0;
        // for(i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(hs.contains(sum-k)){
        //         c++;
        //     }
        //     hs.add(sum);
        // }

        HashMap<Integer,Integer> hm= new HashMap<>();
        int c=0,sum=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
                c+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }

        return c;
        
        
    }
}