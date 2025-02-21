import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
                
        while((input = reader.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input);   
            int a = Integer.parseInt(st.nextToken()); //: 첫번째 정수
            int b = Integer.parseInt(st.nextToken()); //: 두번째 정수
            writer.write((a+b)+"\n");
        }
        writer.flush(); writer.close();     
    }
}
