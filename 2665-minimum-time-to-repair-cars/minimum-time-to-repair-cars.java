class Solution {
    public boolean isPossible(long time,int[] ranks,int cars){
        long res=0;
        for(int i=0;i<ranks.length;i++){
            res=res+((int)Math.sqrt(1.0*time/ranks[i]));
        }
        if(res>=cars) return true;
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
        long i,low,high;
        low=1;
        high=(long)(1e14);
        // for(i=0;i<ranks.length;i++){
        //     high=Math.max(ranks[i],high);
        // }
        // high=high*(cars*cars);
        long ans=-1;
        while(low<=high){
            long mid=(low+high)/2;
            if(isPossible(mid,ranks,cars)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}