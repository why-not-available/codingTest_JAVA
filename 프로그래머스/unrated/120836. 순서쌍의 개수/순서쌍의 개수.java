// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         int i=1;
//         int max = n;
        
//         if(n==1){
//             return 1;
//         }
            
//         while(i<max){
//             if(n % i == 0){
//                 answer++;
//                 max = n / i;
//             }
//             i++;
//         }
        
//         if(max*max==n){
//             return answer*2-1;
//         }else{
//             return answer*2;    
//         }
        
//     }
// }

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                answer+=1;
            }
        }
        return answer;
    }
}