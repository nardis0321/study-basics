package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change {
	/**
	 * 백준 5585번 거스름돈
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int amount = Integer.parseInt(br.readLine());

        amount = 1000 - amount;
        int changes = 0;	
		int[] coins = {500, 100, 50, 10, 5, 1};

        for(int i = 0; i<=coins.length-1; i++) {
			int cnt = amount/coins[i];
			if(cnt>=1) {
				changes += cnt;
				amount -= cnt*coins[i];
			}
        }
        System.out.println(changes);
	}
}

