class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        // slice/n + 2 = answer;
        if(slice<n){
            if(n%slice==0){
                answer = n/slice;
            }else{
                answer = n/slice + 1;
            }
        }else{
            answer = 1;
        }
        
        return answer;
    }
}