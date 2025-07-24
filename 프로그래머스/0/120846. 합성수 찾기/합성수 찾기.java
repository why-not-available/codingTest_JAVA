class Solution {
    public int solution(int n) {        
        int answer = 0;  
        
        for(int i=1; i<=n; i++){   
            int divisor = 2;  
            // 약수 개수(divisor)
            for(int j=1; j<=i; j++){
                if(j!=1 && j!=i && i%j==0){
                    divisor++;
                }  
            }// System.out.println(divisor);
            
            // 합성수 개수 구하기
            if(divisor>=3){
                answer++;
            }
        }        
        
        return answer;
    }
}