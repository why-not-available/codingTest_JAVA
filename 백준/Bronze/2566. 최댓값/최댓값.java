import java.util.*;
import java.io.*;

// 9*9
// 0~99 자연수
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9]; //: 99격자판
        int max = Integer.MIN_VALUE; //: 최대값
        int r = 0; //: 행 
        int c = 0; //: 열

        // 격자판 채우기
        for(int i=0; i<9; i++){           
            StringTokenizer st = new StringTokenizer(reader.readLine()); 
            for(int j=0; j<9; j++){                   
                arr[i][j] = Integer.parseInt(st.nextToken()); 
            }
        }
        
        // 최대값, 좌표 찾기
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    r = i+1; c = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(r + " " + c);
    }
}
