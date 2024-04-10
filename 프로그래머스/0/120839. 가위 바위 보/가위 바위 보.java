class Solution {
    public String solution(String rsp) {
        String answer = "";    
        String rspSubStr = "";
//      가위: 2, 바위: 0, 보: 5
        
        for(int i=0; i<rsp.length(); i++){
            rspSubStr = rsp.substring(i,i+1);   
            
            String one = "";
//          가위(2)일때   
            if(rspSubStr.equals("2")){
                one = "0";
            }
//          바위(0)일때   
            else if(rspSubStr.equals("0")){
                one = "5";
            }
//          보(5)일때
            else{
                one = "2";
            }
            answer+=one;
            
        }
        return answer;
    }
}