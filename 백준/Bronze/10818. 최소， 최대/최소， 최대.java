import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int num = sc.nextInt(); //: 개수
		int array[] = new int[num]; //: 주어진 배열		
		for(int i=0; i<num; i++) {
			array[i] = sc.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		
		for(int i=0; i<num; i++) {
			if(min>array[i]){
                min = array[i];
            }
			if(max<array[i]){
                max = array[i];  
            } 
		}
		System.out.println(min + " " + max);		
	}
}