import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int row = 0;
        
        for(row = 0; row < queries.length; row++){
            int i = queries[row][0];
            int j = queries[row][1];
                
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // System.out.println(Arrays.toString(arr));
        }
        answer = arr;
        // System.out.println(Arrays.toString(arr));
        
        return answer;
    }
}