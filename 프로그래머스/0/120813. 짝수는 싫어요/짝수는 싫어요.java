class Solution {
    public int[] solution(int n) {
        int odd = 0;
        int index = 0;
        
//      홀수 개수 찾기
        if(n%2==1){
            odd = (n+1)/2;
        }else{
            odd = n/2;
        }
        int[] answer = new int[odd];
        
        for(int i=1; i<=n; i+=2){
            answer[index] = i;
            index++;
        }
        
        return answer;
    }
    
}