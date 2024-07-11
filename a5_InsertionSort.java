  import java.util.*;

   class a5_InsertionSort
   {
    public static void main(String args[])
    {
        int arr[]={5, 3, 4, 1, 2};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void InsertionSort(int arr[])
     {
        //i for loop for mainted index position
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else
                {
                    break;
                }
            }
        } 
     }
   }