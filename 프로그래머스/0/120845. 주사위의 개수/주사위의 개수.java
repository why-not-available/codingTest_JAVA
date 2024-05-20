class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int countDice = 1;
        
        for(int i=0; i<3; i++){
            countDice = countDice*(box[i]/n);
            answer = countDice;
        }
        return answer;
    }
}