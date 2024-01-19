class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
//      s1   
        for(int i = 0; i<s1.length; i++){
//          s2   
            for(int j = 0; j<s2.length; j++){
//              비교하기
                if(s1[i].equals(s2[j])){
                    answer = answer+1;
                }
            }
        }
        
        return answer;
    }
}