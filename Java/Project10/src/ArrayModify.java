import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"삼겹살", "족발", "햄버거", "피자"};
		System.out.println(Arrays.toString(foods));
		
		foods[2] = "짜장면";
		foods[0] = "탕수육";
		System.out.println(Arrays.toString(foods));
		
		// 배열의 인덱스 번호 탐색.
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요.");
		String name = sc.next();
		
		for(int idx = 0; idx < foods.length; idx++) {
			if(name.equals(foods[idx])) {
				System.out.println("탐색완료!");
				System.out.println("인덱스 번호: " + idx);
				break;
			}
//			else {
//				System.out.println("없는 음식입니다.");
//			}	(X) - 일치하지 않으면 계속 출력됨.
			
			if(idx == (foods.length - 1))
				System.out.println("없는 음식입니다.");
		}
		
		sc.close();
	}

}
