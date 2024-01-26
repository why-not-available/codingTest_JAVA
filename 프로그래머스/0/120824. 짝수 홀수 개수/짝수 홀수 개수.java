class Solution {
    public int[] solution(int[] num_list) {

        int even = 0;
        int odd = 0;
        
//      배열 훑기
        for(int i=0; i<num_list.length; i++){
            int x = num_list[i];
//          홀짝 개수 세기
            if(x%2 == 0){
                even ++;
            }else{
                odd++;
            }
        }
        int[] answer = {even, odd};
        return answer;
    }
}