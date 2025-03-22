import java.util.*;
import java.io.*;

// 한줄 당 몇칸 = 2*n-1; 
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(reader.readLine());

       // 위 : 1 ~ n
       for (int r = 1; r <= n; r++) {
        for (int i = 0; i < n - r; i++) {
            writer.write(" ");
        }
        for (int i = 0; i < 2 * r - 1; i++) {
            writer.write("*");
        }
        writer.write("\n");
    }

    // 아래 : n - 1 ~ 1
    for (int r = n - 1; r >= 1; r--) {
        for (int i = 0; i < n - r; i++) {
            writer.write(" ");
        }
        for (int i = 0; i < 2 * r - 1; i++) {
            writer.write("*");
        }
        writer.write("\n");
    }

        writer.flush(); writer.close();     
    }
}