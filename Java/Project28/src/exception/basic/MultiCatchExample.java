package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		try {
			System.out.print("정수: ");
			int n = sc.nextInt();
			
			int result = 100 / n;
			
			System.out.println(arr[result]);
			
			String s = null;
			s.equals("안녕");
		} catch(InputMismatchException | ArithmeticException e) {
			System.out.println("입력값이 잘못됐어요!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났어요!");
		} catch(NullPointerException e) {
			System.out.println("null을 참조하는 에러가 발생했습니다!");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
		}
		
		sc.close();
	}

}
