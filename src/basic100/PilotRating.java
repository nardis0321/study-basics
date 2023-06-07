package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PilotRating {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfPilots = Integer.parseInt(br.readLine()); //항상even

		int[] ratingOfPilot = new int[numOfPilots];
		for(int i=0; i<=numOfPilots-1; i++) {
			ratingOfPilot[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(ratingOfPilot);
		
		int minRating = Integer.MAX_VALUE;
		for(int n=0; n< numOfPilots/2; n++) {
			int rating = (ratingOfPilot[n] + ratingOfPilot[numOfPilots-n-1]);
			if(minRating>rating) {
				minRating = rating;
			}
		}
		
		System.out.println(minRating);
	}

}
