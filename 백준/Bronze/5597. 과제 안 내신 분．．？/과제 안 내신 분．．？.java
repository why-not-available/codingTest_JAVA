import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int submit[] = new int[30]; //: 학생들 목록
        int stuNum = 0; //: 출석번호
        
        // 제출한 학생들 체크(값이 1)
        for(int i=0; i<28; i++){
            stuNum = Integer.parseInt(reader.readLine());
            submit[stuNum-1] = 1;
        }
        
        // 제출X 학생(값이 0) 출력
        for(int i=0; i<30; i++){
            if(submit[i]==0){
                System.out.println(i+1);
            }
        }
        
    }
}