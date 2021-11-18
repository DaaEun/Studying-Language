public class ForQuiz {

	public static void main(String[] args) {
		/*
		 사용자에게 구구단 단수를 입력받은 후, 해당 단수의 구구단을 출력하시오.
		 
		 ex) 단수를 입력하세요: 4
		 *** 구구단 4단 ***
		 -------------------------------
		 4 X 1 = 4
		 4 X 2 = 8
		 4 X 3 = 12
		 	 .
		 	 .
		 	 .
		 		 		 
		 4 X 9 = 36
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단수를 입력하세요: ");
//		int num = sc.nextInt();
//		System.out.println("*** 구구단 " + num + "단 ***");
//		System.out.println("-----------------------------");
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.printf("%d X %d = %d\n", num, i, num * i);
//		}
//
//		sc.close();
		
		//랜덤 구구단(2~19)을 출력해 보세요.
		
		int rn =(int) ((Math.random()*18)+2);	
				
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", rn, i, rn * i);
		}
	}

}
