// 짝수: /2 , 홀수: 3 * x + 1, x==1
import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        while(n != 1){
            if(n%2==0){
                n = n/2;
            }else{
                n = 3*n+1;
                // 3*n + 1 과정에서 n이 int 범위를 벗어날 수 있으므로 
                // long 처리 후 int로 변환하는 것이 안전 : long > int
                // long temp = (long)n * 3 + 1; 
                // n = (int)temp;
            }
            list.add(n);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}