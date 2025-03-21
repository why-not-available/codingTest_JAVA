import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine()); //: 몇줄인지
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(reader.readLine());
            
            arr[i] = num;          
        }
        Arrays.sort(arr);

        // 답 출력
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
