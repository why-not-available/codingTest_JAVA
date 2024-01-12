class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0; int maxIndex = 0;
        
        for(int i=0; i<sides.length; i++){
//          세 숫자 중에 제일 큰 값 찾기   
            if(sides[i] > max){
                max = sides[i];
                maxIndex = i;
            }
        }
        
        if(sides[0]+sides[1]+sides[2]-sides[maxIndex] > sides[maxIndex]){
            answer = 1;
        }else{
            answer = 2;
        }

        return answer;
    }
}