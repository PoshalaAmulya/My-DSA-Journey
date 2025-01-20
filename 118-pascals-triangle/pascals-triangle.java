class Solution {
    public List<List<Integer>> generate(int numRows) {
        int i,j;
        List<List<Integer>>res= new ArrayList<List<Integer>>();
        int ans[][]= new int[numRows][numRows];
        for(i=0;i<numRows;i++){
            ans[i][0]=1;
        }
        for(i=0;i<numRows;i++){
            List<Integer> li=new ArrayList<>();
            li.add(1);
            for(j=0;j<=i;j++){
                if(i-1>=0 && j-1>=0){
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
                    li.add(ans[i][j]);
                }
            }
            res.add(li);
        }
        return res;
    }
}