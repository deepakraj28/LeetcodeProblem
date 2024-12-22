class Solution {
    public int hammingWeight(int n)
    {
        String s="";
        while(n!=0)
        {
           int j=n%2;
           s=j+s;
           n/=2;
        }
        int c=0;
        char ch='1';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                c++;
            }
        }
        return c;
    }
}