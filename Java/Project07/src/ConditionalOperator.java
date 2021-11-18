
public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
		 - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
		 - (조건식 ? 좌항 : 우항)
		 - 조건식을 비교하여 true가 도출되었을 시에 좌항을,
		  false가 도출되었을 시에는 우항의 식이 실행됩니다.
		 */
		
		String result = (5 != 4 ? "참입니다." : "거짓이에요.");		
		System.out.println(result);
		
		//난수(랜덤값)를 발생시키는 메서드 Math.random()
		//0.0이상 1.0 미만의 랜덤 실수값을 반환합니다.
//		double rn = Math.random();
//		System.out.println(rn);
		
		//1 ~ 10까지의 정수 난수
		int rn = (int) ((Math.random()*10) + 1);
		//random은 double이고 rn을 int로 주어서 빨간줄이 가는 것
		//(int) 형변환 적어주면 빨간줄 사라짐
		System.out.println(rn);
		
		//10 ~ 100까지의 정수 난수
		int rn2 = (int) ((Math.random()*91) + 10);
	
	}

}
