
public class PrintExample {

	public static void main(String[] args) {
		
		//자바의 표준 출력 형식은 크게 3가지입니다.
		//1. 개행을 포함하지 않는 print()
		//2. 자동 개행을 포함해주는 println()
		System.out.print("hello\n");
		System.out.println("안녕하세요!");
		System.out.print("bye");
		System.out.println("안녕히 가세요!");
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		//12월 25일은 크리스마스 입니다.
		System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
		//3. 형식 지정 표준 출력 함수 printf()		
		System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
		
		System.out.printf("지금 시간은 %d시 %d분입니다. %s요일입니다.\n", 2, 41, "수");
				
		/*
		 # 포맷팅 서식 문자 종류
		 %d = 부호가 있는 정수 데이터
		 %f = 실수 데이터
		 %s = 문자열 데이터
				 
		 탈출문자 (escape code)
		 -탈출문자는 문자열 내부에 작성해야 효과가 나타납니다.
		 \n = 줄바꿈 (enter)
		 \t = 탭 정렬 (4칸 들여쓰기)
		 */
				
		System.out.println("-------------------------------");

		/*
		 - %f는 기본적으로 소수점 6자리까지 표현하도록 설계되어 있습니다.
		 - 만약 자리수를 조절하고 싶다면 %.[자리수에 해당하는 숫자]f를 사용합니다.
		 - "%"특수문자를 표현하고 싶다면 %%를 씁니다.
		 */
				
		double rate = 63.456;
		System.out.printf("시험 합격율: %.2f%%", rate);
		//시험 합격율: 63.46%
		
	}

}
