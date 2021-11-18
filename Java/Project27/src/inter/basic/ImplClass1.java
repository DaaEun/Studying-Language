package inter.basic;

public class ImplClass1 implements Inter1, Inter2{

	/*
	 1. 인터페이스에 명세된 기능을 사용하기 위해서는 클래스에서 해당 인터페이스를 구현해야 한다.
	 
	 2. 인터페이스를 구현하는 키워드는 implements이다.
	 
	 3. 인터페이스는 상속과는 달리 여러 개의 인터페이스를 동시에 다중 구현할 수 있다.
	 
	 4. 또한 인터페이스들끼리 서로 상속이 가능하며, 이 경우 다중상속도 가능하다.
	 
	 5. 인터페이스를 구현할 때 인터페이스 내부에 선언된 추상 메서드들을 반드시 전부 오버라이딩해야 한다.
	 */
	
	@Override
	public void method1() {
		System.out.println("인터페이스1의 메서드 재정의!");
		
	}
	
	@Override
	public void method2() {
		System.out.println("인터페이스2의 메서드 재정의!");
	}

}
