public class FloatTypes {
	public static void main (String[] args) {
		float f = 123.456F;
		double d = 7777.88888;
		
		//double sum = f + d;

        //long i = 10000L;
        //float sum = i + f; // 정수는 실수를 따라가고, 크기가 작은것은 크기가 큰것을 따라감
		//System.out.println(sum);
		
		float one = 0.1F;
		System.out.printf("%.15f\n", one * 22); //정수는 %d 실수는 %f .을붙여 소수점자리수 표기 가능 https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		System.out.printf("%04d", 10);
	}
} 