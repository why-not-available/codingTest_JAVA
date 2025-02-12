import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //: 정수 개수 
        int array[] = new int[n]; //: 배열
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt(); //: 찾을 수
        int count=0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]==v){
                count++;
            }
        }
        System.out.println(count);
    }
}