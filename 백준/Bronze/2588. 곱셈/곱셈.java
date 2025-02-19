import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        
        int units = numB%10; //: 1의 자리
        int tens = (numB/10)%10; //: 10의 자리
        int hreds = numB/100; //: 100의 자리 
        
        System.out.println(numA*units);
        System.out.println(numA*tens);
        System.out.println(numA*hreds);
        System.out.println(numA*numB);
        
    }
}