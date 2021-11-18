import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 - 스캐너를 사용하여 이름과 나이를 입력받아서
		 
		 이름: XXX
		 나이: XX세
		 출생년도: XXXX년 
		 
		 를 출력하세요.
		 */
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		int birthYear = 2020 - age + 1;
		
//		System.out.println("------------------------");
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age + "세");
//		System.out.println("출생년도: " + birthYear + "년");
//		System.out.println("------------------------");
		
		System.out.println("------------------------");
		System.out.printf("이름: %s\n나이: %d세\n출생년도: %d년\n", name, age, birthYear);
		System.out.println("------------------------");
		
		sc.close();
		
	}

}
