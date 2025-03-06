class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int i;
        for(int x: nums2){
            pq.add(x);
        }
        for(i=0;i<m;i++){
            if(pq.size()>0 && nums1[i]>pq.peek()){
                int temp=nums1[i];
                nums1[i]=pq.remove();
                pq.add(temp);
            }
        }
        while(pq.size()>0){
            nums1[i++]=pq.remove();
        }
        // return nums1;

        
    }
}