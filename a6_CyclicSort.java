import java.util.*;
   
     //This cyclic work for range values for best
  class a6_CyclicSort
  {
   public static void main(String args[])
   {
    int arr[]={2,3,1,4,5};
     CyclicSort(arr);
     System.out.println(Arrays.toString(arr));
   }
   
    static void CyclicSort(int arr[])
    { 
         int i=0;

         while(i<arr.length)
         {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else
            {
                i++;
            }

         }

    }
  }