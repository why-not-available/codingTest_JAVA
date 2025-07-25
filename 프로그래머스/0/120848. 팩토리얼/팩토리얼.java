class Solution {
    public int solution(int n) {
        int answer = 0;
        int facto = 1;
        int i = 1;
        
        while(facto*i <= n){
            facto = facto*i;
            i++;
        }
        System.out.println("facto: " + facto);
        answer = i-1;
        
        return answer;
    }
}