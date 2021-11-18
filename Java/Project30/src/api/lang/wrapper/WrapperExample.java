package api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a = 100;
		boolean b = false;
		char c= 'H';
		double d = 5.56;
		
		//Boxing: 기본 데이터 타입을 참조 타입으로 변환하는 과정.
		Integer v1 = new Integer(a);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		//AutoBoxing: new 연산자 사용 없이 객체로 포장을 수행.
		Integer x1 = a;
		Boolean x2 = b;
		Character x3 = c;
		Double x4 = d;
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		
		//Unboxing: 객체화 된 타입을 기본 데이터 타입으로 변환.
		int i = x1;
		double j = x4;
		
		//문자열 변환 기능.
		//Wrapper클래스명.parse + 기본타입명(문자열 or 문자열이 들어있는 변수)
		
		String s1 = "10";
		String s2 = "3.14";
		System.out.println(s1 + s2);
		
		int k = Integer.parseInt(s1);
		double d2 = Double.parseDouble(s2);
		System.out.println(k + d2);
		
	}

}
