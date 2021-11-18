package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton; (X) - 객체 생성 못함.
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		Singleton s6 = Singleton.getInstance();

		s1.method1();
		s1.method2();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}

}
