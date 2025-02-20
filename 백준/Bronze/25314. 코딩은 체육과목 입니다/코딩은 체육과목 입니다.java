// long int는 4바이트 정수까지 저장
// long long int는 8바이트 정수까지 저장
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String l = "";
        
        for(int i=1; i<=n/4; i++){
            l = l+"long ";
        }
        System.out.println(l + "int");
    }
}