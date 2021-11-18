import java.util.Scanner;

public class InsertQuiz {

	public static void main(String[] args) {
		
		/*
		 1. 사용자에게 먹고 싶은 음식을 입력받아서 선언하신 배열을 넣어주세요.
		 배열은  String[]로 100개짜리 배열을 선언해주세요.
		 
		 2. "배불러"라는 문자열을 입력받을 시, 반복문을 종료해주세요.
		 
		 3. 반복문 종료 후 "내가 먹고싶은 음식들: ~~~" 형식으로 입력받은 값을
		 null값을 포함하지 않고 출력해주세요. 
		 */
		
		String[] foods = new String[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("무엇을 먹고싶나요?");
		
		for(int i = 0; i < foods.length; i++) {
			System.out.print("> ");
			String food = sc.next();
			
			if(food.equals("배불러")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			foods[i] = food;
		}
		
		System.out.print("내가 먹고싶은 음식들 : ");
		for(String food: foods) {
			if(food == null)	break;
			System.out.print(food + " ");
		}
		sc.close();
	}

}
