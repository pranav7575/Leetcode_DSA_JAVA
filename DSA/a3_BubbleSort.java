import java.util.*;

class a3_BubbleSort 
{
    public static void main(String args[])
    {
        int arr[]={1,3,2,4,7,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     public static void BubbleSort(int arr[])
     {
         //first for loop for passes as it bubble sort it required N-1 passes
         for(int i=0;i<arr.length;i++)
         {  
               //here we add one condition if array is sorted then why we need pass
                boolean swapped=false;
            //second loop for comparison
            for(int j=1;j<arr.length-i;j++)
            {  
                          if(arr[j]<arr[j-1])
                          {
                            int temp=arr[j];
                            arr[j]=arr[j-1];
                            arr[j-1]=temp;
                            swapped=true;
                          }
            }

            if(!swapped)
            {
                break;
            }
         }
     }
}