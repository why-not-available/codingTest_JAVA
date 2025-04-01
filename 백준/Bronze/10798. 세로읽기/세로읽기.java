import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] arr =  new String[5][15];
        String answer = "";
        
        for(int i = 0; i < 5; i++){
            String[] str = sc.next().split("");
            
            for(int j = 0; j < str.length; j++){
                arr[i][j] = str[j];
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(arr[j][i] != null){
                    answer += arr[j][i];
                } 
            }
        }
        System.out.print(answer);
    }
}