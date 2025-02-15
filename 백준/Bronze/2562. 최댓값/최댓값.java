import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9]; //: 자연수 모음
        int i; //: 자연수 모음 인덱스
        for(i=0; i<9; i++){
            array[i] = sc.nextInt();       
        }
        int max=array[0]; int num=1; //: 최대값, 몇번째
        
        for(i=0; i<9; i++){
            if(array[i]>max){
                max=array[i];
                num=1+i;
            }
        }    
        System.out.print(max+ "\n" + num);
    }
}