import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		
		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)인지 판별하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int i = 2, count = 0;	
		//i: 소수의 판별을 위해 입력받은 정수 num을 지속적으로 나누어 줄 변수
		//count: 나누어 떨어지는 횟수를 세 줄 변수
		while(i <= num) {
			if(num % i == 0)
				count++;
			i++;
		}
		
		if(count == 1)
			System.out.println(num + "은(는) 소수입니다.");
		else
			System.out.println(num + "은(는) 소수가 아닙니다.");
		
		System.out.println("=====================");
		
		int j = 2;
		
		while(num % j != 0) {
			j++;
		}
		System.out.println((num == j)? num + "은(는) 소수입니다." : num + "은(는) 소수가 아닙니다.");
	
		sc.close();
		
	}

}
