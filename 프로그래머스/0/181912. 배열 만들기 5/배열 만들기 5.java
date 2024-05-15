import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> answer = new ArrayList<>();
        
        int intStrsSub = 0;
        for(int i=0; i<intStrs.length; i++){           
            intStrsSub = Integer.parseInt(intStrs[i].substring(s, s+l));
            
            if( k < intStrsSub ){
                answer.add(intStrsSub);
            }      
        }
        
        return answer;
    }
}

// class Solution {
//     public int[] solution(String[] intStrs, int k, int s, int l) {
//         int[] intStrsSub = new int[intStrs.length];
//         int[] answer = {};
        
//         for(int i=0; i<intStrs.length; i++){
//             intStrsSub[i] = Integer.parseInt(intStrs[i].substring(s, s+l));
//         }      

//         for(int j=0; j<intStrsSub.length; j++){
//             if(intStrsSub[j] > k){
//                 int index = 0;
//                 answer[index] = intStrsSub[j];
//                 index++;
//             }
//         }
             
//         return answer;
//     }
// }