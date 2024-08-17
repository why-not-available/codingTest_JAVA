class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int numLen = numbers.length-1;
        
        for(int i=0; i<numbers.length; i++){
            // direction: right
            if(direction.equals("right")){
                if(i==numLen){
                    answer[0] = numbers[i];
                }else{
                    answer[i+1] = numbers[i];
                }
             // direction: left   
            }else{
                if(i==0){
                    answer[numLen] = numbers[0];
                }else{
                    answer[i-1] = numbers[i];
                }
            }
        }
        return answer;
    }
}