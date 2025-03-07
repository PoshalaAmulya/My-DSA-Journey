class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max=0;
        int t=1,i;
        ArrayList<Integer> al= new ArrayList<>();
        for(i=0;i<arr.length;i++){
            while(arr[i]!=t){
                // al.add(t);
                k--;
                if(k==0){
                    return t;
                }
                t++;
            }
            t++;
        }
        return t+k-1;
        
        
    }
}