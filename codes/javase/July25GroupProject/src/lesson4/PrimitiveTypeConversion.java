package lesson4;

public class PrimitiveTypeConversion {
	public static void main(String[] args) {
		short shortFirst = 69;
		short shortSecond = 589; 
		System.out.println("=---------------------------------=");
		System.out.println((byte)shortFirst);
		System.out.println((byte)shortSecond);
		
		long longFirst = 458;
		long longSecond = 525236355;
		System.out.println("=---------------------------------=");
		System.out.println((int)longFirst);
		System.out.println((int)longSecond);

		double oneDouble = 5632.6;
		char oneChar = 'D';
		int oneInt = 123;
		System.out.println("=---------------------------------=");
		System.out.println((float)oneDouble);
		System.out.println((int)oneChar);
		System.out.println((char)oneInt);
	}
}
