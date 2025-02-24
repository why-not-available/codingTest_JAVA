import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(st.nextToken()); //: 테스트케이스 개수

        for(int i=0; i<t; i++){
            String str = reader.readLine(); //: 예제 문자열
            writer.write(str.charAt(0) + "" + str.charAt(str.length()-1) + "\n"); 
        }

        writer.flush(); writer.close();     
    }
}
