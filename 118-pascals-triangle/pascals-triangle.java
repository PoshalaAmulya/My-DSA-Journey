class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        int i,j;
        
        for(i=0;i<numRows;i++){
            List<Integer> li= new ArrayList<>();
            li.add(1);
            if(i==0){
                ans.add(li);
                continue;
            } 
            for(j=1;j<i;j++){
                int ele1=ans.get(i-1).get(j-1);
                int ele2= ans.get(i-1).get(j);
                li.add(ele1+ele2);
            }
            li.add(1);
            ans.add(li);
        }
        return ans;
    }
}