import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(reader.readLine()); //: 테스트케이스 개수
        int r = 0; //: 반복횟수
        String s = ""; //: 반복할 문자열
        String p = ""; //: 결과

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(reader.readLine());
            r = Integer.parseInt(st.nextToken());
            s = st.nextToken();

            for(int j=0; j<s.length(); j++){
                p = String.valueOf(s.charAt(j));

                for(int x=0; x<r; x++){
                    System.out.print(p);
                }              
            }
            
            System.out.println();
        }
    }
}