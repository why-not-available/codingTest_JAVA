import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] splitMy = myStr.split("a|b|c");
        int count = 0;
        
        // answer[] 원소의 개수
        for(int i = 0; i < splitMy.length; i++) {
            if(!splitMy[i].isEmpty()) {
                count++;
            }
        }

        // "EMPTY"
        if (count == 0) {
            return new String[] {"EMPTY"};
        }
        
        String[] answer = new String[count];
//      answer의 인덱스   
        int answerIndex = 0;
        
        for(int i = 0; i < splitMy.length; i++) {
            if(!splitMy[i].isEmpty()) {
                answer[answerIndex++] = splitMy[i];
            }
        }

        return answer;
    }
}
