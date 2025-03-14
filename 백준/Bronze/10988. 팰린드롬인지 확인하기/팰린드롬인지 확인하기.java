import java.util.*;
import java.io.*;
// 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
// 참1, 거짓2

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // 제시 단어, 거꾸로 읽은 단어
        String word = reader.readLine();
        String backward = "";

        for(int i=word.length()-1; i>=0; i--){
            backward = backward + word.charAt(i);
        }

        if(word.equals(backward)){
            writer.write("1");
        }else{
            writer.write("0");
        }

        writer.flush(); writer.close();


    }
}