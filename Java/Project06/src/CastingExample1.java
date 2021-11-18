
public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		# promotion, upcasting
			크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는 
			자바가상머신(JVM)이 자동으로 타입을 올려서 변환해줍니다.
		 */
		
		byte b = 10;
		int i = b;	// 타입이 같지 않으면 값이 들어가지 못함. 
		// byte 타입을 JVM이 컴파일 과정에서 int 타입으로 자동 형 변환한다.
		System.out.println(i);
	
		char c = '가';
		int j = c;	// char -> int 자동 형 변환
		System.out.println("'가'의 유니코드 번호: " + j);
	
		int k = 500;
		double d = k;
		System.out.println(d);
	}

}
