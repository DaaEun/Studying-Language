import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		/*
		 - switch 키워드 뒤에 나오는 괄호안에는 boolean형 조건식이 아닌 변수나, 
		 변수의 연산식을 적어야 하며, 타입은 정수, 문자열만 가능합니다.
		 */
		
		switch(point / 10) {
		
		case 10:
			if(point>100) {
				System.out.println("점수를 잘못 입력하셨습니다.");
				break;
			}
			
			/*
			 else {
				System.out.println("당신의 학점은 A입니다.");
				break;
			}
			 */	
			
			// 아래와 동일한 내용이 나타나서 중복이 나타나며, 
			// 100점은 if문을 거치지 않고 아래로 내려가기 때문에 이와같은 코드가 가능해짐.
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;	// 탈출문: 해당 case만 실행하고 switch문을 탈출
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
			if(point > 100)
				System.out.println("점수를 잘못 입력하셨습니다.");
			else
				System.out.println("당신의 학점은 F입니다.");	
			// break문을 써줄 필요없음. 실행후 바로 switch문을 나가기 때문에.
		}
		sc.close();	
	}

}
