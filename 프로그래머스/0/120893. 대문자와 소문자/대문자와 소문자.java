class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            String substringMs = my_string.substring(i, i+1);
            if(Character.isUpperCase(substringMs.charAt(0))){
                answer+=Character.toLowerCase(substringMs.charAt(0));
            }else{
                answer+=Character.toUpperCase(substringMs.charAt(0));
            }
            
        }
        
        return answer;
    }
}