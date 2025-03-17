class Solution {
    public boolean divideArray(int[] nums) {
        int i,j,n;
        Arrays.sort(nums);
        if(nums.length<=1)
        return false;
        j=1;i=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                int len= j-i;
                if(len%2!=0){
                    return false;
                }
                i=j;
            }
            j++;
        }
        if((j-i)%2==0)
        return true;
        return false;
        // HashMap<Integer,Integer> hm= new HashMap<>();
        // for(i=0;i<nums.length;i++){
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // }
        // for(int x: hm.keySet()){
        //     if(hm.get(x)%2!=0)
        //     return false;
        // }
        // return true;
        
    }
}