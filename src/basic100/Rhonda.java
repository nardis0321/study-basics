package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhonda { //백준 26507
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//레이어 개수 
		int numLayers = Integer.parseInt(br.readLine());
		
		//read 레이어
		int gridRows = 10;
		int gridColumns = 10;
		int[][][] layers = new int[numLayers][gridRows][gridColumns];
		for(int index=0; index<numLayers; index++) {
			for(int row=0; row<gridRows; row++) {		
				String line = br.readLine();
				for(int column=0; column<gridColumns; column++) {
					//유니코드를 사용한 str to int 변환으로 레이어에 저장
					layers[index][column][row] = line.charAt(column) - '0';
				}
			}
			String indent = br.readLine();
		}
		
		//데이터셋 개수 
		int numDataSet = Integer.parseInt(br.readLine());
		
		//each 데이터셋
		for(int data=0; data<numDataSet; data++) {
			//read 데이터셋 : 더할 그리드의 인덱스들
			String[] indices = br.readLine().split(" ");

			//initialize 리턴할 그리드
			int[][] result = new int[gridRows][gridColumns];
			
			//레이어 더하기 작업
			for(String index: indices) { //인덱스를 하나씩 꺼내기
				int layerIndex = Integer.parseInt(index);
				for(int row=0; row<gridRows; row++) { //해당 인덱스의 layer를 result 레이어에 더하기 
					for(int column=0; column<gridColumns; column++) {
						result[row][column] += layers[layerIndex][row][column];
					}
				}
			}
		
			//print the result
				for(int row=0; row<gridRows; row++) {
					for(int column=0; column<gridColumns; column++) {
						//서식 지정자: 폭을 2로 잡고 빈 공간을 0으로 채운 int
					System.out.printf("%02d", result[column][row]);
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
