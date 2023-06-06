package basic100;

public class FloatingPointError {

	public static void main(String[] args) {
		System.out.println("--- floating point error ---");
		Double result = 0.0;
		for(int i=0; i<100; i++) {
			result += 0.1;
		}
		System.out.println("0.1을 100번 더하는값: "+result);
			
		
		//정확한 계산 : 반드시 정수 타입을 사용해야 함
		//정밀도가 높을수록 좋기에 float 보다는 double
		System.out.println("--- use integer type ---");
		float f = 33554432 + 3;
		System.out.printf("%f\n", f); //출력: 33554436
		long l = 33554432 + 3;
		System.out.println(l);; //출력: 33554435
		
		//rounding error
		System.out.println("--- rounding error ---");
		System.out.printf("%.3f\r\n", 0.3255); //출력: 0.326
		System.out.printf("%.3f\r\n", 0.4255); //출력: 0.425
		System.out.printf("%.3f\r\n", 0.42550001); //출력: 0.426
		
		System.out.printf("\n%a\n%a\n%a\n%a\n%a\n",
				0.7,
				0.6,
				0.7 + 0.6,
				(0.7+0.6)*10,
				Math.floor((0.7+0.6)*10));
	}

}
