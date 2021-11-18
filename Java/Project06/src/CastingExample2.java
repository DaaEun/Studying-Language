
public class CastingExample2 {

	public static void main(String[] args) {
		/*
		 # Downcasting, Type Casting
		 - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면 
		 반드시 형 변산자 (type)를 사용하여 명시적으로 형 변환을 진행해야 한다.
		 
		 # Overflow
		 - 명시적으로 형 변환을 하는 이유는 Downcasting의 경우
		  저장 공간이 줄아들어 데이터 손실의 가능성이 있기 때문이다.
		
		 */
		
		int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값: "+ c);
		
		double d = 4.98765;
		int j =(int) d;	// 소수점 아래를 버림. 값의 손실 발생. 
		System.out.println(j);

		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);	// 원래의 값 자체가 손실됨.

	}

}
