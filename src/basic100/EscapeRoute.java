package basic100;

import java.util.Scanner;

public class EscapeRoute {

	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		int coordinateQuantity = sc.nextInt();
        
		int currX = sc.nextInt();
		int currY = sc.nextInt();
		
		float closestDistance = 99f;
		int closestX = 0;
		int closestY = 0;
        
		for(int i=0; i<=coordinateQuantity-2; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			float distance = (float) Math.pow( 
					( Math.pow((currX - x), 2)
					+ Math.pow((currY - y), 2) ), 0.5);
			
			if(distance<closestDistance) {
				closestDistance = distance;
				closestX = x;
				closestY = y;
			}
		}
		System.out.println(currX+" "+currY);
		System.out.println(closestX+" "+closestY);
		System.out.println(Math.floor(closestDistance*100)/100);

		long afterTime = System.currentTimeMillis();
		long duration = (afterTime - beforeTime);
		System.out.println("걸리는 시간: "+duration+"ms");
		System.out.println("사용 메모리: "+Runtime.getRuntime().totalMemory()/(1024*1024)+"MB");

	}

}
