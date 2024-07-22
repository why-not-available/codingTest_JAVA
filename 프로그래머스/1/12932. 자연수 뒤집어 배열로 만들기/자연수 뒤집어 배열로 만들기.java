class Solution {
    public int[] solution(long n) {
        String[] strN = String.valueOf(n).split("");
        int[] answer = new int[strN.length];
        
        for(int i=0; i<strN.length; i++){
            answer[i] = Integer.valueOf(strN[strN.length-1-i]);
        }

        return answer;
    }
}

// class Solution {
//     public int[] solution(long n) {
//         String[] strN = String.valueOf(n).split("");
//         int[] answer = new int[strN.length];
        
//         for(int i=0; i<strN.length; i++){
//             for(int j=strN.length; j>=0; j--){
//                 answer[i] = Integer.valueOf(strN[j]);
//             }
//         }

//         return answer;
//     }
// }

