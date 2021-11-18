import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		int height = sc.nextInt();
		
		if(height >= 140) {
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
			if(age >= 8)
				System.out.println("놀이기구 탑승이 가능합니다.");
			else if(age >= 6)
				System.out.println("보호자 동반 시 탑승이 가능합니다.");
			else {
				System.out.println("나이가 6세 미만입니다.");
				System.out.println("놀이기구 탑승이 불가합니다.");
			}
		}
		else {
			System.out.println("키가 140 미만입니다.");
			System.out.println("놀이기구 탑승이 불가합니다.");
		}
		
		System.out.println(height);
//		System.out.println(age); (X)
		sc.close();
	}

}
