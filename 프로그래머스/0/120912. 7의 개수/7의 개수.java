class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            String[] splitA = Integer.toString(array[i]).split("");
            for(int j=0; j<splitA.length; j++){
                if(splitA[j].equals("7")){
                    answer++;
                }
            }            
        }
        return answer;
    }
}