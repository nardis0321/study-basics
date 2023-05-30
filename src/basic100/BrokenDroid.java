package basic100;

import java.util.Scanner;

public class BrokenDroid {
	//백준 5361

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCaseQuantity = sc.nextInt();
		
		for(int i=0; i<=testCaseQuantity-1; i++) {
			
			float a = sc.nextInt()*350.34f;
			float b = sc.nextInt()*230.90f;
			float c = sc.nextInt()*190.55f;
			float d = sc.nextInt()*125.30f;
			float e = sc.nextInt()*180.90f;
			
			String totalAmount = String.format("%.2f", a+b+c+d+e);
			System.out.println("$"+totalAmount);				
		}
	}

}
