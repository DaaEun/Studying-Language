import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {
	
		/*
		 # 무한 루프
		 
		 - 무한 루프는 반복 횟수를 정하지 않고 무한하게 반복문을 실행하는 구조입니다.
		 
		 - 처음 반복문을 구성할 때, 개발자가 사전에 정확한 반복 횟수를 알 수 없다면
		  무한 루프를 구성해 두고 특정조건을 통해 종료할 수 있도록 코드를 설계합니다.
		
		 - 일반적으로 정확한 반복 횟수를 알고 있다면 for문을 사용하고, 
		 정확한 반복 횟수를 모른다면 while문을 통해 무한 루프를 형성하여 사용합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {	//true는 논리연산자이기 때문에 break만으로 빠져나올 수 있음
			System.out.println("---------------------------");
			System.out.println("15 X 6 = ???");
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == 90) {
				System.out.println("정답입니다!");
				break;
			}
			else {
				System.out.println("틀렸습니다.");
			}
		}
		sc.close();

	}

}
