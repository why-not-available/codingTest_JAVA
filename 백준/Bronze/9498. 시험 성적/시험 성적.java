// 90 ~ 100점은 A, 
// 80 ~ 89점은 B, 
// 70 ~ 79점은 C, 
// 60 ~ 69점은 D, 
// 나머지 점수는 F
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        
        if(score>=90){
            System.out.print("A");
        }else if(score>=80){
            System.out.print("B");
        }else if(score>=70){
            System.out.print("C");
        }else if(score>=60){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}