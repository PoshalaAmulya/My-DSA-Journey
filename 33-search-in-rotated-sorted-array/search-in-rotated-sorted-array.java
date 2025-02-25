class Solution {
    public int search(int[] arr, int k) {
        int i,j,mid;
        int n=arr.length;
        i=0;j=n-1;
        if(n==1){
            if(arr[0]==k) return 0;
            return -1;
        }
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]==k){
                return mid;
            }
            //left side sorted
            else if(arr[mid]>=arr[i]){
                //the target lies in the sorted range
                if(k>=arr[i] && k<=arr[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            //right side is sorted
            else{
                //the target lies in the right sorted part
                if(k>=arr[mid] && k<=arr[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }
    
}