import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		/*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를 가로로 출력하고,
		 	그 소수들의 합을 구하는 로직을 작성합니다.
		 
		 ex) 입력받은 수: 12	
		 	소수: 2 3 5 7 11
		 	소수들의 총 합: 28
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.print("입력받은 수: ");
		int num = sc.nextInt();
		
		/*
		 1. 소수는 약수가 1과 자기 자신밖에 없는 수
		 2. 소수 판별법은 반복문을 사용하여 해당 숫자까지 하나씩 나눠본 후 
		 악수의 갯수가 2개라면 소수라 할 수 있습니다.
		 3. 소수 판별 로직을 세운 후 하나씩 증가하는 외부 반복문의 제어변수가
		  소수일 때만 가로로 출력하고 누적합을 담아줄 변수에 누적시켜 더하면 됩니다.
		 */
		
		int sum = 0;	// 누적합을 담아줄 변수
		
		System.out.print("소수: ");
		for(int i = 1; i <= num; i++ ){
			
			int count = 0;	
			
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0) {
					count ++;
				}
			}//end inner for
			
			if(count == 2) {
				System.out.print(i + " ");
				sum += i;
			}
		}//end outer for
		
		System.out.println("\n소수들의 총 합: " + sum );
		
		sc.close();
	}

}
