    class L55
    {
        public static void main(String args[])
        {
        L55 obj=new L55();
        int arr[]={2,3,1,1,4};
        boolean ans= obj.canJump(arr);
        System.out.println(ans);
        }

        boolean canJump(int[] nums) {
        if(nums.length==1)
            {
                return true;
            }
        boolean m=false;
        int finalindex=nums.length-1;
    for(int i=nums.length-2;i>=0;i--)
        { 
            
            int sum=finalindex-i;
            if(sum<=nums[i])
            {
                finalindex=i;
                m=true;
            }
            else
            {
                m=false;  
            }
            
        }
        return m;
        }
        
    
        
    }