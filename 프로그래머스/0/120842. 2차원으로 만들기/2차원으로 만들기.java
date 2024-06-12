class Solution {
    public int[][] solution(int[] num_list, int n) {
        // [행][열]
        int[][] answer = new int[num_list.length/n][n];
        int numRow = num_list.length/n;
        int numIndex = 0;
        
        for(int i=0; i<numRow; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[numIndex++];
            }
        }
        return answer;
    }
}