import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());        
        int answer[] = new int[n];
        
        for(int idx=0; idx<n; idx++ ){
            answer[idx] = idx+1;
        }
        
        for(int move=1; move<=m; move++){
            st = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(st.nextToken()); //: 바구니
            int j = Integer.parseInt(st.nextToken()); //: 공
            int temp = 0;
            
            // 공 바꾸기
            temp = answer[i-1]; 
            answer[i-1] = answer[j-1];
            answer[j-1] = temp;         
        }
        
        // 출력하기
        for(int idx=0; idx<n; idx++){
            writer.write(answer[idx] + " ");
        }
        writer.flush(); writer.close();
    }
}