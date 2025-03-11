import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine()); 
        double[] scores = new double[n];
        double maxScore = 0; 

        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (scores[i] / maxScore) * 100; 
        }

        System.out.println(sum / n); 
    }
}
