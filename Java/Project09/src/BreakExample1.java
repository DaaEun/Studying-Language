
public class BreakExample1 {

	public static void main(String[] args) {
		
		for(int i =1; i <= 10; i++) {
			if(i > 7) {
				break;
			}	// 7까지 출력됨
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");
		
		System.out.println("---------------------------------");
		
		/*
		 - 내부 반복문에 포함된 break로 외부 반복문까지 한번에 종료시키고 싶다면
		 바깥 반복문에 label을 붙입니다.
		 그 후, break를 선언할 때 label을 같이 선언하시면 됩니다.
		 */
		
		outer: for(int i = 0; i <= 2; i++) {
			for(int j= 0; j <= 1; j++) {
				if(i == j) break outer;
				System.out.println(i + "-" + j);
			}
		}
	}

}
