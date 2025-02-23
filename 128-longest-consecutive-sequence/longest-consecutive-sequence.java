class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs= new HashSet<>();
        int i;
        for(i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int c=0,max=0;
        for(int x: hs){
            int num=x;
            c=1;
            //If it doesn't contain prev elememnt, then this is may be the 
            // starting of the sequence.
            if(!hs.contains(num-1)){
                while(hs.contains(num+1)){
                    c++;
                    num++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
        
    }
}