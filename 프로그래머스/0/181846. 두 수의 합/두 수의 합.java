import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger aInt = new BigInteger(a);
        BigInteger bInt = new BigInteger(b);
        BigInteger sum = aInt.add(bInt);
        
        return sum.toString();
    }
}