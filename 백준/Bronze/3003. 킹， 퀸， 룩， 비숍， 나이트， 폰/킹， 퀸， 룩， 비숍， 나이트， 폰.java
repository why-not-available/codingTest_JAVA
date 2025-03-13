import java.util.*;
import java.io.*;
// 체스는 총 16개 피스
// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int[] set = {1, 1, 2, 2, 2, 8};
        int[] chess = new int[6];

        for(int i=0; i<6; i++){
            chess[i] = Integer.parseInt(st.nextToken());
            chess[i] = set[i]-chess[i];
            System.out.print(chess[i] + " ");
        }    

    }
}