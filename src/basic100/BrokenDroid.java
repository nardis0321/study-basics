package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class BrokenDroid {	
	//백준 5361

	//가격 정보 
	private float blasterRifle = 350.34f;
	private float visualSensor = 230.90f; 
	private float audioSensor = 190.55f;
	private float arm = 125.30f; 
	private float leg = 180.90f;
	private float[] priceArr = {blasterRifle, visualSensor, audioSensor, arm, leg};		

	//입력 + 가공 로직
	public String[] inputData(BufferedReader br) throws NumberFormatException, IOException {
		int caseQuantity = Integer.parseInt(br.readLine());

		String inputLine = "";
		for(int i=0; i<=caseQuantity-1; i++) {
			inputLine += br.readLine()+" ";
		};
		br.close();
		
		String[] orderQuantityArr = inputLine.split(" ");
		return orderQuantityArr;
	}
	
	//계산 로직 + 출력
	public void calculateTotal(String[] quantityArr){
		float totalAmount = 0;
		for(int i =0; i<=quantityArr.length-1; i++) {
			int j = ((i+1)%priceArr.length)-1;
			if(j>=0) {
				totalAmount += (Integer.parseInt(quantityArr[i]) * priceArr[j]);
			} else {
				totalAmount += (Integer.parseInt(quantityArr[i]) * priceArr[j+priceArr.length]);

				DecimalFormat df = new DecimalFormat("0.00");
				System.out.println("$"+ df.format(totalAmount));

				totalAmount = 0;
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BrokenDroid bd = new BrokenDroid();
		bd.calculateTotal( bd.inputData(br) );
	}

}
