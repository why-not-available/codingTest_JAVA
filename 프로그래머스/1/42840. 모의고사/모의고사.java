import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int a=0, b=0, c=0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i % answers.length] == supo1[i % supo1.length]) a++;
            if (answers[i % answers.length] == supo2[i % supo2.length]) b++;
            if (answers[i % answers.length] == supo3[i % supo3.length]) c++;
        }

        int maxVal = Math.max(Math.max(a,b), c);
        ArrayList<Integer> answerList = new ArrayList<>();

        if (maxVal == a) answerList.add(1);
        if (maxVal == b) answerList.add(2);
        if (maxVal == c) answerList.add(3);

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
// 못품
// 1번: 12345 반복
// 2번: 21232425 반복
// 3번: 3311224455 반복