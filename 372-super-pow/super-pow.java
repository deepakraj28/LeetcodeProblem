import java.math.BigInteger;

class Solution {
    public int superPow(int a, int[] b) {
        StringBuilder str=new StringBuilder();
        for (int i=0;i<b.length;i++) 
        {
            str.append(Integer.toString(b[i]));
        }
        String f=str.toString();
        BigInteger exponent=new BigInteger(f);
        BigInteger base=BigInteger.valueOf(a);
        BigInteger result=base.modPow(exponent, BigInteger.valueOf(1337));
        return result.intValue();
    }
}