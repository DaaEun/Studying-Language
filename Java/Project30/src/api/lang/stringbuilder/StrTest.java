package api.lang.stringbuilder;

public class StrTest {

	public static void main(String[] args) {
		
		//String 속도 체크.
		
		long start;
		long end;
		
//		start = System.currentTimeMillis();
//		
//		String str = "A";
//		
//		for(int i=1; i<=500000; i++) {
//			str = str + "A";
//		}
//		
//		end = System.currentTimeMillis();
//		
//		System.out.println("String의 실행 시간: " + (end-start) * 0.001 + "초");
		
		start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("A");
		
		for(int i=1; i<=500000; i++) {
			sb.append("A");
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("StringBuilder의 실행시간: " + (end-start) * 0.001 + "초");
	
		double d = 3.14159265;
		System.out.println(Math.round(d*1000) * 0.001);
	}

}
