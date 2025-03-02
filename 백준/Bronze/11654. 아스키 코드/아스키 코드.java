import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char alph = reader.readLine().charAt(0);
        
        writer.write(Integer.toString((int)alph));
        writer.flush(); writer.close();
        
    }
}