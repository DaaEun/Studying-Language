package test;

/*
import fruit.Banana;
import fruit.Melon;
*/

import fruit.*;	//fruit 패키지 내의 모든 클래스를 import 하겠다.
import juice.*;

public class Test {

	public static void main(String[] args) {
	
		// 다른 패키지 내의 같은 이름의 클래스 객체를 생성할 때에는 반드시 패키지 경로 표시!
		
		fruit.Apple a1 = new fruit.Apple();
		juice.Apple a2 = new juice.Apple();
		Banana b = new Banana();
		Melon m = new Melon();
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
	}

}
