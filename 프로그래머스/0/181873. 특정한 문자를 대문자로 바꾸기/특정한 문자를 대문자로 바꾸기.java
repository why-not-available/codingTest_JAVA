class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string;
        
        for(int i=0; i<my_string.length(); i++){
            String compare = Character.toString(my_string.charAt(i));
            if(compare.equals(alp)){
                answer = my_string.replaceAll(compare, alp.toUpperCase());
            }
        }
        return answer;
    }
}

//  **********replace or replaceAll