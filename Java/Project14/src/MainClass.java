
public class MainClass {

	//피자빵
	static int price = 500;
	static String name = "피자빵";
	static void info() {
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price + "원");
	}
	
	//초코케이크
	static int price2 = 1500;
	static String name2 = "초코케이크";
	static void info2() {
		System.out.println("빵 이름: " + name2);
		System.out.println("빵 가격: " + price2 + "원");
	}
	
	//식빵
	static int price3 = 2000;
	static String name3 = "식빵";
	static void info3() {
		System.out.println("빵 이름: " + name3);
		System.out.println("빵 가격: " + price3 + "원");
	}
	
	public static void main(String[] args) {
		
		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고 빵 객체를 생성할 수 있는 클래스 (설계도)를 작성하시오.
		 - 클래스 이름은 Bread로 통일한다.
		 
		 - MainClass에서 피자빵, 초코케이크, 식빵의 정보를 호출하시오.
		 */

		Bread pizza = new Bread();
		pizza.name = "피자빵";
		pizza.price = 500;
		pizza.info();
		
		Bread choco = new Bread("초코케이크", 1500);
		choco.info();
		
		Bread bread = new Bread("식빵", 2000);
		bread.info();
	}

}
