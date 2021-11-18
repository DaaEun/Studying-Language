package inter.basic;

public interface Inter1 extends Inter{

	//인터페이스에서 변수를 선언하면 자동으로 상수 취급.
	double INCH = 2.54;
	
//	public Inter1() {
//		System.out.println("인터페이스 생성자?");
//	}
	
	//인터페이스에서 메서드를 선언하면 자동으로 추상 메서드 취급.
	public void method1();
}
