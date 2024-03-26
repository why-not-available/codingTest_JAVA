class Solution {
    public String solution(String code) {
        String ret=""; int idx; int mode=0;
        
        for(idx=0; idx<code.length(); idx++){
            if(mode==0){
                if(code.charAt(idx)!='1' && idx%2==0){
                    ret = ret + code.charAt(idx);
                }else if(code.charAt(idx)=='1'){
                    mode=1;
                }
            }else if(mode==1){
                if(code.charAt(idx)!='1' && idx%2==1){
                    ret = ret + code.charAt(idx); 
                }else if(code.charAt(idx)=='1'){
                    mode=0;
                }
            }
        }
        
        if(ret.isEmpty()){
            ret="EMPTY";
        }
        
        return ret;
        
// //      기본값 mode : 0   
// //      예시 code: abc1abc1abc / result: acbac   
//         if(mode==0){
// //          1. 인덱스 늘어나기   
//             for(idx = 0; idx<code.length(); idx++){
// //              2. code[idx]가 1이 아님 + idx 짝수 = ret뒤에 code[idx] 추가             
//                 if(code[idx]!=1 && idx%2==0){
//                     ret = ret + code[idx];
//                 }
// //              3. code[idx]가 1 = mode 0에서 1로 바꾸기   
//                 else if(code[idx]==1){
//                     mode=1;
//                 }           
//             }
//             return ret;
            
//         }else if(mode==1){
// //          1. 인덱스 늘어나기   
//             for(idx = 0; idx<code.length(); idx++){
// //              2. code[idx]가 1이 아님 + idx 홀수 = ret뒤에 code[idx] 추가  
//                 if(code[idx]!=1 && idx%2==1){
//                     ret = ret + code[idx];
//                 }
// //              3. code[idx]가 1 = mode 0에서 1로 바꾸기  
//                 else if(code[idx]==1){
//                     mode=0;
//                 }
//                 return ret;
//             }
//             return ret;
// //      ret가 빈문자열이라면       
//         }else if(ret.isEmpty()){
//             ret = "EMPTY";
//         }
//         return ret;
    }
}