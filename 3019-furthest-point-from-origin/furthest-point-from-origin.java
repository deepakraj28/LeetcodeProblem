class Solution
{
    public int furthestDistanceFromOrigin(String moves)
    {
        int s=0;int l=0;int r=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L')
            {
                l++;
            }
            else if(moves.charAt(i)=='R')
            {
                r++;
            }
            else
            {
                s++;
            }
        }
      return  Math.max(l,r)-Math.min(l,r)+s;     
    }
}