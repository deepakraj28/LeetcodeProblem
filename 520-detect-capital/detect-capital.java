class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
      if(word.length()==1)
      {
        return true;
      }
      if((word.equals(word.toUpperCase())&&word.length()>1)||
        (word.equals(word.toLowerCase())&&word.length()>1)||
(word.substring(1).equals(word.substring(1).toLowerCase())&&Character.isUpperCase(word.charAt(0)))) 
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}