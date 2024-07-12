class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for(int i=0; i<arr.length; i++){
            if(i>=idx && arr[i]==1){
                return i;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}
// idx < ~~ and arr[i]=1