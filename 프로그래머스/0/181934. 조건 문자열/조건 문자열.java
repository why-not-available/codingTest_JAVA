class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(n>=m && ineq.equals(">") && eq.equals("=")){
            answer = 1;
        }else if(n<=m && ineq.equals("<") && eq.equals("=")){
            answer = 1;
        }else if(n>m && ineq.equals(">") && eq.equals("!")){
            answer = 1;
        }else if(n<m && ineq.equals("<") && eq.equals("!")){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}