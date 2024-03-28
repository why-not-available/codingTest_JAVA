class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
//      included[i] : i+1
//      a, a+d, a+d+d ...
//      1. 인덱스 늘어나기(i: 인덱스 번호)   
        for(int i=0; i<included.length; i++){
//          2. included[i]가 true라면, 해당 항의 값 더하기       
            if(included[i] == true){   
                int sum = a + (i*d);
                answer+=sum;
            }    
        }
        return answer;
    }
}