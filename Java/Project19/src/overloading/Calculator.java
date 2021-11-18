package overloading;

public class Calculator {

	/*
	 # 오버로딩 (중복): 하나의 클래스 내부에 같은 이름을 가진 메서드나
	  생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.
	  
	 - 오버로딩 적용 조건:
	 1. 매개 변수의 데이터 타입이 다를 것! or
	 2. 매개 변수의 전달 순서가 다를 것! or
	 3. 매개 변수의 갯수가 다를 것.
	 4. 접근제한자나 반환유형은 오버로딩에 영향을 미치지 않는다.
	 */
	
	void inputData() {
		System.out.println("기본 메서드!");
	}
	
	void inputData(int a) {
		System.out.println("정수 1개가 전달됨!");
	}
	
	void inputData(int a, int b) {
		System.out.println("정수 2개가 전달됨!");
	}
	
	void inputData(String s) {
		System.out.println("문자열 1개가 전달됨!");
	}
	
	void inputData(int a, double d) {}

	void inputData(double d, int a) {}
	
//	void inputData(int number) {} (X) - 정수 매개값 1개를 받는 메서드가 이미 선언됨.
	
//	int inputData(int number) {
//		return 0;
//	} (X) - 반환유형(return type)은 오버로딩에 영향 미치지 않는다.

	int calRectArea(int r) {
		return r*r;
	}
	
	int calRectArea(int width, int height) {
		return width * height;
	}
}













