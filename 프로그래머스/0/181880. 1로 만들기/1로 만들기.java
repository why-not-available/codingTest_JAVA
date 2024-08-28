class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
//      짝수: /2, 홀수: (-1)/2
        for(int i=0; i<num_list.length; i++){
            while(num_list[i]>1){
                // 짝수일때
                if(num_list[i]%2==0){
                   num_list[i] = num_list[i]/2;
                // 홀수일때
                }else{
                    num_list[i] = (num_list[i]-1)/2;                    
                }
                answer++;
            }
        }
        return answer;
    }
}