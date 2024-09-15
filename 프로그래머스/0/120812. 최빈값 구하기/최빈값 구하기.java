// 출처: https://sigfriede.tistory.com/21
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] index = new int[1001];
        int max = Integer.MIN_VALUE;
                  // 변수가 최소값보다 작은 값을 가질 수 있는 경우(특히 음수) 
                  // 이렇게 초기화함으로써 변수가 유효하지 않은 값을 가지는 것을 방지  
        
        for(int i = 0; i < array.length; i++) {
            // array[i]에 을 index[]의 인덱스로 정해서 array[i]에 해당하는 숫자의 개수 구함
            index[array[i]]++;
        }
        
        for(int i = 0; i < index.length; i++) {
            if (index[i] > max) {
                max = index[i];
                answer = i;
            } else if (max == index[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}