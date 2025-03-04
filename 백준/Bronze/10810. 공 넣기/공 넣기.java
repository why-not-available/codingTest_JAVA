import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int n=Integer.parseInt(st.nextToken()); //: 바구니 개수
        int m=Integer.parseInt(st.nextToken()); //: 공 넣는 횟수
        
        int answer[] = new int[n]; //: 최종 답
        
        for(int x=1; x<=m; x++){
            st = new StringTokenizer(reader.readLine()); 
            int i=Integer.parseInt(st.nextToken())-1; //: 바구니 번호1
            int j=Integer.parseInt(st.nextToken())-1; //: 바구니 번호2
            int k=Integer.parseInt(st.nextToken()); //: 넣는 공 번호
            
            // 공 넣기
            for(int y=i; y<=j; y++){
                answer[y] = k;
            }            
        }
        
        // 최종 답 출력
        for(int idx=0; idx<n; idx++){
            writer.write(answer[idx] + " ");
        }
        writer.flush(); writer.close();            
    }
}