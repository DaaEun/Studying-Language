//설계용 클래스(라이브러리클래스)는 메인메서드를 작성하지 않는다.
public class Pen {
	
	//객체의 속성들을 필드(멤버변수)라고 부른다.
	String color;
	int price;
	
	//객체의 기능들을 메서드라고 부른다.
	void write() {
		System.out.println(color + "색 글을 씁니다.");
	}
	
	void priceInfo() {
		System.out.println(color + "색 펜의 가격은" + price + "원 입니다.");
	}
}
