import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		char[] line = in.readLine().toCharArray();
		int rows = line[0];
		int columns = line[2];
		
		LegoMosaics lego = new LegoMosaics(columns);
		
		
		
		
	}

}
