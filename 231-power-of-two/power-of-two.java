class Solution {
    public boolean isPowerOfTwo(int n) {
      int t=n/2;
        for(int i=0;i<=t;i++)
        {
            double r=Math.pow(2,i);
            if(r==n)
            {
                return true;
            }
            if(r>n)
            {
                return false;
            }
        }
        return false;
    }
}