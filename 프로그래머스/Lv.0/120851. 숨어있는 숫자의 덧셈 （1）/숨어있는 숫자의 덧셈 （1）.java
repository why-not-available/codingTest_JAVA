class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++){
            String check = String.valueOf(my_string.charAt(i));
            if(check.matches("[0-9]")){
                answer = answer+Integer.parseInt(check);
            }
        }
        
        return answer;
    }
}