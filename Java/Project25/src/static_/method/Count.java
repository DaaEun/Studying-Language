package static_.method;

public class Count {
	
	public int a;	//인스턴스 변수
	public static int b;	//정적 변수
	
	/*
	 # 인스턴스 메서드: 메서드 안에서는 정적(static) 변수와 인스턴스 변수 모두 참조 가능하다.
	 */
	
	public int method1() {
		return this.a + b;
	}

	/*
	 - static 블록(메서드, 정적 초기화자) 내부에서는 static이 붙은 변수나 메서드만 사용가능하다.
	 
	 - static 블록 내부에서 non-static 멤버를 사용하려면 반드시 객체를 생성하여 
	 주소값을 통해 참조해야 한다.
	 */
	
	public static int method2() {
		
//		return this.a + b;	(x) - static 메서드 안에서는 this를 사용할 수 없다. 
//		return a + b; (X) - 인스턴스 변수를 사용할 수 없다.
		
		Count ccc = new Count();
		return ccc.a + b;
//		static int c = 5; (X)
	}
}
