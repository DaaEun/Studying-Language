
public class PenMain {

	public static void main(String[] args) {

		//펜의 기능과 속성들을 사용하려면 설계도(class)를 바탕으로 펜 객체를 생성한다.

		//객체 생성 문법: 클래스타입 참조변수 = new 클래스이름();
		Pen redPen = new Pen();
 
		//참조연산자(.)를 통해 객체의 속성과 기능들을 사용할 수 있다.
		redPen.color = "빨간";
		redPen.price = 500;
		
		Pen bluePen = new Pen();
		bluePen.color = "파란";
		bluePen.price = 600;
		
		redPen.write();
		bluePen.write();

		redPen.priceInfo();
		bluePen.priceInfo();
		
		System.out.println("-----------------------------------------------");
		System.out.println(redPen);
		System.out.println(bluePen);
		// 주소가 출력됨. HEAP영역에 저장되어 있음을 알수 있음.
	}

}
