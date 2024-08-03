class Solution {
    public int strStr(String haystack, String needle) {
     int hs=haystack.length();
     int ne=needle.length();
     if(hs<ne)
     {
        return -1;
     }
     for(int i=0;i<=hs-ne;i++)
     {
        int j=0;
        while(j<ne && haystack.charAt(i+j)==needle.charAt(j))
        {
            j++;
        }
        if(j==ne)
        {
            return i;
        }
     }
     return -1;
    }
}