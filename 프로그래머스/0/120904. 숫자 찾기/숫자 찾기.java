class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] splitNum = Integer.toString(num).split("");
        
        for(int i=0; i<splitNum.length; i++){
            if(splitNum[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}