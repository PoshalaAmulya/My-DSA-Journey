class Solution {
    public int minimumIndex(List<Integer> nums) {
        int max_cnt=0;
        int max_ele=0;
        int n=nums.size();
        HashMap<Integer,Integer> hm= new HashMap<>();
        int i;
        for(int x: nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
            // System.out.println(max_cnt+" "+hm.get(x));
            if(hm.get(x)>max_cnt){
                max_cnt=hm.get(x);
                max_ele=x;
            }
        }
        int len0;
        int cnt=0;
        int pos=-1;
        for(i=0;i<nums.size();i++){
            if(max_ele==nums.get(i)){
                cnt++;
            }
            // System.out.println(cnt+" "+(i+1)/2);
            if(cnt>(i+1)/2){
                if((max_cnt-cnt)>(n-i-1)/2){
                    return i;
                }
            }
        }
       
        return -1;
    }
}