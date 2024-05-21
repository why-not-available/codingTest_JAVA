class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipherSplit = cipher.split("");
        
        for(int i=0; i<cipher.length(); i++){
            if((i+1)%code==0 && i!=0){
                answer+=cipherSplit[i];
            }else if(code==1){
                answer+=cipherSplit[i];
            }
        }
        return answer;
    }
}