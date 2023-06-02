package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GarbledMessage {
	//백준 5362
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String garbledText = "";
		while( (garbledText = br.readLine()) != null ) {
			System.out.println(garbledText.replace("iiing", "th"));
		}
	}

}
