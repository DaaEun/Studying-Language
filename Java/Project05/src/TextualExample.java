
public class TextualExample {

	public static void main(String[] args) {
	
		/*
		 # 단일문자를 저장하는 테이터 타입 char
		 - 저장하고 싶은 문자를 홑따옴표''에 담아 대입한다.
		 */
		
		char c1 = 'A';	// 쌍타옴표" "로 찍는 순간 String으로 인식하여 안됨.
//		char c1 = 'AB'; (X) 단일문자만 가능하다.
		System.out.println(c1);
		
		char c2 = 65;	// 유니코드에 해당하는 글자  A이다. 97은 a
		System.out.println(c2);
		
		char c3 = 44032;
		System.out.println(c3);
		
		/*
		 # 문자열을 저장할 수 있는 데이터 타입 String
		 - 저장하고 싶은 문자열을 겹따옴표" "에 담아서 대입한다.
		 - String은 기본 데이터 타입은 아니지만, 
		 자주 쓰이기 때문에 기본 데이터 타입처럼 사용한다.(사실은 객체이다.)
		 */
		
		String s1 = "my dream ";
		String s2 = "is a programmer";
		
		// 자바에서는 문자열의 덧셈 연산을 지원한다. 
		// 연산 결과로 문자열을 연결하여 결합한 결과가 도출된다.
		System.out.println(s1 + s2);
		System.out.println(s1 + s2 + ". hahahahaha");

		System.out.println("----------------------------------");
		
		// 문자열과 다른 데이터 타입 간의 + 연산		
		System.out.println(100 + 100);
		System.out.println("100" + "100");
		System.out.println("100" + 100);	
		//서로 다른 데이터 타입이 있으면 전부 문자열로 취급.
		System.out.println("3.14" + 200);
		
		int month = 4;
		int day = 21;
		// 내 생일은 4월 21일 입니다.
		System.out.println("내 생일은 " + month + "월 " + day + "일입니다");
		
	}

}
