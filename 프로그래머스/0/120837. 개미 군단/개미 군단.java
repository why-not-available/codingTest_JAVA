class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 0;
        int soldier = 0;
//      x + y*3 + z*5 = hp
        // 23 = 5 * 4 + 3 * 1
        // 24 = 5 * 4 + 3 * 1 + 1 * 1
        while(hp>0){
            general = hp/5;
            soldier = hp%5/3;
            answer = general + soldier + hp%5%3;
            break;
        }
        
        return answer;
    }
}