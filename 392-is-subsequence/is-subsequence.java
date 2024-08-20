class Solution {
    public boolean isSubsequence(String s, String t) {
        int sub=s.length();
        int str=t.length();
        int sub_ind=0;
        int str_ind=0;
        while(sub_ind<sub&&str_ind<str)
        {
            if(s.charAt(sub_ind)==t.charAt(str_ind))
            {
                sub_ind++;
                str_ind++;
            }
            else
            {
                str_ind++;
            }
        }
        if(sub_ind==sub)
        {
            return true;
        }
        return false;
    }
}