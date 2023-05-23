package algorithm.greedy;

public class Change {
	/**
	 * 최소 개수의 거스름돈 주 
	 * @param amount 거슬러 주어야 하는 액수
	 * @return changes 최소 거스름돈 개수
	 */
	public int minChanges(int amount) {
		int changes = 0;
		
		int[] coins = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for(int i = 0; i<=coins.length-1; i++) {
			if(amount<10) {
				break;
			}
			int cnt = amount/coins[i];
			changes += cnt;
			amount -= cnt*coins[i];
		}
		return changes;
	}

	public static void main(String[] args) {
		Change c1 = new Change();
		int change1 = c1.minChanges(380);
		System.out.println(change1);
		
		Change c2 = new Change();
		int change2 = c2.minChanges(54520);
		System.out.println(change2);

	}
}

