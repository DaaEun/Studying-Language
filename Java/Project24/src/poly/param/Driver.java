package poly.param;

public class Driver {

	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다.");
			return new Sonata();
		} else if(name.equals("아반떼")) {
			System.out.println("아반떼를 구입합니다.");
			return new Avante();
		} else if(name.equals("모닝")) {
			System.out.println("모닝를 구입합니다.");
			return new Morning();
		} else {
			return null;
		}
	}
}
