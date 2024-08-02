import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ss = s.split("");
        
        Arrays.sort(ss, Comparator.reverseOrder());
        // System.out.println(Arrays.toString(ss));
        for(int i=0; i<s.length(); i++){         
            answer+=ss[i];     
        }
            
        return answer;
    }
}