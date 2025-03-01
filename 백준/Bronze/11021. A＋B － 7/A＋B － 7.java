import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnum = Integer.parseInt(reader.readLine());     
        
        for(int i=1; i<=cnum; i++){
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            writer.write("Case #" + i + ": " + (a+b) +"\n");
        }
        writer.flush(); writer.close();
        
    }
}