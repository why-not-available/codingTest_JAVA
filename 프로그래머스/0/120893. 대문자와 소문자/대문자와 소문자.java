class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            // 수정 전: char substringMs = my_string.substring(i, i+1);
            char substringMs = my_string.charAt(i);
            if(Character.isUpperCase(substringMs)){
                answer+=String.valueOf(substringMs).toLowerCase();
            }else{
                answer+=String.valueOf(substringMs).toUpperCase();
            }
            
        }
        
        return answer;
    }
}