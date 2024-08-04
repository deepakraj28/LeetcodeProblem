class Solution {
    public int reverse(int x) {
          int rev=0;
        while(x!=0)
        {
             int b=x%10;
            int  newrev=(rev*10)+b;
            if((newrev-b)/10!=rev)
            {
                return 0;
            }
            rev=newrev;
             x/=10;
        }
        return rev;
    }
}