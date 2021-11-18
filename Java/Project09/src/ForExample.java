
public class ForExample {

	public static void main(String[] args) {
		
		// 1~10까지의 누적합을 구하는 로직
		
//		int total = 0;
//		int n = 1;
//		while(n <= 10) {
//			totla += n;
//			n++;
//		}
		
		int total = 0;
		
		for(int n = 1; n <= 10; n++) {
			total += n;
		}
		
		// 48~ 150사이의 정수중 8의 배수를 가로로 출력(for)
		
		for(int i = 48; i <= 150; i++) {
			if(i % 8 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 48; i <= 150; i += 8)
			System.out.print(i + " ");
		System.out.println();
		
		//1~60000까지의 정수중 177의 배수의 갯수(for)
		int count = 0;
		for(int i = 1; i <= 60000; i++) {
			if(i % 177 == 0) 
				count ++;
		}
		System.out.println("1~60000까지의 정수중 177의 배수의 갯수: " + count);
		
	}

}
