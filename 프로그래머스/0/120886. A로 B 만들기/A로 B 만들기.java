import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] bfChar = before.toCharArray();
        char[] afChar = after.toCharArray();
        
        Arrays.sort(bfChar); 
        Arrays.sort(afChar); 
        
        answer = Arrays.equals(bfChar, afChar) ? 1 : 0;
        
        return answer;
    }
}