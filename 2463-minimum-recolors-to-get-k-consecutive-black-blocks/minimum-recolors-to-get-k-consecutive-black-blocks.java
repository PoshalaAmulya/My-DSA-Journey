class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min= Integer.MAX_VALUE;
        int i;
        int c=0;
        for(i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                c++;
            }
        }
        min=Math.min(min,c);
        int j=i;
        i=0;
        while(j<blocks.length()){
            if(blocks.charAt(i)=='W'){
                c--;
            }
            if(blocks.charAt(j)=='W'){
                c++;
            }
            i++;
            j++;
            min=Math.min(min,c);

        }
        return min;
    }
}