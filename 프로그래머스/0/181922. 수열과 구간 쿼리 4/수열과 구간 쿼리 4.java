class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;               
        
        for(int qi=0; qi<queries.length; qi++){        
            int s = queries[qi][0], 
                e = queries[qi][1],
                k = queries[qi][2];
            
            for(int i=s; i<=e; i++){
                if(i%k == 0){
                    arr[i] = arr[i]+1;
                }
            }
        }        
        return answer;
    }
}