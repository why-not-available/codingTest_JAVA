// class Solution {
//     public int solution(int[] numbers) {
//         int answer = 0;
        
//         for(int i=0; i<numbers.length; i++){
//             if(i+1 < numbers.length){
//                 answer = numbers[i] * numbers[i+1];
//             }
            
//         }
//         return answer;
//     }
// }
class Solution {
    public int solution(int[] numbers) {
		int answer = -100000000;
        // 주어진 제한사항의 최소값과 최대값
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=numbers.length-1; j>i; j--) {
                if(answer < numbers[i] * numbers[j]) {
                    answer = numbers[i] * numbers[j];
                }
			}
		}
        return answer;
    }
}