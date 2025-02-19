import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //: 주사위 눈1
        int b = sc.nextInt(); //: 주사위 눈2
        int c = sc.nextInt(); //: 주사위 눈3
        int reward = 0; //: 상금
        
        //: 모두 같은 수
        if(a==b && b==c){
            reward = 1000*a + 10000;
            
        //: 두 수만 같은 경우
        }else if(a==b || a==c || b==c){
            if(a==b){
                reward = 100*a + 1000;
            }else if(a==c){
                reward = 100*a + 1000;
            }else if(b==c){
                reward = 100*b + 1000;
            }
            
        //: 모두 다른 수
        }else{
            if(a>b && a>c){
                reward = 100*a;
            }else if(b>a && b>c){
                reward = 100*b;
            }else if(c>a && c>b){
                reward = 100*c;
            }
        }
        System.out.print(reward);

    }
}