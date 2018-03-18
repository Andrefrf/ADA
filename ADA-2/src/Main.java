import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line = in.readLine();
		int rows = Character.getNumericValue(line.charAt(0));
		int columns = Character.getNumericValue(line.charAt(2));

		LegoMosaics lego = new LegoMosaics(columns);

		for (int i = 1; i < rows; i++) {
			lego.addLine(in.readLine());
		}
		
		lego.fillCombi();
		System.out.println(lego.calc());

	}

}
