import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int row = 0;
        int num = 0;
        List<Integer> numArr = new ArrayList<>();

        while(true){
            num = Integer.parseInt(reader.readLine());
            
            if(num==-1) break;

            numArr.add(num);
            row++;       
        }

        for(int i=0; i<row; i++){       
            // 약수 리스트, 합
            List<Integer> factors = new ArrayList<>();
            int sum = 0;
            
            // 약수 찾기
            for (int j = 1; j < numArr.get(i); j++) {
                if (numArr.get(i) % j == 0) {
                    factors.add(j);
                    sum += j;
                }
            }

            // 완전수 판별
            if (sum == numArr.get(i)) {
                writer.write(numArr.get(i) + " = ");

                for (int j = 0; j < factors.size(); j++) {
                    writer.write(factors.get(j) + (j == factors.size() - 1 ? "\n" : " + "));
                }
            } else {
                writer.write(numArr.get(i) + " is NOT perfect.\n");
            }
        }

        writer.flush(); writer.close();
    }
}