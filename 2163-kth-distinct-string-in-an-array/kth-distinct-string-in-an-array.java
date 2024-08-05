class Solution {
    public String kthDistinct(String[] s, int k) {
      List li=new ArrayList<>();
        for(int i=0;i<s.length;i++)
        {
            int c=0;
            for(int j=0;j<s.length;j++){
                if(i!=j){
                if(s[i].equals(s[j]))
                {
                    
                    c++;
                    break;
                    }
                   
                }
            }
            if(c==0) li.add(s[i]);
        }
        if(k<=li.size())
        {
           return (String)li.get(k-1);
            
        }
        return "";
    }
}
