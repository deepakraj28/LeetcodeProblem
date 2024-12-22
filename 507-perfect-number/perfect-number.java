class Solution {
    public boolean checkPerfectNumber(int num) {
        if(sum(num)==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int sum(int n)
    {
        int c=0;
        for(int i=1;i<=n/2;i++)
        {
           if(n%i==0)
           {
            c+=i;
           }
        }
        return c;
    }
}