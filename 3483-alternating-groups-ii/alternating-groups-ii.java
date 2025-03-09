class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int i,j,c=1,ans=0;
        int n=colors.length;
        j=1;
        while(j<=(n-1+k-1)){
            if(colors[j%n]!=colors[(j-1+n)%n]){
                c++;
            }
            else{
                c=1;
            }
            if(c>=k){
                ans++;
            }
            j++;
        }
        return ans;
    }
}