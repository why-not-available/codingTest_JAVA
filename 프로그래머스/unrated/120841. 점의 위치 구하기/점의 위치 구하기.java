class Solution {
    public int solution(int[] dot) {
        
        if(dot[0]>0){
            if(dot[1]>0){
                return 1;
            }
            return 4;
        }else{
            if(dot[1]<0){
                return 3;
            }
            return 2;
        }
    }
}

// 1사분면: x>0, y>0
// 2사분면: x<0, y>0 
// 3사분면: x<0, y<0
// 4사분면: x>0, y<0