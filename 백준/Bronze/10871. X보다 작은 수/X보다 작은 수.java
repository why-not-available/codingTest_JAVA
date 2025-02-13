import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //: 정수 개수
        int x = sc.nextInt(); //: 비교하는 수
        int array[] = new int[n]; //: 배열
        
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
            
            if(array[i]<x){
                System.out.print(array[i]+" ");
            }
        }
    }
}