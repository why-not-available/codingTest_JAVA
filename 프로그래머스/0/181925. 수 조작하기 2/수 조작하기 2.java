class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        // int w = 1, s = -1, d = 10, a = -10; 
        
        for(int i=0; i<numLog.length-1; i++){
            
            switch(numLog[i+1]-numLog[i]){
                case 1: answer+= "w";
                        break;
                case -1: answer+= "s";
                        break;
                case 10: answer+= "d";
                        break;
                case -10: answer+= "a";
                        break;
            }
            
        }
        
        return answer;
    }
}