import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        
        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(reader.readLine()) % 42] = true;
        }
        
        int count = 0;
        for(boolean value : arr) {
            if(value){ 
                count++;
            }
        }
        System.out.print(count);
    }
}