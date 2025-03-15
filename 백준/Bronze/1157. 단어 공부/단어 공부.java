import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine().toUpperCase();
        int[] count = new int[26];

        // 알파벳 개수 세기
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'A']++; // 'A'부터 시작하는 인덱스 저장
        }

        // 최대값 찾기
        int maxCount = 0;
        char maxChar = '?';
        boolean duplicate = false;

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) (i + 'A'); // 가장 많이 나온 알파벳
                duplicate = false; // 새로운 최대값 > 중복 해제
            } else if (count[i] == maxCount) {
                duplicate = true; // 최대값이 중복됨
            }
        }

        // 최대값이 중복되면 '?', 아니면 최대값 문자 출력
        System.out.println(duplicate ? "?" : maxChar);

        // 자원 해제
        reader.close();
    }
}
