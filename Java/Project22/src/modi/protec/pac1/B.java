package modi.protec.pac1;

public class B {
	
	A a1 = new A(30); //protec
	A a2 = new A(3.14); //p.f
	
	public B() {
		a1.x = 1; //protec
		a1.y = 2; //p.f
		
		a1.method1();
		a1.method2();
	}

}
