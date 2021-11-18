
public class WhileQuiz1 {

	public static void main(String[] args) {
		
		/*
		 # 두 문제 다 반복문을 사용
		 
		 1. 1~1000까지의 정수 중 3의 배수의 합을 구하시오.(if)
		 2. 1번을 하신 분은 3항 연산식을 이용해서도 구하시오. 
		 */
		
		//1번.
		int sum = 0, i = 1;
		
		while(i <= 1000) {
			if(i % 3 == 0)
				sum += i;
			i++;
		}
		System.out.println("if문을 이용하여 3의 배수 합: " + sum);
		
		
		//2번.
		int sum2 = 0, j = 1;
		
		while(j <= 1000) {
			// j가 3의 배수가 아니라면 sum2값에 변화를 주지 말아라.
			sum2 = (j % 3 == 0) ? sum2 + j : sum2;	
//			sum2 += (j % 3 == 0) ? j : 0;
			j++;
		}
		System.out.println("3항 연산자를 이용하여 3의 배수 합: " + sum2);
	
	}

}
