import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int n=Integer.parseInt(st.nextToken()); //: 바구니 개수
        int m=Integer.parseInt(st.nextToken()); //: 시행 횟수
        int answer[] = new int[n+1]; //: 최종 답
        
        for(int idx=1; idx<=n; idx++) {
			answer[idx] = idx;
		}
        
        for(int idx=1; idx<=m; idx++){
            st = new StringTokenizer(reader.readLine());
            int i=Integer.parseInt(st.nextToken()); //: i
            int j=Integer.parseInt(st.nextToken()); //: j
            
            while(i<j){
                int temp = answer[i];
                answer[i++] = answer[j];
                answer[j--] = temp;
            }
        }
        
        for(int idx=1; idx<=n; idx++) {
			writer.write(answer[idx] + " ");
		}
        writer.flush(); writer.close();            
    }
}