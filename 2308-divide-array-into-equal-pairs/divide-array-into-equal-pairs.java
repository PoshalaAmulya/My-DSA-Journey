class Solution {
    public boolean divideArray(int[] nums) {
        int i,n;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int x: hm.keySet()){
            if(hm.get(x)%2!=0)
            return false;
        }
        return true;
        
    }
}