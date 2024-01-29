class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
//      최대로 마실수 있는 아아: money/5500
//      남은 돈: money%5500
        
            answer[0] = money/5500;
            answer[1] = money%5500;
        
        return answer;
    }
}