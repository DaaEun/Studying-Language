
public class VariableExample2 {

	public static void main(String[] args) {
		
		// 변수는 선언과 동시에 초기화를 진행할 수 있다.(처음 선언시 한번만 가능)
		int score = 90;
//		int score = 95;	(X) 
		// 데이터 타입이 변수명 앞에 붙었다는 의미는 
		// 새로운 변수를 만들고자 하는 것으로  인식하여 에러 발생
		score = 95;	// 기존에 있는 score에 95를 대입한다는 의미
		System.out.println(score);
		// 변수는 좁은 영역이기떄문에 하나의 값만 저장가능. 90은 사라지고, 95만 저장
		// 변수의 값 변경시에는 자료형(데이터 타입)을 쓰지 않습니다.
				
		// 변수에는 다른 변수의 값도 저장이 가능합니다.
		int doubleScore = score * 2;	// 좌항은 영역, 우항은 값
		System.out.println(doubleScore);
				
		// 변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
//		int count = "한 번";	(X) 
		// int 자료형이면 정수만 들어갈 수 있기 때문에 "한 번"이라는 문자가 들어가지 못함.
//		int count = 23.5; (X) 실수 불가능
//		String name = 100;	(X) 정수 불가능
//		String name = "100";	// 문자 가능
				
		// 변수는 자료형이 달라도 이름이 동일하다면 중복 선언할 수 없습니다.
		String name = "홍길동";
//		int name = 572;	(X)
		// 데이터 저장시, 변수명과 값으로 저장되기 때문에 동일한 변수명 선언시 에러 발생
				
		// 선언 및 초기화되지 않은 변수는 참조가 불가능합니다.
//		int result = doubleScore + num;	(X) num을 선언하지 않음
		int result;
//		System.out.println(result);	(X) 초기화를 하지 않으면, 이 문장을 실행할 수 없다.
		
	}

}
