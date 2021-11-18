
public class Identifier {

	public static void main(String[] args) {
		
		// 꼭 지켜야 하 규칙(안 지킬 경우 에러 발생)
		
		// 1. 식별자의 이름은 중복을 허용하지 않습니다.
		// 그리고, 대/소문자를 철저하게 구분합니다.
		int age = 35;
//		int age = 40; (x)
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
				
		// 2. 식별자 이름은 숫자로만 지정하거나 숫자로 시작하면 안됩니다.
//		int 700 = 365; (x)
//		int 7number = 7; (x)
		int number7 = 7;
		int num7ber = 7;
				
		// 3. 식별자 이름에 공백을 포함할 수 없습니다.
//		int my birth day = 19980421; (x) 변수 3개로 인식되었으나.. 문법이 망가짐.
		int mybirthday = 19980421;	// 에러 발생하지 않으나, 가독성 떨어짐.
		int myBirthDAy = 19980421;	// 연결되는 부분에 대문자로 표시. 관례적

		// 4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($)뿐입니다.
		// 그러나, 사용을 권장하지 않습니다.
		String $hello = "안녕";
				
		// 5. 키워드(예약어)는 식별자 이름으로 지정이 불가능합니다.
//		String class = "클래스"; (x) 키워드: 이미 어떠한 기능을 수행중인 단어
		String Class = "클래스";	// 추천하지 않음.
				
		// 6. 한글이나 한자같은 식별자 이름도 지정이 가능합니다.
		// 하지만, 사용을 권장하지 않습니다.
		int 숫자 = 10;
		String 名 = "홍길동";
		System.out.println(숫자);
		System.out.println(名);
		
	}

}
