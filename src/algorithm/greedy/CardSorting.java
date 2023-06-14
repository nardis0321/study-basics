package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CardSorting {
	/**
	 * 백준 1714 카드 정렬하기 (https://www.acmicpc.net/problem/1715)
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//카드 묶음 개수
		int n = Integer.parseInt(br.readLine());
		
		//카드 한 묶음 당 카드 수
		long[] cards = new long[n];
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(br.readLine());
		}
		
		//가장 작은 두 숫자를 더해야 가장 작은 횟수가 나온다
		long result = 0;
		while(cards.length>1){
			Arrays.sort(cards);
			int length = cards.length;
			long[] temp = new long[length-1];
			temp[0] = cards[0]+cards[1];
			result += temp[0]; //더한 횟수가 전부 셈 되어야 함
			
			//다시 sort후 더하기 위한 정리 작업
			for(int i=2; i<length; i++) {
				temp[i-1] = cards[i];
			}
			cards = temp;
		}
		System.out.println(result);
		System.out.println("사용 메모리: "+Runtime.getRuntime().totalMemory()/(1024*1024)+"MB");
	}

}
