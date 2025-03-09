class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int i;
        int c=0;
        if(colors.length<3) return 0;
        int n=colors.length;
        for(i=0;i<colors.length;i++){
            if(i==0){
                if(colors[i]!=colors[n-1] && colors[i]!=colors[i+1]){
                    c++;
                }
            }
            else if(i==n-1){
                if(colors[i]!=colors[i-1] && colors[i]!=colors[0]){
                    c++;
                }
            }
            else if(colors[i]!=colors[i-1] && colors[i]!=colors[i+1]){
                c++;
            }
        }
        return c;
    }
}