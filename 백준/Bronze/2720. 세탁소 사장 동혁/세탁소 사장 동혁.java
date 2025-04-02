import java.io.*;
// 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램
// 거스름돈 단위: cent

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int test = Integer.parseInt(reader.readLine()); //: 테스트케이스 개수

        int q = 25; //: Quarter
        int d = 10; //: Dime
        int n = 5; //: Nickel
        int p = 1; //: Penny
        int count = 0; //: 동전 개수

        for(int i=0; i<test; i++){
            int chge = Integer.parseInt(reader.readLine());
            
            count = chge/q;
            System.out.print(count + " ");
            chge = chge%q;

            count = chge/d;
            System.out.print(count + " ");
            chge = chge%d;

            count = chge/n;
            System.out.print(count + " ");    
            chge = chge%n;    

            count = chge/p;
            System.out.print(count);
            System.out.println();
        }
    }
}