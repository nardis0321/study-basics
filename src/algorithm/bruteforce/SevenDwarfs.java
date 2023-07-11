package algorithm.bruteforce;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
			System.out.println(i);
			heights[i] = sc.nextInt();
		}
		Arrays.sort(heights); //오름차순으로 출력해야 하기 때문에 미리 정렬

		
		// 진짜 난쟁이를 찾아라 7명 키의 합이 100
		int result = 0;
		Set<Integer> pick = new HashSet<>(); 
		while(! (result == 100)) {
			// 합이 100이 될 때까지 반복
			result = 0;
			pick.clear();

			int pickNum = 7;
			while(pick.size()<pickNum) {
				// 더할 7개의 숫자를 고르기
				pick.add((int) ((Math.random()*10+1)%9));	
			}

			for(int picked : pick) {
				result += heights[picked];
			}
		}

		// 진짜 난쟁이의 키를 출력
		for(int picked : pick) {
			System.out.println(heights[picked]);
		}

	}
}
