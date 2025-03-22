import java.util.*;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        
//      약수 개수 구하기   
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
        
        int answer[] = new int[count];
        int idx = 0;
        
//      약수 구하기   
        for(int i=1; i<=n; i++){
            if(n%i==0){ 
                answer[idx] = i;
                idx++;
            }
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}