import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(reader.readLine()); //: 테스트케이스 개수
        
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(reader.readLine());   
            int a = Integer.parseInt(st.nextToken()); //: 첫번째 수
            int b = Integer.parseInt(st.nextToken()); //: 두번째 수
            writer.write((a+b) + "\n");
        }
        writer.flush(); writer.close();     
    }
}