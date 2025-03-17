import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
        while(true){
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
        
            if(A == 0 && B == 0){
                break;
            }
        
            if(B % A == 0){
                System.out.println("factor");
            }else if(A % B == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}