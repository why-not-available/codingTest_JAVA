import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int answer = 0;
        int temp = 1;

        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                answer += (c - 55) * temp;
            } else {
                answer += (c - 48) * temp;
            }
            temp *= b;
        }

        System.out.print(answer);

    }
}
