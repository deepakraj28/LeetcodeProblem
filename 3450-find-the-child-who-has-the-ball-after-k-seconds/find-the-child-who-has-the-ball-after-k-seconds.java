class Solution
{
    public int numberOfChild(int n, int k)
    {
        if (n == 1)
        {
            return 0; 
        }
        int c= 2*(n-1);
        int eff=k%c;
        if (eff<=n-1)
        {
            return eff; 
        }
        else
        {
            return c-eff; 
        }
    }
}