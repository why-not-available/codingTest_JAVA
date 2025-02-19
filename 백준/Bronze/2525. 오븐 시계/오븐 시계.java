import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt(); //: 현재 시
        int minute = sc.nextInt(); //: 현재 분 
        int time= sc.nextInt(); //: 소요 시간(분)
        
        int totalh = (minute+time)/60 + hour;
        int totalm = (minute+time)%60;
        
        if(totalh>=24){
            totalh = totalh-24;
        }
                   
        System.out.print(totalh + " " + totalm);
        
    }
}