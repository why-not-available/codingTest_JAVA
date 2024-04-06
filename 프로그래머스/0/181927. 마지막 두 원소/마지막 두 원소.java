class Solution {
    public int[] solution(int[] num_list) {
        int lastIdx = num_list.length-1; //num_list의 길이는 최소 2
        int lastNum = 0; //마지막에 추가할 원소
        int[] answer = new int[num_list.length+1];     
        
//      마지막 원소>마지막 전 원소 : 마지막 원소-마지막전 원소
//      마지막 원소<=마지막 전 원소 : 마지막 원소*2
        
        for(int i=0; i<num_list.length; i++){
            answer[i]=num_list[i];
        }
        
        if(num_list[lastIdx]>num_list[lastIdx-1]){
            lastNum = num_list[lastIdx]-num_list[lastIdx-1];
        }else{
            lastNum = num_list[lastIdx] * 2;
        }
        answer[lastIdx+1] = lastNum;

        return answer;
    }
}