//1. Scanner api 로딩.
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		//2. Scanner 객체를 생성.
		Scanner sc = new Scanner(System.in);		
		
		/*
		 3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
		 - next(): 공백이 없는 문자열을 입력받습니다.
		 - nextLine(): 공백을 포함하는 문자열을 입력받습니다.
		 - next + 기본타입이름(): 해당 타입에 맞는 문자열을 입력받습니다.
		 ex)
		 	nextInt(): 정수 데이터를 입력받습니다.
		 	nextDouble(): 실수 데이터를 입력받습니다.
		 */
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
		
		//4. Scanner 객체 반납
		sc.close();
	}

}
