// class Solution {
//     public int[] solution(String my_string) {
//         int[] answer = {};
//         String[] splitString = my_string.split("");
        
//         for(int i=0; i<splitString.length; i++){          
//             if(isInteger(Integer.valueOf(splitString[i]))){
//                 answer[i] = Integer.valueOf(splitString[i]);
//             }
//         }
//         return answer;
//     }
// }

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        // 숫자가 아닌 모든 문자를 제거
        my_string = my_string.replaceAll("[^0-9]", "");
        
        // 빈 문자열일 경우 빈 배열 반환
        if (my_string.isEmpty()) {
            return new int[0];
        }
        
        // 문자열을 문자 배열로 변환
        int[] answer = new int[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = Character.getNumericValue(my_string.charAt(i));
        }
        
        // 배열 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}
