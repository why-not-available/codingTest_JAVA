import java.util.Arrays;
    
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase(); 
        char[] arr = my_string.toCharArray();
        Arrays.sort(arr);
        
        answer = String.valueOf(arr);
        return answer;
    }
}