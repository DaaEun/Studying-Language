package exception.basic;

import java.util.Scanner;

public class TryQuiz {

	public static void main(String[] args) {
		
		/*
		 1. 스캐너를 이용하여 정수 2개를 입력받으세요.
		 2. 입력받은 값이 정수라면 단순히 정수 2개를 출력하고
		  반복문을 종료시키세요.
		 3. 입력받은 값이 예외를 발생시킬 수 있는 값이라면 (문자열)
		 "정수로만 입력하세요!" 를 출력 후 다시 정수를 입력받게 하시면 됩니다.
		 4. 마지막에 반복문을 탈출하면 "프로그램 정상 종료!" 구문이
		  출력되도록 예외처리를 해 보세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print("정수1: ");
				int n1 = sc.nextInt();
				System.out.print("정수2: ");
				int n2 = sc.nextInt();
				
				System.out.printf("나눗셈 결과: %d\n", n1/n2);
				break;
			} catch(Exception e) {
				System.out.println("정수로만 입력하세요!");
				sc.nextLine();	//없으면 계속 출력됨..
			}
		}
		System.out.println("프로그램 정상 종료!");
		sc.close();
	}

}
