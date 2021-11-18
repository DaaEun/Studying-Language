import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	// 입력받을 것임
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수: " + point + "점");
		System.out.println("-----------------------------------------");
		
		if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격하셨습니다!");
			
		}
		else {	// else는 조건식을 가질 수 없음.
			System.out.println("70점 미만입니다.");
			System.out.println("불합격하셨습니다.");
		}
		
		System.out.println("수고하셨습니다:)");
	
		sc.close();

	}

}
