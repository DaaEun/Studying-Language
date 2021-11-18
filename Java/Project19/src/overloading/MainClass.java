package overloading;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 - Calculator 클래스에 calcRectArea()메서드를 선언하여
		 길이를 하나만 전달하면 정사각형의 넓이를 리턴하고, 
		 길이를 두 개 전달하면, (가로, 세로) 직사각형의 넓이를 리턴하도록
		 오버로딩을 사용하여 메서드를 선언하세요.
		 
		 - MainClass에서 직접 메서드를 호출해 보세요.
		 */

		Calculator c = new Calculator();
		System.out.println("정사각형의 넓이: " + c.calRectArea(5) + "cm^2");
		System.out.println("직사각형의 넓이: " + c.calRectArea(10,20) + "cm^2");
	}

}
