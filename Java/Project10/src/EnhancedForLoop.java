
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
//		for(int i = 0; i < week.length; i++) {
//			System.out.println(week[i] + "요일" );
//		}
		
		for(String day : week) {
			System.out.println(day + "요일");	// 인덱스를 사용하지 않음.
		}
	
		/*
		 1. scores라는 int 배열을 하나 선언해서 점수 데이터를 저장하세요.
		 {96, 88, 74, 63, 100, 55}
		 
		 2. 향상 for문(foreach)을 사용하여 총점과 평균을 구해보세요.
		 총점(int), 평균(double, 소수점 둘째 자리까지 표현)
		 */
		
		int[] scores = {96, 88, 74, 63, 100, 55};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		double avg = (double) total/ scores.length;
		
		System.out.printf("총점: %d점 평균: %.2f점",total, avg);
	}

}
