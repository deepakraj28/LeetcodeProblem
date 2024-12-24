class Solution {
    public int maxPower(String s) {
        int res=1;
        int max=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                res++;
            }
            if(s.charAt(i)!=s.charAt(i-1))
            {
                if(max<res)
                {
                    max=res;
                }
                res=1;
            }   
        }
         if(max<res)
            {
                max=res;
            }
            return max;
}
}