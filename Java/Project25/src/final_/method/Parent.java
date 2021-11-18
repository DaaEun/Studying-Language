package final_.method;

public class Parent {

	/*
	 - 클래스 선언시 final을 사용하면 그 클래스는 상속이 불가능하다.
	 
	 - final 클래스는 자식 클래스를 가질 수 없고, 오직 외부에서 객체 생성 통해서만 사용할 수 있다.
	 */
	
	public void method1() {}
	public void method2() {}
	public final void method3() {}
}
