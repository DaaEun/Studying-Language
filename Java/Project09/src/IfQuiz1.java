import java.util.Scanner;

public class IfQuiz1 {

	public static void main(String[] args) {
		/*
		 1. 스캐너를 사용하여 키와 나이를 입력받으세요.
		 2. 키가 140이상, 나이가 8살 이상이어야 탑승이 가능한 
		 놀이기구의 탑승 가능 여부를 조건문을 사용하여 판단해 보세요.
		 3. 탑승 가능 여부와 상관없이 "오늘 하루 즐거운 시간되세요~!"
		 
		 ex)
		 키: 140, 나이: 8 -> 놀이기구 o
		 키: 145, 나이: 7 -> 놀이기구 x
		 키: 135, 나이: 10 -> 놀이기구 x
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		int h = sc.nextInt();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println("키: " + h + "cm");
		System.out.println("나이: " + age + "세");
		
		if(h >= 140 && age >= 8)
			System.out.println("놀이기구 탑승이 가능합니다.");
		else
			System.out.println("놀이기구 탑승이 불가능합니다.");
		System.out.println("오늘 하루 즐거운 시간되세요~!");
		
		sc.close();
	}

}
