import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        
        System.out.print(st.countTokens());
        //writer.write(st.countTokens());
        //writer.flush(); writer.close();	
	}
}