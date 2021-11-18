package poly.param;

public class CarShop {

	public void carPrice(Car c) {
		if(c instanceof Sonata) {
			System.out.println("소나타의 가격은 2600만원 입니다.");
		}
		else if(c instanceof Avante) {
			System.out.println("아반떼의 가격은 2000만원 입니다.");
		}
		else if(c instanceof Morning) {
			System.out.println("모닝의 가격은 1500만원 입니다.");
		}
	}
}
