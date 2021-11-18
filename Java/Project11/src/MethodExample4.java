
/*
 # 반환값, 반환 유형(return value, return type)
 
 1. 반환값이란 메서드의 실행결과값을 의미한다.
 
 2. 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한 개만 존재해야 한다.
 
 3. return이라는 키워드를 사용하여 return 뒤에 전달할 값을 지정한다.
 
 4. 전달되는 값의 데이터 타입을 반환 유형이라고 하며, 메서드를 선언할 때 메서드 이름 앞에 반드시 반환 유형을 명시해야 한다.
 
 5. 반환값이 있는 메서드는 호출문이 하나의 값으로 처리될 수 있기 때문에 반환값을 다른 변수에 대입할 수도 있고,
 다른 메서드의 매개값으로도 사용 가능하다.
 
 6. 모든 메서드가 반환값이 있는 것은 아니다. 메서드 실행 후에 반환할 값이 딱히 없다면  return을 사용하지 않아도 된다.
 
 7. 이 때는 반환 유형을 메서드 선언시에 비워두지 않고, 반드시 void라는 키워드를 작성해야 한다.
 
 8. 모든 메서드는  return을 만나면 강제로 메서드가 종료한다. 따라서 조건 없이 return문 아래에 코드를 작성할 수 없다.
 
 9. void 메서드는  return 키워드를 탈출 기능으로 사용할 수 있다.
 */

public class MethodExample4 {
	
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int[] operateTotal(int n1, int n2) {
		return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2};
	}
	
	static double[] calcArrayTotal(int[] arr) {
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
		double avg = sum / (double) arr.length;
		
		return new double[] {sum, avg};
	}
	
	static void multi(int n1, int n2) {
		int result = n1 * n2;
		System.out.printf("%d X %d = %d\n", n1, n2, result);
	}
	
	static void divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("0으로 나누지 마세요!");
//			break; (X) 반복문이나 switch문이 아니여서 쓸 수 없음.
			return;
		}
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);

	}
	
	public static void main(String[] args) {
		
		int r1 = add(3,8);		// int r1 = 11;
		int r2 = add(10,15);	// int r2 = 25;
		int r3 = add(add(4,6), add(7,8));	//int r3 =25;
		
		int[] totalResult = operateTotal(30, 6);
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 * 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);
		
		/*
		 1. 메서드 이름은 calcArrayTotal이라고 한다.
		 
		 2. 이 메서드는 정수 배열 하나를 전달받아 해당 배열 내부에 있는 모든 정수의 
		 합계(int)와 평균(double)을 '배열'에 담아서 리턴한다.
		 
		 3. 2번에 정의된 메서들 선언하고, 실제로 호출하여 합계와 평균(소수점 둘째 자리까지) 출력하세요.
		 
		 {57, 89, 78, 91, 93, 47}
		 */
		
		int[] arr =  {57, 89, 78, 91, 93, 47};
		double[] result = calcArrayTotal(arr);
		System.out.printf("합계 : %d점\t평균 : %.2f점\n" , (int)result[0], result[1]);
		
		System.out.println("------------------------------------");
		
		multi(10, 7);
//		int r4 = multi(10, 7);	(X) - return 값이 없기 때문이다.
		
		/*
		 - 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에 실행 결과를 변수에 저장할 수 없다.
		 - 반드시 단독 호출하여야 한다.
		 - void 메서드는 단순히 동작을 지시하는 역할이다.
		 */

		divide(20, 2);
		divide(20, 0);
	}

}
