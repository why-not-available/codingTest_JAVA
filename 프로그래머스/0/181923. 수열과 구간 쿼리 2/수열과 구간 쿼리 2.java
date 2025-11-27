import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int s, e, k, i;
        
        for(int qi = 0; qi < queries.length; qi++){
            s = queries[qi][0];
            e = queries[qi][1];
            k = queries[qi][2];
            answer[qi] = -1;
            
            for(i = s; i<=e; i++){  
                if(arr[i]>k){
                    if(answer[qi]==-1 || arr[i]<answer[qi]){
                        answer[qi] = arr[i];
                    }            
                }
            }     
        }
        return answer;
    }
}