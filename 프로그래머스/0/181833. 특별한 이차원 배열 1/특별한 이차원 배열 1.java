class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
//      int배열은 null이 0값으로   
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    answer[i][j] = 1;
                }else{
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}