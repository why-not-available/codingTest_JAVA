import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[] = new int[5];
        int total = 0; int mid = 0;

        // 1. 숫자 담기
        for(int i=0; i<5; i++){
            int numbers = Integer.parseInt(reader.readLine());

            arr[i] = numbers;
        }
        // 2. 총 합 구하기
        for(int i=0; i<5; i++){
            total += arr[i];
        }     

        Arrays.sort(arr);

        System.out.println(total/5);
        System.out.println(arr[2]);
    }
           
}