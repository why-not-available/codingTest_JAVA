class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String natural = "";
        
        for(int i=0; i<my_string.length(); i++){
            char splitStr = my_string.charAt(i);
            
            if(Character.isDigit(splitStr)){
                natural += splitStr;
            }else{
                if(!natural.isEmpty()){
                    answer += Integer.parseInt(natural);
                    natural = "";
                }
            }
        }
        System.out.print(natural);
        
        if(!natural.isEmpty()){
            answer += Integer.parseInt(natural);
        }
        
        return answer;
    }
}