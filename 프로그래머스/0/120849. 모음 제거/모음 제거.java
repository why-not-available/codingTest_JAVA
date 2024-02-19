// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
        
// //      각 문자 검사하기 
//         for(int i=0; i<my_string.length(); i++){
// //          각 문자 중 모음 찾기
//             if(my_string.charAt(i).equals(a) || my_string.charAt(i).equals(e) || my_string.charAt(i).equals(i) ||
//                my_string.charAt(i).euquals(o) || my_string.charAt(i).equals(u)){
//                 answer = my_string.replace(String.valueOf(charAt(i)), "");
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] vowels = {"a", "e", "i", "o", "u"};
        
        for (String v : vowels) {
            answer = answer.replaceAll(v, "");
        }
        
        return answer;
    }
}