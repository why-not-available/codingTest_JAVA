import java.io.*;
import java.util.*;

// 알파벳 총 26개 
// a = 97
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String input = reader.readLine();
        int[] answer = new int[26]; Arrays.fill(answer, -1); //: -1로 초기화

        for(int i=0; i<input.length(); i++){
            char alph = input.charAt(i);

            int alphNum = alph - 'a';

            if(answer[alphNum] == -1){
                answer[alphNum] = i;
            }
        }
        
        for(int i=0; i<26; i++){
            System.out.print(answer[i] + " ");   
        }

    }       
}
