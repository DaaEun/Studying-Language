
public class WhileExample2 {

	public static void main(String[] args) {
		
		// 48 ~ 150사이의 정수 중 8의 배수를 가로로 출력하세요.
		
//		int n = 48;	//begin
//		
//		while(n <= 150) {	//end
//			if(n % 8 == 0)
//				System.out.print(n + ": " );
//			n++;	//step
//		}

		int n = 48;
		while(n <= 150) {
			System.out.print(n + ": ");
			n += 8;
		}
		System.out.println();
		
		// 1~100까지의 정수 중 4의 배수이면서 8의 배수는 아닌수를 가로로 출력하세요.
		
		int m = 1;
		
		while( m <= 100 ) {
			if(m % 4 == 0 && m % 8 != 0)
				System.out.print(m + ": ");
			m++;
		}
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 갯수를 구해보세요.
		
		int count = 0, i = 258;
		
		while(i <= 30000) {
			if(i % 258 == 0)
				count++;
			i++;
		}
		System.out.println("1~30000까지의 정수 중  258의 배수의 갯수: " + count);

	}

}
