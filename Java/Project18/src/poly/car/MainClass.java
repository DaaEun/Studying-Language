package poly.car;

public class MainClass {

	public static void main(String[] args) {
	
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		Avante a3 = new Avante();
		
		Morning m1 = new Morning();
		Morning m2 = new Morning();
		Morning m3 = new Morning();
		Morning m4 = new Morning();
		
//		s1.run();
//		s2.run();
//		s3.run();
//		a1.run();
//		a2.run();
//		a3.run();
//		m1.run();
//		m2.run();
//		m3.run();
//		m4.run();
		
		
//		Sonata[] sonatas = {s1, s2, s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		Car[] cars = {s1,s2,s3,a1,a2,a3,m1,m2,m3,m4};
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("---------------------------");
		
		s1.frontLeft = new Ntire();
		s1.frontRight = new Ntire();
		s1.rearLeft = new Htire();
		s1.rearRight = new Htire();
		
		Driver oh = new Driver();
		oh.drive(a1);
		oh.drive(s2);
		oh.drive(m4);
		
	}

}
