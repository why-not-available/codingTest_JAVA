class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a = i; a<=j; a++){
            String[] splitNum = String.valueOf(a).split("");
            
            for(int b = 0; b<splitNum.length; b++){
                if(Integer.parseInt(splitNum[b])==k){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}