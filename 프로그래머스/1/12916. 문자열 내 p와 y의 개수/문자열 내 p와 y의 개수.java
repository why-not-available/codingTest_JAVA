class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0; int countY = 0;
          
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(s);
        
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("p") || s.substring(i,i+1).equals("P")){
                countP++;
            }else if(s.substring(i,i+1).equals("y") || s.substring(i,i+1).equals("Y")){
                countY++;
            }
        }
        
        if(countP != countY){
            answer=false;
        }
        // countP=countY ? (answer=true) : (answer=false);

        return answer;
    }
}