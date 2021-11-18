
public class MethodQuiz {

	static int sum(int n) {
		int sum = 0;
		System.out.print(n + "의 약수: ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		return sum;
	}
	
	public static void main(String[] args) {

		/*
 		 1. 정수를 하나 받아서 해당하는 수의 약수의 총합을 구해서 그 총합을 리턴하는 메서드를 선언하세요.
 		 
 		 2. 이 메서드는 매개값으로 받은 정수의 모든 약수를 가로로 출력한 후 그 약수들의 총합을 리턴한다.
 		 
 		 3. 메서드 선언을 완료한 후에 메서도를 호출하여 10의 약수의 총합과, 72의 약수의 총합을 구하시오.
 		 
 		 4. 메서드 이름은 sum으로 한다.
		 */

		System.out.println("10의 약수의 총합: " + sum(10));
		System.out.println("72의 약수의 총합: " + sum(72));
	}

}
