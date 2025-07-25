import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int sortEmerg;
        
        for(int i=0; i<emergency.length; i++){
            sortEmerg = 0;
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    sortEmerg++;
                }
            }
            answer[i] = sortEmerg+1;
            System.out.println("emerg: " + emergency[i] + " " + sortEmerg);
        }
        
        return answer;
    }
}