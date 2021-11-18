
/*
 # 메서드 (Method)

 1. 메서드는 코드이 모듈화 및 재활용성을 높이기 위해 사용한다.
 
 2. 메서드는 선언하는 과정과 호출하는 과정으로 나누어진다.
 
 3. 메서드의 선언은 메서드 내부에서는 불가능하다.
 새로운 메서드의 선언은 반드시 메서드 블록 외부 and 클래스 블록 내부에서만 가능하다.
 
 4. 메서드의 호출은 메서드나 생성자 내부에서만 가능하다.
 
 5. 호출하는 과정은 메서드를 사용하는 과정이며, 해당 메서드가 필요로 하는 데이터(매개값)을 
 내부로 전달하면서, 해당 메서드는 매개값을 통해 매개값을 통해 처리한 결과를 다시 호출부로 반환한다.
 */

public class MethodExample1 {
	
	// 메서드의 선언.
	static int calcTotal(int x) {
		int total = 0;
		for(int i = 1; i <= x ; i++) {
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		int result = calcTotal(100);
		System.out.println(result);
		
		System.out.println("1~100까지의 누적합: " + calcTotal(100));
		System.out.println("1~200까지의 누적합: " + calcTotal(200));
		System.out.println("1~300까지의 누적합: " + calcTotal(300));
		System.out.println("1~400까지의 누적합: " + calcTotal(400));
		System.out.println("1~500까지의 누적합: " + calcTotal(500));

	}

}
