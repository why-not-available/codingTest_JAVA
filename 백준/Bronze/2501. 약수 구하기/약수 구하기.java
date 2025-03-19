import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken()); //: 약수를 구할 수 N
        int k = Integer.parseInt(st.nextToken()); //: K번째
        int findK = 0; int answer = 0;
        
        for(int i=1; i<=n; i++){
            // 몇번째 약수?
            if(n % i==0){                
                findK+=1;
            }
            // K번째 약수는?
            if(findK==k){
                answer = i;
                break;
            }            
        }
        
        System.out.print(answer);
    }
}
