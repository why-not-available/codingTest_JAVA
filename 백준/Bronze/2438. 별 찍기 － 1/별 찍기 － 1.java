import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String star ="";
        
        for(int i=0; i<num; i++){
            star = star+"*";
            System.out.println(star);
        }        
    }
}