class Solution
{
    public int LCS(String s1,String s2,int i,int j,int[][] dp)
    {
        if(i==-1 || j==-1)
        {
          return 0;  
        }
        if(dp[i+1][j+1]!=-1)
        {
            return dp[i+1][j+1];
        }
        else if(s1.charAt(i) == s2.charAt(j))
        {
            dp[i+1][j+1] = 1 + LCS(s1,s2,i-1,j-1,dp);
        }
        else 
        {
            dp[i+1][j+1] =  Math.max(LCS(s1,s2,i,j-1,dp) , LCS(s1,s2,i-1,j,dp));
        } 
        return dp[i+1][j+1];
    }
    public int longestCommonSubsequence(String text1, String text2)
    {
          int len1=text1.length(),len2=text2.length(); 
          int[][] dp = new int[len1+1][len2+1]; 
          int i,j; 
          for(i=0;i<len1+1;i++)
          {
            for(j=0;j<len2+1;j++)
            {
                dp[i][j] = -1;
            }
          }
          int res = LCS(text1,text2,text1.length()-1,text2.length()-1,dp); 
          return res;
    }
}