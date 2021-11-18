package poly.param;

public class MainClass {

	public static void main(String[] args) {
		
		Driver oh = new Driver();
		Sonata s = (Sonata) oh.buyCar("소나타");
		s.run();
		
		CarShop shop = new CarShop();
		
		shop.carPrice(new Sonata()); //Car c = new Sonata();
		shop.carPrice(oh.buyCar("모닝"));
		
		System.out.println("------------------------------");
		
		shop.carPrice(new Avante());
		shop.carPrice(new Avante());
		shop.carPrice(new Avante());
		shop.carPrice(new Avante());
		shop.carPrice(new Avante());
		shop.carPrice(new Avante());
		shop.carPrice(new Avante());
		shop.carPrice(oh.buyCar("모닝"));
	}

}
