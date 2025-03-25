import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        double a = Integer.parseInt(st.nextToken()); //: 낮
        double b = Integer.parseInt(st.nextToken()); //: 밤
        double v = Integer.parseInt(st.nextToken()); //: 높이

        double day = Math.ceil((v-a) / (a-b)) + 1;
        
        System.out.print((int)day);
    }
}