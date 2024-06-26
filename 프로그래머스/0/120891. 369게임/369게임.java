class Solution {
    public int solution(int order) {
        int answer = 0;
        // String orderString = Integer.toString(order);
        String orderArr[] = Integer.toString(order).split("");
        
        for(int i=0; i<orderArr.length; i++){
            if(orderArr[i].equals("3") || orderArr[i].equals("6") || orderArr[i].equals("9")){
                answer+=1;
            }
        }
        return answer;
    }
}