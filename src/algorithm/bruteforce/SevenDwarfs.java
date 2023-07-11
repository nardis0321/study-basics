package algorithm.bruteforce;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarfs {
	/**
	 * BJ#2309 https://www.acmicpc.net/problem/2309
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		// 난쟁이 후보의 키를 입력 받기
		int candidates = 9;

		int[] heights = new int[9];		
		for(int i=0; i<candidates; i++) {
			heights[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(heights); //오름차순으로 출력해야 하기 때문에 미리 정렬

		
		// 진짜 난쟁이를 찾아라 7명 키의 합이 100
		int result = 0;

		//1. 키를 전부 더하기
		for(int height : heights) {
			result += height;
		}
		//2. 뺄 2개의 인덱스를 찾기
		int firstFakeIndex = 0;
		int secondFakeIndex = 0;
		for(int i=0; i<candidates; i++) { //조합을 탐색 1~9 + 2~9
			for(int j=1; j<candidates; j++) {
				
				if(i==j) { //존재하지 않는 경우 제외
					continue;
				}
				
				int temp = result - heights[i] - heights[j];
				if(temp == 100) {
					firstFakeIndex = i;
					secondFakeIndex = j;
					break;
				}
			}
		}
		

		// 진짜 난쟁이의 키를 출력
		for(int i=0; i<candidates; i++) {
			if(i != firstFakeIndex && i != secondFakeIndex) {
				System.out.println(heights[i]);
			}
		}

	}
}
