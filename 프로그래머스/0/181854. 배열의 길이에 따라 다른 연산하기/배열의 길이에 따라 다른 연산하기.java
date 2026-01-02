class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        if(arr.length%2==0){ //: arr.length 짝수
            for(int i=1; i<arr.length; i+=2){
                arr[i] = arr[i] + n;                                
            }
        }else if(arr.length%2==1){ //: arr.length 홀수
            for(int i=0; i<arr.length; i+=2){
                arr[i] = arr[i] + n;                                
            }
        }
        answer = arr;
        
        return answer;
    }
}