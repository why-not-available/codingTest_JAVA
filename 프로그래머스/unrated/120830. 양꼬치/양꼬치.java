class Solution {      //양꼬치, 음료수
    public int solution(int n, int k) {
        int answer = 0;
        
        answer = 12000*n + 2000*(k - (n/10)); 
        
        return answer;
    }
}