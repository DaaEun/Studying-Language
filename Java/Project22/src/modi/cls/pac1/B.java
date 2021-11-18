package modi.cls.pac1;

//public 제한자는 접근 제한이 없는 형태 (어디에서나 사용이 가능하다.)
public class B {
	
	/*
	 - 클래스 A의 접근 제한자가 p.f이기 때문에 동일 패키지 내부의
	  클래스에서는 사용이 가능합니다.
	 */
	
	A a = new A();

}
