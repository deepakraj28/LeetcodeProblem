class Solution
{
    public List<List<String>> partition(String s)
    {
        List<List<String>> res=new ArrayList<>();
        List<String> li=new ArrayList();
        solve(s,li,res,0);
        return res;
    }
    public boolean isPalindrome(String s,int start,int end)
    {
      while(start<=end)
      {
        if(s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
        start++;
        end--;
      }
      return true;
    }
    public void solve(String s,List<String> li,List<List<String>> res,int start)
    {
        if(start==s.length())
        {
            res.add(new ArrayList<>(li));
            return;
        }
        else
        {
            for(int i=start;i<s.length();i++)
            {
                if(isPalindrome(s,start,i)==true)
                {
                    li.add(s.substring(start,i+1));
                    solve(s,li,res,i+1);
                    li.remove(li.size()-1);
                }
            }
        }
    }
}