class a2_BinarySearch {
    public static void main(String args[]){
        int arr[]={-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target=22;
        int ans=BinarySearch(arr,target);
        System.out.println(ans);
    }

    static int BinarySearch(int arr[], int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }

            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}