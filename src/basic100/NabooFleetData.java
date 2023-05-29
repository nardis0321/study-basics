package basic100;

public class NabooFleetData {
	int[] comlumnSpace = {15, 15, 11, 10};

	String[][] data = 
		{{"SHIP NAME",      "CLASS",          "DEPLOYMENT", "IN SERVICE"},
				{"N2 Bombrt",      "Heavy Fighter",  "Limited",    "21"},
				{"J-Type 327",     "Light Combat",   "Unlimited",  "1"},
				{"NX Cruiser",     "Medium Fighter", "Limited",    "18"},
				{"N1 Starfighter", "Medium Fighter", "Unlimited",  "25"},
				{"Royal Cruiser",  "Light Combat",   "Limited",    "4"}};

	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();

		NabooFleetData data = new NabooFleetData();
		for(int i=0; i<=data.data.length-1; i++) {
			for(int j=0; j<=data.data[i].length-1; j++) {
				System.out.print(data.data[i][j]);
				int blankQuantity = data.comlumnSpace[j] - data.data[i][j].length();
				for(int k=0; k<=blankQuantity-1; k++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		long afterTime = System.currentTimeMillis();
		long duration = (afterTime - beforeTime);
		System.out.println("걸리는 시간: "+duration+"ms");
		System.out.println("사용 메모리: "+Runtime.getRuntime().totalMemory()/(1024*1024)+"MB");

	}
}