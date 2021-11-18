package modi.member.pac1;

public class B {
	
	public B() {
		A a = new A();
		a.x = 1; //public
		a.y = 2; //p.f
//		a.z = 3; //private(x)
		
		a.method1();
		a.method2();
//		a.method3(); //private (x)
		
		
	}

}
