// class Solution {
//     public int solution(String my_string, String is_suffix) {
//         int answer = 0;
//         String mySubstring = my_string.substring(my_string.length()
//                                                  -is_suffix.length());
//         // int stringLen = mySubstring.length();
        
// //      길이: my_string<=is_suffix 인 경우 || is_suffix가 접미사가 아닌 경우 제외   
//         if(my_string.length()<is_suffix.length() 
//            || !mySubstring.equals(is_suffix)){
//             answer = 0;
// //      is_suffix가 접미사인 경우       
//         }else{
//             answer = 1;
//         }
        
//         return answer;
//     }
// }
// // contains()
// // substring(시작, 끝+1)

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
//      길이: my_string<=is_suffix 인 경우 || is_suffix가 접미사가 아닌 경우 제외  
        if(my_string.length()<is_suffix.length()){
            return 0;
        }
        
        String mySubstring = my_string.substring(my_string.length()-is_suffix.length());                
        if(mySubstring.equals(is_suffix)){
            answer = 1;
        }
        return answer;
    }
}
