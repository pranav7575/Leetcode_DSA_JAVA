 
  class Floor_BInarySearch{
    public static void main(String args[])
    {
        int arr[]={2, 3, 5, 9, 14, 16, 18};
        int target=17;
        int ans=Floor(arr,target);
        System.out.println(ans);
    }

    public static int Floor(int arr[], int target)
    {
        int start=0;
        int end=arr.length-1;
// but what if the target is greater than the greatest number in the array
         if(target<arr[start])
        {
            return -1;
                }

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            if(arr[mid]>target){

                end=mid-1;

            }
            else
            {
                start=mid+1;
            }
          }
   return arr[end];
    }
  }