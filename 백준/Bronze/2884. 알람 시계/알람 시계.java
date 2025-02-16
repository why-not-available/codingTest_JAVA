import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int realh = sc.nextInt(); //: 실제 시간(24)
        int realm = sc.nextInt(); //: 실제 분(60)    
        int hour = 0; int minute = 0;
        
        // 0 60 45
        // 00:30-45 > 11:45     
        if(realm>=45){
            hour = realh;
            minute = realm-45;
        }else if(realm<45 && realh>0){
            hour = realh-1;
            minute = 60-(45-realm);            
        }else if(realm<45 && realh==0){
            hour = 23;
            minute = 60-(45-realm);
        }   
        System.out.print(hour+" "+minute);        
    }
}