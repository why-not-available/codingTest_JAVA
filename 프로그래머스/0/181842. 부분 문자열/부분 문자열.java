class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        for(int i=0; i<=str2.length() - str1.length(); i++){
            if(str1.equals(str2.substring(i,i+str1.length()))){
               return 1;  
            }
        }
        return answer;
    }
}

// substring(시작인덱스, 마지막인덱스) : 마지막 인덱스 **전**까지만 출력
// contains()
    