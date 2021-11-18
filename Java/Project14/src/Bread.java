
public class Bread {
	
	String name;
	int price;
	
	Bread() {}
	
	Bread(String bName, int bPrice) {
		name = bName;
		price = bPrice;
	}
	
	void info() {
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price + "원");
		System.out.println("--------------------------------");
	}
	
}
