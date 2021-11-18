import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5 ) continue;
			System.out.println(i + " ");
		}
		System.out.println("\n반복문 종료");
		
		//1~30까지의 정수중 홀수만 가로로 출력하기
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------------------------");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요.");
	
		while(true) {
			System.out.print("> ");
			int answer = sc.nextInt();
			if(answer == 1) break;
			else if(answer == 0) {
				System.out.println("다른 정수를 입력해 주세요!");
				continue;
			}
			System.out.println("100/ 입력한 정수: " + 100/answer);			
		}
	sc.close();

	}

}
