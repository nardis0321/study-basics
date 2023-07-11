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

	/**
	 * 난쟁이 후보의 키를 입력 받기
	 * @param sc
	 * @return 난쟁이 키 배열
	 */
	public int[] input(Scanner sc) {
		int candidates = 9;

		int[] heights = new int[9];		
		for(int i=0; i<candidates; i++) {
			System.out.println(i);
			heights[i] = sc.nextInt();
		}
		Arrays.sort(heights); //오름차순으로 출력해야 하기 때문에 미리 정렬

		return heights;
	}

	/**
	 * 진짜 난쟁이를 찾아라 7명 키의 합이 100
	 * @param heights 난쟁이 후보 키의 배열
	 * @return 진짜 난쟁이의 배열 인덱스 set
	 */
	public Set<Integer> findRealDwarf(int[] heights){
		//9개 중7개를 골라서 더해봐야 함
		int result = 0;
		Set<Integer> pick = new HashSet<>(); 
		while(! (result == 100)) {
			result = 0;
			pick.clear();

			int pickNum = 7;
			while(pick.size()<pickNum) {
				pick.add((int) ((Math.random()*10+1)%9));	
			}

			for(int picked : pick) {
				result += heights[picked];
			}
			System.out.println("pick list " + pick);
			System.out.println("result "+result);

		}
		return pick;
	}

	/**
	 *  진짜 난쟁이의 키를 출력
	 * @param heights 후보 난쟁이들 키 배열
	 * @param pick 진짜 난쟁이의 인덱스 set
	 */
	public void printRealDwarfs(int[] heights, Set<Integer> pick) {
		for(int picked : pick) {
			System.out.println(heights[picked]);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		SevenDwarfs sd = new SevenDwarfs();
		int[] data = sd.input(sc);
		Set<Integer> realDwarf = sd.findRealDwarf(data);
		
		sd.printRealDwarfs(data, realDwarf);

		System.out.println("사용 메모리: "+Runtime.getRuntime().totalMemory()/(1024*1024)+"MB");

	}
}
