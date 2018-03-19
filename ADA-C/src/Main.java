import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int weight = Integer.parseInt(input.readLine().split(" ")[0]);
		int nPacks = Integer.parseInt(input.readLine().split(" ")[0]);
		
		RoboTruck robo = new RoboTruck(weight);
		
		for(int i =1; i<nPacks;i++) {
			
		}
		
		System.out.println("done!");
	}

}
