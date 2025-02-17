import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //: 총 금액(영수증) 
        int n = sc.nextInt(); //: 구매한 물건 종류 수(영수증)
        int[] a = new int[n]; int[] b = new int[n];
        int total = 0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt(); 
            b[i] = sc.nextInt();
            total = a[i]*b[i] + total ;
        }
        if(total == x){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}