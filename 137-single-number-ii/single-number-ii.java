class Solution {
    public int singleNumber(int[] nums)
     {
        int s=nums.length;
        int temp=nums[0];
      
        for(int i=0;i<s;i++)
        {
              int c=0;
            int r=nums[i];
            for(int j=0;j<s;j++)
            {
                if(r==nums[j])
                {
                    c++;
                }
            }
           if(c==1)
           {
            temp=r;
           }
        }
        return temp;
     }
}