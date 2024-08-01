import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] ns = String.valueOf(n).split("");
        String str = "";
        
        Arrays.sort(ns, Comparator.reverseOrder());
        for(int i=0; i<ns.length; i++){
            str+=ns[i];
        }
        
        System.out.println(str);
        return Long.parseLong(str);

    }
}