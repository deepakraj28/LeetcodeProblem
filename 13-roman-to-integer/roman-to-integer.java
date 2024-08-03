class Solution {
    public int romanToInt(String s) {
        int a=s.length();
        int count=0;
        int[] val=new int[256];
        val['I']=1;
        val['V']=5;
        val['X']=10;
        val['L']=50;
        val['C']=100;
        val['D']=500;
        val['M']=1000;
        for(int i=0;i<a;i++)
        {
            char ch=s.charAt(i);
           int cv=val[ch];
           if(i<a-1)
           {
            char nch=s.charAt(i+1);
            int ncv=val[nch];
            if(cv<ncv)
            {
                  count-=cv;
            }
            else
            {
                count+=cv;
            }
           }
           else
           {
            count+=cv;
           }
        }
        return count;
    }
}