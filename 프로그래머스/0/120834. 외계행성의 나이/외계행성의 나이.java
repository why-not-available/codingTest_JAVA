class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String s = String.valueOf(age);
        String[] arr = s.split("");

        for (String value : arr) {
            answer.append((char) ((Integer.parseInt(value)) + 97));
        }

        return answer.toString();
    }
}