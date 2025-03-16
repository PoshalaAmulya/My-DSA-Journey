class Solution {
    public boolean isPossible(long time,int[] ranks,int cars){
        long res=0;
        for(int i=0;i<ranks.length;i++){
            res=res+((long)Math.sqrt(time/ranks[i]));
        }
        if(res>=cars) return true;
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
        int  i;
        long high,low=1;
        // high=(int)1e6;
        // for(i=0;i<ranks.length;i++){
        //     high=(int)Math.max(ranks[i],high);
        // }
        // high=high*(cars*cars);
        // if(high<0){
        high=(long)1e14;
        //     //100*10^6*10^6;
        // }
        // long  ans=high;
        while(low<high){
            long mid=(low+high)/2;
            // System.out.println(mid);
            if(isPossible(mid,ranks,cars)){
                high=mid;
            }
            else{
                low=mid+1;
            }
            // System.out.println(ans);
        }
        return low;
        
    }
}