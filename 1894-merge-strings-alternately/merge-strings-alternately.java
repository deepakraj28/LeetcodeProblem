class Solution
{
    public String mergeAlternately(String word1, String word2)
    {
       String res="";
       int n1=word1.length();
       int n2=word2.length();
       int maxLength=Math.max(n1,n2);
       for(int i=0;i<maxLength;i++)
       {
        if(i<n1)
        {
            res+=word1.charAt(i);
        }
        if(i<n2)
        {
            res+=word2.charAt(i);
        }
       }
       return res;        
    }
}