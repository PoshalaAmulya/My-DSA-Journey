class Solution {
    int leader[];
    int ans;
    public int find(int a){
        if(leader[a]==a){
            return a;
        }
        return leader[a]=find(leader[a]);
    }
    public boolean merge(int a,int b){
        int l1,l2;
        l1=find(a);//l1=leader of a 
        l2=find(b);//l2= leader of b
        if(l1==l2){
            return true; // they belong to the same group.
        }
        //leader of b= leader of a 
        //leader of a= l1;
        //connecting leader of b, to ensure  whole b's team is connected to a
        //leader[l2]=l1;
        leader[l2]=l1;
        ans--;
        return false;
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int m=isConnected[0].length;
        leader= new int[n+1];
        ans=n;
        int i,j;
        for(i=0;i<n;i++){
            leader[i]=i;
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i!=j && isConnected[i][j]==1){
                    merge(i,j);
                    // ans--;
                }
            }
        }
        return ans;
        // HashSet<Integer> hs= new HashSet<>();
        // for(i=0;i<leader.length;i++){
        //     hs.add(leader[i]);
        // }
        // return hs.size();
    }
}