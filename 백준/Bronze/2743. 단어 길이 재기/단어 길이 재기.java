import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String st = reader.readLine();
		reader.close();
				
		System.out.print(st.length());
	}
}