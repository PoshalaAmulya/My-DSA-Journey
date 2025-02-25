class Solution {
    public int findPeakElement(int[] arr) {
        int i,j,n;
        n=arr.length;
        i=1;j=n-2;
        int mid;
        if(n==1)
        return 0;
        if(arr[0]>arr[1])
        return 0;
        while(i<=j){
            mid=(i+j)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            //increasing curve : peak on right , so eliminate left
            else if(arr[mid]>arr[mid-1]){
                i=mid+1;
            }
            //decreasing curve, peak on left so eliminate right
            else if(arr[mid]<arr[mid-1]){
                j=mid-1;
            }
        }
        return n-1;
        
    }
}