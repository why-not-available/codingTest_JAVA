class Solution {
    public int solution(int n) {
        int answer = 1; //: 최소 몇 판
        // 6명 : 1판(6조각) - answer * 6 조각
        // 10명 : 5판(30조각) 
        // 4명 : 2판(12조각)

        while(answer != 0 && (answer*6)%n != 0){
            answer++;
        }
        System.out.println(answer);
        
        return answer;
    }
}