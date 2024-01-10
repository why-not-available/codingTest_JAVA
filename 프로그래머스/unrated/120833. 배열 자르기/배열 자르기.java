import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        // for(int i=0; i<numbers.length; i++){
        //     for(int j=1; j<=numbers.length; j++){
        //         if(i==num1 && j==num2){
        //             answer = Arrays.copyOfRange(numbers, num1, num2);
        //         }
        //     }
        // }
        
        return answer;
    }
}