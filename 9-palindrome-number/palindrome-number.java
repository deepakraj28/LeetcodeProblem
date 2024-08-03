class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y=x;
        if(x>=0)
        {
            while(x!=0)
        {
           int rem=x%10;
           rev=(rev*10)+rem;
           x/=10;
        }
        if(rev==y)
        {
            return true;
        }
        }
        
        return false;
    }
}