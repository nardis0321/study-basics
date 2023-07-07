package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class CardSorting {
	/**
	 * 백준 1715 카드 정렬하기 (https://www.acmicpc.net/problem/1715)
	 * 
	 * 우선순위 큐를 사용하기
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//우선순위 큐, java 정렬 기준으로 오름차순, 우선순위가 낮은 숫자 순
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		/**
		 * 우선순위가 높은 숫자 순의 우선순위 큐 (java 내림차순)
		 * PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		 */
		
		//카드 묶음 개수
		int n = Integer.parseInt(br.readLine());
		
		//카드 한 묶음 당 카드 수
		for (int i = 0; i < n; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		//가장 작은 두 숫자를 더해야 가장 작은 횟수가 나온다
		long result = 0;
		while(pq.size()>1){
			int x = pq.poll() + pq.poll();
			pq.add(x);
			
			result += x; //더한 횟수를 전부 셈하기
		}
		System.out.println(result);
		System.out.println("사용 메모리: "+Runtime.getRuntime().totalMemory()/(1024*1024)+"MB");
	}

}
