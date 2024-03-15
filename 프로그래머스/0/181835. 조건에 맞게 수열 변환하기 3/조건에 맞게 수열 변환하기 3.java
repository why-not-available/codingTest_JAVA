class Solution {
    public int[] solution(int[] arr, int k) {
        // int[] answer = {};
// //      k%2==1 >> *k k%2==0 >> +k
        
// //      홀수라면   
//         if(k%2==1){
//             for(int i=0; i<arr[].length; i++){
//                 arr[i]*=k;
//             }
// //      짝수라면            
//         }else if(k%2==0){
//             for(int j=0; j<arr[].length; j++){
//                 arr[j]+=k;
//             }
//         }
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            if(k%2==0){
                answer[i]=arr[i]+k;
            }else{
                answer[i]=arr[i]*k;               
            }
        }
        
        return answer;
    }
}