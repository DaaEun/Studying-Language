package api.lang.system;

public class SystemTime {
	
	public static void main(String[] args) {
		
		/*
		 - System 클래스가 제공하는 currentTimeMillis()와 nanoTime() 메서드는 
		 1970년 1월 1일 자정을 기준으로 현재까지의 시간을 초로 변환한 시간을 각각 long타입의 
		 밀리초(1/1000), 나노초(1/10^9)로 리턴한다.
		 */
		
//		System.out.println(System.currentTimeMillis());
		
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(int i=1; i<=100000; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행 걸린 시간: " + (end-start)*0.001 + "초");
	}

}
