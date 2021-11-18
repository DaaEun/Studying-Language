import java.util.Scanner;

public class WhileQuiz2 {

	public static void main(String[] args) {

		/*
		 1. 정수를 2개 입력받으세요. (x, y)
		 2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
		 ex) "x부터 y까지의 누적 합계: z"
		 
		 3. 처음에는 x가 무조건 작은 값이 들어올 것이다 라고 가정하고 로직을 작성하세요.
		 그 후 x에 만약 큰 값이 들어올 경우 어떻게 대처할지 생각해 보세요.
		 (while을 두개 쓰는 것 아님.)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 x와 y를 2개 입력하세요. ");
		System.out.print("> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		
//		int temp = x;
//		y = (x > y ? y : x);
//		y = temp;
		
		System.out.printf("x: %d\ty: %d\n", x, y);	
		
		int i = x;
		int z = 0;
		
		while(i <= y) {
			z += i;
			i++;
		}
		
		System.out.println("x부터 y까지의 누적 합계 z: " + z);
		System.out.printf("%d부터 %d까지의 누적 합: %d", x, y, z);
		
		sc.close();
	}

}
