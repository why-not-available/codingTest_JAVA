class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i=0; i<myString.length(); i++){
            char compare = myString.charAt(i);
            if(compare < 109){
                myString = myString.replace(Character.toString(compare), "l");
            }
        }
        System.out.println(myString);
        return myString;
    }
}
// 0: 48 / A: 65 / I: 105 / a: 97