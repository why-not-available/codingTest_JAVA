class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] splitB = binomial.split(" ");
        int a = Integer.parseInt(splitB[0]); String op = splitB[1]; 
        int b = Integer.parseInt(splitB[2]);
        
        switch(op){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
        }
        return answer;
    }
}