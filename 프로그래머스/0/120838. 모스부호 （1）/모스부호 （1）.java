class Solution {
    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-." , "-..", ".", "..-.",
                        "--.", "....", "..", ".---", "-.-", ".-..",
                        "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                        "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};     
        String[] spLetter = letter.split(" ");
        String answer = "";
        
        for(int i=0; i<spLetter.length; i++){
            for(int j=0; j<morse.length; j++){
                if(spLetter[i].equals(morse[j])){
                    answer+=(char)('a'+j);                    
                }
            }
        }     
        
        return answer;
    }
}