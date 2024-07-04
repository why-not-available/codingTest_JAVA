// class Solution {
//     public int[] solution(int[] arr, int[] delete_list) {
//         int[] answer = {};
        
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<delete_list.length; j++){
//                 if(arr[i] != delete_list[j]){
//                     answer[i] = arr[i];
//                 }
//             }
//         }
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            answer.add(num);
        }
        
        for(int del : delete_list){
            int index = answer.indexOf(del);
            
            if (index != -1) {
                answer.remove(index);
            }
        }
        
        return answer;
    }
}