package basic100;

import java.util.Scanner;

public class EscapeRoute {
	
	private static double calculateDistance(int currX, int currY, int x, int y) {
        return Math.sqrt((Math.pow((currX - x), 2) + Math.pow((currY - y), 2)));
    }

	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		int coordinateQuantity = sc.nextInt();
        
		int currX = sc.nextInt();
		int currY = sc.nextInt();
		
		double closestDistance = Double.MAX_VALUE;
		int closestX = 0;
		int closestY = 0;
        
		for(int i=0; i<coordinateQuantity-1; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			double distance = Math.sqrt( 
					( Math.pow((currX - x), 2)
					+ Math.pow((currY - y), 2) ));
			
			if(distance<closestDistance) {
				closestDistance = distance;
				closestX = x;
				closestY = y;
			}
		}
		sc.close();
		
		System.out.println(currX+" "+currY);
		System.out.println(closestX+" "+closestY);
		System.out.println(Math.floor(closestDistance*100)/100);

		long afterTime = System.currentTimeMillis();
        long elapsedTime = afterTime - beforeTime;
        System.out.println("Elapsed Time: " + elapsedTime + "ms");
	}

}
