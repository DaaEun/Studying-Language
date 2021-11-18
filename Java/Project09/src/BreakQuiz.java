import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {
		
		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 지속적으로 문제를 출제한 후,
		  	0을 입력하면 반복문을 탈출시키세요.
		  	
		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요. 
		 --------------------------------------------------
		 3. 덧셈과 뺄셈,즉 연산퀴즈로 만들기	
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("*** 연산퀴즈 ***");
		System.out.println("문제를 그만 푸시려면 0을 입력해주세요.");
		int count1 = 0, count2 = 0;
		
		while(true) {
			int n1 = (int) ((Math.random()*100)+1);
			int n2 = (int) ((Math.random()*100)+1);
			int n3 = (int) (Math.random()*2);
			int correct ;
			
			if(n3 == 0 ) {
				correct = n1 + n2;
				System.out.printf("%d + %d = ???\n", n1, n2);
			}
			else {
				correct = n1 - n2;
				System.out.printf("%d - %d = ???\n", n1, n2);
			}
			
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == 0) {	
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(answer == correct) {
				System.out.println("정답입니다.");
				count1++;
			}
			else {
				System.out.println("틀렸습니다.");
				count2++;
			}
		}
		
		System.out.println("-----------------------------");
		System.out.printf("정답 횟수: %d회\n", count1);
		System.out.printf("오답 횟수: %d회\n", count2);

		sc.close();
	}

}
