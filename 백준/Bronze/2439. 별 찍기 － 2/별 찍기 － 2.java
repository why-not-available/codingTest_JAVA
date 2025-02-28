import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
         for (int i = 1; i <= row; i++) { // > 1부터 row까지 증가 (줄 개수)
            for (int j = 1; j <= row - i; j++) { // > 공백 개수: (row - 현재 줄)
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) { // > 별 개수: 현재 줄 i 만큼 출력
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}