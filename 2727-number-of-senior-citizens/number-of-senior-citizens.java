class Solution
{
    public int countSeniors(String[] details)
    {
        int c=0;
        for(int i=0;i<details.length;i++)
        {
           String temp=details[i];
           String r=temp.substring(11,13);
           int s=Integer.parseInt(r);
           if(s>60)
           {
            c++;
           }
        }
        return c;
    }
}