import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        // 행렬 인덱스(n행 * m열)
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        // 행렬 arr1 담기
        for(int i=0; i<n; i++){
            StringTokenizer val = new StringTokenizer(reader.readLine());
            
            for(int j=0; j<m; j++){                
                int v = Integer.parseInt(val.nextToken());             
                arr1[i][j] = v;               
            }
        }

        // 행렬 arr2 담기
        for(int i=0; i<n; i++){
            StringTokenizer val = new StringTokenizer(reader.readLine());
            
            for(int j=0; j<m; j++){
                int v = Integer.parseInt(val.nextToken());             
                arr2[i][j] = v;               
            }
        }
        
        // 두 행렬의 합 출력하기
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){                
                writer.write(arr1[i][j]+arr2[i][j] + " ");
            }
            writer.write("\n");
        }
  
        writer.flush(); writer.close();
    }
}
