class pair{
    int st,ed;
    pair(int st,int ed){
        this.st=st;
        this.ed=ed;
    }
}
class Solution {
    public List<Integer> partitionLabels(String s) {
        int i;
        List<Integer> ans= new ArrayList<>();
        HashMap<Character,int[]> hm= new HashMap<>();
        for(i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.get(s.charAt(i))[1]=i;
            }
            else{
                int[] arr= new int[2];
                arr[0]=i;
                arr[1]=i;
                hm.put(s.charAt(i),arr);
            }
        }
        int end= hm.get(s.charAt(0))[1];
        int prev=-1;
        for(i=1;i<s.length();i++){
            char ch= s.charAt(i);
            if(hm.get(ch)[0]<=end){
                end=Math.max(hm.get(ch)[1],end);
            }
            else{
                // if(hm.get(ch)[0]==hm.get(ch)[1]){
                //     end=Math.max(hm.get(ch)[1],end);
                // }
                
                    ans.add(end-prev);
                    prev=end;
                    end=Math.max(hm.get(ch)[1],end);
                
            }
        }
        
        ans.add(end-prev);
        return ans;
    }
}